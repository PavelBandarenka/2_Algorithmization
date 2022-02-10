package by.epam.algorithmization.multidimensional;

import java.util.Arrays;
import java.util.Random;

public class Task_9_ElementsAdder {

    /*
     *  Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
     *  столбец содержит максимальную сумму.
     */

    public static void main(String[] args) {

        int n;
        int[][] testArray;
        int maxArrayNum;
        int[] testArraySum;
        int testArraySumMaxValue;
        int testArraySumMaxValueColumnNumber;

        n = 4;
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
        System.out.println("Each column sum:");

        testArraySum = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                testArraySum[i] = testArraySum[i] + testArray[j][i];
            }
            System.out.print(Arrays.toString(new int[]{testArraySum[i]}));
        }
        System.out.println();

        testArraySumMaxValue = 0;
        testArraySumMaxValueColumnNumber = 0;

        for (int i = 0; i < n; i++) {
            if (testArraySum[i] > testArraySumMaxValue) {
                testArraySumMaxValue = testArraySum[i];
                testArraySumMaxValueColumnNumber = i + 1;
            }
        }
        System.out.println("Column with maximum sum is :" + testArraySumMaxValueColumnNumber + "  Sum value is = " + testArraySumMaxValue);
    }
}
