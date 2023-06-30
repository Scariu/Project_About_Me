package com.example.project_about_me;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.project_about_me.databinding.ActivityMainBinding;
import com.example.project_about_me.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    private ActivitySecondBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initListeners();
    }

    private void initListeners() {
        binding.buttonLinkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLinkedin = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/"));
                startActivity(intentLinkedin);
            }
        });
        binding.buttonWhat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentWhat = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:990909090"));
                startActivity(intentWhat);
                }
        });
        binding.buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendEmail();
            }
        });

    }
    protected void sendEmail() {
        String[] TO = {"f.xxxxxxxxxx@gmail.com"};
        String[] CC = {""};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mail"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Contact from mi app");
        emailIntent.putExtra(Intent.EXTRA_TEXT, binding.editTextMessage.getText());
        startActivity(Intent.createChooser(emailIntent, "Send Mail"));
        finish();
    }
}