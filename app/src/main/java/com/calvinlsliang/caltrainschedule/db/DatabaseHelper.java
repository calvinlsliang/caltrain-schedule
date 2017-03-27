package com.calvinlsliang.caltrainschedule.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.caltrain.calvinlsliang.caltrainschedule.R;
import com.calvinlsliang.caltrainschedule.db.model.StopTimes;
import com.calvinlsliang.caltrainschedule.util.Constants;
import com.calvinlsliang.caltrainschedule.util.ConstantsHelper;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class DatabaseHelper extends OrmLiteSqliteOpenHelper {

    private static final String DATABASE_NAME = "scheduler.db";
    private static final int DATABASE_VERSION = 2;

    private Dao<StopTimes, Long> stopTimes = null;
    private final Context context;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION, R.raw.ormlite_config);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, StopTimes.class);
            populateStopTimes("stop_times.txt", ConstantsHelper.VERSION.INITIAL);
            populateStopTimes("stop_times_spring_2017.txt", ConstantsHelper.VERSION.SPRING_2017);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        try {
            TableUtils.dropTable(connectionSource, StopTimes.class, false);
            onCreate(database, connectionSource);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void populateStopTimes(String filename, ConstantsHelper.VERSION version) throws SQLException {
        // trip_id,arrival_time,departure_time,stop_id,stop_sequence,pickup_type,drop_off_type

        final String splitBy = ",";
        String line;
        int tripId;
        String arrivalTime;
        String stopName;

        try {
            final InputStreamReader is = new InputStreamReader(context.getAssets().open(filename));
            final BufferedReader reader = new BufferedReader(is);
            final Constants constants = ConstantsHelper.getConstantsFromVersion(version);

            while ((line = reader.readLine()) != null) {
                String[] split = line.split(splitBy);

                tripId = constants.getTripIdMap().get(split[0]);
                arrivalTime = split[1];
                stopName = constants.getStopIdMap().get(split[3]);

                getDao().create(new StopTimes(tripId, arrivalTime, stopName, version));
            }

            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Dao<StopTimes, Long> getDao() throws SQLException {
        if (stopTimes == null) {
            stopTimes = getDao(StopTimes.class);
        }
        return stopTimes;
    }

    @Override
    public void close() {
        super.close();
        stopTimes = null;
    }
}
