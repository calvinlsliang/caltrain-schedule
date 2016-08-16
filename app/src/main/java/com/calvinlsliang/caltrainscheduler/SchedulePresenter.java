package com.calvinlsliang.caltrainscheduler;

import com.calvinlsliang.caltrainscheduler.model.TimesModel;
import com.calvinlsliang.caltrainscheduler.util.Constants;
import com.calvinlsliang.caltrainscheduler.util.WeekdayConstants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by calvin on 8/6/16.
 */

public class SchedulePresenter {

    private ScheduleActivityView view;

    protected void onCreate(ScheduleActivityView view) {
        this.view = view;
    }

    protected void onDestroy() {
        return;
    }

    protected void handleNewTimes(int startPosition, int endPosition) {
        view.setTimesList(getNewTimes(startPosition, endPosition));
    }

    private List<TimesModel> getNewTimes(int startPosition, int endPosition) {
        if (startPosition >= endPosition) {
            return new ArrayList<>();
        }

        List<TimesModel> timesList = new ArrayList<>();
        String startTime;
        String endTime;
        int busNumber;

        for (int trainIndex = 0; trainIndex < WeekdayConstants.NORTHBOUND[0].length; trainIndex++) {
            startTime = WeekdayConstants.NORTHBOUND[startPosition][trainIndex];
            endTime = WeekdayConstants.NORTHBOUND[endPosition][trainIndex];
            busNumber = Constants.NORTHBOUND_TRAIN_IDS.get(trainIndex);

            if (startTime != null && endTime != null && busNumber > 0) {
                timesList.add(new TimesModel(startTime, endTime, busNumber));
            }
        }
        return timesList;
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
