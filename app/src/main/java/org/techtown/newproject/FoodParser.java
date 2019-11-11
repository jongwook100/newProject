package org.techtown.newproject;

import android.os.AsyncTask;
import android.util.Log;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.techtown.newproject.Common.Common;

import java.io.IOException;

public class FoodParser extends AsyncTask<Void, Void, Void> {
    private FoodListAdapter adapter;
    private FoodListActivity activity;

    public FoodParser(FoodListAdapter adapter, FoodListActivity activity){
        this.adapter = adapter;
        this.activity = activity;
    }

    @Override
    protected Void doInBackground(Void... voids) {
        try {
            for(String recipe : Common.recipes) {
                Document doc = Jsoup.connect(Common.recipe_chart_url + recipe).get();
                final String list_titleStr = recipe;

                final String list_iconStr = doc.select("#content > section > div.recipes > div > ul > li:nth-child(1) > a  > img").attr("src");

                final String list_sub_url = doc.select("#content > section > div.recipes > div > ul > li:nth-child(1) > p > a").attr("href");

                activity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        adapter.addItem(new FoodListDTO(list_iconStr, list_titleStr, Common.recipe_url + list_sub_url));
                        adapter.notifyDataSetChanged();
                    }
                });
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
