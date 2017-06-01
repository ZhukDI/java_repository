package lab9_a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        if(scanner.hasNextInt()) {
            n = scanner.nextInt();
            scanner.nextLine();
        }
        else {
            System.out.println("Вы ввели не целое число!");
        }

        String string = "";
        String tmpString = "";
        for (int i = 0; i < n; i++) {
            System.out.println("Введите строку:");
            string += scanner.nextLine();
        }
        System.out.println(string);
        System.out.println("Введите подстроку, которую хотите удалить:");
        tmpString = scanner.nextLine();
        string = string.replaceAll(tmpString, "");
        System.out.println(string);
    }
}