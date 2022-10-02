package by.epam.algorithmization.onedimensional;

public class Task_1_elementsSum {

    /*
     *  В массив A [N] занесены натуральные числа.
     *  Найти сумму тех элементов, которые кратны данному К.
     */

    public static void main(String[] args) {

        int naturalNumberQuantity;
        int k;
        int[] arrayA;
        int naturalNumbersSum;

        naturalNumberQuantity = 14;
        k = 3;
        arrayA = new int[naturalNumberQuantity];
        naturalNumbersSum = 0;

        System.out.println("Array of integers");
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = i + 1;
            System.out.print(arrayA[i] + " ");
        }

        System.out.println("\nMultiples of " + k + " :");
        for (int i = 0; i < arrayA.length; i++) {
            if ((i+1) % k == 0) {
                System.out.print((i+1) + " ");
                naturalNumbersSum = naturalNumbersSum + (i+1);
            }
        }
        System.out.println("\nnaturalNumbersSum of multiples: \n" + naturalNumbersSum);
    }
}