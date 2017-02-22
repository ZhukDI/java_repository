package Lab2c;

import java.util.Random;

/**
 * Класс Матрица<br>
 *
 *Содержит следующие методы:
 * <br> initialize - инициализация матрицы случайными целыми числами;
 * <br> showMatrix - вывести матрицу на экран;
 * <br> subtractNumber - вычитание числа(avg строки) из элементов матрицы
 *
 * @author Zhuk Dmitry
 */
public class Matrix {
    private int m; //количество строк
    private int n; //количество столбцов
    private int [][] matrix;

    Matrix(int rows, int cols){
        m = rows;
        n = cols;
        matrix = new int[m][n];
    }

    // инициализация матрицы случайными целыми числами
    public void initialize(){
        Random r = new Random();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = r.nextInt(10);
            }
        }
    }

    // вывести матрицу на экран
    public void showMatrix() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // вычитание числа(avg строки) из элементов матрицы
    public void subtractNumber() {
        int[] strSum = new int[m];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                strSum[i] += matrix[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++){
                matrix[i][j] -= strSum[i]/m;
            }
        }
    }
}
