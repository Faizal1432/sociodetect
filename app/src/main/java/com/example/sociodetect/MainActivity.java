package com.example.sociodetect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView cardProfile;
    CardView cardCamera;
    CardView cardCOVID;
    CardView cardInfo;
    CardView cardRisk;
    CardView cardFeedback;
    CardView cardLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardProfile = findViewById(R.id.cardProfile);
        cardCamera = findViewById(R.id.cardCamera);
        cardCOVID = findViewById(R.id.cardCOVID);
        cardInfo = findViewById(R.id.cardInfo);
        cardRisk = findViewById(R.id.cardRisk);
        cardFeedback = findViewById(R.id.cardFeedback);
        cardLogout = findViewById(R.id.cardLogout);

        cardFeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFeedback();
            }
        });
        
        cardInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openInfo(); }
        });

        cardCOVID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openCovid(); }
        });
    }

    public void openFeedback() {
        Intent intent = new Intent(this, UserFeedback.class);
        startActivity(intent);
    }

    public void openInfo() {
        Intent intent = new Intent(this, Infographics.class);
        startActivity(intent);
    }

    public void openCovid() {
        Intent intent = new Intent(this, Covid.class);
        startActivity(intent);
    }
}