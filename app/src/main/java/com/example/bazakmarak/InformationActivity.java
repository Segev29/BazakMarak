package com.example.bazakmarak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InformationActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnDone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infrormation);
        btnDone = findViewById(R.id.BtnDone);
        btnDone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        finish();
    }
}