package com.example.ict602_project_crowdsourcing;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        //Initialize And Assign Variable
        BottomNavigationView bottomNavigationView =findViewById(R.id.bottom_navigation);

        //Set News selected
        bottomNavigationView.setSelectedItemId(R.id.News);

        //Perform ItemSelectedListener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.News:
                        return true;
                    case R.id.Maps:
                        startActivity(new Intent(getApplicationContext()
                                ,MapsActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.AboutUs:
                        startActivity(new Intent(getApplicationContext()
                                ,AboutActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}