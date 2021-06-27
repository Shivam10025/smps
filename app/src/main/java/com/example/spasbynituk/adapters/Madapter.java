package com.example.spasbynituk.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spasbynituk.R;
import com.example.spasbynituk.modules.Modell;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class Madapter extends FirebaseRecyclerAdapter<Modell , Madapter.myviewholder> {

    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public Madapter(@NonNull FirebaseRecyclerOptions<Modell> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull Modell model) {
        holder.course.setText(model.getCourse());
        holder.credit.setText(model.getCredit());
        holder.grades.setText(model.getGrades());
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow , parent , false);
        return new myviewholder(view);
    }

    class myviewholder extends RecyclerView.ViewHolder{
        TextView course , credit , grades;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            course = (itemView).findViewById(R.id.cname1);
            credit = (itemView).findViewById(R.id.textVie4);
            grades = (itemView).findViewById(R.id.textView9);
        }
    }
}
