package com.example.spasbynituk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.spasbynituk.databinding.ActivityMain5Binding;

public class MainActivity5 extends AppCompatActivity {
    ActivityMain5Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        binding = ActivityMain5Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.button121.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5.this , MainActivity8.class);
                startActivity(intent);
            }
        });
        binding.button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5.this , MainActivity6.class);
                startActivity(intent);
            }
        });
        binding.button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5.this , MainActivity2.class);
                startActivity(intent);
            }
        });
        binding.button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5.this , uploadfile2.class);
                startActivity(intent);
            }
        });
        binding.button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5.this , uploadfile.class);
                startActivity(intent);
            }
        });
    }
}