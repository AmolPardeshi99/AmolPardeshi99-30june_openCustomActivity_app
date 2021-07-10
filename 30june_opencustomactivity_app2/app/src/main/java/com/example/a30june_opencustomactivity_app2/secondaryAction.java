package com.example.a30june_opencustomactivity_app2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class secondaryAction extends AppCompatActivity {

    private TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name  = findViewById(R.id.tvNameShow);
        String personName = getIntent().getStringExtra("name");
        name.setText(personName.toString());

    }
}