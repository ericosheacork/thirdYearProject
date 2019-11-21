package com.example.mediscreenapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mediscreenapp.R;

public class LoginActivity extends AppCompatActivity
{

    //variables
    private EditText userID;
    private EditText pword;
    private Button loginbtn;
    private Button resetbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //declaring UI components
        userID = (EditText) findViewById(R.id.editTextUsername);
        pword = (EditText) findViewById(R.id.editTextPassword);
        loginbtn = (Button) findViewById(R.id.loginButton);
        resetbtn = (Button) findViewById(R.id.resetButton);

        //on click actions
        loginbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openMainActivity();
            }
        });

        resetbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                userID.setText("");
                pword.setText("");
            }
        });
    }

    //public or private????????????
    //methods
    public void openMainActivity()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
