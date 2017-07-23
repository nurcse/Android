package com.example.ipvision.tguide;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.List;

/**
 * Created by ipvision on 7/19/2017.
 */

public class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.MyViewHolder> {

    private List<Places> placesList;
    private  Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView name, dateOfBirth, time, division;
        protected Button button;
        protected ImageView img = null;

        public MyViewHolder(View view){
            super(view);
            name = (TextView) view.findViewById(R.id.name);
            //dateOfBirth = (TextView) view.findViewById(R.id.date_of_birth);
            //time = (TextView) view.findViewById(R.id.time);
            division = (TextView) view.findViewById(R.id.division);
            //button = (Button) view.findViewById(R.id.button);
            img = (ImageView) view.findViewById(R.id.image);
        }
    }

    public PlacesAdapter(List<Places> placesList, Context context){
        this.placesList = placesList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.places_list_row, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Places place = placesList.get(position);
        holder.name.setText(place.getName());
        //holder.dateOfBirth.setText(place.getDescription());
        holder.division.setText(place.getDivision());
        holder.img.setImageResource(place.getImage());
        //holder.time.setText(place.getImg());
        //Bitmap im = R.drawable.boga_lake;

        //Glide.with(context).load(place.getImg()).diskCacheStrategy(DiskCacheStrategy.SOURCE).into(holder.img);

    }

    @Override
    public int getItemCount() {
        return placesList.size();
    }


}
