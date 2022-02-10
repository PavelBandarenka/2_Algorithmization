package by.epam.algorithmization.multidimensional;

import java.util.Arrays;

public class Task_6_MatrixTemplateHourglass {

    /*
     *  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
     *  | 1  1  1 ... 1  1  1 |
     *  | 0  1  1 ... 1  1  0 |
     *  | 0  0  1 ... 1  0  0 |
     *  | :  :  : ... :  :  : |
     *  | 0  1  1 ... 1  1  0 |
     *  | 1  1  1 ... 1  1  1 |
     */

    public static void main(String[] args) {

        int n;
        int[][] testArray;

        n = 6;
        testArray = new int[n][n];

        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - i; j++) {
                testArray[i][j] = 1;
                testArray[n - i - 1][j] = 1;
            }
            System.out.println(Arrays.toString(testArray[i]));
        }
    }
}
