package com.example.jpracticebuttons;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {

     EditText etName, etEmail ,etPassword;
     Button btn_validate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        Toolbar toolbar = findViewById(R.id.toolbar);
        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btn_validate = findViewById(R.id.btn_valdiate);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24);
        getSupportActionBar().setTitle(" ");
        btn_validate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean flag = true;
                if(etEmail.getText().toString().isEmpty()
                        || etName.getText().toString().isEmpty()
                        || etPassword.getText().toString().isEmpty() ){
                    flag= false;
                    etPassword.setError("Complete your info");
                    etName.setError("Complete your info");
                    etEmail.setError("Complete your info");
                    Toast.makeText(getApplicationContext(),
                            "Complete your info to register",
                            Toast.LENGTH_SHORT).show();
                }
                if(etPassword.getText().toString().length()< 6 ){
                    flag = false;
                    etPassword.setError("Password Must be greater than 6 chars");
                }
                if(flag){
                    Toast.makeText(getApplicationContext(),
                            "Successfully registered",Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()== android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}