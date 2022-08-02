package com.example.ardelproject;

import android.content.Context;
import android.content.Intent;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    String data1[], data2[];
    int images[];
    Context context;

    public MyAdapter(Context ct, String s1[], String s2[], int img[]){
        context = ct;
        data1 = s1;
        data2 = s2;
        images = img;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.setIsRecyclable(false);
        holder.datetext.setText(data1[position]);
        holder.del_content.setText(data2[position]);
        holder.expressImage.setImageResource(images[position]);

        holder.cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int vw = (holder.hidelayout.getVisibility()==View.GONE) ? View.VISIBLE: View.GONE;
                TransitionManager.beginDelayedTransition(holder.cdlayout, new AutoTransition());
                holder.hidelayout.setVisibility(vw);
            }
        });
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        CardView cardview;
        TextView datetext;
        TextView del_content;
        ImageView expressImage;
        LinearLayout cdlayout;
        LinearLayout hidelayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            cardview = itemView.findViewById(R.id.cardview);
            datetext = itemView.findViewById(R.id.datetext);
            del_content = itemView.findViewById(R.id.del_content);
            expressImage = itemView.findViewById(R.id.expressImage);
            cdlayout = itemView.findViewById(R.id.cdlayout);
            hidelayout = itemView.findViewById(R.id.hidelayout);
        }
    }
}
