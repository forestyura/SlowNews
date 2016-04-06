package com.forest.slownews.controller;

import org.json.JSONObject;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class WeatherProvider {
    public String getWeather() {
        return "Weather in Kiev " + readJson(restRequest()) + " C";
    }

    public int readJson(String json) {
        return (int)new JSONObject(json).getJSONObject("currently").getDouble("temperature");
    }

    public String restRequest() {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://api.forecast.io/forecast/40b837625f22b4d1fc175acb2ffe2204/50.450100,30.523400?units=si");
        return target.request().get(String.class);
    }
}
