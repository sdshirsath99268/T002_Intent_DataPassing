package com.example.t002_intent_passingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {

    TextView txtname , txtemail ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        txtname = findViewById(R.id.passed_name);
        txtemail = findViewById(R.id.passed_email);

        Intent intent = getIntent();

        String NAME = intent.getStringExtra("namekey");
        txtname.setText(NAME);
        String EMAIL = intent.getStringExtra("emailkey");
        txtemail.setText(EMAIL);

    }
}