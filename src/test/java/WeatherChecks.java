import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import kong.unirest.json.JSONObject;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WeatherChecks {

   // private String response;
    private JSONObject response;
    private Double responseLat;
    private Double responseLon;
    private int responseOffset;
    private String responseName;
    private String responseAbbr;
    private Boolean responseDst;
    private String responseUrl;


    public void setResponse(JSONObject response){
        this.response = response;
    }

    public JSONObject getResponse(){
        return this.response;
    }


    @Before
    public void getForecast(){
       setResponse(ApiConnector.getWeather(false,false));
    }

    @Test
    public void checkLat(){
        responseLat = getResponse().getJSONObject("info").getDouble("lat");
     assertEquals(responseLat,Constants.DEFAULT_LAT);

    }

    @Test
    public void checkLon(){
        responseLon = getResponse().getJSONObject("info").getDouble("lon");
        assertEquals(responseLon,Constants.DEFAULT_LON);
    }

    @Test
    public void checkOffset(){
        responseUrl = getResponse().getJSONObject("info").getString("url");
        assertTrue(responseUrl.contains(Constants.RESPONSE_URL_PARAMS));
    }



}
