package com.example.assesment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class welcome extends AppCompatActivity {
    TextView WelcomeTextViewID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        WelcomeTextViewID=findViewById(R.id.WelcomeTextViewID);
    }

    public void NextPageFunction(View view) {
        Intent myIntent3= new Intent(welcome.this,Information.class);
        startActivity(myIntent3);
    }
}
