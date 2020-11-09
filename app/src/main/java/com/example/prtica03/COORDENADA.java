package com.example.prtica03;

import java.io.Serializable;

public class COORDENADA implements Serializable {
    private  double latitude;
    private double longitude;

    public COORDENADA(double latitude,double longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public COORDENADA() {

    }

    public double getLatitude(){ return latitude;}

    public double getLongitude() {
        return longitude;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
