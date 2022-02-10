package by.epam.algorithmization.decompozition;

public class Task_16_ParityDeterminant {

    /*
     *  Написать программу, определяющую сумму n - значных чисел,
     *  содержащих только нечетные цифры. Определить также, сколько
     *  четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
     */

    public static void main(String[] args) {


        int n;
        int[] array;

        n = 4;

        printNumbersWithOddDigits(checkNumbersWithOddDigits(n), n);

        array = checkNumbersWithOddDigits(n);

        System.out.println("Sum of numbers :" + calcOddNumbersSum(array));
        System.out.println("Even numbers quantity in sum number is :" + checkNumbersWithEvenDigits(calcOddNumbersSum(array)));
    }

    public static int calcOddNumbersSum(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum = sum + j;
        }
        return sum;
    }

    public static int[] splitNumberIntoDigits(int a) {
        int arrayLength = countDigitsInNumber(a);
        int[] array = new int[arrayLength];
        for (int i = arrayLength - 1; a > 0; i--, a /= 10) {
            array[i] = a % 10;
        }
        return array;
    }

    public static int countDigitsInNumber(int a) {
        int count = 0;
        for (; a > 0; a /= 10) {
            count++;
        }
        return count;
    }

    public static int calcNumberToStartCountFrom(int n) {
        return (int) Math.pow(10, (-1 + n));
    }

    public static int calcNumberToStopCount(int n) {
        return calcNumberToStartCountFrom(n) * 10 - 1;
    }

    public static boolean checkForOddDigits(int a) {
        int[] array;
        array = splitNumberIntoDigits(a);
        boolean bigger = false;

        for (int j : array) {
            if (j % 2 != 0 && j > 0) {
                bigger = true;
            } else {
                bigger = false;
                break;
            }
        }
        return bigger;
    }

    public static int[] checkNumbersWithOddDigits(int n) {
        int numberToStartFrom = calcNumberToStartCountFrom(n);
        int numberToStop = calcNumberToStopCount(n);
        int[] array = new int[numberToStop - numberToStartFrom];
        int count = 0;
        for (int i = numberToStartFrom; i <= numberToStop; i++) {
            if (checkForOddDigits(i)) {
                array[count] = i;
                count++;
            }
        }
        return array;
    }

    public static int checkNumbersWithEvenDigits(int n) {
        int[] array;
        int count = 0;
        array = splitNumberIntoDigits(n);
        for (int j : array) {
            if (j % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void printNumbersWithOddDigits(int[] array, int n) {
        System.out.println("Odd numbers from " + calcNumberToStartCountFrom(n) + " to " + calcNumberToStopCount(n) + " are:");
        for (int j : array) {
            if (j > 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println();
    }
}
