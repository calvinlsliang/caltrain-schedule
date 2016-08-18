package com.calvinlsliang.caltrainscheduler;

import com.calvinlsliang.caltrainscheduler.model.StopTimesKey;
import com.calvinlsliang.caltrainscheduler.model.TimesModel;
import com.calvinlsliang.caltrainscheduler.util.Constants;
import com.calvinlsliang.caltrainscheduler.util.WeekdayConstants;

import java.util.ArrayList;
import java.util.List;

public class SchedulePresenter {

    private ScheduleActivityView view;

    protected void onStart(ScheduleActivityView view) {
        this.view = view;
        initSetTimes();
    }

    protected void onStop() {
        return;
    }

    protected void handleNewTimes(String start, String end) {
        view.setTimesList(getNewTimes(start, end));
    }

    private List<TimesModel> getNewTimes(String start, String end) {
//        if (startPosition >= endPosition) {
//            return new ArrayList<>();
//        }

        List<TimesModel> timesList = new ArrayList<>();
        String startTime;
        String endTime;
        int busNumber;

        for (int trainIndex = 0; trainIndex < WeekdayConstants.NORTHBOUND[0].length; trainIndex++) {
//            startTime = WeekdayConstants.NORTHBOUND[startPosition][trainIndex];
//            endTime = WeekdayConstants.NORTHBOUND[endPosition][trainIndex];
//            busNumber = Constants.WEEKDAY_NORTHBOUND_TRAIN_IDS.get(trainIndex);
//
//            if (startTime != null && endTime != null && busNumber > 0) {
//                timesList.add(new TimesModel(startTime, endTime, busNumber));
//            }

            // fix initial population. put in int instead of strings?
            // make sure the data in the table is consistent and only make it readable at the very end



            startTime = Constants.SCHEDULE.get(new StopTimesKey(Constants.STOP_ID_MAP.get(start), Constants.TRIP_ID_MAP.get(Constants.WEEKDAY_NORTHBOUND_TRAIN_IDS.get(trainIndex))));



        }
        return timesList;
    }

    private void initSetTimes() {

    }

    private void initStubbedTimes() {
        List<TimesModel> timesList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            TimesModel a = new TimesModel();
            a.startTime = i + "am";
            a.endTime = i + "pm";
            a.busNumber = "#" + i + "00";
            a.duration = i + " min";
            timesList.add(a);
        }

        view.setTimesList(timesList);
        return;
    }
}
