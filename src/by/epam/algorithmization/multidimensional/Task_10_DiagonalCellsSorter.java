package by.epam.algorithmization.multidimensional;

import java.util.Random;

public class Task_10_DiagonalCellsSorter {

    /*
     *  Найти положительные элементы главной диагонали квадратной матрицы.
     */

    public static void main(String[] args) {

        int n;
        int[][] testArray;
        int maxArrayNum;

        n = 4;
        testArray = new int[n][n];
        maxArrayNum = 10;

        Random randomArrayValues = new Random();
        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                testArray[i][j] = randomArrayValues.nextInt(maxArrayNum) - 5;
                System.out.print(testArray[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("Positive elements: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j && testArray[i][j] > 0)
                    System.out.print(testArray[i][j] + "  ");
            }
        }
    }
}

