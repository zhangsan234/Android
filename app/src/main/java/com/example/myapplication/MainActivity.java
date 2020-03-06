package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button)findViewById(R.id.button2);
        EditText edt1 = (EditText)findViewById(R.id.editText);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


//                Intent it =  new Intent();
//       Bundle bn = new Bundle();
//       bn.putString("name",edt1.getText().toString());
//       it.putExtras(bn);
//                it.setClass(MainActivity.this,SecoendActivity.class);
//                startActivity(it);



    }
}
