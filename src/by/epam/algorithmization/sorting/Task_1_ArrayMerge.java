package by.epam.algorithmization.sorting;

public class Task_1_ArrayMerge {

    /*
     *   Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
     *   один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
     *   дополнительный массив.
     */

    public static void main(String[] args) {

        int a;
        int b;
        int k;
        int count;
        int[] testArray1;
        int[] testArray2;

        a = 5;
        b = 4;
        k = 3;
        count = 0;
        testArray1 = new int[a + b];
        testArray2 = new int[b];

        System.out.println("Array_A");
        for (int i = 0; i < a; i++) {
            testArray1[count++] = i;
            System.out.print(testArray1[i] + " ");
        }

        System.out.println();
        System.out.println("Array_B");

        count = 0;
        for (int i = 0; i < b; i++) {
            testArray2[count++] = i;
            System.out.print(testArray2[i] + " ");
        }

        System.out.println();
        count = 0;

        for (int i = k + b; i < a + b; i++) {
            testArray1[i] = testArray1[i - b];
        }

        for (int i = k; count < b; i++) {
            testArray1[i] = testArray2[count];
            count++;
        }
        System.out.println("Array_A+B");

        for (int i = 0; i < a + b; i++) {
            System.out.print(testArray1[i] + " ");
        }
    }
}