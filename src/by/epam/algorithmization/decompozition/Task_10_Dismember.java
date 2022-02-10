package by.epam.algorithmization.decompozition;

import java.util.Arrays;

public class Task_10_Dismember {

    /*
     *  Дано натуральное число N.
     *  Написать метод(методы) для формирования массива,
     *  элементами которого являются цифры числа N.
     */

    public static void main(String[] args) {

        int n;

        n = 6;

        countSequence(n);
    }

    public static void countSequence(int n) {
        if (n > 0) {
            int[] array = new int[n];
            for (int i = 0; i <= n; i++) {
                if (i < n) {
                    array[i] = i + 1;
                }
            }
            System.out.println("Number: " + n + "   includes natural numbers: " + Arrays.toString(array));
        } else {
            System.out.println("Invalid number");
        }
    }
}