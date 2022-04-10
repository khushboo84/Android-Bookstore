package com.example.ancientbooke;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CategoryActivity extends AppCompatActivity {

    private ImageView thriller;
    private ImageView horror;
    private ImageView fantasy;
    private ImageView biography;
    private ImageView scifi;
    private ImageView romance;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);


        thriller=findViewById(R.id.thriller);
        horror=findViewById(R.id.horror);
        fantasy=findViewById(R.id.fantasy);
        biography=findViewById(R.id.biography);
        scifi=findViewById(R.id.scifi);
        romance=findViewById(R.id.romance);


        ////Onclick event with intent functionality for all the category buttons to move to another activty.
        thriller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in1 = new Intent(CategoryActivity.this,listview.class);
                startActivity(in1);
            }
        });

        horror.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in2 = new Intent(CategoryActivity.this,listview.class);
                startActivity(in2);
            }
        });
        fantasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in3= new Intent(CategoryActivity.this,listview.class);
                startActivity(in3);
            }
        });
        biography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in4 = new Intent(CategoryActivity.this,listview.class);
                startActivity(in4);
            }
        });
        scifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in5 = new Intent(CategoryActivity.this,listview.class);
                startActivity(in5);
            }
        });
        romance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in6 = new Intent(CategoryActivity.this,listview.class);
                startActivity(in6);
            }
        });




    }
}