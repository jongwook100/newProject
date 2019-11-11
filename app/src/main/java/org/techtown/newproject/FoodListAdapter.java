package org.techtown.newproject;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;

import java.util.ArrayList;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;

public class FoodListAdapter extends RecyclerView.Adapter<FoodListAdapter.ItemViewHolder> implements Filterable {

    private ArrayList<FoodListDTO> foodData = new ArrayList<FoodListDTO>();
    private ArrayList<FoodListDTO> filteredItemList = foodData ;
    Filter listFilter;
    private View foodview;
    private Context context;

    public FoodListAdapter(Context context){
        this.context = context;
    }


    @NonNull
    @Override
    public FoodListAdapter.ItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        this.foodview = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_custom, viewGroup, false);
        return new
                FoodListAdapter.ItemViewHolder(foodview);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodListAdapter.ItemViewHolder itemViewHolder, int i) {
        itemViewHolder.onBind(foodData.get(i));

        final int final_i = i;

        itemViewHolder.txt_titleStr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),RecipeActivity.class);
                intent.putExtra("url",foodData.get(final_i).getSubUrl());
                intent.putExtra("title",foodData.get(final_i).getTitleStr());
                context.startActivity(intent.addFlags(FLAG_ACTIVITY_NEW_TASK));
            }
        });

    }
    @Override
    public int getItemCount() {
        return foodData.size();
    }

    void addItem(FoodListDTO data) {
        foodData.add(data);
        // 외부에서 item을 추가시킬 함수입니다.
    }

    class ItemViewHolder extends RecyclerView.ViewHolder{
        private TextView txt_titleStr;
        private ImageView img_iconStr;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);

            img_iconStr = itemView.findViewById(R.id.txt_iconStr);
            txt_titleStr = itemView.findViewById(R.id.txt_titleStr);
        }

        void onBind(FoodListDTO data) {
            txt_titleStr.setText(data.getTitleStr());
            Glide.with(itemView.getContext()).asBitmap().load(data.getIcon()).
                    into(new SimpleTarget<Bitmap>() {
                        @Override
                        public void onResourceReady(Bitmap resource, Transition<? super Bitmap> transition){
                            img_iconStr.setImageBitmap(resource);
                        }
                    });
        }
    }

    @Override
    public Filter getFilter() {
        if (listFilter == null) {
            listFilter = new ListFilter();
        }

        return listFilter ;
    }


    private class ListFilter extends Filter {

        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            FilterResults results = new FilterResults() ;

            if (constraint == null || constraint.length() == 0) {
                results.values = foodData ;
                results.count = foodData.size() ;
            } else {
                ArrayList<FoodListDTO> itemList = new ArrayList<FoodListDTO>() ;

                for (FoodListDTO item : foodData) {
                    if (item.getTitleStr().toUpperCase().contains(constraint.toString().toUpperCase()))
                    {
                        itemList.add(item) ;
                    }
                }

                results.values = itemList ;
                results.count = itemList.size() ;
            }
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            filteredItemList = (ArrayList<FoodListDTO>) results.values ;

            if (results.count > 0) {
                notifyDataSetChanged();
            }
        }
    }


}
