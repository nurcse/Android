package com.example.ipvision.tguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {

    private RecyclerView recyclerView;
    private List<Places> placesList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_list);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());

        prepareData();
    }

    private void prepareData(){
        Places place = new Places("cox's bazar", "located in chittagong division", "");
        placesList.add(place);

        place = new Places("bandarban", "located in chittagong division", "");
        placesList.add(place);

        place = new Places("sajek", "located in chittagong division", "");
        placesList.add(place);
    }
}
