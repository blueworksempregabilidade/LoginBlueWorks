package com.example.login_blueworks.RecyclerView;


import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.login_blueworks.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    List<ClipData.Item> items;

    public MyAdapter(Context context) {
        this.context = context;
    }

    public MyAdapter(List<ClipData.Item> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.hardware_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.nameView.setText(items.get(position).getHtmlText());
        holder.textView.setText(items.get(position).getText());
        //holder.imageView.setImageResource(items.get(position).getUri());
    }

    @Override
    public int getItemCount() {

        return items.size();
    }
}
