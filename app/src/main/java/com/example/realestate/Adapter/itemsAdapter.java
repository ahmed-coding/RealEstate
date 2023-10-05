package com.example.realestate.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.realestate.Models.itemModels;
import com.example.realestate.R;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class itemsAdapter extends RecyclerView.Adapter<itemsAdapter.ViewHolder> {

    ArrayList<itemModels> itemsModels;
    DecimalFormat formater;
    Context context;

    public itemsAdapter(ArrayList<itemModels> itemsModels) {
        this.itemsModels = itemsModels;
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
holder.title.setText(itemsModels.get(position).getTitle());
holder.address.setText(itemsModels.get(position).getAddress());
holder.price.setText("$"+formater.format(itemsModels.get(position).getPrice()));
holder.pic.setImageResource(itemsModels.get(position).getPic());

    }

    @Override
    public int getItemCount() {
        return itemsModels.size();
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
