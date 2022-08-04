package com.example.ardelproject;

import android.content.Intent;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class Home extends Fragment {

    private View view;
    LinearLayout cdlayout;
    LinearLayout hidelayout;
    CardView cardview;

    private Button startBtn;
    private Button btning;
    private Button btncom;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.home,container,false);

        cardview = view.findViewById(R.id.cardview);
        cdlayout = view.findViewById(R.id.cdlayout);
        hidelayout = view.findViewById(R.id.hidelayout);
        btning = view.findViewById(R.id.del_ing);
        btncom = view.findViewById(R.id.del_com);

        cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int vw = (hidelayout.getVisibility()==View.GONE) ? View.VISIBLE: View.GONE;

                TransitionManager.beginDelayedTransition(cdlayout, new AutoTransition());
                hidelayout.setVisibility(vw);
            }
        });

        btning.setSelected(true);
        btning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btning.setSelected(true);
                btncom.setSelected(false);
            }
        });
        btncom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btncom.setSelected(true);
                btning.setSelected(false);
            }
        });
        return view;
    }
}