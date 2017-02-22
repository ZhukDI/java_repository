package Lab2;
import java.util.Scanner;

/**
 * Условие
 * Определить принадлежность некоторого значения k интервалам (n, m], [n,
 * m), (n, m), [n, m].<br>
 *
 * Дата и время получения задания: 16.02.2017 15-00;<br>
 * Дата и время сдачи задания: 16.02.2017 15-00;<br>
 *
 * @author Zhuk Dmitry
 * @since JDC 1.8
 */
public class lab2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double k, n, m;
        System.out.print("Введите число k: ");
        k = scanner.nextDouble();
        System.out.print("Введите интервал: ");
        n = scanner.nextDouble();
        m = scanner.nextDouble();

        toBelong(k, n, m);
    }


    private static void toBelong(double k, double n, double m) {
        if(k>n && k<=m)
            System.out.println("k принадлежит интервалу (n, m]");
        if(k>=n && k<m)
            System.out.println("k принадлежит интервалу [n, m)");
        if(k>n && k<m)
            System.out.println("k принадлежит интервалу (n, m)");
        if(k>=n && k<=m)
            System.out.println("k принадлежит интервалу [n, m]");
    }
}

