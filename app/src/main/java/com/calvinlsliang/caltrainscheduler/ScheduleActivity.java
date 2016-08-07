package com.calvinlsliang.caltrainscheduler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.caltrain.calvinlsliang.caltrainscheduler.R;
import com.calvinlsliang.caltrainscheduler.model.TimesModel;
import com.calvinlsliang.caltrainscheduler.util.Constants;

import java.util.List;

public class ScheduleActivity extends AppCompatActivity implements ScheduleActivityView {

    private String start = null;
    private String end = null;
    private Spinner spinnerStart;
    private Spinner spinnerEnd;
    private RecyclerView timesList;
    private TimesAdapter timesAdapter;
    private SchedulePresenter presenter =  new SchedulePresenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        initSpinner();
        initTimesList();
        presenter.onCreate(this);
    }

    @Override
    protected void onDestroy() {
        presenter.onDestroy();
        super.onDestroy();
    }

    @Override
    public void setTimesList(List<TimesModel> timesModels) {
        timesAdapter.setTimesList(timesModels);
    }

    private void initSpinner() {
        spinnerStart = (Spinner) findViewById(R.id.spinnerStart);
        spinnerEnd = (Spinner) findViewById(R.id.spinnerEnd);

        List<String> spinnerArray = Constants.destinations;

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, spinnerArray);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerStart.setAdapter(adapter);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, spinnerArray);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEnd.setAdapter(adapter2);

        initSpinnerListener();
    }

    private void initSpinnerListener() {

        spinnerStart.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position > 0) {
                    start = spinnerStart.getSelectedItem().toString();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinnerEnd.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position > 0) {
                    end = spinnerEnd.getSelectedItem().toString();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void initTimesList() {
        timesList = (RecyclerView) findViewById(R.id.times_list);
        timesList.setHasFixedSize(true);
        timesList.addItemDecoration(new TimesDividerItemDecoration(this));
        timesList.setLayoutManager(new LinearLayoutManager(this));
        timesAdapter = new TimesAdapter();
        timesList.setAdapter(timesAdapter);
    }
}