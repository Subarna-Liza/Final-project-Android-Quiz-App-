package com.example.assesment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Information extends AppCompatActivity {
    EditText NameEditText,PhoneEditText,EmailEditText,IDEditText;
    public static String ExtraData2="Iam come from 1st Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        NameEditText=findViewById(R.id.NameEditTextID);
        PhoneEditText=findViewById(R.id.PhoneEditTextID);
        EmailEditText=findViewById(R.id.EmailEditTextID);
        IDEditText=findViewById(R.id.IDEditTextID);
    }

    public void SaveDataFunction(View view) {
        String ID=IDEditText.getText().toString();
        String name=NameEditText.getText().toString();
        String phone=PhoneEditText.getText().toString();
        String email=EmailEditText.getText().toString();

        DatabaseHelper mydata=new DatabaseHelper(name,phone,email);

        FirebaseDatabase fdb=FirebaseDatabase.getInstance();
        DatabaseReference node=fdb.getReference("Candidate");
        node.child(ID).setValue(mydata);


        NameEditText.setText("");
        PhoneEditText.setText("");
        EmailEditText.setText("");
        Toast.makeText(this, " Data inserted", Toast.LENGTH_SHORT).show();





        Intent myIntent=new Intent(Information.this,MainActivity.class);
        startActivity(myIntent);
    }
}
