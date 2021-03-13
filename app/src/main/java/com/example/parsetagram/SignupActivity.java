package com.example.parsetagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    //Tag for debugging
    public static final String TAG = "SignupActivity";

    //Declared xml stuff
    EditText etgivenEmail;
    EditText etgivenUsername;
    EditText etgivenPassword;
    EditText etgivenagainPassword;
    Button btnSignUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        //Link to xml stuff
        etgivenEmail = findViewById(R.id.etgivenEmail);
        etgivenUsername = findViewById(R.id.etgivenUsername);
        etgivenPassword = findViewById(R.id.etgivenPassword);
        etgivenagainPassword = findViewById(R.id.etgivenagainPassword);
        btnSignUp = findViewById(R.id.btnSignUp);

        //on click move to next activity
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick Sign Up Button");
                Toast.makeText(SignupActivity.this, "Signed Up! Moving to Login", Toast.LENGTH_SHORT).show();
                goToLoginActivity();
            }
        });


    }

    //moves to LoginActivity
    private void goToLoginActivity() {
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
        finish();
    }
}