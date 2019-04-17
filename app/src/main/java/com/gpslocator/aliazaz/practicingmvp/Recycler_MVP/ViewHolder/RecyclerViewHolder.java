package com.gpslocator.aliazaz.practicingmvp.Recycler_MVP.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.gpslocator.aliazaz.practicingmvp.R;
import com.gpslocator.aliazaz.practicingmvp.Recycler_MVP.View.RecyclerRowView;

public class RecyclerViewHolder extends RecyclerView.ViewHolder implements RecyclerRowView {

    TextView name, email, city;

    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.name);
        email = itemView.findViewById(R.id.email);
        city = itemView.findViewById(R.id.city);
    }

    @Override
    public void setName(String name) {
        this.name.setText(name);
    }

    @Override
    public void setEmail(String email) {
        this.email.setText(email);
    }

    @Override
    public void setCity(String city) {
        this.city.setText(city);
    }
}
