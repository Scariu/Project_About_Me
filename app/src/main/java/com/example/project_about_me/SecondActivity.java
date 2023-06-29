package com.example.project_about_me;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.project_about_me.databinding.ActivityMainBinding;
import com.example.project_about_me.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    private ActivitySecondBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}