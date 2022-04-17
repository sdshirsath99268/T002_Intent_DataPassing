package com.example.t002_intent_passingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name , email;
    Button btn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        btn = findViewById(R.id.btn) ;

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String NAME = name.getText().toString();
                String EMAIL = email.getText().toString();
                Intent intent = new Intent(MainActivity.this , UserActivity.class);
                intent.putExtra("namekey", NAME);
                intent.putExtra("emailkey",EMAIL);
                startActivity(intent);
            }
        });
    }
}