package com.amjad.careershiksha.utils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amjad.careershiksha.R;
import com.amjad.careershiksha.model.Category;
import com.amjad.careershiksha.model.Semester;

import java.util.List;

public class SemesterAdapter extends RecyclerView.Adapter<SemesterAdapter.SemesterViewHolder>{
    private List<Semester> semesterList;

    public SemesterAdapter(List<Semester> semesterList) {
        this.semesterList = semesterList;
    }

    @NonNull
    @Override
    public SemesterAdapter.SemesterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_semester, parent,false);
        return new SemesterAdapter.SemesterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SemesterAdapter.SemesterViewHolder holder, int position) {
        Semester semester = semesterList.get(position);
        holder.bind(semester);

    }

    @Override
    public int getItemCount() {
        return semesterList.size();
    }

    public class SemesterViewHolder extends RecyclerView.ViewHolder {
        private TextView semesterText;
        public SemesterViewHolder(@NonNull View itemView) {
            super(itemView);
            semesterText = itemView.findViewById(R.id.tv_semester);
        }

        public void bind(Semester semester) {
            semesterText.setText(semester.getSemesterText());

        }
    }
}
