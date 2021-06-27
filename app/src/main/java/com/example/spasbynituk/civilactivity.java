package com.example.spasbynituk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.spasbynituk.adapters.Mainadapters;
import com.example.spasbynituk.databinding.ActivityCivilactivityBinding;
import com.example.spasbynituk.databinding.ActivityCseactivityBinding;
import com.example.spasbynituk.modules.Mainmodules;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class civilactivity extends AppCompatActivity {
    ActivityCivilactivityBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCivilactivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayList<Mainmodules> list = new ArrayList<>();
        list.add(new Mainmodules("Geotechnical Engineering-I " , "CEL351" , "3"));
        list.add(new Mainmodules("Transportation Engineering " , "CEL255" , "3"));
        list.add(new Mainmodules("Hydrology and Irrigation Engineering" , "CEL355" , "3"));
        list.add(new Mainmodules("Environmental Engineering-II " , "CEL352" , "3"));
        list.add(new Mainmodules("Structural Analysis " , "CEL353" , "3"));
        list.add(new Mainmodules("Engineering Geology " , "CEL252" , "3"));
        list.add(new Mainmodules("Engineering Geology Lab" , "CEP252" , "1"));
        list.add(new Mainmodules("Transportation Engineering Lab " , "CEP255" , "1"));
        list.add(new Mainmodules("Environmental Engineering-II Lab " , "CEP352" , "1"));
        Mainadapters adapter = new Mainadapters(list , this);
        binding.recyclerview.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerview.setLayoutManager(layoutManager);
    }
}