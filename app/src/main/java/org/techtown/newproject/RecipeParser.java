package org.techtown.newproject;

import android.os.AsyncTask;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class RecipeParser extends AsyncTask<Void, Void, Void> {
    static final String Recipe_chart_url = "http://haemukja.com/recipes?utf8=%E2%9C%93&sort=rlv&name=%EA%B9%80%EC%B9%98%EB%B3%B6%EC%9D%8C%EB%B0%A5n";
    static final String Recipe_chart_url_sub = "http://haemukja.com/recipes/2500";


    private RecyclerAdapter adapter;
    private RecipeActivity activity;

    public RecipeParser(RecyclerAdapter adapter, RecipeActivity activity){
        this.adapter = adapter;
        this.activity = activity;
    }

    @Override
    protected Void doInBackground(Void... voids) {
        try {
            for(int i = 1; i < 10; i++) {
                Document doc = Jsoup.connect(Recipe_chart_url).get();
                Document doc_sub = Jsoup.connect(Recipe_chart_url_sub).get();

                final String list_title = doc.select("#content > section > div.recipes > div > ul > li:nth-child(1) > p").text();

                final String list_name = doc_sub.select("#container > div.inpage-recipe > div > div.view_recipe > section.sec_detail > section.sec_rcp_step > ol > li:nth-child(" + i + ") > p").text();

                final String list_imageUrl = doc_sub.select("#container > div.inpage-recipe > div > div.view_recipe > section.sec_detail > section.sec_rcp_step > ol > li:nth-child(" + i + ") > div > img").attr("src");


                System.out.println("RecipeParser : " + list_imageUrl + list_title + ":   ");
                System.out.println("RecipeParser : " + list_name + ":  ");

                activity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        adapter.addItem(new RecipeDTO(list_title, list_name, list_imageUrl));
                        adapter.notifyDataSetChanged();
                    }
                });
            }

            System.out.println("loaded");
            }
        catch (IOException e) {
            e.printStackTrace();
            }
            return null;
        }
}
