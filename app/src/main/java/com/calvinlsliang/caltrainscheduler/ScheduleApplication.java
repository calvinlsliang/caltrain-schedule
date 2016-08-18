package com.calvinlsliang.caltrainscheduler;

import android.app.Application;

import com.calvinlsliang.caltrainscheduler.db.DatabaseHelper;
import com.calvinlsliang.caltrainscheduler.db.model.StopTimes;
import com.calvinlsliang.caltrainscheduler.model.StopTimesKey;
import com.calvinlsliang.caltrainscheduler.util.Constants;
import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.List;

public class ScheduleApplication extends Application {

    private DatabaseHelper databaseHelper = null;

    @Override
    public void onCreate() {
        super.onCreate();
        initSchedules();
    }

    private void destroyDatabaseHelper() {
        OpenHelperManager.releaseHelper();
        databaseHelper = null;
    }

    private void initSchedules() {
        try {
            final Dao<StopTimes, Long> stopTimesDao = getHelper().getDao();
            final List<StopTimes> stopTimesList = stopTimesDao.queryForAll();

            for (StopTimes stopTime : stopTimesList) {
                Constants.SCHEDULE.put(new StopTimesKey(stopTime.stopId, stopTime.tripId), stopTime.arrivalTime);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }

        destroyDatabaseHelper();
    }

    private DatabaseHelper getHelper() {
        if (databaseHelper == null) {
            databaseHelper = OpenHelperManager.getHelper(this, DatabaseHelper.class);
        }
        return databaseHelper;
    }
}

