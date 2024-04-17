package com.example.myaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);


        TextView textView = findViewById(R.id.information_personnel);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToPersonalInformation(v);
            }
        });
    }


    public void goToPersonalInformation(View view) {
        Intent intent = new Intent(this, PersonalInformation.class);
        startActivity(intent);
    }
}
