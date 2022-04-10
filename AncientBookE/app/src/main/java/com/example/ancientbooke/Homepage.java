package com.example.ancientbooke;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Homepage extends AppCompatActivity
{


    ImageView btnNext;
    ImageView about;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        //Initializing/Connecting class variable to XML via id
        btnNext=findViewById(R.id.btnNextHome);
        about =findViewById(R.id.btnabouthome);


        //Onclick event with intent functionality to move to another activity.
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in1 = new Intent(Homepage.this,CategoryActivity.class);
                startActivity(in1);
            }
        });

        //Onclick event with intent functionality to move to another activity.
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in2 = new Intent(Homepage.this,aboutus.class);
                startActivity(in2);
            }
        });


    }
}
