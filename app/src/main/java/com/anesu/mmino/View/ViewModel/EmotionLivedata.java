package com.anesu.mmino.View.ViewModel;

import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.Random;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EmotionLivedata extends ViewModel {


    MutableLiveData<DataPoint[]> seriesHappy = new MutableLiveData<>();
    MutableLiveData<DataPoint[]> seriesSad = new MutableLiveData<>();
    Random mRand = new Random();

    public LiveData<DataPoint[]> getSeriesHappy(){
        return seriesHappy;
    }

    public LiveData<DataPoint[]> getSeriesSad(){
        return seriesSad;
    }

    public void postHappy(){
        int count = 30;
        DataPoint[] values = new DataPoint[count];
        for (int i=0; i<count; i++) {
            double x = i;
            double f = mRand.nextDouble()*0.9;
            double y = Math.sin(i*f+2) + mRand.nextDouble()*0.3;
            DataPoint v = new DataPoint(x, f);
            values[i] = v;
        }
        seriesHappy.postValue(values);
    }

    public void postSad(){
        int count = 30;
        DataPoint[] values = new DataPoint[count];
        for (int i=0; i<count; i++) {
            double x = i;
            double f = mRand.nextDouble()*0.9;
            double y = Math.sin(i*f+2) + mRand.nextDouble()*0.3;
            DataPoint v = new DataPoint(x, f);
            values[i] = v;
        }
        seriesSad.postValue(values);
    }




}
