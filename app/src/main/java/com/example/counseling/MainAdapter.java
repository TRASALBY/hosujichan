package com.example.counseling;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.CustomViewHolder> implements Filterable {

    private ArrayList<MainData> arrayList;
    private ArrayList<MainData> arrayListFilter;

    public MainAdapter( ArrayList<MainData> arrayList) {
        this.arrayList = arrayList;
        arrayListFilter = new ArrayList<>(arrayList);
    }

    @NonNull
    @Override
    public MainAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        CustomViewHolder holder = new CustomViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdapter.CustomViewHolder holder, int position) {
        holder.iv_profile.setImageResource(arrayList.get(position).getIv_profile());
        holder.tv_name.setText(arrayList.get(position).getTv_name());
        holder.tv_category.setText(arrayList.get(position).getTv_category());
        holder.tv_add.setText(arrayList.get(position).getTv_add());
    }

    @Override
    public int getItemCount() {
        return (null != arrayList ? arrayList.size() : 0);
    }

    @Override
    public Filter getFilter() {
        return exampleFilter;
    }

    private Filter exampleFilter = new Filter() {

        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            ArrayList<MainData> filteredList = new ArrayList<>();

            if (constraint == null || constraint.length() == 0) {
                filteredList.addAll(arrayListFilter);
            } else {
                String filterPattern = constraint.toString().toLowerCase().trim();
                for (MainData data : arrayListFilter) {
                    if (data.getTv_add().toLowerCase().contains(filterPattern)) {
                        filteredList.add(data);
                    }
                }
            }
            FilterResults results = new FilterResults();
            results.values = filteredList;
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            arrayList.clear();
            arrayList.addAll((ArrayList) results.values) ;
            notifyDataSetChanged();
        }
    };


    public class CustomViewHolder extends RecyclerView.ViewHolder {
        protected ImageView iv_profile;
        protected TextView tv_name;
        protected TextView tv_category;
        protected TextView tv_add;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.iv_profile = (ImageView) itemView.findViewById(R.id.iv_profile);
            this.tv_name = (TextView) itemView.findViewById(R.id.tv_name);
            this.tv_category = (TextView) itemView.findViewById(R.id.tv_category);
            this.tv_add = (TextView) itemView.findViewById(R.id.tv_add);
        }
    }
}
