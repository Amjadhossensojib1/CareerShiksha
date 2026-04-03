package com.amjad.careershiksha.ui.categoryfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.amjad.careershiksha.R;
import com.amjad.careershiksha.model.Category;
import com.amjad.careershiksha.model.Course;
import com.amjad.careershiksha.utils.CartAdapter;
import com.amjad.careershiksha.utils.CategoryAdapter;
import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class CategoryFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<Category> categoryList;
    private CategoryAdapter adapter;

    public CategoryFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_category, container, false);

        recyclerView = view.findViewById(R.id.Recyclerview);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);

        categoryList = new ArrayList<>();
        categoryList.add(new Category("https://aiinstituteofpakistan.com/wp-content/uploads/2025/02/Devin-AI-worlds-first-AI-software-engineer.jpg","Computer Engineering"));
        categoryList.add(new Category("https://previews.123rf.com/images/ipopba/ipopba2107/ipopba210700082/171457382-man-industrial-engineer-using-laptop-computer-checking-and-analysis-data-of-power-plant-station.jpg","Electrical Engineering"));
        categoryList.add(new Category("https://t3.ftcdn.net/jpg/07/67/68/16/360_F_767681601_PeJnOKoVMsWrSg8B2KufR2Udh5cq4ySu.jpg","Civil Engineering"));
        categoryList.add(new Category("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwpYmV3zuzYkNS7pDcTJpuG7fA6YFQmycxnA&s","Mechanical Engineering"));
        categoryList.add(new Category("https://t4.ftcdn.net/jpg/02/64/87/45/360_F_264874512_asSj4QLFkdifkjMUDj80UKLKKwtH8qBZ.jpg","Architecture Engineering"));
        categoryList.add(new Category("https://img.freepik.com/free-photo/motherboard-circuit-background_23-2151733763.jpg?semt=ais_hybrid&w=740&q=80","Electronics Engineering"));
        categoryList.add(new Category("https://www.onlinedegree.com/wp-content/uploads/2017/02/marine_engineer2-700x468.jpg","Marine Engineering"));
        categoryList.add(new Category("https://cdnpreprodanteagroup.blob.core.windows.net/prod/media/resized/12/1a6a841e-365e-406b-918d-6a71f8599b11/autox580_the-evolving-role-of-environmental-engineers-renamed.jpg","Environmental Engineering"));
        categoryList.add(new Category("https://media.istockphoto.com/id/1443576938/photo/team-of-engineers-working-on-a-night-shift.jpg?s=612x612&w=0&k=20&c=OYzxUzhKbeGiFkze7Oq1FHHY1JpmLlWSqP93bPKwCHQ=","Power Engineering"));
        categoryList.add(new Category("https://getwallpapers.com/wallpaper/full/7/1/d/351520.jpg","RAC Engineering"));

        adapter = new CategoryAdapter(categoryList);
        recyclerView.setAdapter(adapter);


        return view;
    }
}