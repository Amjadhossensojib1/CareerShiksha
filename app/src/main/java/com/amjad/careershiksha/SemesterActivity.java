package com.amjad.careershiksha;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.amjad.careershiksha.model.Category;
import com.amjad.careershiksha.model.Semester;
import com.amjad.careershiksha.utils.CategoryAdapter;
import com.amjad.careershiksha.utils.SemesterAdapter;

import java.util.ArrayList;

public class SemesterActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Semester> semesterList;
    private SemesterAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester);

        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        semesterList = new ArrayList<>();
        semesterList.add(new Semester("Semester 1"));
        semesterList.add(new Semester("Semester 2"));
        semesterList.add(new Semester("Semester 3"));
        semesterList.add(new Semester("Semester 4"));
        semesterList.add(new Semester("Semester 5"));
        semesterList.add(new Semester("Semester 6"));
        semesterList.add(new Semester("Semester 7"));
        semesterList.add(new Semester("Semester 18"));

        adapter = new SemesterAdapter(semesterList);
        recyclerView.setAdapter(adapter);

    }
}