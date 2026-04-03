package com.amjad.careershiksha.ui.homefragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.amjad.careershiksha.ui.aiactivity.Ai_Activity;
import com.amjad.careershiksha.ui.designingActivity.DesigningActivity;
import com.amjad.careershiksha.ui.devloping.DevlopingActivity;
import com.amjad.careershiksha.ui.allcourseActivity.AllCourseActivity;
import com.amjad.careershiksha.R;
import com.amjad.careershiksha.model.Course;
import com.amjad.careershiksha.utils.CartAdapter;
import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    private MaterialCardView exploreCart,devloping,designing,aiandMl;
    private RecyclerView recyclerView;
    private ArrayList<Course> cartList;
    private CartAdapter adapter;
    private ImageSlider imageSlider;

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
        devloping = view.findViewById(R.id.mc_devloping);
        designing = view.findViewById(R.id.mc_designing);
        aiandMl = view.findViewById(R.id.mc_AiandMl);
        recyclerView = view.findViewById(R.id.recycler_view);
        imageSlider = view.findViewById(R.id.image_slider);

        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTS2vKL_ddq8BYiB79liojK2q-rkhK7C49_8Q&s", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQKQ__P5hDqP9u9EmVbjmSd63IgLfGxrUUcOA&s", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSN72y5xQWBMCNTQJmZ1KXjW9KPgKEyo3zdmQ&s", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRz0Fw8l1RhghVYwFRgyQnddtyKG4hlHrFD5Q&s", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTCwn3jLBXrqQlmRkCGKNSU688XUiNKdsuKkg&s", ScaleTypes.FIT));
        imageSlider.setImageList(slideModels);


        exploreCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), AllCourseActivity.class));
            }
        });
        devloping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), DevlopingActivity.class));
            }
        });
        designing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), DesigningActivity.class));
            }
        });
        aiandMl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), Ai_Activity.class));
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