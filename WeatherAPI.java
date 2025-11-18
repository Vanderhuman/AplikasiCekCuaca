/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas.AplikasiCekCuaca;

import java.io.*;
import java.net.*;
import org.json.JSONObject;

public class WeatherAPI {
        private static final String API_KEY = "8e932285c27d921eda5e10614360e475";

    public static Cuaca getCuaca(String kota) {
        try {
            String url = "https://api.openweathermap.org/data/2.5/weather?q=" 
                + kota + "&appid=" + API_KEY + "&units=metric";

            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("GET");

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String response = br.readLine();

            JSONObject obj = new JSONObject(response);
            double suhu = obj.getJSONObject("main").getDouble("temp");
            String kondisi = obj.getJSONArray("weather").getJSONObject(0).getString("main");

            return new Cuaca(kota, kondisi, suhu);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
