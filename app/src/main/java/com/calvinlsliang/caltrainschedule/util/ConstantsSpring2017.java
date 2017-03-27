package com.calvinlsliang.caltrainschedule.util;

import android.util.SparseArray;

import com.calvinlsliang.caltrainschedule.model.StopTimesKey;
import com.calvinlsliang.caltrainschedule.model.TransferModel;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConstantsSpring2017 implements Constants {
    @Override
    public List<String> getDestinations() {
        return null;
    }

    @Override
    public List<Integer> getWeekdayNorthboundTrainIdsList() {
        return null;
    }

    @Override
    public List<Integer> getWeekdaySouthboundTrainIdsList() {
        return null;
    }

    @Override
    public List<Integer> getWeekendNorthboundTrainIdsList() {
        return null;
    }

    @Override
    public List<Integer> getWeekendSouthboundTrainIdsList() {
        return null;
    }

    @Override
    public Map<String, String> getStopIdMap() {
        return null;
    }

    @Override
    public Map<String, Integer> getTripIdMap() {
        return null;
    }

    @Override
    public Map<StopTimesKey, String> getSchedule() {
        return null;
    }

    @Override
    public SparseArray<TransferModel> getTransfers() {
        return null;
    }

    private static final List<String> DESTINATIONS = Arrays.asList(
            "San Francisco", "22nd St", "Bayshore", "So. San Francisco", "San Bruno", "Millbrae", "Broadway", "Burlingame", "San Mateo", "Hayward Park", "Hillsdale", "Belmont", "San Carlos", "Redwood City", "Atherton", "Menlo Park", "Palo Alto", "California Ave", "San Antonio", "Mt View", "Sunnyvale", "Lawrence", "Santa Clara", "College Park", "San Jose Diridon", "Tamien", "Capitol", "Blossom Hill", "Morgan Hill", "San Martin", "Gilroy"
    );

    private static final List<Integer> WEEKDAY_NORTHBOUND_TRAIN_IDS = Arrays.asList(
            101, 103, 305, 207, 309, 211, 313, 215, 217, 319, 221, 323, 225, 227, 329, 231, 233, 135, 237, 139, 143, 147, 151, 155, 257, 159, 261, 263, 365, 267, 269, 371, 273, 375, 277, 279, 381, 283, 385, 287, 289, 191, 193, 195, 197, 199
    );

    private static final List<Integer> WEEKDAY_SOUTHBOUND_TRAIN_IDS = Arrays.asList(
            102, 104, 206, 208, 310, 212, 314, 216, 218, 320, 222, 324, 226, 228, 330, 232, 134, 236, 138, 142, 146, 150, 152, 254, 156, 258, 360, 262, 264, 366, 268, 370, 272, 274, 376, 278, 380, 282, 284, 386, 288, 190, 192, 194, 196, 198
    );

    private static final List<Integer> WEEKEND_NORTHBOUND_TRAIN_IDS = Arrays.asList(
            421, 423, 425, 427, 801, 429, 431, 433, 435, 437, 439, 441, 803, 443, 445, 447, 449, 451
    );

    private static final List<Integer> WEEKEND_SOUTHBOUND_TRAIN_IDS = Arrays.asList(
            422, 424, 426, 428, 802, 430, 432, 434, 436, 438, 440, 442, 804, 444, 446, 448, 450, 454
    );

    private static final Map<StopTimesKey, String> SCHEDULE = new HashMap<>();

    private static final Map<String, String> STOP_ID_MAP;
    static {
        STOP_ID_MAP = new HashMap<>();
        STOP_ID_MAP.put("stop_id", "stop_name");
        STOP_ID_MAP.put("70011", "San Francisco");
        STOP_ID_MAP.put("70012", "San Francisco");
        STOP_ID_MAP.put("70021", "22nd St");
        STOP_ID_MAP.put("70022", "22nd St");
        STOP_ID_MAP.put("70031", "Bayshore");
        STOP_ID_MAP.put("70032", "Bayshore");
        STOP_ID_MAP.put("70041", "So. San Francisco");
        STOP_ID_MAP.put("70042", "So. San Francisco");
        STOP_ID_MAP.put("70051", "San Bruno");
        STOP_ID_MAP.put("70052", "San Bruno");
        STOP_ID_MAP.put("70061", "Millbrae");
        STOP_ID_MAP.put("70062", "Millbrae");
        STOP_ID_MAP.put("70071", "Broadway");
        STOP_ID_MAP.put("70072", "Broadway");
        STOP_ID_MAP.put("70081", "Burlingame");
        STOP_ID_MAP.put("70082", "Burlingame");
        STOP_ID_MAP.put("70091", "San Mateo");
        STOP_ID_MAP.put("70092", "San Mateo");
        STOP_ID_MAP.put("70101", "Hayward Park Caltrain");
        STOP_ID_MAP.put("70102", "Hayward Park");
        STOP_ID_MAP.put("70111", "Hillsdale");
        STOP_ID_MAP.put("70112", "Hillsdale");
        STOP_ID_MAP.put("70121", "Belmont");
        STOP_ID_MAP.put("70122", "Belmont");
        STOP_ID_MAP.put("70131", "San Carlos");
        STOP_ID_MAP.put("70132", "San Carlos");
        STOP_ID_MAP.put("70141", "Redwood City");
        STOP_ID_MAP.put("70142", "Redwood City");
        STOP_ID_MAP.put("70151", "Atherton");
        STOP_ID_MAP.put("70152", "Atherton");
        STOP_ID_MAP.put("70161", "Menlo Park");
        STOP_ID_MAP.put("70162", "Menlo Park");
        STOP_ID_MAP.put("70171", "Palo Alto");
        STOP_ID_MAP.put("70172", "Palo Alto");
        STOP_ID_MAP.put("70191", "California Ave");
        STOP_ID_MAP.put("70192", "California Ave");
        STOP_ID_MAP.put("70201", "San Antonio");
        STOP_ID_MAP.put("70202", "San Antonio");
        STOP_ID_MAP.put("70211", "Mt View");
        STOP_ID_MAP.put("70212", "Mt View");
        STOP_ID_MAP.put("70221", "Sunnyvale");
        STOP_ID_MAP.put("70222", "Sunnyvale");
        STOP_ID_MAP.put("70231", "Lawrence");
        STOP_ID_MAP.put("70232", "Lawrence");
        STOP_ID_MAP.put("70241", "Santa Clara");
        STOP_ID_MAP.put("70242", "Santa Clara");
        STOP_ID_MAP.put("70251", "College Park");
        STOP_ID_MAP.put("70252", "College Park");
        STOP_ID_MAP.put("70261", "San Jose Diridon");
        STOP_ID_MAP.put("70262", "San Jose Diridon");
        STOP_ID_MAP.put("70271", "Tamien");
        STOP_ID_MAP.put("70272", "Tamien");
        STOP_ID_MAP.put("70281", "Capitol");
        STOP_ID_MAP.put("70282", "Capitol");
        STOP_ID_MAP.put("70291", "Blossom Hill");
        STOP_ID_MAP.put("70292", "Blossom Hill");
        STOP_ID_MAP.put("70301", "Morgan Hill");
        STOP_ID_MAP.put("70302", "Morgan Hill");
        STOP_ID_MAP.put("70311", "San Martin");
        STOP_ID_MAP.put("70312", "San Martin");
        STOP_ID_MAP.put("70321", "Gilroy");
        STOP_ID_MAP.put("70322", "Gilroy");
        STOP_ID_MAP.put("777402", "San Jose");
        STOP_ID_MAP.put("777403", "Tamien");
    }
}
