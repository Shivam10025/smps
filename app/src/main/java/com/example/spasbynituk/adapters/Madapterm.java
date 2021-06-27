package com.example.spasbynituk.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spasbynituk.R;
import com.example.spasbynituk.modules.Moodel;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class Madapterm extends FirebaseRecyclerAdapter<Moodel , Madapterm.myviewholder> {

    public Madapterm(@NonNull FirebaseRecyclerOptions<Moodel> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull Moodel model) {
        holder.name.setText(model.getName());
        holder.roll.setText(model.getRoll());
        holder.branch.setText(model.getBranch());
        holder.number.setText(model.getPhone());
        holder.emal.setText(model.getEmail());
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlecol, parent , false);
        return new myviewholder(view);
    }

    class myviewholder extends RecyclerView.ViewHolder{
        TextView name , roll , branch , number , emal;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            name = (TextView)itemView.findViewById(R.id.t_name);
            roll = (TextView)itemView.findViewById(R.id.t_roll);
            branch = (TextView)itemView.findViewById(R.id.t_branch);
            //number = (TextView)itemView.findViewById(R.id.t_num);
           // emal = (TextView)itemView.findViewById(R.id.t_mal);

        }
    }
}
