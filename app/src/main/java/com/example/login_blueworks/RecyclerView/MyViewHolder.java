package com.example.login_blueworks.RecyclerView;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.login_blueworks.R;

public class MyViewHolder extends RecyclerView.ViewHolder {
    
    ImageView imageView;
    TextView textView,nameView;


    
    
    
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        textView = itemView.findViewById(R.id.text);
        nameView = itemView.findViewById(R.id.name);


        
    }
}
