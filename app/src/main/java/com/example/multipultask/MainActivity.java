package com.example.multipultask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {
    ExecutorService executorService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        executorService = Executors.newFixedThreadPool(5);
        findViewById(R.id.button).setOnClickListener(view -> {
            for (int i = 0; i < 10; i++) {
                Work work = new Work(i);
                executorService.execute(work);
            }

        });
    }
}