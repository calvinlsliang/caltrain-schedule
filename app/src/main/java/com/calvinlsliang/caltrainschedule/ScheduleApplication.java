package com.calvinlsliang.caltrainschedule;

import android.app.Application;

import com.calvinlsliang.caltrainschedule.db.DatabaseHelper;
import com.calvinlsliang.caltrainschedule.db.model.StopTimes;
import com.calvinlsliang.caltrainschedule.model.StopTimesKey;
import com.calvinlsliang.caltrainschedule.util.Constants;
import com.calvinlsliang.caltrainschedule.util.ConstantsHelper;
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
            final Constants constants = ConstantsHelper.getConstants();

            for (StopTimes stopTime : stopTimesList) {
                constants.getSchedule().put(new StopTimesKey(stopTime.tripId, stopTime.stopName), stopTime.arrivalTime);
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

