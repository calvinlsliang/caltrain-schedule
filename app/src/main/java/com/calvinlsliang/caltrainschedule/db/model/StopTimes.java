package com.calvinlsliang.caltrainschedule.db.model;

import com.calvinlsliang.caltrainschedule.util.ConstantsHelper;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

@DatabaseTable(tableName = "StopTimes")
public class StopTimes {

    public static final String VERSION = "version";

    private static final SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
    private static final DateFormat dateFormat = DateFormat.getTimeInstance(DateFormat.SHORT);


    @DatabaseField(generatedId = true)
    private long id;

    @DatabaseField
    public int tripId;

    @DatabaseField
    public String arrivalTime;

    @DatabaseField
    public String stopName;

    @DatabaseField
    public int version;

    StopTimes() {
    }

    public StopTimes(int tripId, String arrivalTime, String stopName, ConstantsHelper.VERSION version) {
        this.tripId = tripId;
        this.stopName = stopName;
        this.version = ConstantsHelper.VERSION.valueOf(version);

        try {
            this.arrivalTime = dateFormat.format(format.parse(arrivalTime));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
