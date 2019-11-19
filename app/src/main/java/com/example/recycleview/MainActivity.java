package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> data = new ArrayList<>();
        for (int i = 0; i < 0; i++){
            data.add("Hoc sinh moi");
            data.add("Hoc sinh moi");
            data.add("Hoc sinh moi");
        }

        findViewById(R.id.add1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        rvNumber = findViewById(R.id.RecyclerviewNumber);

        rvNumber.setLayoutManager(new LinearLayoutManager(this));

        NumberAdapter adapter = new NumberAdapter();
        rvNumber.setAdapter(adapter);
    }
}
