import kong.unirest.json.JSONObject;

public interface Constants {

    String API_KEY = "8fb60ac2-fd69-4104-b4d0-e065cc6f94c0";
    String DEFAULT_CITY = "MOSCOW";
    Double DEFAULT_LAT = 45.2376;
    Double DEFAULT_LON = 37.2236;
    int DEFAULT_OFFSET = 10800;
    String DEFAULT_NAME = "Europe/Moscow";
    String DEFAULT_ABBR = "MSK";
    Boolean DEFAULT_DST = true;
    String DEFAULT_URL = "";
    int DEFAULT_FORECAST_LENGTH = 2;
    String RESPONSE_URL_PARAMS = "lat="+DEFAULT_LAT+"&lon="+DEFAULT_LON;

    String REQUEST = "{\"now\":1583254790,\"now_dt\":\"2020-03-03T16:59:50.474Z\",\"info\":{\"lat\":45.2376,\"lon\":37.2236,\"url\":\"https://yandex.ru/pogoda/?lat\\u003d45.2376\\u0026lon\\u003d37.2236\"},\"fact\":{\"temp\":10,\"feels_like\":4,\"temp_water\":7,\"icon\":\"skc_n\",\"condition\":\"clear\",\"wind_speed\":6.5,\"wind_gust\":11.3,\"wind_dir\":\"s\",\"pressure_mm\":763,\"pressure_pa\":1018,\"humidity\":74,\"daytime\":\"n\",\"polar\":false,\"season\":\"spring\",\"obs_time\":1583251200},\"forecast\":{\"date\":\"2020-03-04\",\"date_ts\":1583269200,\"week\":10,\"sunrise\":\"07:03\",\"sunset\":\"18:22\",\"moon_code\":13,\"moon_text\":\"growing-moon\",\"parts\":[{\"part_name\":\"night\",\"temp_min\":10,\"temp_max\":10,\"temp_avg\":10,\"feels_like\":4,\"temp_water\":7,\"icon\":\"skc_n\",\"condition\":\"clear\",\"daytime\":\"n\",\"polar\":false,\"wind_speed\":6.4,\"wind_gust\":11.5,\"wind_dir\":\"s\",\"pressure_mm\":763,\"pressure_pa\":1018,\"humidity\":63,\"prec_mm\":0,\"prec_period\":360,\"prec_prob\":0},{\"part_name\":\"morning\",\"temp_min\":10,\"temp_max\":17,\"temp_avg\":14,\"feels_like\":9,\"temp_water\":7,\"icon\":\"skc_d\",\"condition\":\"clear\",\"daytime\":\"d\",\"polar\":false,\"wind_speed\":6,\"wind_gust\":11.2,\"wind_dir\":\"s\",\"pressure_mm\":763,\"pressure_pa\":1018,\"humidity\":50,\"prec_mm\":0,\"prec_period\":360,\"prec_prob\":0}]}}\n";

    JSONObject request = new JSONObject(REQUEST);
}
