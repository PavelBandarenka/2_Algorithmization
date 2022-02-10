package by.epam.algorithmization.multidimensional;

public class Task_16_MagicSquare {

    /*
     *  Магическим квадратом порядка n называется квадратная матрица размера nxn,
     *  составленная из чисел 1, 2, 3,..., n² так, что суммы по каждому столбцу,
     *  каждой строке и каждой из двух больших диагоналей равны между собой.
     *  Построить такой квадрат. Пример магического квадрата порядка 3:
     *        6 1 8
     *        7 5 3
     *        2 9 4
     */

    public static void main(String[] args) {

        int n;
        int[][] testArray;
        int a;
        int b;
        int count;

        n = 7;
        testArray = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                testArray[i][j] = 0;
            }
        }

        count = 1;
        a = 0;
        b = n / 2;

        while (count < n * n + 1) {
            testArray[a][b] = count;
            count++;
            if (((a == 0) && (b >= n - 1)) && (testArray[n - 1][0] != 0)) {
                a++;
            } else {
                a--;
                if (a < 0) {
                    a = n - 1;
                }
                b++;
                if (b == n) {
                    b = 0;
                }
                if (testArray[a][b] != 0) {
                    a += 2;
                    b--;
                }
            }
        }

        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {
                System.out.print(testArray[k][l] + " ");
            }
            System.out.println();
        }
    }
}

