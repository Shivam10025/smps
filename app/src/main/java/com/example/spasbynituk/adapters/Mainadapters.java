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

import java.util.ArrayList;

public class Mainadapters extends RecyclerView.Adapter<Mainadapters.viewholder>{


    ArrayList<Mainmodules> list;
    Context context;

    public Mainadapters(ArrayList<Mainmodules> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.samplemainfood , parent , false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        final Mainmodules model = list.get(position);
        holder.cname1.setText(model.getCname());
        holder.textView4.setText(model.getCcode());
        holder.textView5.setText(model.getCcredit());
    }

    @Override
    public int getItemCount() {

        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        TextView cname1 , textView4 , textView5;

        public viewholder(@NonNull View itemView) {
            super(itemView);
            cname1 = itemView.findViewById(R.id.cname1);
            textView4 = itemView.findViewById(R.id.textVie4);
            textView5 = itemView.findViewById(R.id.textView5);

        }
    }
}
