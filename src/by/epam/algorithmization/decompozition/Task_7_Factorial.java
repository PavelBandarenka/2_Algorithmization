package by.epam.algorithmization.decompozition;

import java.util.Arrays;

public class Task_7_Factorial {

    /*
     *  Написать метод(методы) для вычисления суммы факториалов
     *  всех нечетных чисел от 1 до 9.
     */

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        printText(array);

    }

    public static void printText(int[] array) {
        int[] oddNumbers = findAnOddNumbers(array);
        System.out.println("Array : " + Arrays.toString(array));
        System.out.println("Odd numbers are: " + Arrays.toString(oddNumbers));
        int[] oddNumberFactorials = calculateFactorial(oddNumbers);
        System.out.println("Factorials are: " + Arrays.toString(oddNumberFactorials));
        System.out.println("Sum of factorials = " + calculateSumOfArray(oddNumberFactorials));

    }

    public static int calculateAnOddNumberQuantity(int[] array) {
        int count = 0;
        for (int i : array) {
            if (i % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] findAnOddNumbers(int[] array) {
        int[] array2 = new int[calculateAnOddNumberQuantity(array)];
        int count = 0;
        for (int j : array) {
            if (j % 2 != 0) {
                array2[count] = j;
                count++;
            }
        }
        return array2;
    }

    public static int[] calculateFactorial(int[] array) {
        int[] array2 = new int[array.length];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = 1;
            for (int j = 1; j <= array[i]; j++) {
                array2[i] = array2[i] * j;
            }
        }
        return array2;
    }

    public static int calculateSumOfArray(int[] array) {
        int temp = 0;
        for (int i : array) {
            temp = temp + i;
        }
        return temp;
    }
}