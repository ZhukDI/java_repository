package Laba_6;

abstract class Cupboard implements Furniture{
    String name;
    double height;
    double width;
    double price;
    String manufacturer;


    public Cupboard(String name, double height, double width, double price, String manufacturer) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Cupboard{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
