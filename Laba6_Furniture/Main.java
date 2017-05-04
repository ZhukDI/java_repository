package Laba_6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        Book book1 = new Book("A Game of Thrones", "George R. R. Martin", 765, 30);
        Book book2 = new Book("Harry Potter and the prisoner of Azkaban", "J. K. Rowling", 640, 25);
        Book book3 = new Book("Thinking in Java", "Bruce Eckel", 1095, 40);
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        Bookcase bookcase = new Bookcase("Billy", 202, 80, 69.99, "IKEA", bookList);

        System.out.println(bookcase);
    }
}
