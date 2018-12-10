package com.example.roca486.prac2;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class BikeModel extends ViewModel {

    public final LiveData<Bike> bikeLiveData = new LiveData<Bike>() {};

    public List<Bike> bikes = new ArrayList<Bike>() {{
        add(new Bike("Bike1", "First bike"));
        add(new Bike("Bike2", "Second bike"));
        add(new Bike("Bike3", "Third bike"));
        add(new Bike("Bike4", "Fourth bike"));
        add(new Bike("Bike5", "Fifth bike"));
        add(new Bike("Bike6", "Sixth bike"));
    }};

    public BikeModel(){

    }

    void doAction(){

    }

}
