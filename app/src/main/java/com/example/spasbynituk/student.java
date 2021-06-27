package com.example.spasbynituk;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.spasbynituk.databinding.ActivitySigninactivityBinding;
import com.example.spasbynituk.databinding.ActivityStudentBinding;
import com.example.spasbynituk.module.User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class student extends AppCompatActivity {
    ActivityStudentBinding binding;
    FirebaseAuth mAuth;
    FirebaseDatabase database;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStudentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        mAuth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();
        progressDialog = new ProgressDialog(student.this);
        progressDialog.setTitle("Creating Account");
        progressDialog.setTitle("we are creating your account");
        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog.show();
                mAuth.createUserWithEmailAndPassword(binding.etEmail.getText().toString() , binding.etPassword.getText().toString()).
                        addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                progressDialog.dismiss();
                                if (task.isSuccessful()){
                                    User user = new User(binding.etUsername.getText().toString()  , binding.etEmail.getText().toString()  , binding.etPassword.getText().toString());
                                    Toast.makeText(student.this, "User created Successfully", Toast.LENGTH_SHORT).show();
                                }
                                else{
                                    Toast.makeText(student.this,task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });
        binding.etacccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(student.this , ssignin.class);
                startActivity(intent);
            }
        });
    }

}