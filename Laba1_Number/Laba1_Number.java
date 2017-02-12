import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Админ on 09.02.2017.
 *
 * Ввести с консоли n целых чисел. На консоль вывести:
 * Числа, которые делятся на 3 или на 9.
 */
public class lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int []arr = new int[0];
        List<Integer> threeMultipleList = new ArrayList<>();
        List<Integer> nineMultipleList = new ArrayList<>();


        System.out.print("Введите количество чисел: ");
        if(scanner.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
            n = scanner.nextInt();
            arr = new int[n];
        }else {
            System.out.println("Вы ввели не целое число");
        }

        for(int i = 0, tmp; i < n; i++){
            System.out.print("Введите " + (i+1) + "-ое число: ");
            tmp = scanner.nextInt();
            arr[i] = tmp;
        }

        for(int i = 0; i < n; i++){
            if(arr[i]%3==0){
                threeMultipleList.add(arr[i]);
            }
            if(arr[i]%9==0){
                nineMultipleList.add(arr[i]);
            }
        }

        if (!(threeMultipleList.isEmpty())){
            System.out.println("Числа, которые делятся на 3:");
        }else{
            System.out.println("Нету чисел, которые делятся на 3.");
        }
        for(int number : threeMultipleList){
            System.out.print(number + " ");
        }

        System.out.println();


        if (!(nineMultipleList.isEmpty())){
            System.out.println("Числа, которые делятся на 9:");
        }else{
            System.out.println("Нету чисел, которые делятся на 9.");
        }
        for(int number : nineMultipleList){
            System.out.print(number + " ");
        }
    }
}
