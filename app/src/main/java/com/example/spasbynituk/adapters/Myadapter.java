package com.example.spasbynituk.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spasbynituk.R;
import com.example.spasbynituk.modules.Mainmodules;
import com.example.spasbynituk.modules.Mainmodules;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import java.util.ArrayList;

public class Myadapter extends FirebaseRecyclerAdapter<Mainmodules , Myadapter.myviewholder> {
    public Myadapter(@NonNull FirebaseRecyclerOptions<Mainmodules> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull Mainmodules model) {
        holder.name.setText(model.getCname());
        holder.credit.setText(model.getCcode());
        holder.grades.setText(model.getCcredit());
    }
    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.samplemainfood , parent , false);
        return  new myviewholder(view);
    }

    class myviewholder extends RecyclerView.ViewHolder{
        TextView name  , credit , grades;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            name = (TextView)itemView.findViewById(R.id.cname1);
            credit = (TextView)itemView.findViewById(R.id.textView9);
            grades = (TextView)itemView.findViewById(R.id.textVie4);
        }
    }
}
