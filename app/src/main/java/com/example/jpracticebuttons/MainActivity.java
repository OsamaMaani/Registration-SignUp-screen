package com.example.jpracticebuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.balysv.materialripple.MaterialRippleLayout;

public class MainActivity extends AppCompatActivity {
    MaterialRippleLayout registration_btn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registration_btn = findViewById(R.id.registration_btn);
        registration_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new
                        Intent(MainActivity.this, RegistrationActivity.class);
                startActivity(intent);
            }
        });
    }
}