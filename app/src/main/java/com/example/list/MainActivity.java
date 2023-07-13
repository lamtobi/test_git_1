package com.example.list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    UserAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rsc);
        adapter = new UserAdapter(this);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(gridLayoutManager);

        adapter.setdata(getlistuser());
        recyclerView.setAdapter(adapter);
    }

    private List<User> getlistuser() {
        List<User> ls = new ArrayList<>();
        ls.add(new User(R.drawable.prc1, "user 1"));
        ls.add(new User(R.drawable.prc2, "user 2"));
        ls.add(new User(R.drawable.prc3, "user 3"));

        ls.add(new User(R.drawable.prc1, "user 1"));
        ls.add(new User(R.drawable.prc2, "user 2"));
        ls.add(new User(R.drawable.prc3, "user 3"));

        ls.add(new User(R.drawable.prc1, "user 1"));
        ls.add(new User(R.drawable.prc2, "user 2"));
        ls.add(new User(R.drawable.prc3, "user 3"));

        return ls;

    }
}