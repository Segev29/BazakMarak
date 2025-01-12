package com.example.bazakmarak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignInActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnDone;
    private Button btnSignUp;
    private EditText userName, password1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        btnDone = findViewById(R.id.BtnSignUp);
        btnDone.setOnClickListener(this);
        btnSignUp = findViewById(R.id.BtnSignUp);
        btnSignUp.setOnClickListener(this);
        userName = findViewById(R.id.ETusername);
        password1 = findViewById(R.id.ETpassword);
    }

    @Override
    public void onClick(View v) {
        if(v == btnSignUp)
        {
            Intent intent = new Intent(this,SignUpActivity.class);
            startActivity(intent);
        }
        else
        {
            //if(existInFireBaseTogether(userName,password1))
            {
                //Intent i = new Intent(this,GameActivity.class);
            }
        }
    }
}