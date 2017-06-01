package product;

/**
 * Created by Админ on 28.02.2017.
 *
 *
 */
public class Product {
    private int id;
    private String name;
    private String UPC;
    private String maker;
    private double price;
    private int shelfLife;
    private int count;


    Product(int id, String name, String UPC, String maker, double price, int shelfLife, int count) {
        this.id = id;
        this.name = name;
        this.UPC = UPC;
        this.maker = maker;
        this.price = price;
        this.shelfLife = shelfLife;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public double getPrice() {
        return price;
    }

    public String getUPC() {
        return UPC;
    }

    public String getMaker() {
        return maker;
    }

    public int getCount() {
        return count;
    }

    public void Show(){
        System.out.println("Id: "+ id);
        System.out.println("Наименование: " + name);
        System.out.println("UPC: " + UPC);
        System.out.println("Производитель: " + maker);
        System.out.println("Цена: " + price + " рублей");
        System.out.println("Срок хранения: " + shelfLife + " месяцев");
        System.out.println("Количество " + count);
    }
}
