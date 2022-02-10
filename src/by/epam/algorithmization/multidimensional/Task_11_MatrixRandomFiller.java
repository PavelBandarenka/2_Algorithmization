package by.epam.algorithmization.multidimensional;

import java.util.Arrays;
import java.util.Random;

public class Task_11_MatrixRandomFiller {

    /*
     *  Матрицу 10x20 заполнить случайными числами от 0 до 15.
     *  Вывести на экран саму матрицу и номера строк,
     *  в которых число 5 встречается три и более раз.
     */

    public static void main(String[] args) {

        int n;
        int m;
        int[][] testArray;
        int maxArrayNum;
        int count;
        int entryNumber;
        int entries;

        n = 10;
        m = 15;
        testArray = new int[n][m];
        maxArrayNum = 15;
        entryNumber = 5;
        entries = 3;

        Random randomArrayValues = new Random();
        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                testArray[i][j] = randomArrayValues.nextInt(maxArrayNum);
            }
            System.out.println(Arrays.toString(testArray[i]));
        }
        System.out.println("Lines where number 5 occurs 3 or more times: ");

        count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (testArray[i][j] == entryNumber)
                    count++;
            }
            if (count >= entries) {
                System.out.println(i + 1);
            }
            count = 0;
        }
    }
}