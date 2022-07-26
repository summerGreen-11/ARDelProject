package com.example.ardelproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Debug;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class Login extends Activity {

    private Button loginuser;
    private Button logindel;
    private Button loginBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        loginuser = (Button) findViewById(R.id.btn_login_user);
        logindel = (Button) findViewById(R.id.btn_login_delivery);
        loginuser.setSelected(true);
        logindel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginuser.setSelected(false);
                logindel.setSelected(true);
            }
        });
        loginuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginuser.setSelected(true);
                logindel.setSelected(false);
            }
        });

        loginBtn = (Button) findViewById(R.id.btn_login);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent); // 다음화면으로 넘어가기
                finish(); // Activity 화면 제거
            }
        });

    }
}
