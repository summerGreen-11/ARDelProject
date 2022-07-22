package com.example.ardelproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private FragmentManager fm;
    private FragmentTransaction ft;
    private Home home;
    private Reserv reserv;
    private Scan scan;
    private Navi navi;
    private Settings settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavi);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.action_home:
                        setFrag(0);
                        break;
                    case R.id.action_reserv:
                        setFrag(1);
                        break;
                    case R.id.action_scan:
                        setFrag(2);
                        break;
                    case R.id.action_navi:
                        setFrag(3);
                        break;
                    case R.id.action_settings:
                        setFrag(4);
                        break;
                }
                return true;
            }
        });
        home = new Home();
        reserv = new Reserv();
        scan = new Scan();
        navi = new Navi();
        settings = new Settings();
        setFrag(0);
    }

    private void setFrag(int n){
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        switch (n){
            case 0:
                ft.replace(R.id.main_frame,home);
                ft.commit();
                break;
            case 1:
                ft.replace(R.id.main_frame,reserv);
                ft.commit();
                break;
            case 2:
                ft.replace(R.id.main_frame,scan);
                ft.commit();
                break;
            case 3:
                ft.replace(R.id.main_frame,navi);
                ft.commit();
                break;
            case 4:
                ft.replace(R.id.main_frame,settings);
                ft.commit();
                break;
        }
    }
}