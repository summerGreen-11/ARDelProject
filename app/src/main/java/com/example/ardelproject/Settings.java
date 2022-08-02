package com.example.ardelproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Settings extends Fragment {

    private View view;
    private Button logoutBtn;
    private ImageButton infoset;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.settings,container,false);

        infoset = (ImageButton) view.findViewById(R.id.btn_info_setting);
        infoset.setOnClickListener(new View.OnClickListener() {
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