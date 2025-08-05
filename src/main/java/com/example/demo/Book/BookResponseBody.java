package com.example.demo.Book;

public class BookResponseBody {
    private String title;
    private String author;
    private double price;

    public BookResponseBody(){

    }

    public BookResponseBody(String title, String author, double price){
        this.author = author;
        this.title = title;
        this.price = price;

    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

}
