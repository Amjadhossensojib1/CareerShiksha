package com.amjad.careershiksha.ui.aiactivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.amjad.careershiksha.R;
import com.amjad.careershiksha.model.VideoModel;
import com.amjad.careershiksha.utils.VideoAdapter;

import java.util.ArrayList;
import java.util.List;

public class Ai_Activity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<VideoModel> videoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai);
        recyclerView = findViewById(R.id.AiandMlrecyclerVideo);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        videoList = new ArrayList<>();

        videoList.add(new VideoModel("Artificial Intelligence Full Course for Beginners", "JMUxmLyrhSk"));
        videoList.add(new VideoModel("Machine Learning Full Course – Andrew Ng", "GwIo3gDZCVQ"));
        videoList.add(new VideoModel("Machine Learning Bangla Tutorial Part 01", "KNAWp2S3w94"));
        videoList.add(new VideoModel("Deep Learning Full Course for Beginners", "aircAruvnKk"));
        videoList.add(new VideoModel("Neural Network Explained Simply", "bfmFfD2RIcg"));
        videoList.add(new VideoModel("Python for Machine Learning Full Course", "7eh4d6sabA0"));
        videoList.add(new VideoModel("Data Science & Machine Learning Full Course", "ua-CiDNNj30"));
        videoList.add(new VideoModel("Machine Learning Roadmap for Beginners", "I74ymkoNTnw"));
        videoList.add(new VideoModel("Generative AI Explained (ChatGPT, LLM)", "zjkBMFhNj_g"));
        videoList.add(new VideoModel("Computer Vision Full Course", "01sAkU_NvOY"));
        videoList.add(new VideoModel("Natural Language Processing Full Course", "X2vAabgKiuM"));


        VideoAdapter adapter = new VideoAdapter(this, videoList);
        recyclerView.setAdapter(adapter);



    }
}