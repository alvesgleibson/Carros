package com.example.gleibsonalves.carros.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.gleibsonalves.carros.R;

/**
 * Created by Gleibson Alves on 19/12/2017.
 */

public class CarViewHolder extends RecyclerView.ViewHolder{
    private TextView mTextModel;

    public CarViewHolder(View itemView) {
        super(itemView);

        this.mTextModel = itemView.findViewById(R.id.text_model);
    }
}
