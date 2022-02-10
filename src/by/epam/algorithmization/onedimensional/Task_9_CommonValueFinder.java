package by.epam.algorithmization.onedimensional;

import java.util.Random;

public class Task_9_CommonValueFinder {

    /*
     *  В массиве целых чисел с количеством элементов n
     *  найти наиболее часто встречающееся число. Если таких
     *  чисел несколько, то определить наименьшее из них.
     */

    public static void main(String[] args) {

        int arrayLength;
        int maxArrayNum;
        int[] testArray;
        int MostCommonDigitCounter;
        int tempCounter;
        int arrayIndex;

        arrayLength = 15;
        maxArrayNum = 10;
        testArray = new int[arrayLength];
        int[] mostCommonDigitsArray;

        Random randomArrayValues = new Random();

        System.out.println("Array of Integers :");
        for (int i = 0; i < arrayLength; i++) {
            testArray[i] = randomArrayValues.nextInt(maxArrayNum);
            System.out.print(testArray[i] + " ");
        }
        System.out.println();

        mostCommonDigitsArray = new int[arrayLength];
        MostCommonDigitCounter = 0;
        tempCounter = 0;
        arrayIndex = 0;

        for (int value : testArray) {
            for (int i : testArray) {
                if (value == i)
                    MostCommonDigitCounter++;
            }
            if (MostCommonDigitCounter > tempCounter) {
                tempCounter = MostCommonDigitCounter;
                mostCommonDigitsArray[arrayIndex] = value;

            }
            MostCommonDigitCounter = 0;
        }
        // Looking for another most common digits

        for (int value : testArray) {
            for (int i : testArray) {
                if (value == i) {
                    MostCommonDigitCounter++;
                }
            }
            if (MostCommonDigitCounter == tempCounter) {
                int sameDigits = 0;
                for (int k = 0; k <= arrayIndex; k++) {
                    if (mostCommonDigitsArray[k] == value) {
                        sameDigits++;
                    }
                }
                if (sameDigits == 0) {
                    arrayIndex++;
                    mostCommonDigitsArray[arrayIndex] = value;
                }
            }
            MostCommonDigitCounter = 0;
        }

        System.out.println("Most common digits :");
        for (int i = 0; i <= arrayIndex; i++) {
            System.out.print(mostCommonDigitsArray[i] + " ");
        }

        //Search and print most common digits lowest value
        System.out.println();
        System.out.println("Most common digits smallest number :");
        int minValue = mostCommonDigitsArray[0];
        for (int k = 0; k <= arrayIndex; k++) {
            if (mostCommonDigitsArray[k] < minValue) {
                minValue = mostCommonDigitsArray[k];
            }
        }
        System.out.println(minValue);
    }
}
