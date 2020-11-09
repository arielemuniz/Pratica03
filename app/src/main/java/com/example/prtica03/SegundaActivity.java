package com.example.prtica03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class SegundaActivity extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap map;
    private final LatLng CANTAGALO = new LatLng(-21.9811,-42.3682);
    private final LatLng VICOSA = new LatLng(-20.752946,-42.879097);
    private final LatLng CCE = new LatLng(-20.7676,-42.8588);
    final private COORDENADA c = new COORDENADA();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        Intent it=getIntent();
        double lat = it.getDoubleExtra("latitude",0.0d);
        double longi = it.getDoubleExtra("longitude",0.0d);
        c.setLatitude(lat);
        c.setLongitude(longi);

        ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMapAsync(this);


    }
    public void onClick_Cantagalo(View v){
        map.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        CameraUpdate update = CameraUpdateFactory.newLatLngZoom(CANTAGALO,16);
        map.animateCamera(update);
    }

    public void onClick_Vicosa(View v){
        map.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        CameraUpdate update = CameraUpdateFactory.newLatLngZoom(VICOSA,14);
        map.animateCamera(update);
    }

    public void onClick_CCE(View v){
        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        CameraUpdate update = CameraUpdateFactory.newLatLngZoom(CCE,12);
        map.animateCamera(update);
    }

    public void onMapReady(GoogleMap googleMap) {
        final LatLng coordenada = new LatLng(c.getLatitude(),c.getLongitude());
        map = googleMap;
        map.moveCamera(CameraUpdateFactory.newLatLng(coordenada));
        map.animateCamera(CameraUpdateFactory.zoomTo(14));
    }
}