package com.example.spasbynituk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;

import com.example.spasbynituk.adapters.Adapterm;
import com.example.spasbynituk.adapters.Madapter;
import com.example.spasbynituk.modules.Modell;
import com.example.spasbynituk.modules.Modelll;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class Three extends AppCompatActivity {
    String ct;
    RecyclerView recview;
    Adapterm adapterm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        ct = getIntent().getExtras().getString("Value");
        recview = (RecyclerView)findViewById(R.id.recyclerview);
        recview.setLayoutManager(new LinearLayoutManager(this));
        FirebaseRecyclerOptions<Modelll> options =
                new FirebaseRecyclerOptions.Builder<Modelll>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child(ct), Modelll.class)
                        .build();
        adapterm = new Adapterm(options);
        recview.setAdapter(adapterm);
    }
    @Override
    protected void onStart() {
        super.onStart();
        adapterm.startListening();
    }
    @Override
    protected void onStop() {
        super.onStop();
        adapterm.stopListening();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.searchmenu, menu);
        MenuItem item = menu.findItem(R.id.search);
        SearchView searchView = (SearchView)item.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                processsearch(s);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                processsearch(s);
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }

    private void processsearch(String s) {
        String p="grades: ";
        s = p.concat(s);
        FirebaseRecyclerOptions<Modelll> options =
                new FirebaseRecyclerOptions.Builder<Modelll>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child(ct).orderByChild("grades").startAt(s).endAt(s+"\uf8ff"), Modelll.class)
                        .build();
        adapterm = new Adapterm(options);
        adapterm.startListening();
        recview.setAdapter(adapterm);
    }
}