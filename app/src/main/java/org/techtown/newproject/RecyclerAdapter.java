package org.techtown.newproject;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ItemViewHolder> {

    private ArrayList<RecipeDTO> listData = new ArrayList<>();
    private View view;

    @NonNull
    @Override
    public RecyclerAdapter.ItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        this.view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_recipe, viewGroup, false);
        return new
                ItemViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ItemViewHolder itemViewHolder, int i) {
        itemViewHolder.onBind(listData.get(i));
    }
    @Override
    public int getItemCount() {
        return listData.size();
    }

    void addItem(RecipeDTO data) {
        listData.add(data);
        // 외부에서 item을 추가시킬 함수입니다.
    }

    class ItemViewHolder extends RecyclerView.ViewHolder{
        private TextView txt_chartName, txt_chartTitle;
        private ImageView img_chart;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);

            txt_chartTitle = itemView.findViewById(R.id.txt_chartTitle);
            txt_chartName = itemView.findViewById(R.id.txt_chartName);
            img_chart     = itemView.findViewById(R.id.img_chart);
        }

        void onBind(RecipeDTO data) {
            txt_chartTitle.setText(data.getTitle());
            txt_chartName.setText(data.getName());
            Glide.with(itemView.getContext()).asBitmap().load(data.getImageUrl()).
                    into(new SimpleTarget<Bitmap>() {
                        @Override
                        public void onResourceReady(Bitmap resource, Transition<? super Bitmap> transition){
                            img_chart.setImageBitmap(resource);
                        }
                    });
        }
    }
}