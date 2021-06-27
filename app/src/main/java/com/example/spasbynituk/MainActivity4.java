package com.example.spasbynituk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.spasbynituk.databinding.ActivityMain4Binding;

public class MainActivity4 extends AppCompatActivity {
    ActivityMain4Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        binding = ActivityMain4Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity4.this , MainActivity3.class);
                startActivity(intent);
            }
        });
        binding.button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity4.this , MainActivity2.class);
                startActivity(intent);
            }
        });
        binding.button111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity4.this , uploadfile3.class);
                startActivity(intent);
            }
        });
    }
}