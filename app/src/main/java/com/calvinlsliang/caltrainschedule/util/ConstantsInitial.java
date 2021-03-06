package com.calvinlsliang.caltrainschedule.util;

import android.util.SparseArray;

import com.calvinlsliang.caltrainschedule.model.StopTimesKey;
import com.calvinlsliang.caltrainschedule.model.TransferModel;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConstantsInitial implements Constants {

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
    public Map<StopTimesKey, String> getSchedule() {
        return SCHEDULE;
    }

    @Override
    public SparseArray<TransferModel> getTransfers() {
        return TRANSFERS;
    }

    @Override
    public Map<String, String> getStopIdMap() {
        return STOP_ID_MAP;
    }

    @Override
    public Map<String, Integer> getTripIdMap() {
        return TRIP_ID_MAP;
    }

    private static final List<String> DESTINATIONS = Arrays.asList(
            "San Francisco", "22nd St", "Bayshore", "So. San Francisco", "San Bruno", "Millbrae", "Broadway", "Burlingame", "San Mateo", "Hayward Park", "Hillsdale", "Belmont", "San Carlos", "Redwood City", "Atherton", "Menlo Park", "Palo Alto", "California Ave", "San Antonio", "Mt View", "Sunnyvale", "Lawrence", "Santa Clara", "College Park", "San Jose Diridon", "Tamien", "Capitol", "Blossom Hill", "Morgan Hill", "San Martin", "Gilroy"
    );

    private static final List<Integer> WEEKDAY_NORTHBOUND_TRAIN_IDS = Arrays.asList(
            101, 103, 305, 207, 309, 211, 313, 215, 217, 319, 221, 323, 225, 227, 329, 231, 233, 135, 237, 139, 143, 147, 151, 155, 257, 159, 261, 263, 365, 267, 269, 371, 273, 375, 277, 279, 381, 283, 385, 287, 289, 191, 193, 195, 197, 199
    );

    private static final List<Integer> WEEKDAY_SOUTHBOUND_TRAIN_IDS = Arrays.asList(
            102, 104, 206, 208, 210, 312, 314, 216, 218, 220, 322, 324, 226, 228, 230, 332, 134, 236, 138, 142, 146, 150, 152, 254, 156, 258, 360, 262, 264, 366, 268, 370, 272, 274, 376, 278, 380, 282, 284, 386, 288, 190, 192, 194, 196, 198
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
        STOP_ID_MAP.put("70101", "Hayward Park");
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
        TRIP_ID_MAP.put("23a", 23);
        TRIP_ID_MAP.put("25a", 25);
        TRIP_ID_MAP.put("27a", 27);
        TRIP_ID_MAP.put("01a", 1);
        TRIP_ID_MAP.put("29a", 29);
        TRIP_ID_MAP.put("31a", 31);
        TRIP_ID_MAP.put("33a", 33);
        TRIP_ID_MAP.put("35a", 35);
        TRIP_ID_MAP.put("37a", 37);
        TRIP_ID_MAP.put("39a", 39);
        TRIP_ID_MAP.put("41a", 41);
        TRIP_ID_MAP.put("03a", 3);
        TRIP_ID_MAP.put("43a", 43);
        TRIP_ID_MAP.put("45a", 45);
        TRIP_ID_MAP.put("47a", 47);
        TRIP_ID_MAP.put("49a", 49);
        TRIP_ID_MAP.put("22a", 22);
        TRIP_ID_MAP.put("24a", 24);
        TRIP_ID_MAP.put("26a", 26);
        TRIP_ID_MAP.put("02a", 2);
        TRIP_ID_MAP.put("30a", 30);
        TRIP_ID_MAP.put("32a", 32);
        TRIP_ID_MAP.put("34a", 34);
        TRIP_ID_MAP.put("36a", 36);
        TRIP_ID_MAP.put("38a", 38);
        TRIP_ID_MAP.put("40a", 40);
        TRIP_ID_MAP.put("04a", 4);
        TRIP_ID_MAP.put("44a", 44);
        TRIP_ID_MAP.put("46a", 46);
        TRIP_ID_MAP.put("421a", 421);
        TRIP_ID_MAP.put("423a", 423);
        TRIP_ID_MAP.put("425a", 425);
        TRIP_ID_MAP.put("427a", 427);
        TRIP_ID_MAP.put("801a", 801);
        TRIP_ID_MAP.put("429a", 429);
        TRIP_ID_MAP.put("431a", 431);
        TRIP_ID_MAP.put("433a", 433);
        TRIP_ID_MAP.put("435a", 435);
        TRIP_ID_MAP.put("437a", 437);
        TRIP_ID_MAP.put("439a", 439);
        TRIP_ID_MAP.put("441a", 441);
        TRIP_ID_MAP.put("803a", 803);
        TRIP_ID_MAP.put("443a", 443);
        TRIP_ID_MAP.put("445a", 445);
        TRIP_ID_MAP.put("447a", 447);
        TRIP_ID_MAP.put("449a", 449);
        TRIP_ID_MAP.put("451a", 451);
        TRIP_ID_MAP.put("422a", 422);
        TRIP_ID_MAP.put("424a", 424);
        TRIP_ID_MAP.put("426a", 426);
        TRIP_ID_MAP.put("428a", 428);
        TRIP_ID_MAP.put("802a", 802);
        TRIP_ID_MAP.put("430a", 430);
        TRIP_ID_MAP.put("432a", 432);
        TRIP_ID_MAP.put("434a", 434);
        TRIP_ID_MAP.put("436a", 436);
        TRIP_ID_MAP.put("438a", 438);
        TRIP_ID_MAP.put("440a", 440);
        TRIP_ID_MAP.put("442a", 442);
        TRIP_ID_MAP.put("804a", 804);
        TRIP_ID_MAP.put("444a", 444);
        TRIP_ID_MAP.put("446a", 446);
        TRIP_ID_MAP.put("448a", 448);
        TRIP_ID_MAP.put("450a", 450);
        TRIP_ID_MAP.put("454a", 454);
        TRIP_ID_MAP.put("23u", 23);
        TRIP_ID_MAP.put("25u", 25);
        TRIP_ID_MAP.put("27u", 27);
        TRIP_ID_MAP.put("01u", 1);
        TRIP_ID_MAP.put("29u", 29);
        TRIP_ID_MAP.put("31u", 31);
        TRIP_ID_MAP.put("33u", 33);
        TRIP_ID_MAP.put("35u", 35);
        TRIP_ID_MAP.put("37u", 37);
        TRIP_ID_MAP.put("39u", 39);
        TRIP_ID_MAP.put("41u", 41);
        TRIP_ID_MAP.put("03u", 3);
        TRIP_ID_MAP.put("43u", 43);
        TRIP_ID_MAP.put("45u", 45);
        TRIP_ID_MAP.put("47u", 47);
        TRIP_ID_MAP.put("49u", 49);
        TRIP_ID_MAP.put("22u", 22);
        TRIP_ID_MAP.put("24u", 24);
        TRIP_ID_MAP.put("26u", 26);
        TRIP_ID_MAP.put("02u", 2);
        TRIP_ID_MAP.put("30u", 30);
        TRIP_ID_MAP.put("32u", 32);
        TRIP_ID_MAP.put("34u", 34);
        TRIP_ID_MAP.put("36u", 36);
        TRIP_ID_MAP.put("38u", 38);
        TRIP_ID_MAP.put("40u", 40);
        TRIP_ID_MAP.put("04u", 4);
        TRIP_ID_MAP.put("44u", 44);
        TRIP_ID_MAP.put("46u", 46);
        TRIP_ID_MAP.put("423u", 423);
        TRIP_ID_MAP.put("425u", 425);
        TRIP_ID_MAP.put("427u", 427);
        TRIP_ID_MAP.put("801u", 801);
        TRIP_ID_MAP.put("429u", 429);
        TRIP_ID_MAP.put("431u", 431);
        TRIP_ID_MAP.put("433u", 433);
        TRIP_ID_MAP.put("435u", 435);
        TRIP_ID_MAP.put("437u", 437);
        TRIP_ID_MAP.put("439u", 439);
        TRIP_ID_MAP.put("441u", 441);
        TRIP_ID_MAP.put("803u", 803);
        TRIP_ID_MAP.put("443u", 443);
        TRIP_ID_MAP.put("445u", 445);
        TRIP_ID_MAP.put("447u", 447);
        TRIP_ID_MAP.put("449u", 449);
        TRIP_ID_MAP.put("422u", 422);
        TRIP_ID_MAP.put("424u", 424);
        TRIP_ID_MAP.put("426u", 426);
        TRIP_ID_MAP.put("428u", 428);
        TRIP_ID_MAP.put("802u", 802);
        TRIP_ID_MAP.put("430u", 430);
        TRIP_ID_MAP.put("432u", 432);
        TRIP_ID_MAP.put("434u", 434);
        TRIP_ID_MAP.put("436u", 436);
        TRIP_ID_MAP.put("438u", 438);
        TRIP_ID_MAP.put("440u", 440);
        TRIP_ID_MAP.put("442u", 442);
        TRIP_ID_MAP.put("804u", 804);
        TRIP_ID_MAP.put("444u", 444);
        TRIP_ID_MAP.put("446u", 446);
        TRIP_ID_MAP.put("448u", 448);
        TRIP_ID_MAP.put("101", 101);
        TRIP_ID_MAP.put("103", 103);
        TRIP_ID_MAP.put("305", 305);
        TRIP_ID_MAP.put("207", 207);
        TRIP_ID_MAP.put("309", 309);
        TRIP_ID_MAP.put("211", 211);
        TRIP_ID_MAP.put("313", 313);
        TRIP_ID_MAP.put("215", 215);
        TRIP_ID_MAP.put("217", 217);
        TRIP_ID_MAP.put("319", 319);
        TRIP_ID_MAP.put("221", 221);
        TRIP_ID_MAP.put("323", 323);
        TRIP_ID_MAP.put("225", 225);
        TRIP_ID_MAP.put("227", 227);
        TRIP_ID_MAP.put("329", 329);
        TRIP_ID_MAP.put("231", 231);
        TRIP_ID_MAP.put("233", 233);
        TRIP_ID_MAP.put("135", 135);
        TRIP_ID_MAP.put("237", 237);
        TRIP_ID_MAP.put("139", 139);
        TRIP_ID_MAP.put("143", 143);
        TRIP_ID_MAP.put("147", 147);
        TRIP_ID_MAP.put("151", 151);
        TRIP_ID_MAP.put("155", 155);
        TRIP_ID_MAP.put("257", 257);
        TRIP_ID_MAP.put("159", 159);
        TRIP_ID_MAP.put("261", 261);
        TRIP_ID_MAP.put("263", 263);
        TRIP_ID_MAP.put("365", 365);
        TRIP_ID_MAP.put("267", 267);
        TRIP_ID_MAP.put("269", 269);
        TRIP_ID_MAP.put("371", 371);
        TRIP_ID_MAP.put("273", 273);
        TRIP_ID_MAP.put("375", 375);
        TRIP_ID_MAP.put("277", 277);
        TRIP_ID_MAP.put("279", 279);
        TRIP_ID_MAP.put("381", 381);
        TRIP_ID_MAP.put("283", 283);
        TRIP_ID_MAP.put("385", 385);
        TRIP_ID_MAP.put("287", 287);
        TRIP_ID_MAP.put("289", 289);
        TRIP_ID_MAP.put("191", 191);
        TRIP_ID_MAP.put("193", 193);
        TRIP_ID_MAP.put("195", 195);
        TRIP_ID_MAP.put("197", 197);
        TRIP_ID_MAP.put("199", 199);
        TRIP_ID_MAP.put("102", 102);
        TRIP_ID_MAP.put("104", 104);
        TRIP_ID_MAP.put("206", 206);
        TRIP_ID_MAP.put("208", 208);
        TRIP_ID_MAP.put("210", 210);
        TRIP_ID_MAP.put("312", 312);
        TRIP_ID_MAP.put("314", 314);
        TRIP_ID_MAP.put("216", 216);
        TRIP_ID_MAP.put("218", 218);
        TRIP_ID_MAP.put("220", 220);
        TRIP_ID_MAP.put("322", 322);
        TRIP_ID_MAP.put("324", 324);
        TRIP_ID_MAP.put("226", 226);
        TRIP_ID_MAP.put("228", 228);
        TRIP_ID_MAP.put("230", 230);
        TRIP_ID_MAP.put("332", 332);
        TRIP_ID_MAP.put("134", 134);
        TRIP_ID_MAP.put("236", 236);
        TRIP_ID_MAP.put("138", 138);
        TRIP_ID_MAP.put("142", 142);
        TRIP_ID_MAP.put("146", 146);
        TRIP_ID_MAP.put("150", 150);
        TRIP_ID_MAP.put("152", 152);
        TRIP_ID_MAP.put("254", 254);
        TRIP_ID_MAP.put("156", 156);
        TRIP_ID_MAP.put("258", 258);
        TRIP_ID_MAP.put("360", 360);
        TRIP_ID_MAP.put("262", 262);
        TRIP_ID_MAP.put("264", 264);
        TRIP_ID_MAP.put("366", 366);
        TRIP_ID_MAP.put("268", 268);
        TRIP_ID_MAP.put("370", 370);
        TRIP_ID_MAP.put("272", 272);
        TRIP_ID_MAP.put("274", 274);
        TRIP_ID_MAP.put("376", 376);
        TRIP_ID_MAP.put("278", 278);
        TRIP_ID_MAP.put("380", 380);
        TRIP_ID_MAP.put("282", 282);
        TRIP_ID_MAP.put("284", 284);
        TRIP_ID_MAP.put("386", 386);
        TRIP_ID_MAP.put("288", 288);
        TRIP_ID_MAP.put("190", 190);
        TRIP_ID_MAP.put("192", 192);
        TRIP_ID_MAP.put("194", 194);
        TRIP_ID_MAP.put("196", 196);
        TRIP_ID_MAP.put("198", 198);
    }

    private static final SparseArray<TransferModel> TRANSFERS;
    static {
        TRANSFERS = new SparseArray<>();
        TRANSFERS.put(207, new TransferModel(211, DESTINATIONS.indexOf("Menlo Park"), "Menlo Park", "6:42 AM"));
        TRANSFERS.put(217, new TransferModel(221, DESTINATIONS.indexOf("Menlo Park"), "Menlo Park", "7:42 AM"));
        TRANSFERS.put(227, new TransferModel(231, DESTINATIONS.indexOf("Menlo Park"), "Menlo Park", "8:45 AM"));
        TRANSFERS.put(261, new TransferModel(263, DESTINATIONS.indexOf("Redwood City"), "Redwood City", "4:27 PM"));
        TRANSFERS.put(269, new TransferModel(273, DESTINATIONS.indexOf("Redwood City"), "Redwood City", "5:29 PM"));
        TRANSFERS.put(279, new TransferModel(283, DESTINATIONS.indexOf("Redwood City"), "Redwood City", "6:29 PM"));
        TRANSFERS.put(208, new TransferModel(210, DESTINATIONS.indexOf("San Carlos"), "San Carlos", "7:11 AM"));
        TRANSFERS.put(218, new TransferModel(220, DESTINATIONS.indexOf("San Carlos"), "San Carlos", "8:11 AM"));
        TRANSFERS.put(228, new TransferModel(230, DESTINATIONS.indexOf("San Carlos"), "San Carlos", "9:11 AM"));
        TRANSFERS.put(264, new TransferModel(268, DESTINATIONS.indexOf("Redwood City"), "Redwood City", "5:24 PM"));
        TRANSFERS.put(274, new TransferModel(278, DESTINATIONS.indexOf("Redwood City"), "Redwood City", "6:24 PM"));
        TRANSFERS.put(284, new TransferModel(288, DESTINATIONS.indexOf("Redwood City"), "Redwood City", "7:24 PM"));
    }
}
