package by.epam.algorithmization.decompozition;

public class Task_8_SequenceAdder {

    /*
     *  Задан массив D. Определить следующие суммы:
     *  D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
     *  Пояснение. Составить метод(методы) для вычисления суммы
     *  трех последовательно расположенных элементов
     *  массива с номерами от k до m.
     */

    public static void main(String[] args) {

        int[] arrayD = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90};
        int[] arrayKM = {3, 4, 5};
        int[][] arrayDFetch;
        int[] arraySum;

        arrayDFetch = fetchingElementsFromD(arrayD, arrayKM);
        arraySum = (calculateSum(fetchingElementsFromD(arrayD, arrayKM)));

        printSolution(arrayDFetch, arraySum, arrayKM);

    }

    public static int[][] fetchingElementsFromD(int[] arrayD, int[] arrayKM) {
        int[][] array = new int[arrayKM.length][arrayKM.length];
        for (int i = 0; i < arrayKM.length; i++) {
            int count = 0;
            for (int j = 0; j < arrayKM.length; j++) {
                int temp = arrayKM[i];
                array[i][j] = arrayD[temp + count];
                count++;
            }
        }
        return array;
    }

    public static int[] calculateSum(int[][] array) {
        int[] array1 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array1[i] = array1[i] + array[i][j];
            }
        }
        return array1;
    }

    public static void printSolution(int[][] arrayDFetch, int[] arraySum, int[] arrayKM) {
        for (int i = 0; i < arrayDFetch.length; i++) {
            System.out.println();
            System.out.print("Sum D[k...m] : " + arraySum[i] +
                             "    array D from k=" + arrayKM[i] +
                             " to m=" + (arrayKM[i] + 2) + " elements numbers : ");
            {
                for (int j = 0; j < arrayDFetch.length; j++)
                    System.out.print(arrayDFetch[i][j] + " ");
            }
        }
    }
}