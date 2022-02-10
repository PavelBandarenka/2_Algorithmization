package by.epam.algorithmization.decompozition;

public class Task_15_DigitSequence {

    /*
     *  Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
     *  последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
     */

    public static void main(String[] args) {


        int n;

        n = 3;

        printNumbersWithDigitsProgression(checkNumbersWithDigitsProgression(n), n);

    }

    public static int countDigitsInNumber(int a) {
        int count = 0;
        for (; a > 0; a /= 10) {
            count++;
        }
        return count;
    }

    public static int[] splitNumberIntoDigits(int a) {
        int arrayLength = countDigitsInNumber(a);
        int[] array = new int[arrayLength];
        for (int i = arrayLength - 1; a > 0; i--, a /= 10) {
            array[i] = a % 10;
        }
        return array;
    }

    public static boolean checkForProgression(int a) {
        int[] array;
        array = splitNumberIntoDigits(a);
        boolean bigger = false;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                bigger = true;
            } else {
                bigger = false;
                break;
            }
        }
        return bigger;
    }

    public static int calcNumberToStartCountFrom(int n) {
        return (int) Math.pow(10, (-1 + n));
    }

    public static int calcNumberToStopCount(int n) {
        return calcNumberToStartCountFrom(n) * 10 - 1;
    }

    public static int[] checkNumbersWithDigitsProgression(int n) {
        int numberToStartFrom = calcNumberToStartCountFrom(n);
        int numberToStop = calcNumberToStopCount(n);
        int[] array = new int[numberToStop - numberToStartFrom];
        int count = 0;
        for (int i = numberToStartFrom; i < numberToStop; i++)
            if (checkForProgression(i)) {
                array[count] = i;
                count++;
            }
        return array;
    }

    public static void printNumbersWithDigitsProgression(int[] array, int n) {
        System.out.println("Numbers from " + calcNumberToStartCountFrom(n) + " to " + calcNumberToStopCount(n) + " are:");
        for (int j : array)
            if (j > 0)
                System.out.print(j + " ");
    }
}
