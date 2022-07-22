package com.example.arcgis_for_android_example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.location.LocationManager;
import android.os.Bundle;

import com.esri.arcgisruntime.ArcGISRuntimeEnvironment;
import com.esri.arcgisruntime.LicenseLevel;
import com.esri.arcgisruntime.mapping.ArcGISMap;
import com.esri.arcgisruntime.mapping.Basemap;
import com.esri.arcgisruntime.mapping.BasemapStyle;
import com.example.arcgis_for_android_example.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        this.initMapView();
    }

    private void initMapView() {
        ArcGISRuntimeEnvironment.setLicense("runtimelite,1000,rud2338129685,none,YYPJD4SZ8L6K003AD227");
        binding.mapview.setMap(new ArcGISMap(BasemapStyle.ARCGIS_TOPOGRAPHIC));
        binding.mapview.setAttributionTextVisible(false);
    }
}