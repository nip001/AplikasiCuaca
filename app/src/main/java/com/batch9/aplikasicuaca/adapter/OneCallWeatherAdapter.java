package com.batch9.aplikasicuaca.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.batch9.aplikasicuaca.R;
import com.batch9.aplikasicuaca.entity.oncall.Weather;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class OneCallWeatherAdapter extends RecyclerView.Adapter<OneCallWeatherAdapter.OneCallWeatherViewHolder>{

    private ArrayList<Weather> cuaca;
    private Context context;

    public OneCallWeatherAdapter(ArrayList<Weather> cuaca, Context context) {
        this.cuaca = cuaca;
        this.context = context;
    }

    @NonNull
    @Override
    public OneCallWeatherViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_cuaca,parent,false);
        return new OneCallWeatherAdapter.OneCallWeatherViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OneCallWeatherViewHolder holder, int position) {
        Glide.with(context).load("http://openweathermap.org/img/wn/"+cuaca.get(position).getIcon()+".png").into(holder.iconView);
        holder.txtDesc.setText(cuaca.get(position).getDescription());
        holder.txtMain.setText(cuaca.get(position).getMain());

    }

    @Override
    public int getItemCount() {
        return cuaca.size();
    }

    public class OneCallWeatherViewHolder extends RecyclerView.ViewHolder{

        ImageView iconView;
        TextView txtMain,txtDesc;

        public OneCallWeatherViewHolder (@NonNull View itemView){
            super(itemView);
            iconView = itemView.findViewById(R.id.iconImage);
            txtDesc= itemView.findViewById(R.id.txtDesc);
            txtMain= itemView.findViewById(R.id.txtMain);
        }
    }
}
