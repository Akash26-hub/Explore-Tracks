package com.example.exploretracks;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder>{

    Context context;
    String[] list;
    String[] timer;
    int[] img;
    int[] img2;
    int[] img3;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView t;
        TextView t2;
        ImageView i;
        ImageView i2;
        ImageView i3;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);

            t = itemView.findViewById(R.id.textView76);
            t2 = itemView.findViewById(R.id.textView36);
            i = itemView.findViewById(R.id.imageView56);
            i2 = itemView.findViewById(R.id.imageView26);
            i3 = itemView.findViewById(R.id.imageView16);
        }
    }
    public MyListAdapter(Context context, String[] list, String[] timer, int[] img,int[] img2, int[] img3){
        this.context=context;
        this.list=list;
        this.timer=timer;
        this.img=img;
        this.img2=img2;
        this.img3=img3;
    }


    @NonNull
    @Override
    public MyListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.list_item_layout,parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) { 
    holder.t.setText(list[position]);
        holder.t2.setText(timer[position]);
        holder.i.setImageResource(img[position]);
        holder.i2.setImageResource(img2[position]);
        holder.i3.setImageResource(img3[position]);

    }

    @Override
    public int getItemCount() {
        return list.length;
    }
}