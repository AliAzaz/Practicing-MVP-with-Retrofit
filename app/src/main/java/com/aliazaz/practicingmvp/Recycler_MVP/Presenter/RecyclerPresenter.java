package com.aliazaz.practicingmvp.Recycler_MVP.Presenter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.aliazaz.practicingmvp.Contract.User;
import com.aliazaz.practicingmvp.R;
import com.aliazaz.practicingmvp.Recycler_MVP.ViewHolder.RecyclerViewHolder;

import java.util.List;

public class RecyclerPresenter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private final List<User> usersList;

    public RecyclerPresenter(List<User> users) {
        this.usersList = users;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new RecyclerViewHolder(
                LayoutInflater.from(viewGroup.getContext()).
                        inflate(R.layout.item_layout,
                                viewGroup,
                                false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder recyclerViewHolder, int position) {
        recyclerViewHolder.setName(usersList.get(position).getName());
        recyclerViewHolder.setEmail(usersList.get(position).getEmail());
        recyclerViewHolder.setCity(usersList.get(position).getAddress().getCity());
    }

    @Override
    public int getItemCount() {
        return usersList.size();
    }
}
