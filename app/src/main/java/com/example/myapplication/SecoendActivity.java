package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecoendActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        TextView tv = (TextView)findViewById(R.id.textView);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secoend);
//        Intent it = this.getIntent();
//        Bundle bn = it.getExtras();
//        tv.setText(bn.getString("name"));
    }
}
