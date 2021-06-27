package com.example.spasbynituk.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spasbynituk.R;
import com.example.spasbynituk.Secondary;
import com.example.spasbynituk.modules.Modell;
import com.example.spasbynituk.modules.Modelll;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class Adapterm extends FirebaseRecyclerAdapter<Modelll, Adapterm.myviewholder> {


    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public Adapterm(@NonNull FirebaseRecyclerOptions<Modelll> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull Modelll model) {
        holder.credit.setText(model.getCredit());
        holder.grades.setText(model.getGrades());
        holder.roll.setText(model.getRoll());
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow , parent , false);
        return new myviewholder(view);
    }
    class myviewholder extends RecyclerView.ViewHolder{
        TextView credit , grades  , roll;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            credit = (itemView).findViewById(R.id.textView9);
            grades = (itemView).findViewById(R.id.textVie4);
            roll = (itemView).findViewById(R.id.cname1);
        }
    }

}
