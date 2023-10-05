package com.example.realestate.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.realestate.Models.itemModels;
import com.example.realestate.R;
import com.example.realestate.activites.DetailsActivity;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class itemsAdapter extends RecyclerView.Adapter<itemsAdapter.ViewHolder> {

    ArrayList<itemModels> items;
    DecimalFormat formater;
    Context context;

    public itemsAdapter(ArrayList<itemModels> itemsModels) {
        this.items = itemsModels;
        this.formater = new DecimalFormat("###,###,###,###.##");
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);
        context =parent.getContext();
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title.setText(items.get(position).getTitle());
        holder.address.setText(items.get(position).getAddress());
        holder.price.setText("$"+formater.format(items.get(position).getPrice()));
        int drawableResourceId = holder.itemView.getResources().getIdentifier(items.get(position).getPic(), "drawable",holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext())
                .load(drawableResourceId)
                .into(holder.pic);
        holder.itemView.setOnClickListener(v-> {

                Intent intent = new Intent(context, DetailsActivity.class);
                intent.putExtra("object", items.get(position));
                context.startActivity(intent);
        });


    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
TextView title,address,price;
ImageView pic;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.txtTitle);
            address = itemView.findViewById(R.id.txtAddress);
            price = itemView.findViewById(R.id.txtPrice);
            pic = itemView.findViewById(R.id.pic);
        }
    }
}
