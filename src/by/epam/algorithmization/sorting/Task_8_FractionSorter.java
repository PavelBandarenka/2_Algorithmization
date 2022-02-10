package by.epam.algorithmization.sorting;

import java.util.Arrays;

public class Task_8_FractionSorter {

    /*
     *  Даны дроби p1/q1,p2/q2,...pn/qn (pi,qi - натуральные).
     *  Составить программу, которая приводит эти дроби к общему
     *  знаменателю и упорядочивает их в порядке возрастания.
     */

    public static void main(String[] args) {

        int[] array1 = {2, 3, 2, 7};
        int[] array2 = {3, 2, 5, 6};
        int CommonDenominator;

        System.out.println("Sequence of fractions ");
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        CommonDenominator = array2Denominator(array2, array2MaxValue(array2));
        System.out.println("Common denominator");
        System.out.println(Arrays.toString(array1Numerator(array1, array2, CommonDenominator)));
        System.out.println(Arrays.toString(array2CommonDenominator(array2, CommonDenominator)));

        Shell(array1);
        System.out.println("Sorting");
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }

    public static int array2MaxValue(int[] array) {
        int array1MaxValue = 0;
        for (int i : array) {
            if (i > array1MaxValue) array1MaxValue = i;
        }
        return array1MaxValue;
    }

    public static int array2Denominator(int[] array, int maxValue) {
        int value = maxValue;
        for (int i = 0; i < array.length; i++) {
            if (value % array[i] != 0) {
                value = value + maxValue;
                i = i - 1;
            }
        }
        return value;
    }

    public static int[] array2CommonDenominator(int[] array, int Denominator) {
        Arrays.fill(array, Denominator);
        return array;
    }

    public static int[] array1Numerator(int[] array1, int[] array2, int commonDenominator) {
        for (int i = 0; i < array2.length; i++) {
            array1[i] = array1[i] * (commonDenominator / array2[i]);
        }
        return array1;
    }

    public static void Shell(int[] array) {
        for (int i = 0; i < array.length - 1; ) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                if (i != 0) {
                    i--;
                }
            } else if (array[i] < array[i + 1]) {
                i++;
            }
        }
    }
}
