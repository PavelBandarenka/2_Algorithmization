package by.epam.algorithmization.onedimensional;

import java.util.Random;

public class Task_2_OccurrencesReplacer {

    /*
     *  Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
     *  числом. Подсчитать количество замен.
     */

    public static void main(String[] args) {


        int replacements;
        double z;
        double[] testArray;

        replacements = 0;
        z = 7;
        testArray = new double[15];

        Random randomArrayValues = new Random();

        System.out.println("Z = " + z);
        System.out.println("Sequence of real numbers: ");
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = Math.ceil(randomArrayValues.nextDouble() * (10 - 1) + 1);
            System.out.print(testArray[i] + ", ");

        }
        System.out.println("\nReplacements: ");
        for (int i = 0; i < testArray.length; i++) {
            if (testArray[i] > z) {
                testArray[i] = z;
                replacements++;
            }
        }

        for (double v : testArray) System.out.print(v + ", ");

        System.out.println("\nNumber of replacements:  " + replacements);
    }
}

