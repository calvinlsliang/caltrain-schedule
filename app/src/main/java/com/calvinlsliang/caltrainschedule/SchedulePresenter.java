package com.calvinlsliang.caltrainschedule;

import com.calvinlsliang.caltrainschedule.model.StopTimesKey;
import com.calvinlsliang.caltrainschedule.model.TimesModel;
import com.calvinlsliang.caltrainschedule.model.TransferModel;
import com.calvinlsliang.caltrainschedule.util.Constants;

import java.util.ArrayList;
import java.util.List;

public class SchedulePresenter {

    private ScheduleActivityView view;
    private boolean isWeekend;
    private int departureStation = 0;
    private int arrivalStation = 0;

    protected void onCreate(ScheduleActivityView view) {
        this.view = view;
    }

    protected void onDestroy() {
        this.view = null;
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

        List<Integer> trainStations = getTrainStation();
        List<TimesModel> timesList = new ArrayList<>();

        for (int trainIndex = 0; trainIndex < trainStations.size(); trainIndex++) {
            int busNumber = trainStations.get(trainIndex);
            String startTime = Constants.SCHEDULE.get(new StopTimesKey(busNumber, Constants.DESTINATIONS.get(departureStation)));
            String endTime = Constants.SCHEDULE.get(new StopTimesKey(busNumber, Constants.DESTINATIONS.get(arrivalStation)));
            TransferModel transferModel = null;

            if (endTime == null) {
                transferModel = Constants.TRANSFERS.get(busNumber);

                if (transferModel != null && validTransfer(transferModel)) {
                    endTime = checkTransfers(transferModel.bus);
                }
            }

            if (startTime != null && endTime != null) {
                TimesModel timesModel = new TimesModel(startTime, endTime, busNumber);
                if (transferModel != null) {
                    timesModel.setTransferLocation(transferModel.location);
                    timesModel.setTransferTime(transferModel.time);
                }

                timesList.add(timesModel);
            }
        }
        return timesList;
    }

    private List<Integer> getTrainStation() {
        final boolean isNorthbound = isNorthbound();
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

    private boolean validTransfer(TransferModel transferModel) {
        final boolean isNorthbound = isNorthbound();

        return isNorthbound ? departureStation > transferModel.busIndex : departureStation < transferModel.busIndex
                && !transferModel.location.equals(Constants.DESTINATIONS.get(departureStation));
    }

    private boolean isNorthbound() {
        return departureStation > arrivalStation;
    }
}
