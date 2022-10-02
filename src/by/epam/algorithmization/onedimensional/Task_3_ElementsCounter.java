package by.epam.algorithmization.onedimensional;

import java.util.Random;

public class Task_3_ElementsCounter {

    /*
     *  Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
     *  положительных и нулевых элементов.
     */

    public static void main(String[] args) {

        int arrayLength;
        double[] testArray;
        int positiveCounter;
        int negativeCounter;
        int zeroValueCounter;

        arrayLength = 50;
        testArray = new double[arrayLength];
        positiveCounter = 0;
        negativeCounter = 0;
        zeroValueCounter = 0;

        Random randomArrayValues = new Random();

        //dynamic array filling
        System.out.println("Array of real numbers: (lenght = " + arrayLength + " units)");
        for (int i = 1; i < testArray.length; i++) {
            testArray[i] = Math.ceil(randomArrayValues.nextDouble() * (10 - (-10)) + (-10));
        }

        //count
        for(double d :testArray){
            if (d > 0) {
                positiveCounter++;
            } else if (d < 0) {
                negativeCounter++;
            } else zeroValueCounter++;
            System.out.print(d + " ");
        }
        //print result
        System.out.println("\nPositive elements = " + positiveCounter + "\nNegative elements = "
                           + negativeCounter + "\nZero value = " + zeroValueCounter);
    }
}

