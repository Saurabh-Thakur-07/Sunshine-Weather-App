package com.example.sunshineweatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView weatherData ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weatherData =  findViewById(R.id.tv_weather_data);
        String[] weather_fake_data = {
                "Meerut",
                "Delhi",
                "Delhi",
                "Delhi",
                "Delhi",
                "Delhi",
                "Bharat"
        };
        for(String cityName : weather_fake_data)
        {
            weatherData.append(cityName+"\n");
        }
    }
}