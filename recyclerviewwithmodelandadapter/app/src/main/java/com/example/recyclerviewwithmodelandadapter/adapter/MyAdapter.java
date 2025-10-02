package com.example.recyclerviewwithmodelandadapter.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewwithmodelandadapter.databinding.SinglerowdesignBinding;
import com.example.recyclerviewwithmodelandadapter.model.Student;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    List<Student> studentList;

    public MyAdapter(List<Student> studentList) {
        this.studentList = studentList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        SinglerowdesignBinding binding = SinglerowdesignBinding.inflate(inflater, parent, false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Student student = studentList.get(position);
        // Bind data with DataBinding
        holder.binding.setStudent(student);
        holder.binding.executePendingBindings(); // update immediately
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        SinglerowdesignBinding binding;

        public MyViewHolder(SinglerowdesignBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
