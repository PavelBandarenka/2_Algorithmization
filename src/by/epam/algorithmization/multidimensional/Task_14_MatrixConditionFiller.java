package by.epam.algorithmization.multidimensional;

import java.util.Random;

public class Task_14_MatrixConditionFiller {

    /*
     *  Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
     *  причем в каждом столбце число единиц равно номеру столбца.
     */

    public static void main(String[] args) {

        int n;
        int m;
        int[][] testArray;

        n = 13;
        m = 8;
        testArray = new int[n][m];

        System.out.println("Array:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i + 1) testArray[j][i] = 0;
                else testArray[j][i] = 1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(testArray[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

