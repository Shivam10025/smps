package com.example.spasbynituk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.spasbynituk.adapters.Mainadapters;
import com.example.spasbynituk.databinding.ActivityCseactivityBinding;
import com.example.spasbynituk.databinding.ActivityEeactvityBinding;
import com.example.spasbynituk.modules.Mainmodules;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class eeactvity extends AppCompatActivity {
    ActivityEeactvityBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEeactvityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayList<Mainmodules> list = new ArrayList<>();
        list.add(new Mainmodules("Electrical Machine II" , "EEL351" , "3"));
        list.add(new Mainmodules("Control System" , "EEL254" , "3"));
        list.add(new Mainmodules("Power System-1" , "EEL256", "3"));
        list.add(new Mainmodules("Power Electronics" , "EEL255" , "3"));
        list.add(new Mainmodules("Microcontroller and Interfacing" , "ECL353" , "3"));
        list.add(new Mainmodules("Analog Circuits" , "ECL252" , "3"));
        list.add(new Mainmodules("Control System Lab" , "EEP254" , "1"));
        list.add(new Mainmodules("Electrical Machine II Lab" , "EEP351" , "1"));
        list.add(new Mainmodules("PowerElectronicsLab" , "ECP354" , "1"));
        Mainadapters adapter = new Mainadapters(list , this);
        binding.recyclerview.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerview.setLayoutManager(layoutManager);
    }
}