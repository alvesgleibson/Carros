package com.example.gleibsonalves.carros.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.gleibsonalves.carros.R;
import com.example.gleibsonalves.carros.adapter.CarlistAdapter;

public class MainActivity extends AppCompatActivity {

    ViewHolder mViewHolder = new ViewHolder();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //3 passos para a recyclerView(Obter a RecyclerView Tem que ser a primeira)

        //1-Obter a Recyclerview
        this.mViewHolder.recyclerView = findViewById(R.id.recycleview_car);

        //2-Definir um Adapter
        CarlistAdapter carlistAdapter = new CarlistAdapter();
        this.mViewHolder.recyclerView.setAdapter(carlistAdapter);

        //3-Definir um Layout
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        this.mViewHolder.recyclerView.setLayoutManager(linearLayoutManager);
    }

    public static class ViewHolder {
        RecyclerView recyclerView;

    }
}
