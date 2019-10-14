/**
 * @authors Karol Pawlak
 * @date October 2019
 * @description MediScreen Group Project - Mobile App
 *
 * LOGIN SCREEN
 */
package com.example.mediscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //variables
    EditText userid;
    EditText pword;
    Button loginbtn;
    Button resetbtn;
    TextView statusWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userid = (EditText) findViewById(R.id.editText);
        pword = (EditText) findViewById(R.id.editText2);
        loginbtn = (Button) findViewById(R.id.button);
        resetbtn = (Button) findViewById(R.id.button2);
        statusWindow = (TextView) findViewById(R.id.textView);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                statusWindow.setText("Logging in...");

                openNewActivity();

            }
        });

        resetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userid.setText("");
                pword.setText(""); }
        });
    }

    private void openNewActivity() {
        Intent intent = new Intent(this, MainPageActivity.class);
        startActivity(intent);
    }
}
