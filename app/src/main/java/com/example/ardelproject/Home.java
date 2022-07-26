package com.example.ardelproject;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.TransitionRes;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Home extends Fragment {

    private View view;
    LinearLayout cdlayout;
    LinearLayout hidelayout;
    CardView cardview;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.home,container,false);

        cardview = view.findViewById(R.id.cardview);
        cdlayout = view.findViewById(R.id.cdlayout);
        hidelayout = view.findViewById(R.id.hidelayout);

        cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int vw = (hidelayout.getVisibility()==View.GONE) ? View.VISIBLE: View.GONE;

                TransitionManager.beginDelayedTransition(cdlayout, new AutoTransition());
                hidelayout.setVisibility(vw);
            }
        });

        return view;
    }
}
