package com.example.twitterjava.adapter;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.twitterjava.R;
import com.example.twitterjava.model.Post;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class FeedAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    ArrayList<Post> items;

    public FeedAdapter(Context context, ArrayList<Post> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_feed_post, parent, false);
        return new FeedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Post data = items.get(position);

        if (holder instanceof FeedViewHolder) {
            ((FeedViewHolder) holder).iv_profile.setImageResource(data.getProfile());
            ((FeedViewHolder) holder).vv_video.setVideoURI(Uri.parse("android.resource://" + context.getPackageName() + "/" + data.getVideo()));
            ((FeedViewHolder) holder).tv_fullname.setText(data.getFullname());
            ((FeedViewHolder) holder).vv_video.setOnClickListener(view -> ((FeedViewHolder) holder).vv_video.start());
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    private static class FeedViewHolder extends RecyclerView.ViewHolder {
        ShapeableImageView iv_profile;
        VideoView vv_video;
        TextView tv_fullname;

        public FeedViewHolder(View view) {
            super(view);
            iv_profile = view.findViewById(R.id.iv_profile);
            vv_video = view.findViewById(R.id.vv_video);
            tv_fullname = view.findViewById(R.id.tv_fullname);
        }
    }

}
