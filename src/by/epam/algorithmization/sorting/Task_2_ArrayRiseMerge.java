package by.epam.algorithmization.sorting;

public class Task_2_ArrayRiseMerge {

    /*
     *   Даны две последовательности
     *   a1<=a2<=...<=an и b1<=b2<=...<=bm
     *   Образовать из них новую последовательность чисел так,
     *   чтобы она тоже была неубывающей.
     *   Примечание. Дополнительный массив не использовать.
     */

    public static void main(String[] args) {

        int n;
        int m;
        int countAn;
        int countBm;
        int[] testArray1;
        int[] testArray2;

        n = 5;
        m = 4;
        countAn = 2;
        testArray1 = new int[n + m];
        testArray2 = new int[m];

        System.out.println("An");
        for (int i = 0; i < n; i++) {
            testArray1[i] = countAn++;
            System.out.print(testArray1[i] + " ");
        }
        System.out.println();
        System.out.println("Bm");
        countBm = 4;
        for (int i = 0; i < m; i++) {
            testArray2[i] = countBm++;
            System.out.print(testArray2[i] + " ");
        }
        System.out.println();
        System.out.println("An + Bm");
        int count = 0;
        for (int i = 0; i < n + m; i++) {
            if (i >= n) {
                testArray1[i] = testArray2[count];
                count++;
            }
        }
        int temp;
        for (int i = 0; i < n + m; i++) {
            for (int j = 0; j < n + m; j++) {
                if (testArray1[j] > testArray1[i]) {
                    temp = testArray1[j];
                    testArray1[j] = testArray1[i];
                    testArray1[i] = temp;
                }
            }
        }
        for (int i = 0; i < n + m; i++) {
            System.out.print(testArray1[i] + " ");
        }
    }
}
