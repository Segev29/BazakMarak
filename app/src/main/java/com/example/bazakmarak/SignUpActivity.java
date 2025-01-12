package com.example.bazakmarak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnSave;
    private EditText userName, password1, password2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        btnSave = findViewById(R.id.BtnSignUp);
        btnSave.setOnClickListener(this);
        userName = findViewById(R.id.ETusername1);
        password1 = findViewById(R.id.ETpassword1);
        password2 = findViewById(R.id.ETpasswordVerify);

    }

    @Override
    public void onClick(View v) {
        String s1 = password1.getText().toString();
        String s2 = password2.getText().toString();
        if (s1.equals(s2)) /*&& isUsernameInFireBase(userName.getText())*/
        {
            if(s1.length() < 8)
            {
                Toast.makeText(this, "Too Short, 8+ characters are a must!", Toast.LENGTH_SHORT).show();
            }
            else
            {
                //saveNewUserInFireBase(userName.getText(),password1.getText());
                finish();
            }
        }
        else{
            Toast.makeText(this, "Passwords are not similar, please verify your password again.", Toast.LENGTH_SHORT).show();
        }
    }
}