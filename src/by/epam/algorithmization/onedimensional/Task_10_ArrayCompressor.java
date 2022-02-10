package by.epam.algorithmization.onedimensional;

import java.util.Random;

public class Task_10_ArrayCompressor {

    /*
     *  Дан целочисленный массив с количеством элементов п.
     *  Сжать массив, выбросив из него каждый второй элемент
     *  (освободившиеся элементы заполнить нулями).
     *  Примечание. Дополнительный массив не использовать.
     */

    public static void main(String[] args) {

        int arrayLength;
        int maxArrayNum;
        int[] testArray;
        int counter;

        arrayLength = 15;
        maxArrayNum = 10;
        testArray = new int[arrayLength];

        Random randomArrayValues = new Random();

        System.out.println("Array of Integers :");
        for (int i = 0; i < arrayLength; i++) {
            testArray[i] = randomArrayValues.nextInt(maxArrayNum);
            System.out.print(testArray[i] + " ");
        }
        System.out.println();

        //Shrink and fill with zeros
        counter = 0;
        for (int i = 0; i < (arrayLength + 1) / 2; i++) {
            testArray[i] = testArray[i * 2];
            counter++;
            if (counter == (arrayLength + 1) / 2) {
                for (int j = counter; j < arrayLength; j++) {
                    testArray[j] = 0;
                }
            }
        }
        // Printing result
        System.out.println("Result :");
        for (int j : testArray) System.out.print(j + " ");
    }
}
