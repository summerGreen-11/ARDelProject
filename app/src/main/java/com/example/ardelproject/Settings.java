package com.example.ardelproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Settings extends Fragment {

    private View view;
    private Button logoutBtn;

    private LinearLayout layset1;
    private LinearLayout layset2;
    private LinearLayout layset3;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.settings,container,false);

        layset1 = (LinearLayout) view.findViewById(R.id.lay_set1);
        layset2 = (LinearLayout) view.findViewById(R.id.lay_set2);
        layset3 = (LinearLayout) view.findViewById(R.id.lay_set3);

        layset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), setting02.class);
                startActivity(intent); // 다음화면으로 넘어가기
            }
        });

        logoutBtn = (Button) view.findViewById(R.id.btn_logout);
        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logoutBtn.setSelected(true);

                Intent intent = new Intent(getActivity().getApplicationContext(), Login.class);
                startActivity(intent); // 다음화면으로 넘어가기
                //finish(); // Activity 화면 제거
            }
        });
        return view;
    }
}