package com.example.spasbynituk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.example.spasbynituk.adapters.Madapter;
import com.example.spasbynituk.adapters.Madapterm;
import com.example.spasbynituk.adapters.Myadapter;
import com.example.spasbynituk.modules.Mainmodules;
import com.example.spasbynituk.modules.Model;
import com.example.spasbynituk.modules.Modell;
import com.example.spasbynituk.modules.Moodel;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;
import android.view.View;
import android.view.WindowManager;

public class Secondary extends AppCompatActivity {
    String st;
    RecyclerView recview;
    RecyclerView recview2;
    Madapter madapter;
    Madapterm madapterm;
    FloatingActionButton fb;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        st = getIntent().getExtras().getString("Value");
        String pt;
        pt=st;
        String pu;
        pu = pt.concat("-p");
        fb = (FloatingActionButton) findViewById(R.id.floating);
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Secondary.this  , MainActivity7.class);
                i.putExtra("Value" , st);
                startActivity(i);
                finish();
            }
        });
      // recview2 = (RecyclerView)findViewById(R.id.recyclerview2);
        recview = (RecyclerView)findViewById(R.id.recyclerview);
      // recview2.setLayoutManager(new LinearLayoutManager(this));
      /*  FirebaseRecyclerOptions<Moodel> options1 =
                new FirebaseRecyclerOptions.Builder<Moodel>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child(pu), Moodel.class)
                        .build();
        madapterm = new Madapterm(options1);
        recview2.setAdapter(madapterm);*/
        recview.setLayoutManager(new LinearLayoutManager(this));
        FirebaseRecyclerOptions<Modell> options =
                new FirebaseRecyclerOptions.Builder<Modell>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child(st), Modell.class)
                        .build();
        madapter = new Madapter(options);
        recview.setAdapter(madapter);
    }
    @Override
    protected void onStart() {
        super.onStart();
       //madapterm.startListening();
        madapter.startListening();
    }
    @Override
    protected void onStop() {
        super.onStop();
       //madapterm.stopListening();
        madapter.stopListening();
    }
}
