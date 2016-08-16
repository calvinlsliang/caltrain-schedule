package com.calvinlsliang.caltrainscheduler.db.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "StopTimes")
public class StopTimes {

    @DatabaseField(generatedId = true)
    private long id;

    @DatabaseField(columnName = "trip_id")
    private String tripId;

    @DatabaseField(columnName = "stop_id")
    private String stopId;

    @DatabaseField(columnName = "arrival_time")
    private String arrivalTime;
}
