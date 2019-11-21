package com.example.mediscreenapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mediscreenapp.R;

public class HomeActivity extends AppCompatActivity
{

    //variables
    private Button loginbtn;
    private Button registerbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //declaring UI components
        loginbtn = (Button) findViewById(R.id.loginButtonHome);
        registerbtn = (Button) findViewById(R.id.registerButton);

        //on click actions
        loginbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openLoginActivity();
            }
        });

        registerbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openRegisterActivity();
            }
        });
    }

    //methods
    public void openLoginActivity()
    {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void openRegisterActivity()
    {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}
