package by.epam.algorithmization.multidimensional;

public class Task_7_MatrixTemplateSinus {

    /*
     *  Сформировать квадратную матрицу порядка N по правилу:
     *  A[I, J] = sin (( I² - J²)/N)
     *  и подсчитать количество положительных элементов в ней.
     */

    public static void main(String[] args) {

        int n;
        int count;
        double[][] testArray;

        n = 4;
        count = 0;
        testArray = new double[n][n];

        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                testArray[i][j] = Math.sin((double) (i * i - j * j) / n);
                if (testArray[i][j] > 0) {
                    count++;
                }
                System.out.print(Math.ceil(100 * testArray[i][j]) / 100 + "  ");
            }
            System.out.println();
        }
        System.out.println(count);
    }
}
