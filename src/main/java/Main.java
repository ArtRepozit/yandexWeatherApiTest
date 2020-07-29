
import forPegaApi.Generators;
import forPegaApi.NameGenerators;
import forPegaApi.TestGen;

public class Main {
    public static void main(String[] args) {
//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//
//        String res = ApiConnector.getWeather(false);
//
//        JsonParser parser = new JsonParser();
//        JsonObject json = parser.parse(res).getAsJsonObject();
//        System.out.println(gson.toJson(json));


//        String str = Unirest.get("https://api.weather.yandex.ru/v1/informers")
//                .header("X-Yandex-API-Key", Constants.API_KEY)
//                .queryString("lat", Constants.DEFAULT_LAT)
//                .queryString("lon", Constants.DEFAULT_LON)
//                .queryString("lang", "ru_RU")
//                .asString().getBody();

/*        JSONObject jsonObject = new JSONObject(Constants.REQUEST);
        System.out.println(jsonObject);
        JSONObject info = jsonObject.getJSONObject("info");
        Double lat = info.getDouble("lat");
        Double lon = jsonObject.getJSONObject("info").getDouble("lon");
        JSONArray forecast = jsonObject.getJSONArray("forecasts");
        int offset = jsonObject.getJSONObject("info").getJSONObject("tzinfo").getInt("offset");
        boolean dst = jsonObject.getJSONObject("info").getJSONObject("tzinfo").getBoolean("dst");
        String url = jsonObject.getJSONObject("info").getString("url");
        String season  = jsonObject.getJSONObject("fact").getString("season");

        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        timeZone.getOffset(23);

        System.out.println(lat);
        System.out.println(lon);
        System.out.println(forecast.length());
        System.out.println(offset);
        System.out.println(timeZone.getOffset(0) / 1000);
        System.out.println(timeZone.getID());
        System.out.println(timeZone.getDisplayName());
        System.out.println(dst);
        System.out.println(url);
        System.out.println(url.contains("lon=" + Constants.DEFAULT_LON));
        System.out.println(season);*/

        Generators generators = new Generators();
        NameGenerators nameGenerators = new NameGenerators();
        TestGen gen = new TestGen();

//        System.out.println("Инн ЮЛ = " + generators.generateInnByUL());
//        System.out.println("Инн ИП = " + generators.generateInnByIP());
//        System.out.println("Огрн ЮЛ = " + generators.generateOgrnUl());
//        System.out.println("Огрн ИП = " + generators.generateOgrnIp());
        System.out.println(generators.generateObjectId());
        System.out.println(generators.printClassName());
        System.out.println(gen.printClassName());
    }
}
