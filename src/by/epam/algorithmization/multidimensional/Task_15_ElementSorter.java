package by.epam.algorithmization.multidimensional;

import java.util.Random;

public class Task_15_ElementSorter {

    /*
     *  Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
     */

    public static void main(String[] args) {

        int n;
        int[][] testArray;
        int maxArrayNum;
        int count;

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
        count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (testArray[i][j] > count)
                    count = testArray[i][j];
            }
        }
        System.out.println("max element is  - " + count);
        System.out.println("replace all odd elements with this number  : ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (testArray[i][j] % 2 == 1) {
                    testArray[i][j] = count;
                }
                System.out.print(testArray[i][j] + "  ");
            }
            System.out.println();
        }
    }
}