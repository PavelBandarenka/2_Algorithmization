package by.epam.algorithmization.multidimensional;

import java.util.Random;

public class Task_2_DiagonalCellsCounter {

    /*
     *  Дана квадратная матрица. Вывести на экран элементы,
     *  стоящие на диагонали.
     */

    public static void main(String[] args) {

        int n;
        int m;
        int [][] testArray;
        int maxArrayNum;

        n = 3;
        m = 3;
        testArray = new int[n][m];
        maxArrayNum = 10;

        Random randomArrayValues = new Random();
        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                testArray[i][j] = randomArrayValues.nextInt(maxArrayNum);
                System.out.print(testArray[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("Diagonally :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i==j) {
                    System.out.print(testArray[i][j]);
                }
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(testArray[i][m-1-i]);
        }
    }
}
