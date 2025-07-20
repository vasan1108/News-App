package com.example.newsnow;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.button.MaterialButton;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Initialize the views
        TextView username = findViewById(R.id.username);
        TextView password = findViewById(R.id.password);

        MaterialButton loginbtn = findViewById(R.id.loginbtn);

        // Set up login button click listener
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check if the username and password match "admin" (as an example)
                if (username.getText().toString().equals("Sadha") && password.getText().toString().equals("Dhinesh")) {
                    // Successful login
                    Toast.makeText(login.this, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();

                    // Start MainActivity
                    Intent intent = new Intent(login.this, MainActivity.class);
                    startActivity(intent);
                    finish();  // Finish the login activity so the user cannot go back
                } else {
                    // Failed login
                    Toast.makeText(login.this, "LOGIN FAILED !!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
