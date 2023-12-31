package com.example.realestate.activites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.realestate.Adapter.itemsAdapter;
import com.example.realestate.Models.itemModels;
import com.example.realestate.R;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class DetailsActivity extends AppCompatActivity {
    private TextView txtTitle,txtDescription,txtPrice,txtBed,txtBath,txtWifi;
    private itemModels items;
    private ImageView pic;
    DecimalFormat formater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        initView();
        setVeriables();

    }

    private void setVeriables() {
        items = (itemModels) getIntent().getSerializableExtra("object");
        txtTitle.setText(items.getTitle());
        txtPrice.setText("$" + formater.format(items.getPrice())); // Convert to String
        txtBed.setText(items.getBad() + " Bed");
        txtBath.setText(items.getBad() + " Bath");
        txtDescription.setText(items.getDescription());
        if (items.isWifi()) {
            txtWifi.setText("Wifi");
        } else {
            txtWifi.setText("No-Wifi");
        }

        int picResourceID = items.getPic(); // Get the resource ID directly
        pic.setImageResource(picResourceID);
    }


    private void initView() {
    formater = new DecimalFormat("###,###,###,###.##");
    txtBath = (TextView) findViewById(R.id.txtBath);
    txtBed = (TextView) findViewById(R.id.txtBed);
    txtDescription = (TextView) findViewById(R.id.txtDescription);
    txtPrice = (TextView) findViewById(R.id.txtPrice);
    txtWifi = (TextView) findViewById(R.id.txtWifi);
    txtTitle = (TextView) findViewById(R.id.txtTitle);
    pic = (ImageView) findViewById(R.id.pic);


    }

}