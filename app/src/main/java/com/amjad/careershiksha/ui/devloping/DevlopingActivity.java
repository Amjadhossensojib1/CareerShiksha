package com.amjad.careershiksha.ui.devloping;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.amjad.careershiksha.R;
import com.amjad.careershiksha.model.VideoModel;
import com.amjad.careershiksha.utils.VideoAdapter;

import java.util.ArrayList;
import java.util.List;

public class DevlopingActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<VideoModel> videoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devloping);

        recyclerView = findViewById(R.id.recyclerVideo);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        videoList = new ArrayList<>();

        // 🔥 Playlist Video (Add real video IDs)
        videoList.add(new VideoModel("Android Development for Beginners - Full Course", "fis26HvvDII"));
        videoList.add(new VideoModel("Android App Development Bangla Tutorial 01", "tTwFF35WOHI"));
        videoList.add(new VideoModel("Android App Development Tutorial for Beginners", "FjrKMcnKahY"));
        videoList.add(new VideoModel("Android App Development Bangla Class 02", "eZ7lGWAFahM"));
        videoList.add(new VideoModel("Android App বানানোর ৭টি উপায়", "3u4qjR9IivM"));
        videoList.add(new VideoModel("HTML Tutorial – Intro to Web Development", "k_apoPmQntw"));
        videoList.add(new VideoModel("HTML Ids & Classes Explained", "BucLTOfLQsk"));
        videoList.add(new VideoModel("Web Dev Full Course – HTML, CSS, JS (freeCodeCamp)", "zJSY8tbf_ys"));
        videoList.add(new VideoModel("Full Stack Web Development – Beginners", "nu_pCVPKzTk"));
        videoList.add(new VideoModel("HTML Crash Course – HTML Tutorial", "qz0aGYrrlhU"));



        VideoAdapter adapter = new VideoAdapter(this, videoList);
        recyclerView.setAdapter(adapter);
    }
}
