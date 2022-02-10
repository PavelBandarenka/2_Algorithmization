package by.epam.algorithmization.multidimensional;

import java.util.Random;

public class Task_12_MatrixStringSorter {

    /*
     *  Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
     */

    public static void main(String[] args) {

        int n;
        int[][] testArray;
        int maxArrayNum;

        n = 5;
        testArray = new int[n][n];
        maxArrayNum = 10;

        Random randomArrayValues = new Random();
        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                testArray[i][j] = randomArrayValues.nextInt(maxArrayNum);
                System.out.print(testArray[i][j] + "  ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (testArray[i][j] > testArray[i][k]) {
                        int temp = testArray[i][j];
                        testArray[i][j] = testArray[i][k];
                        testArray[i][k] = temp;
                    }
                }
            }
        }
        System.out.println("Sort by +");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(testArray[i][j] + "  ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++)
                    if (testArray[i][j] < testArray[i][k]) {
                        int temp = testArray[i][j];
                        testArray[i][j] = testArray[i][k];
                        testArray[i][k] = temp;
                    }
            }
        }
        System.out.println("Sort by -");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(testArray[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
