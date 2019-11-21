/**
 * Year 3 Group Project - MediScreen Application
 *
 * Authors:
 * - Eric O'Shea
 * - Jonathan Lim
 * - Karol Pawlak
 * - Mariusz Lisiecki
 *
 * Description:
 */

package com.example.mediscreenapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.mediscreenapp.R;

public class SplashScreenActivity extends AppCompatActivity {

    //variables
    private final int displayTime = 2000; //splash screen showing for 2 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //splash screen runs for displayTime and then fires MainActivity
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                Intent main = new Intent(SplashScreenActivity.this, HomeActivity.class);
                SplashScreenActivity.this.startActivity(main);
                SplashScreenActivity.this.finish();
            }

        }, displayTime);
    }
}
