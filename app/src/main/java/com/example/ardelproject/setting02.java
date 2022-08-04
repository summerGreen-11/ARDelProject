package com.example.ardelproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;

public class setting02 extends AppCompatActivity {

    SwitchCompat sw1;
    SwitchCompat sw2;
    SwitchCompat sw3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting02);

        sw1 = (SwitchCompat) findViewById(R.id.btn_sw1);
        sw2 = (SwitchCompat) findViewById(R.id.btn_sw2);
        sw3 = (SwitchCompat) findViewById(R.id.btn_sw3);

        sw1.setChecked(true);
        sw2.setChecked(true);
        sw3.setChecked(true);
    }
}