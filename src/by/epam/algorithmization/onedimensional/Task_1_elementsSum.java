package by.epam.algorithmization.onedimensional;

public class Task_1_elementsSum {

    /*
     *  В массив A [N] занесены натуральные числа.
     *  Найти сумму тех элементов, которые кратны данному К.
     */

    public static void main(String[] args) {

        int n;
        int k;
        int[] testArray;
        int Sum;

        n = 14;
        k = 3;
        testArray = new int[n];
        Sum = 0;

        System.out.println("Array of integers");
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = i + 1;
            System.out.print(testArray[i] + " ");
        }
        System.out.println("\nMultiples of " + k + " :");
        for (int i = 0; i < testArray.length; i++) {
            if ((i+1) % k == 0) {
                System.out.print((i+1) + " ");
                Sum = Sum + (i+1);
            }
        }
        System.out.println("\nSum of multiples: \n" + Sum);
    }
}