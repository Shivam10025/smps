package com.example.spasbynituk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.spasbynituk.adapters.Mainadapters;
import com.example.spasbynituk.databinding.ActivityCseactivityBinding;
import com.example.spasbynituk.modules.Mainmodules;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class cseactivity extends AppCompatActivity {

    ActivityCseactivityBinding binding;
    FirebaseDatabase database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCseactivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayList<Mainmodules> list = new ArrayList<>();
        list.add(new Mainmodules("Computer Networks" , "CSL255" , "3"));
        list.add(new Mainmodules("Computer Organisation" , "CSL258" , "3"));
        list.add(new Mainmodules("Software Engineering" , "CSL256" , "3"));
        list.add(new Mainmodules("Theory Of Computation" , "CSL259" , "3"));
        list.add(new Mainmodules("Design & Analysis of Algorithms" , "CSL254" , "3"));
        list.add(new Mainmodules("Probability & Numerical Methods" , "SCL253" , "3"));
        list.add(new Mainmodules("Computer Networks Lab" , "CSP255" , "1"));
        list.add(new Mainmodules("Software Lab" , "CSP256" , "1"));
        list.add(new Mainmodules("Algorithms Lab" , "CSP254" , "1"));
        Mainadapters adapter = new Mainadapters(list , this);
        binding.recyclerview.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerview.setLayoutManager(layoutManager);
    
    }
}