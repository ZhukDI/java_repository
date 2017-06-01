package product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Админ on 28.02.2017.
 *
 */
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1,"iPhone 7", "002341002", "Apple", 1600.00, 36, 1);
        Product product2 = new Product(2,"Nokia 3310", "101451008", "HMD Global", 100.00, 36, 1);
        Product product3 = new Product(3,"Xiaomi Redmi Note 3", "200151013", "Xiaomi Corporation", 380.00, 24, 1);
        Product product4 = new Product(5,"iPhone 7", "002341001", "Apple", 1500.00, 30, 1);
        Product product5 = new Product(6,"iPhone 7", "002341003", "Apple", 1400.00, 26, 1);

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);

        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.print("Введите наименование: ");
        name = scanner.nextLine();
        showByName(name, productList);

        double price;
        System.out.print("Введите наименование: ");
        name = scanner.nextLine();
        System.out.print("Введите цену: ");
        price = scanner.nextDouble();
        showByNameAndPrice(name, price, productList);

        int shelfLife;
        System.out.print("Введите срок хранения: ");
        shelfLife = scanner.nextInt();
        showByShelfLife(shelfLife, productList);
    }

    private static void showByName(String name, List<Product> productList){
        for (Product product: productList) {
            if(name.equals(product.getName())){
                product.Show();
                System.out.println();
            }
        }
    }

    private static void showByNameAndPrice(String name, double price, List<Product> productList){
        for (Product product: productList) {
            if(name.equals(product.getName()) && price>=product.getPrice()){
                product.Show();
                System.out.println();
            }
        }
    }

    private static void showByShelfLife(int shelfLife, List<Product> productList){
        for (Product product: productList) {
            if(shelfLife<product.getShelfLife()){
                product.Show();
                System.out.println();
            }
        }
    }
}