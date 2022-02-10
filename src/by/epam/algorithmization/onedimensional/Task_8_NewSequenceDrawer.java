package by.epam.algorithmization.onedimensional;

import java.util.Random;

public class Task_8_NewSequenceDrawer {

    /*
     *  Дана последовательность целых чисел a1,a2,...,an.
     *  Образовать новую последовательность, выбросив из
     *  исходной те члены, которые равны min(a1,a2,...,an).
     */

    public static void main(String[] args) {

        int arrayLength;
        int maxArrayNum;
        int[] testArray;
        int[] targetArray;
        int targetArrayIndex;

        arrayLength = 15;
        maxArrayNum = 10;
        testArray = new int[arrayLength];
        targetArrayIndex = 0;

        Random randomArrayValues = new Random();

        int minValue = maxArrayNum;
        int minValueCounter = 0;
        System.out.println("Sequence of integers: ");

        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = randomArrayValues.nextInt(10);
            System.out.print(" " + testArray[i]);
            if (testArray[i] <= minValue) {
                minValue = testArray[i];
            }
        }
        System.out.println("\nSmallest number in sequence : " + minValue);

        for (int value : testArray) {
            if (value == minValue) {
                minValueCounter++;
            }
        }
        System.out.println("Amount : " + minValueCounter);
        System.out.println("Result :");

        targetArray = new int[testArray.length - minValueCounter];
        for (int j : testArray) {
            if (j != minValue) {
                targetArray[targetArrayIndex] = j;
                System.out.print(" " + targetArray[targetArrayIndex]);
                targetArrayIndex++;
            }
        }
    }
}
