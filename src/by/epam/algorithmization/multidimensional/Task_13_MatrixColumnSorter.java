package by.epam.algorithmization.multidimensional;

import java.util.Random;

public class Task_13_MatrixColumnSorter {

    /*
     *  Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
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
                for (int k = i + 1; k < n; k++) {
                    if (testArray[i][j] > testArray[k][j]) {
                        int temp = testArray[i][j];
                        testArray[i][j] = testArray[k][j];
                        testArray[k][j] = temp;
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
                for (int k = i + 1; k < n; k++) {
                    if (testArray[i][j] < testArray[k][j]) {
                        int temp = testArray[i][j];
                        testArray[i][j] = testArray[k][j];
                        testArray[k][j] = temp;
                    }
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
