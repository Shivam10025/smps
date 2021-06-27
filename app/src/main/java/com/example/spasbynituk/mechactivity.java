package com.example.spasbynituk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.spasbynituk.adapters.Mainadapters;
import com.example.spasbynituk.databinding.ActivityCseactivityBinding;
import com.example.spasbynituk.databinding.ActivityMechactivityBinding;
import com.example.spasbynituk.modules.Mainmodules;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class mechactivity extends AppCompatActivity {
    ActivityMechactivityBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMechactivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayList<Mainmodules> list = new ArrayList<>();
        list.add(new Mainmodules("Energy Conversion Technique" , "MEL351" , "3"));
        list.add(new Mainmodules("Fluid Machines" , "MEL352" , "3"));
        list.add(new Mainmodules("Machine Drawing" , "MEL256" , "1"));
        list.add(new Mainmodules("Casting welding" , "MEL257" , "3"));
        list.add(new Mainmodules("Machines Dynamics" , "MEL354" , "3"));
        list.add(new Mainmodules("Machine Tools" , "MEL258" , "3"));
        list.add(new Mainmodules("Fluid Machines Lab" , "MEP352" , "1"));
        list.add(new Mainmodules("Machine Drawing Lab" , "MEP256" , "2"));
        list.add(new Mainmodules("Machine Tools Lab" , "MEP257" , "1"));
        Mainadapters adapter = new Mainadapters(list , this);
        binding.recyclerview.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerview.setLayoutManager(layoutManager);
    }
}