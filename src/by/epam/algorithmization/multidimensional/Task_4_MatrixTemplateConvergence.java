package by.epam.algorithmization.multidimensional;

public class Task_4_MatrixTemplateConvergence {

    /*
     *  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
     *  | 1  2   3   ... n |
     *  | n  n-1 n-2 ... 1 |
     *  | 1  2   3   ... n |
     *  | n  n-1 n-2 ... 1 |
     *  | :  :   :   :   : |
     *  | n  n-1 n-2 ... 1 |
     */

    public static void main(String[] args) {

        int n;
        int m;
        int[][] testArray;

        n = 4;
        m = 4;
        testArray = new int[n][m];

        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i % 2 == 0) {
                    testArray[i][j] = 1 + j;
                } else {
                    testArray[i][j] = n - j;
                }
                System.out.print(testArray[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

