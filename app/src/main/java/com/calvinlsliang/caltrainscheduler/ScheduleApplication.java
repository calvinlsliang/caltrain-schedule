package com.calvinlsliang.caltrainscheduler;

import android.app.Application;

import com.calvinlsliang.caltrainscheduler.db.DatabaseHelper;

public class ScheduleApplication extends Application {

    private DatabaseHelper databaseHelper = null;

    @Override
    public void onCreate() {
        super.onCreate();
        initSchedules();
    }

    private void initSchedules() {
    }
}

