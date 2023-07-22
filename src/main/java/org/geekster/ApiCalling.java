package org.geekster;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ApiCalling {
    public void apiCallingMethod() throws IOException {
        URL url = null;
        HttpURLConnection connection = null;
        int responseCode = 0;

        String urlString ="https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&current_weather=true&hourly=temperature_2m,relativehumidity_2m,windspeed_10m";

        try {
            url = new URL(urlString);
        } catch (MalformedURLException e) {
            System.out.println("Problem in URL");
        }

        //connection

        try {
            connection = (HttpURLConnection) url.openConnection();
            responseCode = connection.getResponseCode();
        } catch (Exception e) {
            System.out.println("Connection Problem");
        }

        //extract information from connection object

        if(responseCode == 200){
            BufferedReader in  = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder apiData = new StringBuilder();
            String readLine = null;

            while((readLine= in.readLine())!=null){
                apiData.append(readLine);
            }
            in.close();

            JSONObject jsonAPIResponse = new JSONObject(apiData.toString());
            System.out.println(jsonAPIResponse.get("latitude"));
            System.out.println(jsonAPIResponse.get("longitude"));
            System.out.println(jsonAPIResponse.get("generationtime_ms"));
            System.out.println(jsonAPIResponse.get("utc_offset_seconds"));
            System.out.println(jsonAPIResponse.get("timezone"));
            System.out.println(jsonAPIResponse.get("timezone_abbreviation"));
            System.out.println(jsonAPIResponse.get("current_weather"));
            System.out.println(jsonAPIResponse.get("hourly_units"));
            System.out.println(jsonAPIResponse.get("elevation"));
        }
        else{
            System.out.println("API call could not be made!!!");
        }
    }
}
