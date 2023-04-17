package com.example.baseproject3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    BottomNavigationView bottomNavigationView;
    Home home;
    Assignment assignment;
    Fees fees;
    Library library;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        home = new Home();
        assignment = new Assignment();
        fees = new Fees();
        library = new Library();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById((R.id.toolbar));
        bottomNavigationView = findViewById(R.id.bootambar);
        toolbar.setTitle("Student Management");
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                return false;
            }
        });
    }
}
