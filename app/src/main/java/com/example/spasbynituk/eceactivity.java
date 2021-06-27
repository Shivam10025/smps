package com.example.spasbynituk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.spasbynituk.adapters.Mainadapters;
import com.example.spasbynituk.databinding.ActivityCseactivityBinding;
import com.example.spasbynituk.databinding.ActivityEceactivityBinding;
import com.example.spasbynituk.modules.Mainmodules;

import java.util.ArrayList;

public class eceactivity extends AppCompatActivity {

    ActivityEceactivityBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEceactivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayList<Mainmodules> list = new ArrayList<>();
        list.add(new Mainmodules("Antenna Theory" , "ECL354" , "3"));
        list.add(new Mainmodules("Control System" , "EEL254" , "3"));
        list.add(new Mainmodules("Analog Communication System" , "ECL253" , "3"));
        list.add(new Mainmodules("Microcontroller & interfacing" , "ECL353" , "3"));
        list.add(new Mainmodules("Analog Circuit" , "ECL252" , "3"));
        list.add(new Mainmodules("Probability & Numerical Methods" , "SCL253" , "3"));
        list.add(new Mainmodules("Analog Circuit Lab" , "ECP252" , "1"));
        list.add(new Mainmodules("Analog Communication Lab" , "ECP253" , "1"));
        list.add(new Mainmodules("Microcontroller Lab" , "CSP254" , "1"));
        list.add(new Mainmodules("Control System Lab" , "EEP254" , "1"));
        list.add(new Mainmodules("Community Project" , "HMD201" , "NULL"));
        Mainadapters adapter = new Mainadapters(list , this);
        binding.recyclerview.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerview.setLayoutManager(layoutManager);
    }
}