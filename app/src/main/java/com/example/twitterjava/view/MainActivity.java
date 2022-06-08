package com.example.twitterjava.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.twitterjava.R;
import com.example.twitterjava.adapter.FeedAdapter;
import com.example.twitterjava.adapter.StoryAdapter;
import com.example.twitterjava.model.Post;
import com.example.twitterjava.model.Story;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerStory;
    RecyclerView recyclerFeed;
    ArrayList<Story> stories = new ArrayList<>();
    ArrayList<Post> posts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        recyclerStory = findViewById(R.id.recyclerStory);
        recyclerStory.setLayoutManager(
                new LinearLayoutManager(
                        this,
                        LinearLayoutManager.HORIZONTAL,
                        false
                )
        );
        recyclerFeed = findViewById(R.id.recyclerFeed);
        recyclerFeed.setLayoutManager(new GridLayoutManager(this, 1));
        StoryAdapter adapter = new StoryAdapter(this, stories);
        recyclerStory.setAdapter(adapter);

        FeedAdapter feedAdapter = new FeedAdapter(this, posts);
        recyclerFeed.setAdapter(feedAdapter);
        data();
    }

    private void data() {
        stories.add(new Story(R.drawable.im_user_1, "Xurshid"));
        stories.add(new Story(R.drawable.im_user_2, "Begzod"));
        stories.add(new Story(R.drawable.im_user_3, "Sherzod"));
        stories.add(new Story(R.drawable.im_user_1, "Xurshid"));
        stories.add(new Story(R.drawable.im_user_2, "Begzod"));
        stories.add(new Story(R.drawable.im_user_3, "Sherzod"));
        stories.add(new Story(R.drawable.im_user_1, "Xurshid"));
        stories.add(new Story(R.drawable.im_user_2, "Begzod"));
        stories.add(new Story(R.drawable.im_user_3, "Sherzod"));

        posts.add(new Post(R.drawable.im_user_1, "Xurshidbek Kurbanov", R.raw.vid));
        posts.add(new Post(R.drawable.im_user_2, "Xurshidbek Kurbanov", R.raw.vid));
        posts.add(new Post(R.drawable.im_user_3, "Xurshidbek Kurbanov", R.raw.vid));
        posts.add(new Post(R.drawable.im_user_1, "Xurshidbek Kurbanov", R.raw.vid));
        posts.add(new Post(R.drawable.im_user_2, "Xurshidbek Kurbanov", R.raw.vid));
        posts.add(new Post(R.drawable.im_user_3, "Xurshidbek Kurbanov", R.raw.vid));
    }
}