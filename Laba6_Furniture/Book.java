package Laba_6;

public class Book {
    String name;
    String author;
    int numberOfPages;
    double price;

    public Book(String name, String author, int numberOfPages, double price) {
        this.name = name;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", price=" + price +
                '}';
    }
}
