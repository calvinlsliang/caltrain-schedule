package com.calvinlsliang.caltrainscheduler;

import com.calvinlsliang.caltrainscheduler.model.StopTimesKey;
import com.calvinlsliang.caltrainscheduler.model.TimesModel;
import com.calvinlsliang.caltrainscheduler.util.Constants;

import java.util.ArrayList;
import java.util.List;

public class SchedulePresenter {

    private ScheduleActivityView view;
    private boolean isWeekend;

    protected void onStart(ScheduleActivityView view) {
        this.view = view;
    }

    protected void onStop() {
        return;
    }

    protected void handleNewTimes(int startPosition, int endPosition) {
        view.setTimesList(getNewTimes(startPosition, endPosition));
    }

    private List<TimesModel> getNewTimes(int startPosition, int endPosition) {
        if (startPosition == endPosition) {
            return new ArrayList<>();
        }

        List<Integer> trainStations = getTrainStation(startPosition, endPosition);
        List<TimesModel> timesList = new ArrayList<>();
        String startTime;
        String endTime;
        int busNumber;

        for (int trainIndex = 0; trainIndex < trainStations.size(); trainIndex++) {
            busNumber = trainStations.get(trainIndex);
            startTime = Constants.SCHEDULE.get(new StopTimesKey(busNumber, Constants.DESTINATIONS.get(startPosition)));
            endTime = Constants.SCHEDULE.get(new StopTimesKey(busNumber, Constants.DESTINATIONS.get(endPosition)));

            if (startTime != null && endTime != null) {
                timesList.add(new TimesModel(startTime, endTime, busNumber));
            }
        }
        return timesList;
    }

    private List<Integer> getTrainStation(int startPosition, int endPosition) {
        final boolean isNorthbound = startPosition > endPosition;
        if (isWeekend) {
            if (isNorthbound) {
                return Constants.WEEKEND_NORTHBOUND_TRAIN_IDS;
            } else {
                return Constants.WEEKEND_SOUTHBOUND_TRAIN_IDS;
            }
        } else {
            if (isNorthbound) {
                return Constants.WEEKDAY_NORTHBOUND_TRAIN_IDS;
            } else {
                return Constants.WEEKDAY_SOUTHBOUND_TRAIN_IDS;
            }
        }
    }
}
