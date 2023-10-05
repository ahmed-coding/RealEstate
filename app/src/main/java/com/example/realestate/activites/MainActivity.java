package com.example.realestate.activites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.realestate.Adapter.itemsAdapter;
import com.example.realestate.Models.itemModels;
import com.example.realestate.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterPopular,adapterNew;
    private RecyclerView recyclerViewPopular, recyclerViewNew;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
    }
    private void initRecyclerView() {
        ArrayList<itemModels> items = new ArrayList<>();
        items.add(new itemModels("Title 1","Yemen-Sana'a","Description 1",2,3,200000000,"pic1",true));
        items.add(new itemModels("Title 2","Yemen-Sana'a","Description 2",2,3,20000000,"pic2",true));
        items.add(new itemModels("Title 3","Yemen-Sana'a","Description 3",2,3,20000000,"pic3",true));

        recyclerViewPopular= findViewById(R.id.viewPopular);
        recyclerViewNew = findViewById(R.id.viewNew);
        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerViewNew.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));

        adapterNew = new itemsAdapter(items);
        adapterPopular = new itemsAdapter(items);

        recyclerViewNew.setAdapter(adapterNew);
        recyclerViewPopular.setAdapter(adapterPopular);

    }
}