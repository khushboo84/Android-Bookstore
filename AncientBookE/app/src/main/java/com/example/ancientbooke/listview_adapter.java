package com.example.ancientbooke;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.squareup.picasso.Picasso;

import java.util.List;

//Creating adapter class which extends recyclerview adapter and processes arraylist of books
public class listview_adapter extends RecyclerView.Adapter<listview_adapter.MyViewHolder> {



    private List<books> mybooks;
    private Context context;


    public listview_adapter(List<books> books,Context context) {
        mybooks = books;
        this.context = context;

    }



    @NonNull
    @Override
    public listview_adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //Declaring layoutinflater that creates vies according to XML layout.
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        return new MyViewHolder(layoutInflater, parent);



    }

    // Implementing ViewHolder,onBindViewHolder and getItemCount methods.
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {



        books b = mybooks.get(position);

        //Displaying list of book data in the holder(card)
        holder.txtName.setText(b.getName());
        holder.txtAuthor.setText(b.getAuthor());
        Picasso.get().load(b.getImage()).into(holder.imageView);

        //onclick card event with intent-putExtra method to send the particular book (current book) entries over to next activity.

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context,displayActivity.class);
                intent.putExtra("imageview",b.getImage());
                intent.putExtra("txtName",b.getName());
                intent.putExtra("txtAuthor",b.getAuthor());
                intent.putExtra("txtGenre",b.getGenre());
                intent.putExtra("txtPrice",b.getPrice());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mybooks.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txtName;
        TextView txtAuthor;
        ImageView imageView;

        public MyViewHolder(LayoutInflater inflater, ViewGroup parent) {

            //setting inflator values from single card XML layout.
            super(inflater.inflate(R.layout.row_layout, parent, false));

            txtName = itemView.findViewById(R.id.txtName);
            txtAuthor = itemView.findViewById(R.id.txtAuthor);
            imageView = (ImageView) itemView.findViewById(R.id.imageview);


        }

    }



}
