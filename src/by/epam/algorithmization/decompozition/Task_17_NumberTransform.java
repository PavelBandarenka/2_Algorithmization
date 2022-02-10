package by.epam.algorithmization.decompozition;

public class Task_17_NumberTransform {

    /*
     *  Из заданного числа вычли сумму его цифр.
     *  Из результата вновь вычли сумму его цифр и т.д.
     *  Сколько таких действий надо произвести,
     *  чтобы получился нуль? Для решения задачи использовать декомпозицию.
     */

    public static void main(String[] args) {

        int a;

        a = 78;

        printSubtractionsQuantity(a);
    }

    public static void printSubtractionsQuantity(int a) {
        System.out.println("For number a = " + a + " we need subtract " + calcSubtractionIteration(a) + " times to come to zero ");
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

    public static int calcDigitSumSubtractionFromNumber(int[] array, int a) {
        int sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        a = a - sum;
        return a;
    }

    public static int calcSubtractionIteration(int a) {
        int subtraction = calcDigitSumSubtractionFromNumber(splitNumberIntoDigits(a), a);
        int count = 0;
        int temp;
        while (a > 0) {
            temp = a - subtraction;
            a = a - temp;
            subtraction = calcDigitSumSubtractionFromNumber(splitNumberIntoDigits(a), a);
            count++;
        }
        return count;
    }
}
