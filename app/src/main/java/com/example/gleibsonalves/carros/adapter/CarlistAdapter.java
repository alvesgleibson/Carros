package com.example.gleibsonalves.carros.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gleibsonalves.carros.R;
import com.example.gleibsonalves.carros.viewholder.CarViewHolder;

/**
 * Created by Gleibson Alves on 19/12/2017.
 */

public class CarlistAdapter extends RecyclerView.Adapter<CarViewHolder>{
    @Override
    public CarViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View carView = inflater.inflate(R.layout.row_car_list, parent, false);

        return  new CarViewHolder(carView);


    }

    @Override
    public void onBindViewHolder(CarViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
