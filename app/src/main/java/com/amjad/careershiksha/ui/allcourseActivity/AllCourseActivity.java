package com.amjad.careershiksha.ui.allcourseActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.amjad.careershiksha.R;
import com.amjad.careershiksha.model.Course;
import com.amjad.careershiksha.utils.CartAdapter;

import java.util.ArrayList;

public class AllCourseActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Course> cartList;
    private CartAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_course);

        recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        cartList = new ArrayList<>();
        cartList.add(new Course("Advanced Certification Program in Ai","https://cdn-icons-png.flaticon.com/128/5278/5278402.png"));
        cartList.add(new Course("Advanced Certification Program in Ai2","https://cdn-icons-png.flaticon.com/128/873/873117.png"));
        cartList.add(new Course("Advanced Certification Program in Ai","https://cdn-icons-png.flaticon.com/128/226/226777.png"));
        cartList.add(new Course("Advanced Certification Program in Ai","https://cdn-icons-png.flaticon.com/128/1055/1055666.png"));
        cartList.add(new Course("Advanced Certification Program in Ai","https://cdn-icons-png.flaticon.com/128/9672/9672242.png"));
        cartList.add(new Course("Advanced Certification Program in Ai","https://cdn-icons-png.flaticon.com/128/16584/16584822.png"));


        adapter = new CartAdapter(cartList);
        recyclerView.setAdapter(adapter);

    }
}