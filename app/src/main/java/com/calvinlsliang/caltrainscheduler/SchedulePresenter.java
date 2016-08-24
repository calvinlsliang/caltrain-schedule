package com.calvinlsliang.caltrainscheduler;

import com.calvinlsliang.caltrainscheduler.model.StopTimesKey;
import com.calvinlsliang.caltrainscheduler.model.TimesModel;
import com.calvinlsliang.caltrainscheduler.model.TransferModel;
import com.calvinlsliang.caltrainscheduler.util.Constants;

import java.util.ArrayList;
import java.util.List;

public class SchedulePresenter {

    private ScheduleActivityView view;
    private boolean isWeekend;
    private int departureStation = 0;
    private int arrivalStation = 0;

    protected void onStart(ScheduleActivityView view) {
        this.view = view;
    }

    protected void handleNewDayRange(int dayPosition) {
        isWeekend = dayPosition == 1;
        view.setTimesList(getNewTimes());
    }

    protected void handleNewTimes(int startPosition, int endPosition) {
        departureStation = startPosition;
        arrivalStation = endPosition;
        view.setTimesList(getNewTimes());
    }

    private List<TimesModel> getNewTimes() {
        if (departureStation == arrivalStation) {
            return null;
        }

        List<Integer> trainStations = getTrainStation(departureStation, arrivalStation);
        List<TimesModel> timesList = new ArrayList<>();

        TransferModel transferModel = null;
        TimesModel timesModel;
        String startTime;
        String endTime;
        int busNumber;

        for (int trainIndex = 0; trainIndex < trainStations.size(); trainIndex++) {
            busNumber = trainStations.get(trainIndex);
            startTime = Constants.SCHEDULE.get(new StopTimesKey(busNumber, Constants.DESTINATIONS.get(departureStation)));
            endTime = Constants.SCHEDULE.get(new StopTimesKey(busNumber, Constants.DESTINATIONS.get(arrivalStation)));

            if (endTime == null) {
                transferModel = Constants.TRANSFERS.get(busNumber);

                if (transferModel != null) {
                    endTime = checkTransfers(transferModel.bus);
                }
            }

            if (startTime != null && endTime != null) {
                timesModel = new TimesModel(startTime, endTime, busNumber);
                if (transferModel != null) {
                    timesModel.setTransferLocation(transferModel.location);
                    timesModel.setTransferTime(transferModel.time);
                }

                timesList.add(timesModel);
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

    private String checkTransfers(int busNumber) {
         return Constants.SCHEDULE.get(new StopTimesKey(busNumber, Constants.DESTINATIONS.get(arrivalStation)));
    }
}
