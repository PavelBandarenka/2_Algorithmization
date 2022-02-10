package by.epam.algorithmization.multidimensional;

import java.util.Random;

public class Task_3_ElementsSpecifier {

    /*
     *  Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
     */

    public static void main(String[] args) {

        int n;
        int m;
        int[][] testArray;
        int maxArrayNum;
        int string;
        int column;

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

        Random randomStringNumber = new Random();

        string = randomStringNumber.nextInt(n) + 1;
        System.out.println("some k string :" + string);
        System.out.print(string + " string values: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i + 1 == string) {
                    System.out.print(" " + testArray[i][j]);
                }
            }
        }
        System.out.println();

        Random randomColumnNumber = new Random();
        column = randomColumnNumber.nextInt(m) + 1;
        System.out.println("some p column :" + column);
        System.out.print(column + " column values: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j + 1 == column) {
                    System.out.print(" " + testArray[i][j]);
                }
            }
        }
        System.out.println();
    }
}
