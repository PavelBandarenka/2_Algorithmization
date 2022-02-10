package by.epam.algorithmization.multidimensional;

public class Task_5_MatrixTemplateZeroing {

    /*
     *  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
     *  | 1  1   1 ... 1  1  1 |
     *  | 2  2   2 ... 2  2  0 |
     *  | 3  3   3 ... 3  0  0 |
     *  | :  :   : ... :  :  : |
     *  | n  n-1 0 ... 0  0  0 |
     *  | n  0   0 ... 0  0  0 |
     */

    public static void main(String[] args) {

        int n;
        int[][] testArray;

        n = 6;
        testArray = new int[n][n];

        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= (n - i)) {
                    testArray[i][j] = 0;
                } else {
                    testArray[i][j] = i + 1;
                }
                System.out.print(testArray[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

