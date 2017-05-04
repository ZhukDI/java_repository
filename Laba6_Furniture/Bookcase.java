package Laba_6;

import java.util.ArrayList;

public class Bookcase extends Cupboard {
    ArrayList<Book> bookList;

    public Bookcase(String name, double height, double width, double price, String manufacturer) {
        super(name, height, width, price, manufacturer);
    }

    public Bookcase(String name, double height, double width, double price, String manufacturer, ArrayList<Book> bookList) {
        super(name, height, width, price, manufacturer);
        this.bookList = bookList;
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    @Override
    public void getPrice() {
        System.out.println(price);
    }

    @Override
    public void getManufacturer() {
        System.out.println(manufacturer);
    }

    @Override
    public void buy() {
        System.out.println("Куплено!");
    }

    @Override
    public void sell() {
        System.out.println("Продано!");
    }
}
