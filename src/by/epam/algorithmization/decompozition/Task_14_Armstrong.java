package by.epam.algorithmization.decompozition;

public class Task_14_Armstrong {

    /*
     *  Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
     *  возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
     *  использовать декомпозицию.
     */

    public static void main(String[] args) {


        int k;

        k = 1000;

        printArmstrongNumbers(findArmstrongToNumberK(k));
    }

    public static int countDigitsInNumber(int a) {
        int count = 0;
        for (; a > 0; a /= 10) {
            count++;
        }
        return count;
    }

    public static int calculateDigitsDegree(int a, int b) {
        int degree = countDigitsInNumber(b);
        int tempA = a;
        for (int i = 1; i < degree; i++) {
            tempA = tempA * a;
        }
        return tempA;
    }

    public static int[] splitNumberIntoDigits(int a) {
        int arrayLength = countDigitsInNumber(a);
        int[] array = new int[arrayLength];
        for (int i = 0; a > 0; i++, a /= 10) {
            array[i] = a % 10;
        }
        return array;
    }

    public static int calculateArmstrong(int a) {
        int[] array;
        array = splitNumberIntoDigits(a);
        int sumOfDigits = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = calculateDigitsDegree(array[i], a);
            sumOfDigits = sumOfDigits + array[i];
        }
        return sumOfDigits;
    }

    public static int[] findArmstrongToNumberK(int k) {
        int[] array = new int[k];
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + count;
            count++;
        }
        count = 0;
        int[] array1 = new int[k];
        for (int j : array) {
            if (j == calculateArmstrong(j) && j > 0) {
                array1[count] = j;
            }
            count++;
        }
        return array1;
    }

    public static void printArmstrongNumbers(int[] array) {
        System.out.println("From 1 to k (k=" + array.length + "), Armstrong numbers are:");
        for (int i : array) {
            if (i > 0) {
                System.out.print(i + " ");
            }
        }
    }
}
