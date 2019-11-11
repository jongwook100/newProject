package org.techtown.newproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class FoodListActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    FoodListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodlist);
        // Adapter 생성
        adapter = new FoodListAdapter(this.getApplicationContext());
        getData(adapter);

        recyclerView = findViewById(R.id.foodRecyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void getData(FoodListAdapter adapter){
        FoodParser foodParser = new FoodParser(adapter, this);
        foodParser.execute();
    }
}