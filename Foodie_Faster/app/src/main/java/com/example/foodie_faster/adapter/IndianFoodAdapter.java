package com.example.foodie_faster.adapter;

import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.foodie_faster.DetailsActivity;
import com.example.foodie_faster.R;
import com.example.foodie_faster.model.IndianFood;
import com.example.foodie_faster.model.PopularFood;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;


public class IndianFoodAdapter extends RecyclerView.Adapter<IndianFoodAdapter.IndianFoodViewHolder> {
    Context context;
    List<IndianFood> indianFoodList;
    List<IndianFood> filteredIndianFoodList;




    public IndianFoodAdapter(Context context, List<IndianFood> indianFoodList) {
        this.context = context;
        this.indianFoodList = indianFoodList;


    }

    @NonNull
    @NotNull
    @Override
    public IndianFoodViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.indian_food_row_item, parent, false);
        return new IndianFoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull IndianFoodViewHolder holder, int position) {

        holder.foodImage.setImageResource(indianFoodList.get(position).getImageUrl());
        holder.name.setText(indianFoodList.get(position).getName());
        holder.price.setText(indianFoodList.get(position).getPrice());
        holder.rating.setText(indianFoodList.get(position).getRating());
        holder.resturantName.setText(indianFoodList.get(position).getResturantname());
        holder.delivery_time.setText(indianFoodList.get(position).getDelivery_time());
        holder.type.setText(indianFoodList.get(position).getType());
        holder.desc.setText(indianFoodList.get(position).getDescription());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, DetailsActivity.class);
                i.putExtra("name",indianFoodList.get(position).getName());
                i.putExtra("price",indianFoodList.get(position).getPrice());
                i.putExtra("foodImage",indianFoodList.get(position).getImageUrl());
                i.putExtra("rating",indianFoodList.get(position).getRating());
                i.putExtra("resturantName",indianFoodList.get(position).getResturantname());
                i.putExtra("type",indianFoodList.get(position).getType());
                i.putExtra("desc",indianFoodList.get(position).getDescription());
                i.putExtra("dev_time",indianFoodList.get(position).getDelivery_time());

                context.startActivity(i);

            }
        });

    }

    @Override
    public int getItemCount() {
        return indianFoodList.size();
    }




    public static final class IndianFoodViewHolder extends RecyclerView.ViewHolder{
        ImageView foodImage;
        TextView price, name, rating, resturantName,delivery_time,type,desc;

        public IndianFoodViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.food_image);
            price = itemView.findViewById(R.id.price);
            name = itemView.findViewById(R.id.name);
            rating = itemView.findViewById(R.id.rating);
            resturantName = itemView.findViewById(R.id.resturant_name);
            desc=itemView.findViewById(R.id.des);
            delivery_time=itemView.findViewById(R.id.dit);
            type=itemView.findViewById(R.id.typ);

        }

    }


}

