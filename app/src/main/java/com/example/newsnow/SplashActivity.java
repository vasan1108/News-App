package com.example.newsnow;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Delay of 3 seconds before navigating to the login activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Create intent to navigate to login activity
                Intent intent = new Intent(SplashActivity.this, login.class);
                startActivity(intent);
                finish();  // Finish SplashActivity to prevent the user from going back to it
            }
        }, 3000);  // Delay of 3 seconds (3000 milliseconds)
    }
}
