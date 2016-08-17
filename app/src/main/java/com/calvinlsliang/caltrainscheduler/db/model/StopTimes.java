package com.calvinlsliang.caltrainscheduler.db.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import org.jsefa.csv.annotation.CsvDataType;
import org.jsefa.csv.annotation.CsvField;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

@DatabaseTable(tableName = "StopTimes")
@CsvDataType()
public class StopTimes {

    private static final SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
    private static final DateFormat dateFormat = DateFormat.getTimeInstance(DateFormat.SHORT);


    @DatabaseField(generatedId = true)
    private long id;

    @DatabaseField(columnName = "trip_id")
    @CsvField(pos = 1)
    private String tripId;

    @DatabaseField(columnName = "arrival_time")
    @CsvField(pos = 2)
    private String arrivalTime;

    @DatabaseField(columnName = "stop_id")
    @CsvField(pos = 4)
    private String stopId;

    StopTimes() {
    }

    public StopTimes(String tripId, String arrivalTime, String stopId) {
        this.tripId = tripId;
        this.stopId = stopId;

        try {
            this.arrivalTime = dateFormat.format(format.parse(arrivalTime));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
