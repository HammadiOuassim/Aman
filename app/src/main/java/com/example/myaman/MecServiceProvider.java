package com.example.myaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MecServiceProvider extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mec_service_provider);
    }

    public void goToRoutingActivity(View view) {
        Intent intent = new Intent(this, Routing.class);
        startActivity(intent);
    }
}
