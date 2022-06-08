package com.example.twitterjava.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.twitterjava.R;
import com.example.twitterjava.model.Story;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class StoryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    ArrayList<Story> items;

    public StoryAdapter(Context context, ArrayList<Story> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_feed_story, parent, false);
        return new StoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Story data = items.get(position);
        if (holder instanceof StoryViewHolder) {
            ((StoryViewHolder) holder).iv_profile.setImageResource(data.getProfile());
            ((StoryViewHolder) holder).tv_fullname.setText(data.getFullname());
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    private static class StoryViewHolder extends RecyclerView.ViewHolder {
        ShapeableImageView iv_profile;
        TextView tv_fullname;

        public StoryViewHolder(View view) {
            super(view);
            iv_profile = view.findViewById(R.id.iv_profile);
            tv_fullname = view.findViewById(R.id.tv_fullname);
        }
    }
}
