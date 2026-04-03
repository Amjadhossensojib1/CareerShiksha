package com.amjad.careershiksha.ui.semester;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.amjad.careershiksha.R;
import com.amjad.careershiksha.model.Semester;
import com.amjad.careershiksha.utils.SemesterAdapter;

import java.util.ArrayList;

public class SemesterActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Semester> semesterList;
    private SemesterAdapter adapter;

    private String department;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester);

        department = getIntent().getStringExtra("department");

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        semesterList = new ArrayList<>();
        semesterList.add(new Semester("Semester 1"));
        semesterList.add(new Semester("Semester 2"));
        semesterList.add(new Semester("Semester 3"));
        semesterList.add(new Semester("Semester 4"));
        semesterList.add(new Semester("Semester 5"));
        semesterList.add(new Semester("Semester 6"));
        semesterList.add(new Semester("Semester 7"));
        semesterList.add(new Semester("Semester 8"));

        adapter = new SemesterAdapter(semesterList, department, this);
        recyclerView.setAdapter(adapter);
    }
}
