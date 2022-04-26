package com.example.itmedbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);
        LogFragment logFragment = new LogFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.loginFrame,logFragment).commit();

        Button btnSignForm = findViewById(R.id.btnSignForm);
        btnSignForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignActivity.this, SignFormActivity.class);
                startActivity(intent);
            }
        });
    }
}