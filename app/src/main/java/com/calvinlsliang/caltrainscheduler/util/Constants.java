package com.calvinlsliang.caltrainscheduler.util;

import com.calvinlsliang.caltrainscheduler.model.StopTimesKey;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Constants {

    public static final List<String> DESTINATIONS = Arrays.asList(
            "San Francisco", "22nd St", "Bayshore", "So. San Francisco", "San Bruno", "Millbrae", "Broadway", "Burlingame", "San Mateo", "Hayward Park", "Hillsdale", "Belmont", "San Carlos", "Redwood City", "Atherton", "Menlo Park", "Palo Alto", "California Ave", "San Antonio", "Mt View", "Sunnyvale", "Lawrence", "Santa Clara", "College Park", "San Jose Diridon", "Tamien", "Capitol", "Blossom Hill", "Morgan Hill", "San Martin", "Gilroy", "San Jose"
    );

    public static final List<String> NORTHBOUND_DESTINATIONS = Arrays.asList(
            "Gilroy", "San Martin", "Morgan Hill", "Blossom Hill", "Capitol", "Tamien", "San Jose Diridon", "College Park", "Santa Clara", "Lawrence", "Sunnyvale", "Mountain View", "San Antonio", "California Ave", "Palo Alto", "Menlo Park", "Redwood City", "San Carlos", "Belmont", "Hillsdale", "Hayward Park", "San Mateo", "Burlingame", "Millbrae", "San Bruno", "So. San Francisco", "Bayshore", "22nd Street", "San Francisco"
    );

    public static final List<Integer> WEEKDAY_NORTHBOUND_TRAIN_IDS = Arrays.asList(
            101, 103, 305, 207, 309, 211, 313, 215, 217, 319, 221, 323, 225, 227, 329, 231, 233, 135, 237, 139, 143, 147, 151, 155, 257, 159, 261, 263, 365, 267, 269, 371, 273, 375, 277, 279, 381, 283, 385, 287, 289, 191, 193, 195, 197, 199
    );

    public static final List<Integer> WEEKDAY_SOUTHBOUND_TRAIN_IDS = Arrays.asList(
            102, 104, 206, 208, 210, 312, 314, 216, 218, 220, 322, 324, 226, 228, 230, 332, 134, 236, 138, 142, 146, 150, 152, 254, 156, 258, 360, 262, 264, 366, 268, 370, 272, 274, 376, 278, 380, 282, 284, 386, 288, 190, 192, 194, 196, 198
    );

    public static final List<Integer> WEEKEND_NORTHBOUND_TRAIN_IDS = Arrays.asList(
            421, 423, 425, 427, 801, 429, 431, 433, 435, 437, 439, 441, 803, 443, 445, 447, 449, 451
    );

    public static final List<Integer> WEEKEND_SOUTHBOUND_TRAIN_IDS = Arrays.asList(
            422, 424, 426, 428, 802, 430, 432, 434, 436, 438, 440, 442, 804, 444, 446, 448, 450, 454
    );

    public static final HashMap<StopTimesKey, String> SCHEDULE = new HashMap<>();

    public static final Map<String, String> STOP_ID_MAP2;
    static {
        STOP_ID_MAP2 = new HashMap<>();
        STOP_ID_MAP2.put("70011", "San Francisco");
        STOP_ID_MAP2.put("70012", "San Francisco");
        STOP_ID_MAP2.put("70021", "22nd St");
        STOP_ID_MAP2.put("70022", "22nd St");
        STOP_ID_MAP2.put("70031", "Bayshore");
        STOP_ID_MAP2.put("70032", "Bayshore");
        STOP_ID_MAP2.put("70041", "So. San Francisco");
        STOP_ID_MAP2.put("70042", "So. San Francisco");
        STOP_ID_MAP2.put("70051", "San Bruno");
        STOP_ID_MAP2.put("70052", "San Bruno");
        STOP_ID_MAP2.put("70061", "Millbrae");
        STOP_ID_MAP2.put("70062", "Millbrae");
        STOP_ID_MAP2.put("70071", "Broadway");
        STOP_ID_MAP2.put("70072", "Broadway");
        STOP_ID_MAP2.put("70081", "Burlingame");
        STOP_ID_MAP2.put("70082", "Burlingame");
        STOP_ID_MAP2.put("70091", "San Mateo");
        STOP_ID_MAP2.put("70092", "San Mateo");
        STOP_ID_MAP2.put("70101", "Hayward Park");
        STOP_ID_MAP2.put("70102", "Hayward Park");
        STOP_ID_MAP2.put("70111", "Hillsdale");
        STOP_ID_MAP2.put("70112", "Hillsdale");
        STOP_ID_MAP2.put("70121", "Belmont");
        STOP_ID_MAP2.put("70122", "Belmont");
        STOP_ID_MAP2.put("70131", "San Carlos");
        STOP_ID_MAP2.put("70132", "San Carlos");
        STOP_ID_MAP2.put("70141", "Redwood City");
        STOP_ID_MAP2.put("70142", "Redwood City");
        STOP_ID_MAP2.put("70151", "Atherton");
        STOP_ID_MAP2.put("70152", "Atherton");
        STOP_ID_MAP2.put("70161", "Menlo Park");
        STOP_ID_MAP2.put("70162", "Menlo Park");
        STOP_ID_MAP2.put("70171", "Palo Alto");
        STOP_ID_MAP2.put("70172", "Palo Alto");
        STOP_ID_MAP2.put("70191", "California Ave");
        STOP_ID_MAP2.put("70192", "California Ave");
        STOP_ID_MAP2.put("70201", "San Antonio");
        STOP_ID_MAP2.put("70202", "San Antonio");
        STOP_ID_MAP2.put("70211", "Mt View");
        STOP_ID_MAP2.put("70212", "Mt View");
        STOP_ID_MAP2.put("70221", "Sunnyvale");
        STOP_ID_MAP2.put("70222", "Sunnyvale");
        STOP_ID_MAP2.put("70231", "Lawrence");
        STOP_ID_MAP2.put("70232", "Lawrence");
        STOP_ID_MAP2.put("70241", "Santa Clara");
        STOP_ID_MAP2.put("70242", "Santa Clara");
        STOP_ID_MAP2.put("70251", "College Park");
        STOP_ID_MAP2.put("70252", "College Park");
        STOP_ID_MAP2.put("70261", "San Jose Diridon");
        STOP_ID_MAP2.put("70262", "San Jose Diridon");
        STOP_ID_MAP2.put("70271", "Tamien");
        STOP_ID_MAP2.put("70272", "Tamien");
        STOP_ID_MAP2.put("70281", "Capitol");
        STOP_ID_MAP2.put("70282", "Capitol");
        STOP_ID_MAP2.put("70291", "Blossom Hill");
        STOP_ID_MAP2.put("70292", "Blossom Hill");
        STOP_ID_MAP2.put("70301", "Morgan Hill");
        STOP_ID_MAP2.put("70302", "Morgan Hill");
        STOP_ID_MAP2.put("70311", "San Martin");
        STOP_ID_MAP2.put("70312", "San Martin");
        STOP_ID_MAP2.put("70321", "Gilroy");
        STOP_ID_MAP2.put("70322", "Gilroy");
        STOP_ID_MAP2.put("777402", "San Jose");
        STOP_ID_MAP2.put("777403", "Tamien");
    }

    public static final Map<String, Integer> STOP_ID_MAP;
    static {
        STOP_ID_MAP = new HashMap<>();
        STOP_ID_MAP.put("San Francisco", 70011);
        STOP_ID_MAP.put("San Francisco", 70012);
        STOP_ID_MAP.put("22nd St", 70021);
        STOP_ID_MAP.put("22nd St", 70022);
        STOP_ID_MAP.put("Bayshore", 70031);
        STOP_ID_MAP.put("Bayshore", 70032);
        STOP_ID_MAP.put("So. San Francisco", 70041);
        STOP_ID_MAP.put("So. San Francisco", 70042);
        STOP_ID_MAP.put("San Bruno", 70051);
        STOP_ID_MAP.put("San Bruno", 70052);
        STOP_ID_MAP.put("Millbrae", 70061);
        STOP_ID_MAP.put("Millbrae", 70062);
        STOP_ID_MAP.put("Broadway", 70071);
        STOP_ID_MAP.put("Broadway", 70072);
        STOP_ID_MAP.put("Burlingame", 70081);
        STOP_ID_MAP.put("Burlingame", 70082);
        STOP_ID_MAP.put("San Mateo", 70091);
        STOP_ID_MAP.put("San Mateo", 70092);
        STOP_ID_MAP.put("Hayward Park", 70101);
        STOP_ID_MAP.put("Hayward Park", 70102);
        STOP_ID_MAP.put("Hillsdale", 70111);
        STOP_ID_MAP.put("Hillsdale", 70112);
        STOP_ID_MAP.put("Belmont", 70121);
        STOP_ID_MAP.put("Belmont", 70122);
        STOP_ID_MAP.put("San Carlos", 70131);
        STOP_ID_MAP.put("San Carlos", 70132);
        STOP_ID_MAP.put("Redwood City", 70141);
        STOP_ID_MAP.put("Redwood City", 70142);
        STOP_ID_MAP.put("Atherton", 70151);
        STOP_ID_MAP.put("Atherton", 70152);
        STOP_ID_MAP.put("Menlo Park", 70161);
        STOP_ID_MAP.put("Menlo Park", 70162);
        STOP_ID_MAP.put("Palo Alto", 70171);
        STOP_ID_MAP.put("Palo Alto", 70172);
        STOP_ID_MAP.put("California Ave", 70191);
        STOP_ID_MAP.put("California Ave", 70192);
        STOP_ID_MAP.put("San Antonio", 70201);
        STOP_ID_MAP.put("San Antonio", 70202);
        STOP_ID_MAP.put("Mt View", 70211);
        STOP_ID_MAP.put("Mt View", 70212);
        STOP_ID_MAP.put("Sunnyvale", 70221);
        STOP_ID_MAP.put("Sunnyvale", 70222);
        STOP_ID_MAP.put("Lawrence", 70231);
        STOP_ID_MAP.put("Lawrence", 70232);
        STOP_ID_MAP.put("Santa Clara", 70241);
        STOP_ID_MAP.put("Santa Clara", 70242);
        STOP_ID_MAP.put("College Park", 70251);
        STOP_ID_MAP.put("College Park", 70252);
        STOP_ID_MAP.put("San Jose Diridon", 70261);
        STOP_ID_MAP.put("San Jose Diridon", 70262);
        STOP_ID_MAP.put("Tamien", 70271);
        STOP_ID_MAP.put("Tamien", 70272);
        STOP_ID_MAP.put("Capitol", 70281);
        STOP_ID_MAP.put("Capitol", 70282);
        STOP_ID_MAP.put("Blossom Hill", 70291);
        STOP_ID_MAP.put("Blossom Hill", 70292);
        STOP_ID_MAP.put("Morgan Hill", 70301);
        STOP_ID_MAP.put("Morgan Hill", 70302);
        STOP_ID_MAP.put("San Martin", 70311);
        STOP_ID_MAP.put("San Martin", 70312);
        STOP_ID_MAP.put("Gilroy", 70321);
        STOP_ID_MAP.put("Gilroy", 70322);
        STOP_ID_MAP.put("San Jose", 777402);
        STOP_ID_MAP.put("Tamien", 777403);
    }

    public static final Map<String, Integer> TRIP_ID_MAP;
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


//    public static final String[][] WEEKDAY_NORTHBOUND_SCHEDULE = new String[WEEKDAY_NORTHBOUND_TRAIN_IDS.size()][]

    // need set of (north/south) * (weekend/weekday) train ids
    // need hashmap k: readable name of stop_id, v: int of stop_id
    // need hashmap k: readable name of trip_id v: string of trip_id

    /*

    initialize four (north/south)*(weekday/weekend) arrays.

    north weekday
    height: stop_id
    width: northbound_weekday trip_ids

    north weekend

    south weekday

    south weekend

    populating
    -------------------
    for each row in stop_times:

        find which of the four (north/south)*(weekday/weekend) table the trip_id belongs to.

        if row matches the stop_id of array:
            add that time in the index

    to read
    -------------------



     */

}
