package com.geektech.recyclerviewhw;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.recyclerviewhw.Country;
import com.geektech.recyclerviewhw.R;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    private ArrayList<Country> list ;

    public void setList(ArrayList<Country> list) {
        this.list = new ArrayList<>();
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_users,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  UserAdapter.ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView country1,city;
        private ImageView flag;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            country1 = itemView.findViewById(R.id.country_tv);
            city = itemView.findViewById(R.id.city_tv);
            flag = itemView.findViewById(R.id.ic_flag);
        }


        public void onBind(Country country) {
            country1.setText(country.getCountry());
            city.setText(country.getCity());
            flag.setImageResource(country.getFlag());
        }
    }
}
