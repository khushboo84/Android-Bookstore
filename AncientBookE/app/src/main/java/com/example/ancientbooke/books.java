package com.example.ancientbooke;


public class books {

    //Declaring fields for books arraylist.
    private String Name, Author, Genre, Image, Price;

    public books(){

    }

    //Constructor
    public books(String name, String author, String genre, String image, String price) {
        Name = name;
        Author = author;
        Genre = genre;
        Image = image;
        Price = price;
    }

    //Getter and setters for all the fields.
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }
}
