package com.ithought.rahul.nozimers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.preference.PreferenceManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.kosalgeek.genasync12.AsyncResponse;
import com.kosalgeek.genasync12.PostResponseAsyncTask;

import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

public class GeoLocation extends AppCompatActivity {

    Button getLocationBtn;
    TextView locationText,tv_latitude,tv_longitude;
    private Geocoder geocoder;
    PreferenceManager mPref;
    LocationManager locationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo_location);


        String url = "http://192.168.4.152:5000/alert/";

        HashMap postData = new HashMap();

        PostResponseAsyncTask readTask = new PostResponseAsyncTask(GeoLocation.this, postData, new AsyncResponse() {
            @Override
            public void processFinish(String s) {


            }
        });
        readTask.execute(url);



    }


}
