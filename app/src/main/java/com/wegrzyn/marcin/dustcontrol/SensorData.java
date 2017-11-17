package com.wegrzyn.marcin.dustcontrol;

import java.util.Date;

/**
 * Created by wirea on 22.10.2017.
 */

public class SensorData {

    private float pm25;
    private float pm10;
    private Date date;

    public SensorData(float pm25, float pm10, Date date) {
        this.pm25 = pm25;
        this.pm10 = pm10;
        this.date = date;
    }

    public SensorData() {
        pm10 = 0;
        pm25 = 0;
    }

    public float getPm25() {
        return pm25;
    }

    public float getPm10() {
        return pm10;
    }

    public Date getDate() {
        return date;
    }

    public void setPm25(float pm25) {
        this.pm25 = pm25;
    }

    public void setPm10(float pm10) {
        this.pm10 = pm10;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
