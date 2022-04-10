package com.example.ancientbooke;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseListAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class listview extends AppCompatActivity {

    //Arraylist for storing books value.
    List<books> myBookList = new ArrayList<>();

    private RecyclerView rview;
    private RecyclerView.Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        //Storing values for books in objects
        books b1 = new books("The Stars Shine Down", "Sidney Sheldon","Crime/Thriller","https://upload.wikimedia.org/wikipedia/en/6/62/TheStarsShineDown.jpg","29.99 CAD");
        books b2 = new books("The Hollow", "Agatha Christie","Crime/Thriller","https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1308815448i/16303._UY420_SS420_.jpg","19.29 CAD");
        books b3 = new books("The Murder on the Links", "Agatha Christie","Crime/Thriller","https://images.penguinrandomhouse.com/cover/9780525565086","23.89 CAD");
        books b4 = new books("Are you afraid of the Dark", "Sidney Sheldon","Crime/Thriller","https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1388485229l/43324.jpg","26.39 CAD");
        books b5 = new books("The Deception Point", "Dan Brown","Science Fiction","https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1551277487l/976._SY475_.jpg","47.09 CAD");
        books b6 = new books("And Then There Were None", "Agatha Christie","Crime/Thriller","https://images-na.ssl-images-amazon.com/images/I/81B9LhCS2AL.jpg","34.99 CAD");
        books b7 = new books("The Murder Of Roger Ackroyd", "Agatha Christie","Crime/Thriller","https://static01.nyt.com/images/2020/10/25/books/review/25AgathaChristie-ackroyd/25AgathaChristie-ackroyd-mobileMasterAt3x.jpg","29.99 CAD");
        books b8 = new books("The Rescue", "Nicholas Sparks","Romance","https://www.hachettebookgroup.com/wp-content/uploads/2021/07/9780446931397-1.jpg?fit=377%2C675","78.99 CAD");
        books b9 = new books("A Walk to Remember", "Nicholas Sparks","Romance","https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1498755310l/35545737._SY475_.jpg","12.00 CAD");
        books b10 = new books("If Tomorrow Comes", "Sidney Sheldon","Crime/Thriller","https://upload.wikimedia.org/wikipedia/en/2/2a/If_Tomorrow_Comes.jpg","20.00 CAD");
        books b11 = new books("White Smoke", "Tiffany Jackson","Horror","https://i.harperapps.com/covers/9780063029095/x300.jpg","13.99 CAD");
        books b12 = new books("Weather Girl", "Racheal Lynn","Romance","https://shereads.com/wp-content/uploads/2021/10/WeatherGirl_RachelLynnSolomon.jpg","11.99 CAD");
        books b13 = new books("Life Without Children", "Roddy Doyle","Fiction","https://s3.amazonaws.com/sfc-datebook-wordpress/wp-content/uploads/sites/2/2021/12/MER08faf0f774b6e9020494a2edfd918_Ahead_books1227-678x1024.jpg","13.75 CAD");
        books b14 = new books("Five Feet Apart", "Racheal Lippincott","Romance","https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1529358577i/39939417._SR1200,630_.jpg","45.99 CAD");

        myBookList.add(b1);
        myBookList.add(b2);
        myBookList.add(b3);
        myBookList.add(b4);
        myBookList.add(b5);
        myBookList.add(b6);
        myBookList.add(b7);
        myBookList.add(b8);
        myBookList.add(b9);
        myBookList.add(b10);
        myBookList.add(b11);
        myBookList.add(b12);
        myBookList.add(b13);
        myBookList.add(b14);



        //Calling adapter class by passing arraylist of books.
        adapter = new listview_adapter(myBookList,getApplicationContext());

        //Connecting with XML via id.
        rview = findViewById(R.id.rview);
        // Setting grid layout with 2 columns.
        rview.setLayoutManager(new GridLayoutManager(this, 2));
        rview.setAdapter(adapter);

    }
}