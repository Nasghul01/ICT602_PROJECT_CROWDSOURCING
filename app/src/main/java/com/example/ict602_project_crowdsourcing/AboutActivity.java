package com.example.ict602_project_crowdsourcing;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AboutActivity extends AppCompatActivity {

    TextView linkTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        //Initialize And Assign Variable
        BottomNavigationView bottomNavigationView =findViewById(R.id.bottom_navigation);

        //Set News selected
        bottomNavigationView.setSelectedItemId(R.id.AboutUs);

        //Perform ItemSelectedListener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.News:
                        startActivity(new Intent(getApplicationContext()
                                ,NewsActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.Maps:
                        startActivity(new Intent(getApplicationContext()
                                ,MapsActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.AboutUs:
                        return true;
                }
                return false;
            }
        });

        linkTextView = findViewById(R.id.textViewLink);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}