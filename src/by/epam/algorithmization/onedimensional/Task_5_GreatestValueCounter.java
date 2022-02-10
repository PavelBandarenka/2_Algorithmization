package by.epam.algorithmization.onedimensional;

import java.util.Random;

public class Task_5_GreatestValueCounter {

    /*
     *  Даны целые числа а1 ,а2 ,..., аn .
     *  Вывести на печать только те числа, для которых аi > i.
     */

    public static void main(String[] args) {

        int n;
        int[] testArray;

        n = 10;
        testArray = new int[n];

        Random randomArrayValues = new Random();

        System.out.println("ai |Digit|Result");

        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = randomArrayValues.nextInt(n);
            System.out.print(i + "   " + testArray[i] + " ");
            if (testArray[i] > i) {
                System.out.print(" print: " + testArray[i] + "; ");
            } else {
                System.out.print(" print: -");
            }
            System.out.println();
        }
    }
}
