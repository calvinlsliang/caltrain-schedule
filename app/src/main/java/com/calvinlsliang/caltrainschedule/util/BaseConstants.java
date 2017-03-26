package com.calvinlsliang.caltrainschedule.util;

import android.util.SparseArray;

import com.calvinlsliang.caltrainschedule.model.StopTimesKey;
import com.calvinlsliang.caltrainschedule.model.TransferModel;

import java.util.List;
import java.util.Map;

public interface BaseConstants {
    List<String> getDestinations();
    List<Integer> getWeekdayNorthboundTrainIdsList();
    List<Integer> getWeekdaySouthboundTrainIdsList();
    List<Integer> getWeekendNorthboundTrainIdsList();
    List<Integer> getWeekendSouthboundTrainIdsList();
    Map<String, String> getStopIdMap();
    Map<String, Integer> getTripIdMap();
    Map<StopTimesKey, String> getSchedule();
    SparseArray<TransferModel> getTransfers();
}
