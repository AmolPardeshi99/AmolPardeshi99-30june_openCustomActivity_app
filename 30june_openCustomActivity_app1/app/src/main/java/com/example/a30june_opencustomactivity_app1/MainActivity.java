package com.example.a30june_opencustomactivity_app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button mBtnSend;
    private EditText metName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnSend = findViewById(R.id.btnSend);
        metName = findViewById(R.id.etName);

        mBtnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("android.content.Intent.ACTION_SEND");
                intent.setType("plain/text");
                intent.putExtra("name",metName.getText().toString());
                startActivity(intent);
            }
        });

    }
}