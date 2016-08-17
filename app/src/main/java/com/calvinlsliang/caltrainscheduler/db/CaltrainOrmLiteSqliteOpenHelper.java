package com.calvinlsliang.caltrainscheduler.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.caltrain.calvinlsliang.caltrainscheduler.R;
import com.calvinlsliang.caltrainscheduler.db.model.StopTimes;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

public class CaltrainOrmLiteSqliteOpenHelper extends OrmLiteSqliteOpenHelper {

    private static final String DATABASE_NAME = "scheduler.db";
    private static final int DATABASE_VERSION = 2;

    private Dao<StopTimes, Long> stopTimes = null;

    public CaltrainOrmLiteSqliteOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION, R.raw.ormlite_config);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, StopTimes.class);
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

    public Dao<StopTimes, Long> getDao() throws SQLException {
        if (stopTimes == null) {
            stopTimes = getDao(StopTimes.class);
        }
        return stopTimes;
    }
}
