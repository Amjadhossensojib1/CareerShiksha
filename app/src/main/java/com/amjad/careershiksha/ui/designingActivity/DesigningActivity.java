package com.amjad.careershiksha.ui.designingActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.amjad.careershiksha.R;
import com.amjad.careershiksha.model.VideoModel;
import com.amjad.careershiksha.utils.VideoAdapter;

import java.util.ArrayList;
import java.util.List;

public class DesigningActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<VideoModel> videoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_designing);

        recyclerView = findViewById(R.id.DesiginingrecyclerVideo);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        videoList = new ArrayList<>();

        videoList.add(new VideoModel("Figma UI/UX Design Class 01", "4W1TXrDAUQY"));
        videoList.add(new VideoModel("Free Figma UX Design Course 2025", "QJBP2uy8LcU"));
        videoList.add(new VideoModel("UIUX Design Figma A to Z", "4Ay-hQuROdo"));
        videoList.add(new VideoModel("Figma Crash Course Beginners", "1SNZRCVNizg"));
        videoList.add(new VideoModel("Complete Figma Course Class-02", "mBb_UuR1jpA"));
        videoList.add(new VideoModel("Figma Mobile App Design Tutorial", "PeGfX7W1mJk"));
        videoList.add(new VideoModel("Graphic Design Bangla Full Tutorial Part-1", "xAFb1FJjqes"));
        videoList.add(new VideoModel("Graphic Design Bangla Tutorial Basic", "2W5Cl52E5LI"));
        videoList.add(new VideoModel("Graphic Design Full Bangla Course", "jy_b6QclUeM"));
        videoList.add(new VideoModel("Graphics Design Full Bangla", "Xa1XxUdhYg4"));

        VideoAdapter adapter = new VideoAdapter(this, videoList);
        recyclerView.setAdapter(adapter);


    }
}