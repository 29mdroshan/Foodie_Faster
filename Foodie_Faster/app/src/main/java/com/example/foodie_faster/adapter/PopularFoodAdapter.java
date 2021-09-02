package com.example.foodie_faster.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodie_faster.DetailsActivity;
import com.example.foodie_faster.R;
import com.example.foodie_faster.model.PopularFood;

import org.jetbrains.annotations.NotNull;

import java.util.List;


public class PopularFoodAdapter extends RecyclerView.Adapter<PopularFoodAdapter.PopularFoodViewHolder> {
    Context context;
    List<PopularFood> popularFoodList;


    public PopularFoodAdapter(Context context, List<PopularFood> popularFoodList) {
        this.context = context;
        this.popularFoodList = popularFoodList;
    }

    @NonNull
    @NotNull
    @Override
    public PopularFoodViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.popular_food_row_item, parent, false);
        return new PopularFoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull PopularFoodViewHolder holder, int position) {


        holder.foodImage.setImageResource(popularFoodList.get(position).getImageUrl());
        holder.name.setText(popularFoodList.get(position).getName());
        holder.price.setText(popularFoodList.get(position).getPrice());
        holder.rating.setText(popularFoodList.get(position).getRating());
        holder.type.setText(popularFoodList.get(position).getType());
        holder.delivery_time.setText(popularFoodList.get(position).getDelivery_time());
        holder.description.setText(popularFoodList.get(position).getDescription());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                    Intent i = new Intent(context, DetailsActivity.class);
                    i.putExtra("name",popularFoodList.get(position).getName());
                    i.putExtra("price",popularFoodList.get(position).getPrice());
                    i.putExtra("foodImage",popularFoodList.get(position).getImageUrl());
                    i.putExtra("rating",popularFoodList.get(position).getRating());
                    i.putExtra("desc",popularFoodList.get(position).getDescription());
                i.putExtra("type",popularFoodList.get(position).getType());
                i.putExtra("dev_time",popularFoodList.get(position).getDelivery_time());


                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return popularFoodList.size();
    }


    public static final class PopularFoodViewHolder extends RecyclerView.ViewHolder{
        ImageView foodImage;
        TextView price, name,description,rating,type,delivery_time;
        int i;

        public PopularFoodViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);


            foodImage = itemView.findViewById(R.id.food_image);
            price = itemView.findViewById(R.id.price);
            name = itemView.findViewById(R.id.name);
            description=itemView.findViewById(R.id.dit);
            rating=itemView.findViewById(R.id.rate);
            type=itemView.findViewById(R.id.type);
            delivery_time=itemView.findViewById(R.id.dev_time);


        }
    }
}

