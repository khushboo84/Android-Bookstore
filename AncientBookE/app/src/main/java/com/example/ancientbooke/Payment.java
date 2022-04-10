package com.example.ancientbooke;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Payment extends AppCompatActivity {

    TextView btnPayment;
    EditText nameOnCard;
    EditText cardNumber;
    EditText expiryDate;
    EditText cvc;
    EditText emailAddress;
    RadioButton googlePay;
    RadioButton debitCard;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment);

        btnPayment = findViewById(R.id.btnpayment);
        nameOnCard = findViewById(R.id.editTextTextPersonName);
        cardNumber = findViewById(R.id.editTextNumber);
        expiryDate = findViewById(R.id.editTextDate);
        cvc = findViewById(R.id.txtcvc);
        emailAddress = findViewById(R.id.txtemail);
        googlePay = findViewById(R.id.radioButton);
        debitCard = findViewById(R.id.Debitcard);


        nameOnCard.getText().toString();
        cardNumber.getText().toString();
        expiryDate.getText().toString();
        cvc.getText().toString();
        emailAddress.getText().toString();


        //Toast to display successful message pop up
        //Intent to go back to main activity
        btnPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"PAYMENT SUCCESSFUL",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Payment.this,MainActivity.class);
                startActivity(intent);

            }
        });

    }
}
