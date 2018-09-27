package com.example.administrator.weatherapp;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    private TextView tvLocation, tvTemperature, tvHumidity, tvWindSpeed, tvCloudiness;
    private Button btnRefresh;
    private ImageView ivIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvLocation = (TextView) findViewById(R.id.location);
        tvTemperature = (TextView) findViewById(R.id.temperature);
        tvHumidity = (TextView) findViewById(R.id.humidity);
        tvWindSpeed = (TextView) findViewById(R.id.wind_speed);
        tvCloudiness  = (TextView) findViewById(R.id.cloudiness);
        btnRefresh = (Button) findViewById(R.id.button_refresh);
        ivIcon = (ImageView) findViewById(R.id.icon);
    }
}

private class WeatherDataRetrieval extends AsyncTask<Void, Void, Void>{
    @Override
    protected void onPreExecute(){
        super.onPreExecute();
    }

    @Override
    protected void doInBackground(Void arg0){
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(Void result){
        super.onPreExecute();
    }
}
