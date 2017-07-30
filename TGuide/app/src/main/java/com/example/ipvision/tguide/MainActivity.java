package com.example.ipvision.tguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {

    private RecyclerView recyclerView;
    private List<Places> placesList = new ArrayList<>();
    private PlacesAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_list);

        mAdapter = new PlacesAdapter(placesList, this);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Places place = placesList.get(position);

                Intent intent = new Intent(MainActivity.this, PlaceDetailsActivity.class);
                intent.putExtra("placeObject",  place);
                startActivity(intent);
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        prepareData();
    }

    private void prepareData(){
        Places place = new Places("কক্সবাজার, সেন্টমার্টিন",
                "চট্টগ্রাম । কক্সবাজার", R.drawable.coxsbazar, 0);
        placesList.add(place);

        place = new Places("সাজেক ভ্যালী", "চট্টগ্রাম । খাগড়াছড়ি", R.drawable.sajek, 1);
        placesList.add(place);

        place = new Places("নিঝুম দ্বীপ", "চট্টগ্রাম । নোয়াখালী", R.drawable.nijhumisland,2);
        placesList.add(place);

        place = new Places("বগালেক", "চট্টগ্রাম । বান্দরবন", R.drawable.boga_lake,3);
        placesList.add(place);

        place = new Places("কেওক্রাডং", "চট্টগ্রাম । বান্দরবন", R.drawable.keokradong,4);
        placesList.add(place);

        place = new Places("সুন্দরবন", "খুলনা", R.drawable.sundarban,5);
        placesList.add(place);

        place = new Places("নীলগিরি", "চট্টগ্রাম । বান্দরবন", R.drawable.nilgiri,6);
        placesList.add(place);

        place = new Places("জাফলং", "সিলেট", R.drawable.jaflong,7);
        placesList.add(place);

        place = new Places("বিছনাকান্দি", "সিলেট", R.drawable.bichnakandi,8);
        placesList.add(place);
    }
}
