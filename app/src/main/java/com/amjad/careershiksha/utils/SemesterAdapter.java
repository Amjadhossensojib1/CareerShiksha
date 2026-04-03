package com.amjad.careershiksha.utils;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amjad.careershiksha.R;
import com.amjad.careershiksha.model.Semester;
import com.amjad.careershiksha.ui.booklistActivity.BookListActivity;

import java.util.List;

public class SemesterAdapter extends RecyclerView.Adapter<SemesterAdapter.SemesterViewHolder> {

    private List<Semester> semesterList;
    private String department;
    private Context context;

    public SemesterAdapter(List<Semester> semesterList, String department, Context context) {
        this.semesterList = semesterList;
        this.department = department;
        this.context = context;
    }

    @NonNull
    @Override
    public SemesterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_semester, parent, false);
        return new SemesterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SemesterViewHolder holder, int position) {
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

        public void bind(final Semester semester) {
            semesterText.setText(semester.getSemesterText());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, BookListActivity.class);
                    intent.putExtra("department", department);
                    intent.putExtra("semester", semester.getSemesterText());
                    context.startActivity(intent);
                }
            });
        }
    }
}
