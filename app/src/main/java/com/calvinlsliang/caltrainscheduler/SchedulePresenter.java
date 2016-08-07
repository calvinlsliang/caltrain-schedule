package com.calvinlsliang.caltrainscheduler;

import com.calvinlsliang.caltrainscheduler.model.TimesModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by calvin on 8/6/16.
 */

public class SchedulePresenter {

    private ScheduleActivityView view;

    protected void onCreate(ScheduleActivityView view) {
        this.view = view;

        initStubbedTimes();
    }

    protected void onDestroy() {
        return;
    }

    private void initStubbedTimes() {
        List<TimesModel> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            TimesModel a = new TimesModel();
            a.startTime = i + "am";
            a.endTime = i + "pm";
            a.busNumber = "#" + i + "00";
            a.duration = i;
            list.add(a);
        }

        view.setTimesList(list);
        return;
    }
}
