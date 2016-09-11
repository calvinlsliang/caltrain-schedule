package com.calvinlsliang.caltrainschedule;


import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class ScheduleManager {

    private final int DEFAULT = 0;
    private final String DAY_POSITION = "dayPosition";
    private final String START_POSITION = "startPosition";
    private final String END_POSITION = "endPosition";

    SharedPreferences prefs;

    public ScheduleManager(Context context) {
        prefs = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public int getDayPosition() {
        return prefs.getInt(DAY_POSITION, DEFAULT);
    }

    public void setDayPosition(int position) {
        prefs.edit().putInt(DAY_POSITION, position).apply();
    }

    public int getStartPosition() {
        return prefs.getInt(START_POSITION, DEFAULT);
    }

    public void setStartPosition(int position) {
        prefs.edit().putInt(START_POSITION, position).apply();
    }

    public int getEndPosition() {
        return prefs.getInt(END_POSITION, DEFAULT);
    }

    public void setEndPosition(int position) {
        prefs.edit().putInt(END_POSITION, position).apply();
    }
}
