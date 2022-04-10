package com.example.ancientbooke;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class displayActivity extends AppCompatActivity {

    private ImageView displayImage;
    private TextView txtdisplayName, txtdisplayAuthor, txtdisplayGenre,txtdisplayPrice, btnebook;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);

        //Initialising variables with xml ids.
        displayImage = (ImageView) findViewById(R.id.displayImage);
        txtdisplayAuthor = findViewById(R.id.txtdisplayAuthor);
        txtdisplayGenre = findViewById(R.id.txtdisplayGenre);
        txtdisplayName = findViewById(R.id.txtdisplayName);
        txtdisplayPrice = findViewById(R.id.txtdisplayPrice);
        btnebook = findViewById(R.id.btnebook);

        //Getting the content from previous activty (current book details i.e book clicked)via getIntent() method.
        //Displaying data with set method and image url with Picasso
        Picasso.get().load(getIntent().getStringExtra("imageview")).into(displayImage);
        txtdisplayName.setText(getIntent().getStringExtra("txtName"));
        txtdisplayAuthor.setText(getIntent().getStringExtra("txtAuthor"));
        txtdisplayGenre.setText(getIntent().getStringExtra("txtGenre"));
        txtdisplayPrice.setText(getIntent().getStringExtra("txtPrice"));


        //Sending the previously retrieved data over to the next avtivity via Intent.
        btnebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(displayActivity.this,checkout.class);
                intent1.putExtra("displayImage",getIntent().getStringExtra("imageview"));
                intent1.putExtra("txtdisplayName",getIntent().getStringExtra("txtName"));
                intent1.putExtra("txtdisplayPrice",getIntent().getStringExtra("txtPrice"));
                intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent1);
            }
        });

    }
}
