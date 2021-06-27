package com.example.spasbynituk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.spasbynituk.databinding.ActivityAskingactivityBinding;
import com.example.spasbynituk.databinding.ActivitySigninactivityBinding;

public class askingactivity extends AppCompatActivity {
    ActivityAskingactivityBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);;
        getSupportActionBar().hide();
        binding = ActivityAskingactivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(askingactivity.this , signinactivity.class);
                startActivity(intent);
            }
        });
        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(askingactivity.this , MainActivity5.class);
                startActivity(intent);
            }
        });
    }
}