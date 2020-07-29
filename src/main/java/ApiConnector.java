import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import kong.unirest.Unirest;
import kong.unirest.json.JSONObject;


public class ApiConnector {

    public static JSONObject getWeather(Boolean extra, Boolean printResponse) {
        try {
            String str = Unirest.get("https://api.weather.yandex.ru/v1/forecast")
                    .header("X-Yandex-API-Key", Constants.API_KEY)
                    .queryString("lat", Constants.DEFAULT_LAT)
                    .queryString("lon", Constants.DEFAULT_LON)
                    .queryString("extra", extra)
                    .queryString("limit", Constants.DEFAULT_FORECAST_LENGTH)
                    .asString().getBody();

            if (printResponse == true) {
                Gson gson = new GsonBuilder().setPrettyPrinting().create();

                JsonParser parser = new JsonParser();
                JsonObject json = parser.parse(str).getAsJsonObject();
                System.out.println(gson.toJson(json));
            }

            return new JSONObject(str);
        } catch (Exception e) {
            throw e;
        }
    }
}
