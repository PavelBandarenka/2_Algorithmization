package by.epam.algorithmization.decompozition;

public class Task_12_ArrayKN {

    /*
     *  Даны натуральные числа К и N.
     *  Написать метод(методы) формирования массива А,
     *  элементами которого являются числа,
     *  сумма цифр которых равна К и которые не большее N.
     */

    public static void main(String[] args) {

        int k;
        int n;
        int[][] array;

        k = 5;
        n = 35;

        System.out.println("For elements K=" + k + " and N=" + n + " in array A " + "\n"
                           + "digits whose sum is equal to K " + "\n"
                           + "and which are not greater than N are: ");

        array = calculateArrayElementsOfNumbers(countNumbersUntilN(n), n);

        calculateArrayElementsSumOfNumbers(array, n, k);
    }

    public static int[] countNumbersUntilN(int n) {
        int[] array = new int[n];
        if (n > 0) {
            for (int i = 0; i <= n; i++) {
                if (i < n) {
                    array[i] = i + 1;
                }
            }
        }
        return array;
    }

    public static int countNumbersInElement(int n) {
        int countNumbersInElement = 0;
        int tempN = n;
        for (; tempN > 0; tempN /= 10) {
            countNumbersInElement++;
        }
        return countNumbersInElement;
    }

    public static int[][] calculateArrayElementsOfNumbers(int[] array, int n) {
        int numInElem = countNumbersInElement(n);
        int[][] array1 = new int[array.length][numInElem];
        int temp = n;
        for (int i = 0; i < array.length; i++) {
            n = temp - i;
            int count = 0;
            for (; n > 0; n /= 10) {
                array1[i][count] = n % 10;
                count++;
            }
        }
        return array1;
    }

    public static void calculateArrayElementsSumOfNumbers(int[][] array, int n, int k) {
        for (int[] ints : array) {
            int tempSum = 0;
            for (int j = 0; j < countNumbersInElement(n); j++) {
                tempSum = tempSum + ints[j];
            }
            if (tempSum == k && tempSum < n) {
                System.out.print(" ");
                for (int j = countNumbersInElement(n) - 1; j >= 0; j--) {
                    if (ints[j] > 0) {
                        System.out.print(ints[j]);
                    }
                }
            }
        }
    }
}
