package com.example.myaman;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {
    private Handler handlerAnimation = new Handler();
    private boolean statusAnimation = false;
    private ImageView imgAnimation1, imgAnimation2;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home); // Make sure to set the correct layout file


        imgAnimation1 = findViewById(R.id.imgAnimation1);
        imgAnimation2 = findViewById(R.id.imgAnimation2);
        button = findViewById(R.id.button);
        startPulse();





        ImageView imageView = findViewById(R.id.iv1);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click event programmatically
                goToSpList(v);
            }
        });
    }
    private void startPulse() {
        handlerAnimation.post(runnable);
    }
    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            imgAnimation1.animate().scaleX(4f).scaleY(4f).alpha(0f).setDuration(1000)
                    .withEndAction(new Runnable() {
                        @Override
                        public void run() {
                            imgAnimation1.setScaleX(1f);
                            imgAnimation1.setScaleY(1f);
                            imgAnimation1.setAlpha(1f);
                        }
                    });

            imgAnimation2.animate().scaleX(4f).scaleY(4f).alpha(0f).setDuration(700)
                    .withEndAction(new Runnable() {
                        @Override
                        public void run() {
                            imgAnimation2.setScaleX(1f);
                            imgAnimation2.setScaleY(1f);
                            imgAnimation2.setAlpha(1f);
                        }
                    });

            handlerAnimation.postDelayed(this, 1500);
        }
    };



    public void goToReportEmaergency(View view) {
        Intent intent = new Intent(this,ReportEmergency.class);
        startActivity(intent);
    }




    public void goToSpList(View view){
        Intent intent = new Intent(this,MecServiceProvider.class);
        startActivity(intent);
    }
}
