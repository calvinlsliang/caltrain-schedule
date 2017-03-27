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
        return DESTINATIONS;
    }

    @Override
    public List<Integer> getWeekdayNorthboundTrainIdsList() {
        return WEEKDAY_NORTHBOUND_TRAIN_IDS;
    }

    @Override
    public List<Integer> getWeekdaySouthboundTrainIdsList() {
        return WEEKDAY_SOUTHBOUND_TRAIN_IDS;
    }

    @Override
    public List<Integer> getWeekendNorthboundTrainIdsList() {
        return WEEKEND_NORTHBOUND_TRAIN_IDS;
    }

    @Override
    public List<Integer> getWeekendSouthboundTrainIdsList() {
        return WEEKEND_SOUTHBOUND_TRAIN_IDS;
    }

    @Override
    public Map<String, String> getStopIdMap() {
        return STOP_ID_MAP;
    }

    @Override
    public Map<String, Integer> getTripIdMap() {
        return TRIP_ID_MAP;
    }

    @Override
    public Map<StopTimesKey, String> getSchedule() {
        return SCHEDULE;
    }

    @Override
    public SparseArray<TransferModel> getTransfers() {
        return TRANSFERS;
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

    private static final Map<String, Integer> TRIP_ID_MAP;
    static {
        TRIP_ID_MAP = new HashMap<>();
        TRIP_ID_MAP.put("6511128-CT-16APR-Caltrain-Saturday-01", 422);
        TRIP_ID_MAP.put("6511129-CT-16APR-Caltrain-Saturday-01", 424);
        TRIP_ID_MAP.put("6511130-CT-16APR-Caltrain-Saturday-01", 426);
        TRIP_ID_MAP.put("6511131-CT-16APR-Caltrain-Saturday-01", 428);
        TRIP_ID_MAP.put("6511132-CT-16APR-Caltrain-Saturday-01", 430);
        TRIP_ID_MAP.put("6511133-CT-16APR-Caltrain-Saturday-01", 432);
        TRIP_ID_MAP.put("6511134-CT-16APR-Caltrain-Saturday-01", 434);
        TRIP_ID_MAP.put("6511135-CT-16APR-Caltrain-Saturday-01", 436);
        TRIP_ID_MAP.put("6511136-CT-16APR-Caltrain-Saturday-01", 438);
        TRIP_ID_MAP.put("6511137-CT-16APR-Caltrain-Saturday-01", 440);
        TRIP_ID_MAP.put("6511138-CT-16APR-Caltrain-Saturday-01", 442);
        TRIP_ID_MAP.put("6511139-CT-16APR-Caltrain-Saturday-01", 444);
        TRIP_ID_MAP.put("6511140-CT-16APR-Caltrain-Saturday-01", 446);
        TRIP_ID_MAP.put("6511141-CT-16APR-Caltrain-Saturday-01", 448);
        TRIP_ID_MAP.put("6511142-CT-16APR-Caltrain-Saturday-01", 423);
        TRIP_ID_MAP.put("6511143-CT-16APR-Caltrain-Saturday-01", 425);
        TRIP_ID_MAP.put("6511144-CT-16APR-Caltrain-Saturday-01", 427);
        TRIP_ID_MAP.put("6511145-CT-16APR-Caltrain-Saturday-01", 429);
        TRIP_ID_MAP.put("6511146-CT-16APR-Caltrain-Saturday-01", 431);
        TRIP_ID_MAP.put("6511147-CT-16APR-Caltrain-Saturday-01", 433);
        TRIP_ID_MAP.put("6511148-CT-16APR-Caltrain-Saturday-01", 435);
        TRIP_ID_MAP.put("6511149-CT-16APR-Caltrain-Saturday-01", 437);
        TRIP_ID_MAP.put("6511150-CT-16APR-Caltrain-Saturday-01", 439);
        TRIP_ID_MAP.put("6511151-CT-16APR-Caltrain-Saturday-01", 441);
        TRIP_ID_MAP.put("6511152-CT-16APR-Caltrain-Saturday-01", 443);
        TRIP_ID_MAP.put("6511153-CT-16APR-Caltrain-Saturday-01", 445);
        TRIP_ID_MAP.put("6511154-CT-16APR-Caltrain-Saturday-01", 447);
        TRIP_ID_MAP.put("6511155-CT-16APR-Caltrain-Saturday-01", 449);
        TRIP_ID_MAP.put("6511156-CT-16APR-Caltrain-Saturday-01", 801);
        TRIP_ID_MAP.put("6511157-CT-16APR-Caltrain-Saturday-01", 803);
        TRIP_ID_MAP.put("6511158-CT-16APR-Caltrain-Saturday-01", 802);
        TRIP_ID_MAP.put("6511159-CT-16APR-Caltrain-Saturday-01", 804);
        TRIP_ID_MAP.put("6511160-CT-16APR-Caltrain-Saturday-01", 450);
        TRIP_ID_MAP.put("6511161-CT-16APR-Caltrain-Saturday-01", 454);
        TRIP_ID_MAP.put("6511162-CT-16APR-Caltrain-Saturday-01", 421);
        TRIP_ID_MAP.put("6511163-CT-16APR-Caltrain-Saturday-01", 451);
        TRIP_ID_MAP.put("6511164-CT-16APR-Caltrain-Saturday-01", 30);
        TRIP_ID_MAP.put("6511165-CT-16APR-Caltrain-Saturday-01", 31);
        TRIP_ID_MAP.put("6511166-CT-16APR-Caltrain-Saturday-01", 32);
        TRIP_ID_MAP.put("6511167-CT-16APR-Caltrain-Saturday-01", 33);
        TRIP_ID_MAP.put("6511168-CT-16APR-Caltrain-Saturday-01", 34);
        TRIP_ID_MAP.put("6511169-CT-16APR-Caltrain-Saturday-01", 35);
        TRIP_ID_MAP.put("6511170-CT-16APR-Caltrain-Saturday-01", 36);
        TRIP_ID_MAP.put("6511171-CT-16APR-Caltrain-Saturday-01", 37);
        TRIP_ID_MAP.put("6511172-CT-16APR-Caltrain-Saturday-01", 38);
        TRIP_ID_MAP.put("6511173-CT-16APR-Caltrain-Saturday-01", 39);
        TRIP_ID_MAP.put("6511174-CT-16APR-Caltrain-Saturday-01", 40);
        TRIP_ID_MAP.put("6511175-CT-16APR-Caltrain-Saturday-01", 41);
        TRIP_ID_MAP.put("6511176-CT-16APR-Caltrain-Saturday-01", 42);
        TRIP_ID_MAP.put("6511177-CT-16APR-Caltrain-Saturday-01", 44);
        TRIP_ID_MAP.put("6511178-CT-16APR-Caltrain-Saturday-01", 43);
        TRIP_ID_MAP.put("6511179-CT-16APR-Caltrain-Saturday-01", 29);
        TRIP_ID_MAP.put("6511180-CT-16APR-Caltrain-Saturday-01", 45);
        TRIP_ID_MAP.put("6511181-CT-16APR-Caltrain-Saturday-01", 46);
        TRIP_ID_MAP.put("6511182-CT-16APR-Caltrain-Saturday-01", 47);
        TRIP_ID_MAP.put("6511183-CT-16APR-Caltrain-Saturday-01", 49);
        TRIP_ID_MAP.put("6511184-CT-16APR-Caltrain-Saturday-01", 50);
        TRIP_ID_MAP.put("6511185-CT-16APR-Caltrain-Saturday-01", 51);
        TRIP_ID_MAP.put("6511186-CT-16APR-Caltrain-Saturday-01", 52);
        TRIP_ID_MAP.put("6511187-CT-16APR-Caltrain-Saturday-01", 53);
        TRIP_ID_MAP.put("6511188-CT-16APR-Caltrain-Saturday-01", 54);
        TRIP_ID_MAP.put("6511189-CT-16APR-Caltrain-Saturday-01", 56);
        TRIP_ID_MAP.put("6511190-CT-16APR-Caltrain-Saturday-01", 57);
        TRIP_ID_MAP.put("6511191-CT-16APR-Caltrain-Saturday-01", 58);
        TRIP_ID_MAP.put("6511192-CT-16APR-Caltrain-Saturday-01", 59);
        TRIP_ID_MAP.put("6511004-CT-16APR-Caltrain-Sunday-01", 422);
        TRIP_ID_MAP.put("6511005-CT-16APR-Caltrain-Sunday-01", 424);
        TRIP_ID_MAP.put("6511006-CT-16APR-Caltrain-Sunday-01", 426);
        TRIP_ID_MAP.put("6511007-CT-16APR-Caltrain-Sunday-01", 428);
        TRIP_ID_MAP.put("6511008-CT-16APR-Caltrain-Sunday-01", 430);
        TRIP_ID_MAP.put("6511009-CT-16APR-Caltrain-Sunday-01", 432);
        TRIP_ID_MAP.put("6511010-CT-16APR-Caltrain-Sunday-01", 434);
        TRIP_ID_MAP.put("6511011-CT-16APR-Caltrain-Sunday-01", 436);
        TRIP_ID_MAP.put("6511012-CT-16APR-Caltrain-Sunday-01", 438);
        TRIP_ID_MAP.put("6511013-CT-16APR-Caltrain-Sunday-01", 440);
        TRIP_ID_MAP.put("6511014-CT-16APR-Caltrain-Sunday-01", 442);
        TRIP_ID_MAP.put("6511015-CT-16APR-Caltrain-Sunday-01", 444);
        TRIP_ID_MAP.put("6511016-CT-16APR-Caltrain-Sunday-01", 446);
        TRIP_ID_MAP.put("6511017-CT-16APR-Caltrain-Sunday-01", 448);
        TRIP_ID_MAP.put("6511018-CT-16APR-Caltrain-Sunday-01", 423);
        TRIP_ID_MAP.put("6511019-CT-16APR-Caltrain-Sunday-01", 425);
        TRIP_ID_MAP.put("6511020-CT-16APR-Caltrain-Sunday-01", 427);
        TRIP_ID_MAP.put("6511021-CT-16APR-Caltrain-Sunday-01", 429);
        TRIP_ID_MAP.put("6511022-CT-16APR-Caltrain-Sunday-01", 431);
        TRIP_ID_MAP.put("6511023-CT-16APR-Caltrain-Sunday-01", 433);
        TRIP_ID_MAP.put("6511024-CT-16APR-Caltrain-Sunday-01", 435);
        TRIP_ID_MAP.put("6511025-CT-16APR-Caltrain-Sunday-01", 437);
        TRIP_ID_MAP.put("6511026-CT-16APR-Caltrain-Sunday-01", 439);
        TRIP_ID_MAP.put("6511027-CT-16APR-Caltrain-Sunday-01", 441);
        TRIP_ID_MAP.put("6511028-CT-16APR-Caltrain-Sunday-01", 443);
        TRIP_ID_MAP.put("6511029-CT-16APR-Caltrain-Sunday-01", 445);
        TRIP_ID_MAP.put("6511030-CT-16APR-Caltrain-Sunday-01", 447);
        TRIP_ID_MAP.put("6511031-CT-16APR-Caltrain-Sunday-01", 449);
        TRIP_ID_MAP.put("6511032-CT-16APR-Caltrain-Sunday-01", 801);
        TRIP_ID_MAP.put("6511033-CT-16APR-Caltrain-Sunday-01", 803);
        TRIP_ID_MAP.put("6511034-CT-16APR-Caltrain-Sunday-01", 802);
        TRIP_ID_MAP.put("6511035-CT-16APR-Caltrain-Sunday-01", 804);
        TRIP_ID_MAP.put("6511164-CT-16APR-Caltrain-Sunday-01", 30);
        TRIP_ID_MAP.put("6511165-CT-16APR-Caltrain-Sunday-01", 31);
        TRIP_ID_MAP.put("6511166-CT-16APR-Caltrain-Sunday-01", 32);
        TRIP_ID_MAP.put("6511167-CT-16APR-Caltrain-Sunday-01", 33);
        TRIP_ID_MAP.put("6511168-CT-16APR-Caltrain-Sunday-01", 34);
        TRIP_ID_MAP.put("6511169-CT-16APR-Caltrain-Sunday-01", 35);
        TRIP_ID_MAP.put("6511170-CT-16APR-Caltrain-Sunday-01", 36);
        TRIP_ID_MAP.put("6511171-CT-16APR-Caltrain-Sunday-01", 37);
        TRIP_ID_MAP.put("6511172-CT-16APR-Caltrain-Sunday-01", 38);
        TRIP_ID_MAP.put("6511173-CT-16APR-Caltrain-Sunday-01", 39);
        TRIP_ID_MAP.put("6511174-CT-16APR-Caltrain-Sunday-01", 40);
        TRIP_ID_MAP.put("6511175-CT-16APR-Caltrain-Sunday-01", 41);
        TRIP_ID_MAP.put("6511176-CT-16APR-Caltrain-Sunday-01", 42);
        TRIP_ID_MAP.put("6511177-CT-16APR-Caltrain-Sunday-01", 44);
        TRIP_ID_MAP.put("6511178-CT-16APR-Caltrain-Sunday-01", 43);
        TRIP_ID_MAP.put("6511179-CT-16APR-Caltrain-Sunday-01", 29);
        TRIP_ID_MAP.put("6511180-CT-16APR-Caltrain-Sunday-01", 45);
        TRIP_ID_MAP.put("6511181-CT-16APR-Caltrain-Sunday-01", 46);
        TRIP_ID_MAP.put("6511182-CT-16APR-Caltrain-Sunday-01", 47);
        TRIP_ID_MAP.put("6511183-CT-16APR-Caltrain-Sunday-01", 49);
        TRIP_ID_MAP.put("6511184-CT-16APR-Caltrain-Sunday-01", 50);
        TRIP_ID_MAP.put("6511185-CT-16APR-Caltrain-Sunday-01", 51);
        TRIP_ID_MAP.put("6511186-CT-16APR-Caltrain-Sunday-01", 52);
        TRIP_ID_MAP.put("6511187-CT-16APR-Caltrain-Sunday-01", 53);
        TRIP_ID_MAP.put("6511188-CT-16APR-Caltrain-Sunday-01", 54);
        TRIP_ID_MAP.put("6511189-CT-16APR-Caltrain-Sunday-01", 56);
        TRIP_ID_MAP.put("6511190-CT-16APR-Caltrain-Sunday-01", 57);
        TRIP_ID_MAP.put("6511191-CT-16APR-Caltrain-Sunday-01", 58);
        TRIP_ID_MAP.put("6511192-CT-16APR-Caltrain-Sunday-01", 59);
        TRIP_ID_MAP.put("6511041-CT-16APR-Combo-Weekday-01", 371);
        TRIP_ID_MAP.put("6511042-CT-16APR-Combo-Weekday-01", 381);
        TRIP_ID_MAP.put("6511043-CT-16APR-Combo-Weekday-01", 305);
        TRIP_ID_MAP.put("6511044-CT-16APR-Combo-Weekday-01", 313);
        TRIP_ID_MAP.put("6511045-CT-16APR-Combo-Weekday-01", 323);
        TRIP_ID_MAP.put("6511046-CT-16APR-Combo-Weekday-01", 309);
        TRIP_ID_MAP.put("6511047-CT-16APR-Combo-Weekday-01", 319);
        TRIP_ID_MAP.put("6511048-CT-16APR-Combo-Weekday-01", 329);
        TRIP_ID_MAP.put("6511054-CT-16APR-Combo-Weekday-01", 366);
        TRIP_ID_MAP.put("6511055-CT-16APR-Combo-Weekday-01", 376);
        TRIP_ID_MAP.put("6511056-CT-16APR-Combo-Weekday-01", 386);
        TRIP_ID_MAP.put("6511062-CT-16APR-Combo-Weekday-01", 210);
        TRIP_ID_MAP.put("6511065-CT-16APR-Combo-Weekday-01", 236);
        TRIP_ID_MAP.put("6511066-CT-16APR-Combo-Weekday-01", 254);
        TRIP_ID_MAP.put("6511067-CT-16APR-Combo-Weekday-01", 258);
        TRIP_ID_MAP.put("6511068-CT-16APR-Combo-Weekday-01", 262);
        TRIP_ID_MAP.put("6511069-CT-16APR-Combo-Weekday-01", 272);
        TRIP_ID_MAP.put("6511070-CT-16APR-Combo-Weekday-01", 282);
        TRIP_ID_MAP.put("6511075-CT-16APR-Combo-Weekday-01", 215);
        TRIP_ID_MAP.put("6511076-CT-16APR-Combo-Weekday-01", 225);
        TRIP_ID_MAP.put("6511077-CT-16APR-Combo-Weekday-01", 233);
        TRIP_ID_MAP.put("6511078-CT-16APR-Combo-Weekday-01", 237);
        TRIP_ID_MAP.put("6511079-CT-16APR-Combo-Weekday-01", 257);
        TRIP_ID_MAP.put("6511086-CT-16APR-Combo-Weekday-01", 289);
        TRIP_ID_MAP.put("6511087-CT-16APR-Combo-Weekday-01", 207);
        TRIP_ID_MAP.put("6511090-CT-16APR-Combo-Weekday-01", 221);
        TRIP_ID_MAP.put("6511100-CT-16APR-Combo-Weekday-01", 143);
        TRIP_ID_MAP.put("6511101-CT-16APR-Combo-Weekday-01", 196);
        TRIP_ID_MAP.put("6511102-CT-16APR-Combo-Weekday-01", 198);
        TRIP_ID_MAP.put("6511103-CT-16APR-Combo-Weekday-01", 101);
        TRIP_ID_MAP.put("6511104-CT-16APR-Combo-Weekday-01", 135);
        TRIP_ID_MAP.put("6511105-CT-16APR-Combo-Weekday-01", 139);
        TRIP_ID_MAP.put("6511106-CT-16APR-Combo-Weekday-01", 147);
        TRIP_ID_MAP.put("6511107-CT-16APR-Combo-Weekday-01", 151);
        TRIP_ID_MAP.put("6511108-CT-16APR-Combo-Weekday-01", 155);
        TRIP_ID_MAP.put("6511110-CT-16APR-Combo-Weekday-01", 191);
        TRIP_ID_MAP.put("6511111-CT-16APR-Combo-Weekday-01", 193);
        TRIP_ID_MAP.put("6511112-CT-16APR-Combo-Weekday-01", 199);
        TRIP_ID_MAP.put("6511113-CT-16APR-Combo-Weekday-01", 102);
        TRIP_ID_MAP.put("6511120-CT-16APR-Combo-Weekday-01", 104);
        TRIP_ID_MAP.put("6511121-CT-16APR-Combo-Weekday-01", 192);
        TRIP_ID_MAP.put("6511122-CT-16APR-Combo-Weekday-01", 194);
        TRIP_ID_MAP.put("6511123-CT-16APR-Combo-Weekday-01", 103);
        TRIP_ID_MAP.put("6511124-CT-16APR-Combo-Weekday-01", 195);
        TRIP_ID_MAP.put("6511125-CT-16APR-Combo-Weekday-01", 197);
        TRIP_ID_MAP.put("6511127-CT-16APR-Combo-Weekday-01", 159);
        TRIP_ID_MAP.put("6511193-CT-16APR-Combo-Weekday-01", 380);
        TRIP_ID_MAP.put("6511194-CT-16APR-Combo-Weekday-01", 370);
        TRIP_ID_MAP.put("6511195-CT-16APR-Combo-Weekday-01", 385);
        TRIP_ID_MAP.put("6511196-CT-16APR-Combo-Weekday-01", 375);
        TRIP_ID_MAP.put("6511197-CT-16APR-Combo-Weekday-01", 365);
        TRIP_ID_MAP.put("6511198-CT-16APR-Combo-Weekday-01", 332);
        TRIP_ID_MAP.put("6511199-CT-16APR-Combo-Weekday-01", 312);
        TRIP_ID_MAP.put("6511200-CT-16APR-Combo-Weekday-01", 322);
        TRIP_ID_MAP.put("6511201-CT-16APR-Combo-Weekday-01", 314);
        TRIP_ID_MAP.put("6511202-CT-16APR-Combo-Weekday-01", 324);
        TRIP_ID_MAP.put("6511203-CT-16APR-Combo-Weekday-01", 360);
        TRIP_ID_MAP.put("6511204-CT-16APR-Combo-Weekday-01", 206);
        TRIP_ID_MAP.put("6511208-CT-16APR-Combo-Weekday-01", 267);
        TRIP_ID_MAP.put("6511209-CT-16APR-Combo-Weekday-01", 277);
        TRIP_ID_MAP.put("6511210-CT-16APR-Combo-Weekday-01", 216);
        TRIP_ID_MAP.put("6511211-CT-16APR-Combo-Weekday-01", 226);
        TRIP_ID_MAP.put("6511212-CT-16APR-Combo-Weekday-01", 220);
        TRIP_ID_MAP.put("6511213-CT-16APR-Combo-Weekday-01", 230);
        TRIP_ID_MAP.put("6511217-CT-16APR-Combo-Weekday-01", 211);
        TRIP_ID_MAP.put("6511218-CT-16APR-Combo-Weekday-01", 231);
        TRIP_ID_MAP.put("6511219-CT-16APR-Combo-Weekday-01", 264);
        TRIP_ID_MAP.put("6511220-CT-16APR-Combo-Weekday-01", 284);
        TRIP_ID_MAP.put("6511221-CT-16APR-Combo-Weekday-01", 268);
        TRIP_ID_MAP.put("6511222-CT-16APR-Combo-Weekday-01", 217);
        TRIP_ID_MAP.put("6511223-CT-16APR-Combo-Weekday-01", 227);
        TRIP_ID_MAP.put("6511224-CT-16APR-Combo-Weekday-01", 274);
        TRIP_ID_MAP.put("6511225-CT-16APR-Combo-Weekday-01", 278);
        TRIP_ID_MAP.put("6511226-CT-16APR-Combo-Weekday-01", 288);
        TRIP_ID_MAP.put("6511477-CT-16APR-Combo-Weekday-01", 208);
        TRIP_ID_MAP.put("6511478-CT-16APR-Combo-Weekday-01", 218);
        TRIP_ID_MAP.put("6511479-CT-16APR-Combo-Weekday-01", 228);
        TRIP_ID_MAP.put("6511480-CT-16APR-Combo-Weekday-01", 261);
        TRIP_ID_MAP.put("6511481-CT-16APR-Combo-Weekday-01", 269);
        TRIP_ID_MAP.put("6511482-CT-16APR-Combo-Weekday-01", 279);
        TRIP_ID_MAP.put("6511483-CT-16APR-Combo-Weekday-01", 263);
        TRIP_ID_MAP.put("6511484-CT-16APR-Combo-Weekday-01", 273);
        TRIP_ID_MAP.put("6511485-CT-16APR-Combo-Weekday-01", 283);
        TRIP_ID_MAP.put("6511486-CT-16APR-Combo-Weekday-01", 287);
        TRIP_ID_MAP.put("6511526-CT-16APR-Combo-Weekday-01", 146);
        TRIP_ID_MAP.put("6511528-CT-16APR-Combo-Weekday-01", 138);
        TRIP_ID_MAP.put("6511530-CT-16APR-Combo-Weekday-01", 142);
        TRIP_ID_MAP.put("6511532-CT-16APR-Combo-Weekday-01", 150);
        TRIP_ID_MAP.put("6511533-CT-16APR-Combo-Weekday-01", 152);
        TRIP_ID_MAP.put("6511534-CT-16APR-Combo-Weekday-01", 156);
        TRIP_ID_MAP.put("6511535-CT-16APR-Combo-Weekday-01", 190);
        TRIP_ID_MAP.put("6511536-CT-16APR-Combo-Weekday-01", 134);
        TRIP_ID_MAP.put("6511323-CT-17APR-Caltrain-Saturday-01", 422);
        TRIP_ID_MAP.put("6511324-CT-17APR-Caltrain-Saturday-01", 424);
        TRIP_ID_MAP.put("6511325-CT-17APR-Caltrain-Saturday-01", 426);
        TRIP_ID_MAP.put("6511326-CT-17APR-Caltrain-Saturday-01", 428);
        TRIP_ID_MAP.put("6511327-CT-17APR-Caltrain-Saturday-01", 430);
        TRIP_ID_MAP.put("6511328-CT-17APR-Caltrain-Saturday-01", 432);
        TRIP_ID_MAP.put("6511329-CT-17APR-Caltrain-Saturday-01", 434);
        TRIP_ID_MAP.put("6511330-CT-17APR-Caltrain-Saturday-01", 436);
        TRIP_ID_MAP.put("6511331-CT-17APR-Caltrain-Saturday-01", 438);
        TRIP_ID_MAP.put("6511332-CT-17APR-Caltrain-Saturday-01", 440);
        TRIP_ID_MAP.put("6511333-CT-17APR-Caltrain-Saturday-01", 442);
        TRIP_ID_MAP.put("6511334-CT-17APR-Caltrain-Saturday-01", 444);
        TRIP_ID_MAP.put("6511335-CT-17APR-Caltrain-Saturday-01", 446);
        TRIP_ID_MAP.put("6511336-CT-17APR-Caltrain-Saturday-01", 448);
        TRIP_ID_MAP.put("6511337-CT-17APR-Caltrain-Saturday-01", 423);
        TRIP_ID_MAP.put("6511338-CT-17APR-Caltrain-Saturday-01", 425);
        TRIP_ID_MAP.put("6511339-CT-17APR-Caltrain-Saturday-01", 427);
        TRIP_ID_MAP.put("6511340-CT-17APR-Caltrain-Saturday-01", 429);
        TRIP_ID_MAP.put("6511341-CT-17APR-Caltrain-Saturday-01", 431);
        TRIP_ID_MAP.put("6511342-CT-17APR-Caltrain-Saturday-01", 433);
        TRIP_ID_MAP.put("6511343-CT-17APR-Caltrain-Saturday-01", 435);
        TRIP_ID_MAP.put("6511344-CT-17APR-Caltrain-Saturday-01", 437);
        TRIP_ID_MAP.put("6511345-CT-17APR-Caltrain-Saturday-01", 439);
        TRIP_ID_MAP.put("6511346-CT-17APR-Caltrain-Saturday-01", 441);
        TRIP_ID_MAP.put("6511347-CT-17APR-Caltrain-Saturday-01", 443);
        TRIP_ID_MAP.put("6511348-CT-17APR-Caltrain-Saturday-01", 445);
        TRIP_ID_MAP.put("6511349-CT-17APR-Caltrain-Saturday-01", 447);
        TRIP_ID_MAP.put("6511350-CT-17APR-Caltrain-Saturday-01", 449);
        TRIP_ID_MAP.put("6511351-CT-17APR-Caltrain-Saturday-01", 801);
        TRIP_ID_MAP.put("6511352-CT-17APR-Caltrain-Saturday-01", 803);
        TRIP_ID_MAP.put("6511353-CT-17APR-Caltrain-Saturday-01", 802);
        TRIP_ID_MAP.put("6511354-CT-17APR-Caltrain-Saturday-01", 804);
        TRIP_ID_MAP.put("6511355-CT-17APR-Caltrain-Saturday-01", 450);
        TRIP_ID_MAP.put("6511356-CT-17APR-Caltrain-Saturday-01", 454);
        TRIP_ID_MAP.put("6511357-CT-17APR-Caltrain-Saturday-01", 421);
        TRIP_ID_MAP.put("6511358-CT-17APR-Caltrain-Saturday-01", 451);
        TRIP_ID_MAP.put("6511391-CT-17APR-Caltrain-Saturday-01", 30);
        TRIP_ID_MAP.put("6511392-CT-17APR-Caltrain-Saturday-01", 31);
        TRIP_ID_MAP.put("6511393-CT-17APR-Caltrain-Saturday-01", 32);
        TRIP_ID_MAP.put("6511394-CT-17APR-Caltrain-Saturday-01", 33);
        TRIP_ID_MAP.put("6511395-CT-17APR-Caltrain-Saturday-01", 34);
        TRIP_ID_MAP.put("6511396-CT-17APR-Caltrain-Saturday-01", 35);
        TRIP_ID_MAP.put("6511397-CT-17APR-Caltrain-Saturday-01", 36);
        TRIP_ID_MAP.put("6511398-CT-17APR-Caltrain-Saturday-01", 37);
        TRIP_ID_MAP.put("6511399-CT-17APR-Caltrain-Saturday-01", 38);
        TRIP_ID_MAP.put("6511400-CT-17APR-Caltrain-Saturday-01", 39);
        TRIP_ID_MAP.put("6511401-CT-17APR-Caltrain-Saturday-01", 40);
        TRIP_ID_MAP.put("6511402-CT-17APR-Caltrain-Saturday-01", 41);
        TRIP_ID_MAP.put("6511403-CT-17APR-Caltrain-Saturday-01", 42);
        TRIP_ID_MAP.put("6511404-CT-17APR-Caltrain-Saturday-01", 44);
        TRIP_ID_MAP.put("6511405-CT-17APR-Caltrain-Saturday-01", 43);
        TRIP_ID_MAP.put("6511406-CT-17APR-Caltrain-Saturday-01", 29);
        TRIP_ID_MAP.put("6511407-CT-17APR-Caltrain-Saturday-01", 45);
        TRIP_ID_MAP.put("6511408-CT-17APR-Caltrain-Saturday-01", 46);
        TRIP_ID_MAP.put("6511409-CT-17APR-Caltrain-Saturday-01", 47);
        TRIP_ID_MAP.put("6511410-CT-17APR-Caltrain-Saturday-01", 49);
        TRIP_ID_MAP.put("6511411-CT-17APR-Caltrain-Saturday-01", 50);
        TRIP_ID_MAP.put("6511412-CT-17APR-Caltrain-Saturday-01", 51);
        TRIP_ID_MAP.put("6511413-CT-17APR-Caltrain-Saturday-01", 52);
        TRIP_ID_MAP.put("6511414-CT-17APR-Caltrain-Saturday-01", 53);
        TRIP_ID_MAP.put("6511415-CT-17APR-Caltrain-Saturday-01", 54);
        TRIP_ID_MAP.put("6511416-CT-17APR-Caltrain-Saturday-01", 56);
        TRIP_ID_MAP.put("6511417-CT-17APR-Caltrain-Saturday-01", 57);
        TRIP_ID_MAP.put("6511418-CT-17APR-Caltrain-Saturday-01", 58);
        TRIP_ID_MAP.put("6511419-CT-17APR-Caltrain-Saturday-01", 59);
        TRIP_ID_MAP.put("6511359-CT-17APR-Caltrain-Sunday-01", 422);
        TRIP_ID_MAP.put("6511360-CT-17APR-Caltrain-Sunday-01", 424);
        TRIP_ID_MAP.put("6511361-CT-17APR-Caltrain-Sunday-01", 426);
        TRIP_ID_MAP.put("6511362-CT-17APR-Caltrain-Sunday-01", 428);
        TRIP_ID_MAP.put("6511363-CT-17APR-Caltrain-Sunday-01", 430);
        TRIP_ID_MAP.put("6511364-CT-17APR-Caltrain-Sunday-01", 432);
        TRIP_ID_MAP.put("6511365-CT-17APR-Caltrain-Sunday-01", 434);
        TRIP_ID_MAP.put("6511366-CT-17APR-Caltrain-Sunday-01", 436);
        TRIP_ID_MAP.put("6511367-CT-17APR-Caltrain-Sunday-01", 438);
        TRIP_ID_MAP.put("6511368-CT-17APR-Caltrain-Sunday-01", 440);
        TRIP_ID_MAP.put("6511369-CT-17APR-Caltrain-Sunday-01", 442);
        TRIP_ID_MAP.put("6511370-CT-17APR-Caltrain-Sunday-01", 444);
        TRIP_ID_MAP.put("6511371-CT-17APR-Caltrain-Sunday-01", 446);
        TRIP_ID_MAP.put("6511372-CT-17APR-Caltrain-Sunday-01", 448);
        TRIP_ID_MAP.put("6511373-CT-17APR-Caltrain-Sunday-01", 423);
        TRIP_ID_MAP.put("6511374-CT-17APR-Caltrain-Sunday-01", 425);
        TRIP_ID_MAP.put("6511375-CT-17APR-Caltrain-Sunday-01", 427);
        TRIP_ID_MAP.put("6511376-CT-17APR-Caltrain-Sunday-01", 429);
        TRIP_ID_MAP.put("6511377-CT-17APR-Caltrain-Sunday-01", 431);
        TRIP_ID_MAP.put("6511378-CT-17APR-Caltrain-Sunday-01", 433);
        TRIP_ID_MAP.put("6511379-CT-17APR-Caltrain-Sunday-01", 435);
        TRIP_ID_MAP.put("6511380-CT-17APR-Caltrain-Sunday-01", 437);
        TRIP_ID_MAP.put("6511381-CT-17APR-Caltrain-Sunday-01", 439);
        TRIP_ID_MAP.put("6511382-CT-17APR-Caltrain-Sunday-01", 441);
        TRIP_ID_MAP.put("6511383-CT-17APR-Caltrain-Sunday-01", 443);
        TRIP_ID_MAP.put("6511384-CT-17APR-Caltrain-Sunday-01", 445);
        TRIP_ID_MAP.put("6511385-CT-17APR-Caltrain-Sunday-01", 447);
        TRIP_ID_MAP.put("6511386-CT-17APR-Caltrain-Sunday-01", 449);
        TRIP_ID_MAP.put("6511387-CT-17APR-Caltrain-Sunday-01", 801);
        TRIP_ID_MAP.put("6511388-CT-17APR-Caltrain-Sunday-01", 803);
        TRIP_ID_MAP.put("6511389-CT-17APR-Caltrain-Sunday-01", 802);
        TRIP_ID_MAP.put("6511390-CT-17APR-Caltrain-Sunday-01", 804);
        TRIP_ID_MAP.put("6511391-CT-17APR-Caltrain-Sunday-01", 30);
        TRIP_ID_MAP.put("6511392-CT-17APR-Caltrain-Sunday-01", 31);
        TRIP_ID_MAP.put("6511393-CT-17APR-Caltrain-Sunday-01", 32);
        TRIP_ID_MAP.put("6511394-CT-17APR-Caltrain-Sunday-01", 33);
        TRIP_ID_MAP.put("6511395-CT-17APR-Caltrain-Sunday-01", 34);
        TRIP_ID_MAP.put("6511396-CT-17APR-Caltrain-Sunday-01", 35);
        TRIP_ID_MAP.put("6511397-CT-17APR-Caltrain-Sunday-01", 36);
        TRIP_ID_MAP.put("6511398-CT-17APR-Caltrain-Sunday-01", 37);
        TRIP_ID_MAP.put("6511399-CT-17APR-Caltrain-Sunday-01", 38);
        TRIP_ID_MAP.put("6511400-CT-17APR-Caltrain-Sunday-01", 39);
        TRIP_ID_MAP.put("6511401-CT-17APR-Caltrain-Sunday-01", 40);
        TRIP_ID_MAP.put("6511402-CT-17APR-Caltrain-Sunday-01", 41);
        TRIP_ID_MAP.put("6511403-CT-17APR-Caltrain-Sunday-01", 42);
        TRIP_ID_MAP.put("6511404-CT-17APR-Caltrain-Sunday-01", 44);
        TRIP_ID_MAP.put("6511405-CT-17APR-Caltrain-Sunday-01", 43);
        TRIP_ID_MAP.put("6511406-CT-17APR-Caltrain-Sunday-01", 29);
        TRIP_ID_MAP.put("6511407-CT-17APR-Caltrain-Sunday-01", 45);
        TRIP_ID_MAP.put("6511408-CT-17APR-Caltrain-Sunday-01", 46);
        TRIP_ID_MAP.put("6511409-CT-17APR-Caltrain-Sunday-01", 47);
        TRIP_ID_MAP.put("6511410-CT-17APR-Caltrain-Sunday-01", 49);
        TRIP_ID_MAP.put("6511411-CT-17APR-Caltrain-Sunday-01", 50);
        TRIP_ID_MAP.put("6511412-CT-17APR-Caltrain-Sunday-01", 51);
        TRIP_ID_MAP.put("6511413-CT-17APR-Caltrain-Sunday-01", 52);
        TRIP_ID_MAP.put("6511414-CT-17APR-Caltrain-Sunday-01", 53);
        TRIP_ID_MAP.put("6511415-CT-17APR-Caltrain-Sunday-01", 54);
        TRIP_ID_MAP.put("6511416-CT-17APR-Caltrain-Sunday-01", 56);
        TRIP_ID_MAP.put("6511417-CT-17APR-Caltrain-Sunday-01", 57);
        TRIP_ID_MAP.put("6511418-CT-17APR-Caltrain-Sunday-01", 58);
        TRIP_ID_MAP.put("6511419-CT-17APR-Caltrain-Sunday-01", 59);
        TRIP_ID_MAP.put("6511232-CT-17APR-Combo-Weekday-01", 196);
        TRIP_ID_MAP.put("6511240-CT-17APR-Combo-Weekday-01", 190);
        TRIP_ID_MAP.put("6511244-CT-17APR-Combo-Weekday-01", 102);
        TRIP_ID_MAP.put("6511251-CT-17APR-Combo-Weekday-01", 104);
        TRIP_ID_MAP.put("6511276-CT-17APR-Combo-Weekday-01", 221);
        TRIP_ID_MAP.put("6511293-CT-17APR-Combo-Weekday-01", 217);
        TRIP_ID_MAP.put("6511294-CT-17APR-Combo-Weekday-01", 227);
        TRIP_ID_MAP.put("6511301-CT-17APR-Combo-Weekday-01", 371);
        TRIP_ID_MAP.put("6511302-CT-17APR-Combo-Weekday-01", 381);
        TRIP_ID_MAP.put("6511306-CT-17APR-Combo-Weekday-01", 309);
        TRIP_ID_MAP.put("6511307-CT-17APR-Combo-Weekday-01", 319);
        TRIP_ID_MAP.put("6511420-CT-17APR-Combo-Weekday-01", 101);
        TRIP_ID_MAP.put("6511421-CT-17APR-Combo-Weekday-01", 135);
        TRIP_ID_MAP.put("6511422-CT-17APR-Combo-Weekday-01", 139);
        TRIP_ID_MAP.put("6511423-CT-17APR-Combo-Weekday-01", 143);
        TRIP_ID_MAP.put("6511424-CT-17APR-Combo-Weekday-01", 147);
        TRIP_ID_MAP.put("6511425-CT-17APR-Combo-Weekday-01", 151);
        TRIP_ID_MAP.put("6511426-CT-17APR-Combo-Weekday-01", 155);
        TRIP_ID_MAP.put("6511427-CT-17APR-Combo-Weekday-01", 191);
        TRIP_ID_MAP.put("6511428-CT-17APR-Combo-Weekday-01", 193);
        TRIP_ID_MAP.put("6511429-CT-17APR-Combo-Weekday-01", 199);
        TRIP_ID_MAP.put("6511430-CT-17APR-Combo-Weekday-01", 150);
        TRIP_ID_MAP.put("6511432-CT-17APR-Combo-Weekday-01", 152);
        TRIP_ID_MAP.put("6511433-CT-17APR-Combo-Weekday-01", 134);
        TRIP_ID_MAP.put("6511434-CT-17APR-Combo-Weekday-01", 138);
        TRIP_ID_MAP.put("6511435-CT-17APR-Combo-Weekday-01", 142);
        TRIP_ID_MAP.put("6511436-CT-17APR-Combo-Weekday-01", 146);
        TRIP_ID_MAP.put("6511439-CT-17APR-Combo-Weekday-01", 198);
        TRIP_ID_MAP.put("6511440-CT-17APR-Combo-Weekday-01", 156);
        TRIP_ID_MAP.put("6511441-CT-17APR-Combo-Weekday-01", 192);
        TRIP_ID_MAP.put("6511442-CT-17APR-Combo-Weekday-01", 194);
        TRIP_ID_MAP.put("6511443-CT-17APR-Combo-Weekday-01", 206);
        TRIP_ID_MAP.put("6511444-CT-17APR-Combo-Weekday-01", 208);
        TRIP_ID_MAP.put("6511445-CT-17APR-Combo-Weekday-01", 218);
        TRIP_ID_MAP.put("6511446-CT-17APR-Combo-Weekday-01", 263);
        TRIP_ID_MAP.put("6511447-CT-17APR-Combo-Weekday-01", 273);
        TRIP_ID_MAP.put("6511448-CT-17APR-Combo-Weekday-01", 283);
        TRIP_ID_MAP.put("6511449-CT-17APR-Combo-Weekday-01", 216);
        TRIP_ID_MAP.put("6511450-CT-17APR-Combo-Weekday-01", 226);
        TRIP_ID_MAP.put("6511451-CT-17APR-Combo-Weekday-01", 267);
        TRIP_ID_MAP.put("6511452-CT-17APR-Combo-Weekday-01", 277);
        TRIP_ID_MAP.put("6511453-CT-17APR-Combo-Weekday-01", 261);
        TRIP_ID_MAP.put("6511454-CT-17APR-Combo-Weekday-01", 269);
        TRIP_ID_MAP.put("6511455-CT-17APR-Combo-Weekday-01", 279);
        TRIP_ID_MAP.put("6511456-CT-17APR-Combo-Weekday-01", 236);
        TRIP_ID_MAP.put("6511457-CT-17APR-Combo-Weekday-01", 254);
        TRIP_ID_MAP.put("6511458-CT-17APR-Combo-Weekday-01", 258);
        TRIP_ID_MAP.put("6511459-CT-17APR-Combo-Weekday-01", 233);
        TRIP_ID_MAP.put("6511460-CT-17APR-Combo-Weekday-01", 237);
        TRIP_ID_MAP.put("6511461-CT-17APR-Combo-Weekday-01", 257);
        TRIP_ID_MAP.put("6511462-CT-17APR-Combo-Weekday-01", 282);
        TRIP_ID_MAP.put("6511463-CT-17APR-Combo-Weekday-01", 215);
        TRIP_ID_MAP.put("6511464-CT-17APR-Combo-Weekday-01", 225);
        TRIP_ID_MAP.put("6511465-CT-17APR-Combo-Weekday-01", 231);
        TRIP_ID_MAP.put("6511466-CT-17APR-Combo-Weekday-01", 264);
        TRIP_ID_MAP.put("6511467-CT-17APR-Combo-Weekday-01", 284);
        TRIP_ID_MAP.put("6511468-CT-17APR-Combo-Weekday-01", 274);
        TRIP_ID_MAP.put("6511470-CT-17APR-Combo-Weekday-01", 278);
        TRIP_ID_MAP.put("6511471-CT-17APR-Combo-Weekday-01", 288);
        TRIP_ID_MAP.put("6511472-CT-17APR-Combo-Weekday-01", 289);
        TRIP_ID_MAP.put("6511473-CT-17APR-Combo-Weekday-01", 228);
        TRIP_ID_MAP.put("6511475-CT-17APR-Combo-Weekday-01", 268);
        TRIP_ID_MAP.put("6511476-CT-17APR-Combo-Weekday-01", 207);
        TRIP_ID_MAP.put("6511489-CT-17APR-Combo-Weekday-01", 159);
        TRIP_ID_MAP.put("6511490-CT-17APR-Combo-Weekday-01", 323);
        TRIP_ID_MAP.put("6511491-CT-17APR-Combo-Weekday-01", 313);
        TRIP_ID_MAP.put("6511492-CT-17APR-Combo-Weekday-01", 360);
        TRIP_ID_MAP.put("6511493-CT-17APR-Combo-Weekday-01", 380);
        TRIP_ID_MAP.put("6511494-CT-17APR-Combo-Weekday-01", 370);
        TRIP_ID_MAP.put("6511495-CT-17APR-Combo-Weekday-01", 329);
        TRIP_ID_MAP.put("6511496-CT-17APR-Combo-Weekday-01", 365);
        TRIP_ID_MAP.put("6511497-CT-17APR-Combo-Weekday-01", 375);
        TRIP_ID_MAP.put("6511498-CT-17APR-Combo-Weekday-01", 385);
        TRIP_ID_MAP.put("6511499-CT-17APR-Combo-Weekday-01", 305);
        TRIP_ID_MAP.put("6511500-CT-17APR-Combo-Weekday-01", 324);
        TRIP_ID_MAP.put("6511501-CT-17APR-Combo-Weekday-01", 314);
        TRIP_ID_MAP.put("6511502-CT-17APR-Combo-Weekday-01", 103);
        TRIP_ID_MAP.put("6511503-CT-17APR-Combo-Weekday-01", 197);
        TRIP_ID_MAP.put("6511505-CT-17APR-Combo-Weekday-01", 386);
        TRIP_ID_MAP.put("6511506-CT-17APR-Combo-Weekday-01", 222);
        TRIP_ID_MAP.put("6511507-CT-17APR-Combo-Weekday-01", 232);
        TRIP_ID_MAP.put("6511508-CT-17APR-Combo-Weekday-01", 262);
        TRIP_ID_MAP.put("6511509-CT-17APR-Combo-Weekday-01", 272);
        TRIP_ID_MAP.put("6511513-CT-17APR-Combo-Weekday-01", 366);
        TRIP_ID_MAP.put("6511514-CT-17APR-Combo-Weekday-01", 376);
        TRIP_ID_MAP.put("6511515-CT-17APR-Combo-Weekday-01", 211);
        TRIP_ID_MAP.put("6511516-CT-17APR-Combo-Weekday-01", 330);
        TRIP_ID_MAP.put("6511517-CT-17APR-Combo-Weekday-01", 320);
        TRIP_ID_MAP.put("6511518-CT-17APR-Combo-Weekday-01", 310);
        TRIP_ID_MAP.put("6511521-CT-17APR-Combo-Weekday-01", 195);
        TRIP_ID_MAP.put("6511522-CT-17APR-Combo-Weekday-01", 287);
        TRIP_ID_MAP.put("6511523-CT-17APR-Combo-Weekday-01", 212);
    }

    private static final SparseArray<TransferModel> TRANSFERS;
    static {
        TRANSFERS = new SparseArray<>();
        // Northbound morning
        TRANSFERS.put(207, new TransferModel(211, DESTINATIONS.indexOf("Menlo Park"), "Menlo Park", "6:41 AM"));
        TRANSFERS.put(217, new TransferModel(221, DESTINATIONS.indexOf("Menlo Park"), "Menlo Park", "7:41 AM"));
        TRANSFERS.put(227, new TransferModel(231, DESTINATIONS.indexOf("Menlo Park"), "Menlo Park", "8:43 AM"));

        // Northbound evening
        TRANSFERS.put(261, new TransferModel(263, DESTINATIONS.indexOf("Redwood City"), "Redwood City", "4:24 PM"));
        TRANSFERS.put(269, new TransferModel(273, DESTINATIONS.indexOf("Redwood City"), "Redwood City", "5:29 PM"));
        TRANSFERS.put(279, new TransferModel(283, DESTINATIONS.indexOf("Redwood City"), "Redwood City", "6:29 PM"));

        // Southbound morning
        TRANSFERS.put(208, new TransferModel(212, DESTINATIONS.indexOf("San Carlos"), "San Carlos", "7:02 AM"));
        TRANSFERS.put(218, new TransferModel(222, DESTINATIONS.indexOf("San Carlos"), "San Carlos", "8:02 AM"));
        TRANSFERS.put(228, new TransferModel(232, DESTINATIONS.indexOf("San Carlos"), "San Carlos", "9:02 AM"));

        // Southbound morning bullet
        TRANSFERS.put(310, new TransferModel(212, DESTINATIONS.indexOf("Redwood City"), "Redwood City", "7:11 AM"));
        TRANSFERS.put(320, new TransferModel(222, DESTINATIONS.indexOf("Redwood City"), "Redwood City", "8:11 AM"));
        TRANSFERS.put(330, new TransferModel(232, DESTINATIONS.indexOf("Redwood City"), "Redwood City", "9:11 AM"));

        // Southbound evening
        TRANSFERS.put(264, new TransferModel(268, DESTINATIONS.indexOf("Redwood City"), "Redwood City", "5:28 PM"));
        TRANSFERS.put(274, new TransferModel(278, DESTINATIONS.indexOf("Redwood City"), "Redwood City", "6:28 PM"));
        TRANSFERS.put(284, new TransferModel(288, DESTINATIONS.indexOf("Redwood City"), "Redwood City", "7:28 PM"));
    }
}
