package com.example.recyclerviewwithmodelandadapter;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewwithmodelandadapter.adapter.MyAdapter;
import com.example.recyclerviewwithmodelandadapter.databinding.ActivityMainBinding;
import com.example.recyclerviewwithmodelandadapter.model.Student;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.recview.setLayoutManager(new LinearLayoutManager(this));
        binding.recview.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        MyAdapter adapter = new MyAdapter(getstudents());
        binding.recview.setAdapter(adapter);
    }

    public List<Student> getstudents() {
        List<Student> slist = new ArrayList<>();
        slist.add(new Student("Satyendra","MBA"));
        slist.add(new Student("Sandeep","Btech"));
        slist.add(new Student("Sandhya","BA"));
        slist.add(new Student("neeraj","LPU"));
        slist.add(new Student("jay","BBA"));
        slist.add(new Student("pintu","BCA"));
        return slist;
    }
}