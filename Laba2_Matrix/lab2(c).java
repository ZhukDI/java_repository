package Lab2c;

/**
 * Условие
 * Построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое.<br>
 *
 * Дата и время получения задания: 16.02.2017 15-00;<br>
 * Дата и время сдачи задания: 16.02.2017 15-00;<br>
 *
 * @author Zhuk Dmitry
 * @since JDC 1.8
 */
public class lab2c {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3, 3);

        matrix.initialize();
        System.out.println("Первоначальная матрица");
        matrix.showMatrix();
        System.out.println();

        System.out.println("Вычитание среднего значения из матрицы");
        matrix.subtractNumber();
        System.out.println("Преобразованная матрица");
        matrix.showMatrix();
    }
}
