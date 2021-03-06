package com.example.blackforkwetlandsapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class BirdsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<OrganismClass> birdList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_layout);


        birdList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        birdList.add(new OrganismClass(getString(R.string.bird_1_name)
                , getString(R.string.bird_1_des), R.drawable.ic_android2));



        OrganismRecyclerAdapter recyclerAdapter = new OrganismRecyclerAdapter(birdList);
        recyclerView.setAdapter(recyclerAdapter);
    }
}
