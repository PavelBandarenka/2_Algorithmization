package by.epam.algorithmization.decompozition;

public class Task_2_FractionGCD {

    /*
     *  Написать метод(методы) для нахождения
     *  наибольшего общего делителя четырех натуральных чисел.
     */

    public static void main(String[] args) {

        int[] array = {4, 12, 16, 32};
        int firstTwoElementsGCD;
        int wholeArrayGreatestCommonDivisor;

        firstTwoElementsGCD = findGreatestCommonDivisorOfTwoElements(array);
        wholeArrayGreatestCommonDivisor = findWholeArrayGreatestCommonDivisor(array, firstTwoElementsGCD);

        System.out.println(wholeArrayGreatestCommonDivisor);
    }

    public static int findGreatestCommonDivisorOfTwoElements(int[] array) {
        int greatestCommonDivisor = 0;
        int maxElement = Math.max(array[0], array[1]);
        for (int i = maxElement; i > 0; i--) {
            if (array[0] % i == 0 && array[1] % i == 0) {
                greatestCommonDivisor = i;
                break;
            }
        }
        return greatestCommonDivisor;
    }

    public static int findWholeArrayGreatestCommonDivisor(int[] array, int firstTwoElementsGCD) {
        int arrayGCD = firstTwoElementsGCD;
        for (int i = 2; i < array.length; i++) {
            for (int j = array[i]; j > 0; j--) {
                if (array[i] % j == 0 && arrayGCD % j == 0) {
                    arrayGCD = j;
                    break;
                }
            }
        }
        return arrayGCD;
    }
}