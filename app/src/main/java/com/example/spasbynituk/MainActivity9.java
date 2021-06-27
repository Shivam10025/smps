package com.example.spasbynituk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.spasbynituk.databinding.ActivityMain5Binding;
import com.example.spasbynituk.module.Datahold;
import com.example.spasbynituk.module.Dataholdin;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity9 extends AppCompatActivity {
    EditText name , roll , email , phone;
    AutoCompleteTextView Branch;
    private static final String[] bra= new String[]{
            "Computer Science Engineering" , "Electronic Engineering" , "Electrical Engineering" , "Mechanical Engineering" , "Civil Engineering"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        AutoCompleteTextView edittext3= findViewById(R.id.et_branch);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this , android.R.layout.simple_list_item_1 , bra);
        edittext3.setAdapter(adapter2);
    }
    public void process1(View view){
        name = (EditText)findViewById(R.id.et_name);
        roll = (EditText)findViewById(R.id.et_roll);
        email = (EditText)findViewById(R.id.et_email);
        phone = (EditText)findViewById(R.id.et_number);
        Branch = (AutoCompleteTextView)findViewById(R.id.et_branch);
        String pi = name.getText().toString().trim();
        String po = roll.getText().toString().trim();
        String pu = email.getText().toString().trim();
        String py = phone.getText().toString().trim();
        String pt = Branch.getText().toString().trim();
        String pr , pe , pw;
        pr = po;
        pe="Name: ";
        pi=pe.concat(pi);
        Datahold dh = new Datahold(pi , pt , po);
       // Dataholdin dhn = new Dataholdin(pi , po , py , pu , pt);
        FirebaseDatabase dg = FirebaseDatabase.getInstance();
        DatabaseReference nodep  = dg.getReference(po);
        nodep.child("1").setValue(dh);
        name.setText("");
        roll.setText("");
        email.setText("");
        phone.setText("");
        Branch.setText("");
        Toast.makeText(getApplicationContext(), "Data Added", Toast.LENGTH_SHORT).show();
    }
}