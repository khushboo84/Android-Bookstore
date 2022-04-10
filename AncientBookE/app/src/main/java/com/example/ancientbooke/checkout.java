package com.example.ancientbooke;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class checkout extends AppCompatActivity {

    // Declaring XML views
    ImageView displayImg;
    TextView txtcheckoutPrice, txtcheckoutName, btnProceed;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.checkout);

        //Initializing views with XML ids.
        displayImg = (ImageView) findViewById(R.id.displayImg);
        txtcheckoutName = findViewById(R.id.txtcheckoutName);
        txtcheckoutPrice = findViewById(R.id.txtcalPrice);
        btnProceed = findViewById(R.id.btnproceedchk);


        //Getting values (current book) from intent and passing them to current set of XML views to display individual book details.
        Picasso.get().load(getIntent().getStringExtra("displayImage")).into(displayImg);
        txtcheckoutName.setText(getIntent().getStringExtra("txtdisplayName"));
        txtcheckoutPrice.setText(getIntent().getStringExtra("txtdisplayPrice"));


        //onClick listener event to move to next activity using intent.
        btnProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(checkout.this,Payment.class);
                startActivity(intent);
            }
        });



    }
}
