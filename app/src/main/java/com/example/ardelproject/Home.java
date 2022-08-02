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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Home extends Fragment {

    private View view;
    LinearLayout cdlayout;
    LinearLayout hidelayout;
    CardView cardview;
    RecyclerView recyView;

    private Button startBtn;
    private Button btning;
    private Button btncom;

    String s1[] = {"6/25","7/9","7/11","7/19","7/23","8/1","8/8"};
    String s2[] = {"기념품","선풍기","헤어질결심 각본집","우양산","아두이노 키트","에어팟 3세대","로지텍 마우스"};
    int eximages[] = {R.drawable.kexpresslogo,R.drawable.koreaexpress,R.drawable.kexpresslogo,R.drawable.koreaexpress
    ,R.drawable.kexpresslogo,R.drawable.kexpresslogo,R.drawable.koreaexpress};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.home,container,false);

        cardview = view.findViewById(R.id.cardview);
        recyView = view.findViewById(R.id.recyclerView);
        cdlayout = view.findViewById(R.id.cdlayout);
        hidelayout = view.findViewById(R.id.hidelayout);
        btning = view.findViewById(R.id.del_ing);
        btncom = view.findViewById(R.id.del_com);

        MyAdapter myAdapter = new MyAdapter(getActivity().getApplicationContext(), s1, s2, eximages);
        recyView.setAdapter(myAdapter);
        recyView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));

//        cardview.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int vw = (hidelayout.getVisibility()==View.GONE) ? View.VISIBLE: View.GONE;
//                TransitionManager.beginDelayedTransition(cdlayout, new AutoTransition());
//                hidelayout.setVisibility(vw);
//            }
//        });

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