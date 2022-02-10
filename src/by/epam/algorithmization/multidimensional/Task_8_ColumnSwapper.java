package by.epam.algorithmization.multidimensional;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_8_ColumnSwapper {

    /*
     *  В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
     *  на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
     *  пользователь с клавиатуры.
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
                testArray[i][j] = randomArrayValues.nextInt(maxArrayNum);
                System.out.print(testArray[i][j] + "  ");
            }
            System.out.println();
        }
        Scanner console = new Scanner(System.in);
        System.out.println("Enter number of 1st column from 1 to 4");
        int columnNumber1 = console.nextInt();

        System.out.println("Enter number of 2nd column from 1 to 4");
        int columnNumber2 = console.nextInt();

        System.out.println("New array here");
        int a;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == columnNumber1 - 1) {
                    a = testArray[i][j];
                    testArray[i][j] = testArray[i][columnNumber2 - 1];
                    testArray[i][columnNumber2 - 1] = a;
                }
            }
            System.out.println(Arrays.toString(testArray[i]));
        }
    }
}