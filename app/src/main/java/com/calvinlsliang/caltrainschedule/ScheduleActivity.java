package com.calvinlsliang.caltrainschedule;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.caltrain.calvinlsliang.caltrainschedule.R;
import com.calvinlsliang.caltrainschedule.model.TimesModel;
import com.calvinlsliang.caltrainschedule.util.Constants;

import java.util.Calendar;
import java.util.List;

public class ScheduleActivity extends AppCompatActivity implements ScheduleActivityView {

    private static final String[] emailAddresses = {"caltraincat@gmail.com"};

    private int dayPosition = 0;
    private int startPosition = 0;
    private int endPosition = 0;
    private Spinner spinnerStart;
    private Spinner spinnerEnd;
    private Spinner actionbarSpinnerDays;
    private TimesAdapter timesAdapter;
    private ScheduleManager manager;
    private final SchedulePresenter presenter = new SchedulePresenter();

    private TextView noAvailableTrains;
    private RecyclerView timesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        presenter.onCreate(this);
        manager = new ScheduleManager(this);

        noAvailableTrains = (TextView) findViewById(R.id.no_trains);
        timesList = (RecyclerView) findViewById(R.id.times_list);

        initActionBar();
        initSpinner();
        initTimesList();
        initAutocomplete();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onDestroy() {
        presenter.onDestroy();
        manager = null;
        super.onDestroy();
    }

    @Override
    public void setTimesList(@Nullable List<TimesModel> timesModels) {
        if (timesModels == null || timesModels.isEmpty()) {
            showNoAvailableTrainsMessage();
        } else {
            hideNoAvailableTrainsMessage();
        }

        timesAdapter.setTimesList(timesModels);
    }

    private void showNoAvailableTrainsMessage() {
        noAvailableTrains.setVisibility(View.VISIBLE);
        timesList.setVisibility(View.GONE);
    }

    private void hideNoAvailableTrainsMessage() {
        noAvailableTrains.setVisibility(View.GONE);
        timesList.setVisibility(View.VISIBLE);
    }

    private void initActionBar() {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar == null) {
            return;
        }
        actionBar.setDisplayShowTitleEnabled(false);
        View view = getLayoutInflater().inflate(R.layout.actionbar_days, null);

        actionbarSpinnerDays = (Spinner) view.findViewById(R.id.actionbar_spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                R.layout.actionbar_textview, getResources().getStringArray(R.array.actionbar_days));
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        actionbarSpinnerDays.getBackground().setColorFilter(ContextCompat.getColor(this, R.color.white), PorterDuff.Mode.SRC_ATOP);
        actionbarSpinnerDays.setAdapter(adapter);

        ImageView swap = (ImageView) view.findViewById(R.id.actionbar_swap);
        swap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swapStartAndEnd();
            }
        });

        ImageView feedback = (ImageView) view.findViewById(R.id.actionbar_feedback);
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startEmailIntent();
            }
        });

        actionBar.setCustomView(view);
        actionBar.setDisplayShowCustomEnabled(true);

        Toolbar parent = (Toolbar) view.getParent();
        parent.setContentInsetsAbsolute(0, 0);

        initActionBarSpinnerListener();
    }

    private void initActionBarSpinnerListener() {
        actionbarSpinnerDays.setSelection(manager.getDayPosition());

        actionbarSpinnerDays.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                dayPosition = position;
                manager.setDayPosition(position);
                presenter.handleNewDayRange(dayPosition);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void initSpinner() {
        spinnerStart = (Spinner) findViewById(R.id.spinnerStart);
        spinnerEnd = (Spinner) findViewById(R.id.spinnerEnd);

        List<String> spinnerArray = Constants.DESTINATIONS;

        ArrayAdapter<String> adapter = new StationArrayAdapter(this, android.R.layout.simple_spinner_item, spinnerArray, spinnerStart);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerStart.setAdapter(adapter);

        ArrayAdapter<String> adapter2 = new StationArrayAdapter(this, android.R.layout.simple_spinner_item, spinnerArray, spinnerEnd);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEnd.setAdapter(adapter2);

        initStationSpinnerListener();
    }

    private void initStationSpinnerListener() {
        spinnerStart.setSelection(manager.getStartPosition());
        spinnerEnd.setSelection(manager.getEndPosition());

        spinnerStart.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                startPosition = position;
                manager.setStartPosition(position);
                presenter.handleNewTimes(startPosition, endPosition);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinnerEnd.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                endPosition = position;
                manager.setEndPosition(position);
                presenter.handleNewTimes(startPosition, endPosition);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void initTimesList() {
        final RecyclerView timesList = (RecyclerView) findViewById(R.id.times_list);
        if (timesList == null) {
            return;
        }

        timesList.setHasFixedSize(true);
        timesList.addItemDecoration(new TimesDividerItemDecoration(this));
        timesList.setLayoutManager(new LinearLayoutManager(this));
        timesAdapter = new TimesAdapter();
        timesList.setAdapter(timesAdapter);
    }

    private void swapStartAndEnd() {
        final int temp = manager.getStartPosition();
        spinnerStart.setSelection(manager.getEndPosition());
        spinnerEnd.setSelection(temp);
    }

    private void startEmailIntent() {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, emailAddresses);
        intent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.email_subject));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Toast.makeText(this, getString(R.string.no_email_provider), Toast.LENGTH_SHORT).show();
        }
    }

    private void initAutocomplete() {
        final Calendar calendar = Calendar.getInstance();

        initDayOfWeek(calendar.get(Calendar.DAY_OF_WEEK));
        initTime();
    }

    private void initDayOfWeek(final int dayOfWeek) {
        final int WEEKDAY = 0;
        final int WEEKEND = 1;
        if (dayOfWeek == Calendar.SUNDAY || dayOfWeek == Calendar.SATURDAY) {
            actionbarSpinnerDays.setSelection(WEEKEND);
        } else {
            actionbarSpinnerDays.setSelection(WEEKDAY);
        }
    }

    private void initTime() {

    }


}
