package by.epam.algorithmization.multidimensional;

import java.util.Random;

public class Task_1_OddColumnsDrawer {

    /*
     *  Дана матрица. Вывести на экран все нечетные столбцы,
     *  у которых первый элемент больше последнего
     */

    public static void main(String[] args) {

        int n;
        int m;
        int[][] testArray;
        int maxArrayNum;

        n = 3;
        m = 5;
        testArray = new int[n][m];
        maxArrayNum = 10;

        Random randomArrayValues = new Random();
        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                testArray[i][j] = randomArrayValues.nextInt(maxArrayNum);
                System.out.print(testArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Target columns :");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j += 2) {
                if (testArray[0][j] > testArray[n - 1][j])
                    System.out.print(testArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
