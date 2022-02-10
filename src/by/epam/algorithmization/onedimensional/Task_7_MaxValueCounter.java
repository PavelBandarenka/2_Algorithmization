package by.epam.algorithmization.onedimensional;

public class Task_7_MaxValueCounter {

    /*
     *  Даны действительные числа a1, a2, ... , an.
     *  Найти max (a1+a2n, a2 + a2n-1, ... , an + an+1).
     */

    public static void main(String[] args) {

        int arrayLength;
        double max;
        double[] testArray;

        arrayLength = 6;
        max = 0;
        testArray = new double[arrayLength];

        System.out.println("Real numbers: ");
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = i + 1;
            System.out.print(testArray[i] + " ");
        }

        System.out.print("...");
        System.out.println("\nSequence of real numbers: ");

        for (int j = 0; j < testArray.length - 1; j++) {
            double v = testArray[j] + testArray[j + 1];
            if (v > max){
                max = v;
                }
            System.out.print(testArray[j] + "+" + testArray[j + 1] + ", ");
        }
        System.out.println("...\nmax =" + max);
    }
}