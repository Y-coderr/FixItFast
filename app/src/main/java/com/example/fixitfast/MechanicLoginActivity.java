package com.example.fixitfast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class MechanicLoginActivity extends AppCompatActivity {
    public EditText mEmail = (EditText) findViewById(R.id.email),mPassword = (EditText) findViewById(R.id.password);
    public Button mLogin = (Button) findViewById(R.id.login),mRegister = (Button) findViewById(R.id.register);

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener firebaseAuthListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanic_login);


    }
}