package com.calvinlsliang.caltrainscheduler.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.caltrain.calvinlsliang.caltrainscheduler.R;
import com.calvinlsliang.caltrainscheduler.db.model.StopTimes;
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
    private static final int DATABASE_VERSION = 1;

    private Dao<StopTimes, Long> stopTimes = null;
    private Context context;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION, R.raw.ormlite_config);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, StopTimes.class);
            populateStopTimes();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        try {
            TableUtils.dropTable(connectionSource, StopTimes.class, false);
            onCreate(database, connectionSource);
            populateStopTimes();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    // Populate db with static data from CSV
    private void populateStopTimes() throws SQLException {

        // trip_id,arrival_time,departure_time,stop_id,stop_sequence,pickup_type,drop_off_type

        // TODO remove JSefa if this works

        final String splitBy = ",";
        String line;
        String tripId;
        String arrivalTime;
        String stopId;

        try {
            final InputStreamReader is = new InputStreamReader(context.getAssets().open("stop_times.txt"));
            final BufferedReader reader = new BufferedReader(is);

            while ((line = reader.readLine()) != null) {
                String[] split = line.split(splitBy);
                tripId = split[0];      // tripId
                arrivalTime = split[1]; // arrivalTime
                stopId = split[3];      // stopId

                getDao().create(new StopTimes(tripId, arrivalTime, stopId));
            }
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
