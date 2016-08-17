package com.calvinlsliang.caltrainscheduler.db.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import org.jsefa.csv.annotation.CsvDataType;
import org.jsefa.csv.annotation.CsvField;

@DatabaseTable(tableName = "StopTimes")
@CsvDataType()
public class StopTimes {

    @DatabaseField(generatedId = true)
    private long id;

    @DatabaseField(columnName = "trip_id")
    @CsvField(pos = 1)
    private String tripId;

    @DatabaseField(columnName = "stop_id")
    @CsvField(pos = 4)
    private String stopId;

    @DatabaseField(columnName = "arrival_time")
    @CsvField(pos = 2)
    private String arrivalTime;
}
