package by.epam.algorithmization.onedimensional;

import java.util.Random;

public class Task_4_ElementsSwapper {

    /*
     *  Даны действительные числа а1 ,а2 ,..., аn .
     *  Поменять местами наибольший и наименьший элементы.
     */

    public static void main(String[] args) {

        int arrayLength;
        double[] testArray;
        double maxValue;
        double minValue;

        arrayLength = 9;
        testArray = new double[arrayLength];
        maxValue = 0;

        Random randomArrayValues = new Random();

        System.out.println("Sequence of real numbers: ");
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = Math.ceil(randomArrayValues.nextDouble() * (10 - 1) + 1);
            System.out.print(testArray[i] + " ");
        }

        for (double value : testArray) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        minValue = maxValue;
        for (double value : testArray) {
            if (value < minValue) {
                minValue = value;
            }
        }

        System.out.println("\nmaxValue = " + maxValue + "\nminValue = " + minValue + "\nAfter swap :");

        for (int i = 0; i < testArray.length; i++) {
            if (testArray[i] == maxValue) {
                testArray[i] = minValue;
            } else if (testArray[i] == minValue) {
                testArray[i] = maxValue;
            }
        }
        for (double v : testArray) System.out.print(v + " ");
    }
}