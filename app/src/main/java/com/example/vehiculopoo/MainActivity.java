package com.example.vehiculopoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Carro carro1= new Carro("Toyota","Blanco","Corolla"
        , 4,5,"XYZ136",70,4,"motor electrico de 83kW"
        ,false,4,"Energía electrica",3);

    }
}