package com.calvinlsliang.caltrainscheduler.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by calvin on 8/6/16.
 */

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

    public static final String[][] WEEKDAY_NORTHBOUND_SCHEDULE = new String[WEEKDAY_NORTHBOUND_TRAIN_IDS.size()][DESTINATIONS.size()];

    public static final String[][] WEEKDAY_SOUTHBOUND_SCHEDULE = new String[WEEKDAY_SOUTHBOUND_TRAIN_IDS.size()][DESTINATIONS.size()];

    public static final String[][] WEEKEND_NORTHBOUND_SCHEDULE = new String[WEEKEND_NORTHBOUND_TRAIN_IDS.size()][DESTINATIONS.size()];

    public static final String[][] WEEKEND_SOUTHBOUND_SCHEDULE = new String[WEEKEND_SOUTHBOUND_TRAIN_IDS.size()][DESTINATIONS.size()];


    public static final Map<String, Integer> STOP_ID_MAP;
    static {
        STOP_ID_MAP = new HashMap<>();
        STOP_ID_MAP.put("", 0);
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

    public static final Map<String, String> TRIP_ID_MAP;
    static {
        TRIP_ID_MAP = new HashMap<>();
        TRIP_ID_MAP.put("23a", "25a");
        TRIP_ID_MAP.put("25a", "27a");
        TRIP_ID_MAP.put("27a", "01a");
        TRIP_ID_MAP.put("01a", "29a");
        TRIP_ID_MAP.put("29a", "31a");
        TRIP_ID_MAP.put("31a", "33a");
        TRIP_ID_MAP.put("33a", "35a");
        TRIP_ID_MAP.put("35a", "37a");
        TRIP_ID_MAP.put("37a", "39a");
        TRIP_ID_MAP.put("39a", "41a");
        TRIP_ID_MAP.put("41a", "03a");
        TRIP_ID_MAP.put("03a", "43a");
        TRIP_ID_MAP.put("43a", "45a");
        TRIP_ID_MAP.put("45a", "47a");
        TRIP_ID_MAP.put("47a", "49a");
        TRIP_ID_MAP.put("49a", "22a");
        TRIP_ID_MAP.put("22a", "24a");
        TRIP_ID_MAP.put("24a", "26a");
        TRIP_ID_MAP.put("26a", "02a");
        TRIP_ID_MAP.put("02a", "30a");
        TRIP_ID_MAP.put("30a", "32a");
        TRIP_ID_MAP.put("32a", "34a");
        TRIP_ID_MAP.put("34a", "36a");
        TRIP_ID_MAP.put("36a", "38a");
        TRIP_ID_MAP.put("38a", "40a");
        TRIP_ID_MAP.put("40a", "04a");
        TRIP_ID_MAP.put("04a", "44a");
        TRIP_ID_MAP.put("44a", "46a");
        TRIP_ID_MAP.put("46a", "421a");
        TRIP_ID_MAP.put("421a", "423a");
        TRIP_ID_MAP.put("423a", "425a");
        TRIP_ID_MAP.put("425a", "427a");
        TRIP_ID_MAP.put("427a", "801a");
        TRIP_ID_MAP.put("801a", "429a");
        TRIP_ID_MAP.put("429a", "431a");
        TRIP_ID_MAP.put("431a", "433a");
        TRIP_ID_MAP.put("433a", "435a");
        TRIP_ID_MAP.put("435a", "437a");
        TRIP_ID_MAP.put("437a", "439a");
        TRIP_ID_MAP.put("439a", "441a");
        TRIP_ID_MAP.put("441a", "803a");
        TRIP_ID_MAP.put("803a", "443a");
        TRIP_ID_MAP.put("443a", "445a");
        TRIP_ID_MAP.put("445a", "447a");
        TRIP_ID_MAP.put("447a", "449a");
        TRIP_ID_MAP.put("449a", "451a");
        TRIP_ID_MAP.put("451a", "422a");
        TRIP_ID_MAP.put("422a", "424a");
        TRIP_ID_MAP.put("424a", "426a");
        TRIP_ID_MAP.put("426a", "428a");
        TRIP_ID_MAP.put("428a", "802a");
        TRIP_ID_MAP.put("802a", "430a");
        TRIP_ID_MAP.put("430a", "432a");
        TRIP_ID_MAP.put("432a", "434a");
        TRIP_ID_MAP.put("434a", "436a");
        TRIP_ID_MAP.put("436a", "438a");
        TRIP_ID_MAP.put("438a", "440a");
        TRIP_ID_MAP.put("440a", "442a");
        TRIP_ID_MAP.put("442a", "804a");
        TRIP_ID_MAP.put("804a", "444a");
        TRIP_ID_MAP.put("444a", "446a");
        TRIP_ID_MAP.put("446a", "448a");
        TRIP_ID_MAP.put("448a", "450a");
        TRIP_ID_MAP.put("450a", "454a");
        TRIP_ID_MAP.put("454a", "23u");
        TRIP_ID_MAP.put("23u", "25u");
        TRIP_ID_MAP.put("25u", "27u");
        TRIP_ID_MAP.put("27u", "01u");
        TRIP_ID_MAP.put("01u", "29u");
        TRIP_ID_MAP.put("29u", "31u");
        TRIP_ID_MAP.put("31u", "33u");
        TRIP_ID_MAP.put("33u", "35u");
        TRIP_ID_MAP.put("35u", "37u");
        TRIP_ID_MAP.put("37u", "39u");
        TRIP_ID_MAP.put("39u", "41u");
        TRIP_ID_MAP.put("41u", "03u");
        TRIP_ID_MAP.put("03u", "43u");
        TRIP_ID_MAP.put("43u", "45u");
        TRIP_ID_MAP.put("45u", "47u");
        TRIP_ID_MAP.put("47u", "49u");
        TRIP_ID_MAP.put("49u", "22u");
        TRIP_ID_MAP.put("22u", "24u");
        TRIP_ID_MAP.put("24u", "26u");
        TRIP_ID_MAP.put("26u", "02u");
        TRIP_ID_MAP.put("02u", "30u");
        TRIP_ID_MAP.put("30u", "32u");
        TRIP_ID_MAP.put("32u", "34u");
        TRIP_ID_MAP.put("34u", "36u");
        TRIP_ID_MAP.put("36u", "38u");
        TRIP_ID_MAP.put("38u", "40u");
        TRIP_ID_MAP.put("40u", "04u");
        TRIP_ID_MAP.put("04u", "44u");
        TRIP_ID_MAP.put("44u", "46u");
        TRIP_ID_MAP.put("46u", "423u");
        TRIP_ID_MAP.put("423u", "425u");
        TRIP_ID_MAP.put("425u", "427u");
        TRIP_ID_MAP.put("427u", "801u");
        TRIP_ID_MAP.put("801u", "429u");
        TRIP_ID_MAP.put("429u", "431u");
        TRIP_ID_MAP.put("431u", "433u");
        TRIP_ID_MAP.put("433u", "435u");
        TRIP_ID_MAP.put("435u", "437u");
        TRIP_ID_MAP.put("437u", "439u");
        TRIP_ID_MAP.put("439u", "441u");
        TRIP_ID_MAP.put("441u", "803u");
        TRIP_ID_MAP.put("803u", "443u");
        TRIP_ID_MAP.put("443u", "445u");
        TRIP_ID_MAP.put("445u", "447u");
        TRIP_ID_MAP.put("447u", "449u");
        TRIP_ID_MAP.put("449u", "422u");
        TRIP_ID_MAP.put("422u", "424u");
        TRIP_ID_MAP.put("424u", "426u");
        TRIP_ID_MAP.put("426u", "428u");
        TRIP_ID_MAP.put("428u", "802u");
        TRIP_ID_MAP.put("802u", "430u");
        TRIP_ID_MAP.put("430u", "432u");
        TRIP_ID_MAP.put("432u", "434u");
        TRIP_ID_MAP.put("434u", "436u");
        TRIP_ID_MAP.put("436u", "438u");
        TRIP_ID_MAP.put("438u", "440u");
        TRIP_ID_MAP.put("440u", "442u");
        TRIP_ID_MAP.put("442u", "804u");
        TRIP_ID_MAP.put("804u", "444u");
        TRIP_ID_MAP.put("444u", "446u");
        TRIP_ID_MAP.put("446u", "448u");
        TRIP_ID_MAP.put("448u", "101");
        TRIP_ID_MAP.put("101", "103");
        TRIP_ID_MAP.put("103", "305");
        TRIP_ID_MAP.put("305", "207");
        TRIP_ID_MAP.put("207", "309");
        TRIP_ID_MAP.put("309", "211");
        TRIP_ID_MAP.put("211", "313");
        TRIP_ID_MAP.put("313", "215");
        TRIP_ID_MAP.put("215", "217");
        TRIP_ID_MAP.put("217", "319");
        TRIP_ID_MAP.put("319", "221");
        TRIP_ID_MAP.put("221", "323");
        TRIP_ID_MAP.put("323", "225");
        TRIP_ID_MAP.put("225", "227");
        TRIP_ID_MAP.put("227", "329");
        TRIP_ID_MAP.put("329", "231");
        TRIP_ID_MAP.put("231", "233");
        TRIP_ID_MAP.put("233", "135");
        TRIP_ID_MAP.put("135", "237");
        TRIP_ID_MAP.put("237", "139");
        TRIP_ID_MAP.put("139", "143");
        TRIP_ID_MAP.put("143", "147");
        TRIP_ID_MAP.put("147", "151");
        TRIP_ID_MAP.put("151", "155");
        TRIP_ID_MAP.put("155", "257");
        TRIP_ID_MAP.put("257", "159");
        TRIP_ID_MAP.put("159", "261");
        TRIP_ID_MAP.put("261", "263");
        TRIP_ID_MAP.put("263", "365");
        TRIP_ID_MAP.put("365", "267");
        TRIP_ID_MAP.put("267", "269");
        TRIP_ID_MAP.put("269", "371");
        TRIP_ID_MAP.put("371", "273");
        TRIP_ID_MAP.put("273", "375");
        TRIP_ID_MAP.put("375", "277");
        TRIP_ID_MAP.put("277", "279");
        TRIP_ID_MAP.put("279", "381");
        TRIP_ID_MAP.put("381", "283");
        TRIP_ID_MAP.put("283", "385");
        TRIP_ID_MAP.put("385", "287");
        TRIP_ID_MAP.put("287", "289");
        TRIP_ID_MAP.put("289", "191");
        TRIP_ID_MAP.put("191", "193");
        TRIP_ID_MAP.put("193", "195");
        TRIP_ID_MAP.put("195", "197");
        TRIP_ID_MAP.put("197", "199");
        TRIP_ID_MAP.put("199", "102");
        TRIP_ID_MAP.put("102", "104");
        TRIP_ID_MAP.put("104", "206");
        TRIP_ID_MAP.put("206", "208");
        TRIP_ID_MAP.put("208", "210");
        TRIP_ID_MAP.put("210", "312");
        TRIP_ID_MAP.put("312", "314");
        TRIP_ID_MAP.put("314", "216");
        TRIP_ID_MAP.put("216", "218");
        TRIP_ID_MAP.put("218", "220");
        TRIP_ID_MAP.put("220", "322");
        TRIP_ID_MAP.put("322", "324");
        TRIP_ID_MAP.put("324", "226");
        TRIP_ID_MAP.put("226", "228");
        TRIP_ID_MAP.put("228", "230");
        TRIP_ID_MAP.put("230", "332");
        TRIP_ID_MAP.put("332", "134");
        TRIP_ID_MAP.put("134", "236");
        TRIP_ID_MAP.put("236", "138");
        TRIP_ID_MAP.put("138", "142");
        TRIP_ID_MAP.put("142", "146");
        TRIP_ID_MAP.put("146", "150");
        TRIP_ID_MAP.put("150", "152");
        TRIP_ID_MAP.put("152", "254");
        TRIP_ID_MAP.put("254", "156");
        TRIP_ID_MAP.put("156", "258");
        TRIP_ID_MAP.put("258", "360");
        TRIP_ID_MAP.put("360", "262");
        TRIP_ID_MAP.put("262", "264");
        TRIP_ID_MAP.put("264", "366");
        TRIP_ID_MAP.put("366", "268");
        TRIP_ID_MAP.put("268", "370");
        TRIP_ID_MAP.put("370", "272");
        TRIP_ID_MAP.put("272", "274");
        TRIP_ID_MAP.put("274", "376");
        TRIP_ID_MAP.put("376", "278");
        TRIP_ID_MAP.put("278", "380");
        TRIP_ID_MAP.put("380", "282");
        TRIP_ID_MAP.put("282", "284");
        TRIP_ID_MAP.put("284", "386");
        TRIP_ID_MAP.put("386", "288");
        TRIP_ID_MAP.put("288", "190");
        TRIP_ID_MAP.put("190", "192");
        TRIP_ID_MAP.put("192", "194");
        TRIP_ID_MAP.put("194", "196");
        TRIP_ID_MAP.put("196", "198");
        TRIP_ID_MAP.put("198", "");
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
