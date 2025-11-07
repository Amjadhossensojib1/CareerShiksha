package com.amjad.careershiksha.ui.homefragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.amjad.careershiksha.ui.allcourseActivity.AllCourseActivity;
import com.amjad.careershiksha.R;
import com.amjad.careershiksha.model.Course;
import com.amjad.careershiksha.utils.CartAdapter;
import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    private MaterialCardView exploreCart;
    private RecyclerView recyclerView;
    private ArrayList<Course> cartList;
    private CartAdapter adapter;

    public HomeFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        exploreCart = view.findViewById(R.id.cv_card4);
        recyclerView = view.findViewById(R.id.recycler_view);

        exploreCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), AllCourseActivity.class));
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
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

        return view;
    }
}