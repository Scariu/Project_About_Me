package com.example.project_about_me;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.project_about_me.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initListeners();
        textViewContent();
    }

    private void textViewContent(){
        binding.textViewAboutMe.setText("Hola! Mi nombre es Florencia Hidalgo Alarcón, soy enfermera de profesión y estudiante de Android Developer.");
        binding.textViewExpNurse.setText("Poseo 1 año de experiencia como enfermera.");
        binding.textViewExpDevelop.setText("Llevo 3 meses como estudiante de Android Developer.");
        binding.textViewMoti.setText("Me motiva poder trabajar en el área de la programación.");
    }
    private void initListeners() {
        binding.buttonContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}