package com.example.kh.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivitySecond extends AppCompatActivity {
TextView txtData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_second);
        txtData = (TextView) findViewById(R.id.txtData);
        Intent intent = getIntent();

        String mText = intent.getStringExtra("name");
        int num  = intent.getIntExtra("page", 0);
        txtData.setText(mText+" "+num );
    }
}
