package com.example.ancientbooke;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class aboutus extends AppCompatActivity {

    ImageView btnNext;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutus);

        btnNext = findViewById(R.id.btnNextabout);

    //Intent functionality to move to next activity.
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in1 = new Intent(aboutus.this,Homepage.class);
                startActivity(in1);
            }
        });
    }
}
