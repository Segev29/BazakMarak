package com.example.bazakmarak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this,GameActivity.class);
        startActivity(intent);
        //Intent intent1 = new Intent(this,InformationActivity.class);
        //startActivity(intent1);

    }
}