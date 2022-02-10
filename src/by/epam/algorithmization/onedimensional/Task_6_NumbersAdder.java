package by.epam.algorithmization.onedimensional;

public class Task_6_NumbersAdder {

    /*
     *  Задана последовательность N вещественных чисел.
     *  Вычислить сумму чисел, порядковые номера которых
     *  являются простыми числами.
     */

    public static void main(String[] args) {

        int arrayLength;
        double arrayNextNum;
        double[] testArray;
        double primeSumCount;

        arrayLength = 15;
        arrayNextNum = 0;
        testArray = new double[arrayLength];
        primeSumCount = 0;

        for (int i = 0; i < testArray.length; i++) {

            testArray[i] = arrayNextNum;
            arrayNextNum++;
            System.out.print(i + ") " + testArray[i] + "    ");
            if (indexCheck(i)) {

                primeSumCount += testArray[i];
                System.out.print("Is prime index");
            }
            System.out.println();
        }
        System.out.println("Sum of numbers with prime indices = " + primeSumCount);

    }

    public static boolean indexCheck(int x) {
        if (x < 2) return false;
        for (int j = 2; j <= x / 2; j++) {
            if (x % j == 0)
                return false;
        }
        return true;
    }
}