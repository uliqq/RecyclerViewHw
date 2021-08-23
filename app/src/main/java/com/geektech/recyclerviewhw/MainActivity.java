package com.geektech.recyclerviewhw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.geektech.recyclerviewhw.Country;
import com.geektech.recyclerviewhw.R;
import com.geektech.recyclerviewhw.UserAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Country> list;
    private RecyclerView recyclerView;
    private UserAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createLists();
        initViews();
    }

    private void createLists() {
        list = new ArrayList<>();
        list.add(new Country("Hong-Kong","Bankok",R.drawable.ic_hongkong));
        list.add(new Country("Canada","Ottawa",R.drawable.ic_canada));
        list.add(new Country("Japan","Tokyo",R.drawable.ic_japan));
        list.add(new Country("Kazakhstan","Nur-Sultan",R.drawable.ic_kz));
        list.add(new Country("Estonia","Tallin",R.drawable.ic_estonia));
        list.add(new Country("Finland","Helsinki",R.drawable.ic_finland));
        list.add(new Country("Korea","Seoul",R.drawable.ic_korea));
        list.add(new Country("Great Britain","London",R.drawable.ic_gb));
        list.add(new Country("Italy","Rome",R.drawable.ic_italy));
        list.add(new Country("Netherlands","Amsterdam",R.drawable.ic_netherlands));
        list.add(new Country("Portugal","Lisbon",R.drawable.ic_portugal));
        list.add(new Country("Switzerland","Bern",R.drawable.ic_sw));
        list.add(new Country("Turkey","Ankara",R.drawable.ic_turkey));
        list.add(new Country("Vietnam","Hanoi",R.drawable.ic_vietnam));

    }

    private void initViews(){
        recyclerView = findViewById(R.id.main_recycler_view);
        adapter = new UserAdapter();
        adapter.setList(list);
        recyclerView.setAdapter(adapter);
    }
}