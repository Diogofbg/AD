package org.example;

import com.google.gson.Gson;

public class TelemetryDataPoint {

    public double temperature;
    public double humidity;

    public TelemetryDataPoint(double temperature, double humidity) {
        this.humidity = humidity;
        this.temperature = temperature;
    }

    // Serialize object to JSON format.
    public String serialize() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

}
