package com.example.spasbynituk;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity6 extends AppCompatActivity {
    Button btn;
    EditText et;
    String st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        btn = findViewById(R.id.button7);
        et = findViewById(R.id.etmail5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity6.this  , Secondary.class);
                st = et.getText().toString();
                st = st.toUpperCase();
                i.putExtra("Value" , st);
                startActivity(i);
                finish();
            }
        });
    }
}