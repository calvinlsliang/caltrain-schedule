package com.caltrain.calvinlsliang.caltrainscheduler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.caltrain.calvinlsliang.caltrainscheduler.model.TimesModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ScheduleActivity extends AppCompatActivity {

    private String start = null;
    private String end = null;
    private Spinner spinnerStart;
    private Spinner spinnerEnd;
    private RecyclerView timesList;

    private static final List<String> destinations = Arrays.asList(
            "San Francisco", "22nd Street", "Bayshore", "South San Francisco", "San Bruno",
            "Millbrae", "Broadway Weekend only", "Burlingame", "San Mateo", "Hayward Park",
            "Hillsdale", "Belmont", "San Carlos", "Redwood City", "Atherton Weekend only",
            "Menlo Park", "Palo Alto", "California Ave", "San Antonio", "Mountain View",
            "Sunnyvale", "Lawrence", "Santa Clara", "College Park", "San Jose Diridon",
            "Tamien", "Capitol", "Blossom Hill", "Morgan Hill", "San Martin", "Gilroy");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        initSpinner();
        initTimesList();
    }

    protected void initSpinner() {
        spinnerStart = (Spinner) findViewById(R.id.spinnerStart);
        spinnerEnd = (Spinner) findViewById(R.id.spinnerEnd);

        List<String> spinnerArray = destinations;

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, spinnerArray);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerStart.setAdapter(adapter);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, spinnerArray);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEnd.setAdapter(adapter2);

        initSpinnerListener();
    }

    protected void initSpinnerListener() {

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

    protected void initTimesList() {
        timesList = (RecyclerView) findViewById(R.id.times_list);
        timesList.setHasFixedSize(true);
        timesList.addItemDecoration(new TimesDividerItemDecoration(this));
        timesList.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView.Adapter adapter = new TimesAdapter(initStubbedTimes());
        timesList.setAdapter(adapter);

    }

    private List<TimesModel> initStubbedTimes() {
        List<TimesModel> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            TimesModel a = new TimesModel();
            a.startTime = i + "am";
            a.endTime = i + "pm";
            a.busNumber = "#" + i + "00";
            a.duration = i;
            list.add(a);
        }

        return list;
    }
}
