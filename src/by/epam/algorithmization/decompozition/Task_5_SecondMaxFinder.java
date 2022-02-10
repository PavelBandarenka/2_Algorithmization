package by.epam.algorithmization.decompozition;

public class Task_5_SecondMaxFinder {

    /*
     *  Составить программу, которая в массиве A[N] находит
     *  второе по величине число (вывести на печать число,
     *  которое меньше максимального элемента массива, но
     *  больше всех других элементов).
     */

    public static void main(String[] args) {

        int[] array = {111, 5, 30, 17, 30};

        System.out.println("Max element in array: " + findMaxElement(array));
        System.out.println("Penultimate element in array: " + findPenultimateElement(array));

    }

    public static int findPenultimateElement(int[] array) {
        int min = findMinElement(array);
        int max = findMaxElement(array);

        for (int i : array) {
            if (min < i && i < max)
                min = i;
        }
        return min;
    }

    public static int findMaxElement(int[] array) {
        int temp = 0;
        for (int i : array) {
            if (i > temp)
                temp = i;
        }
        return temp;
    }

    public static int findMinElement(int[] array) {
        int temp = array[0];
        for (int i : array) {
            if (i < temp) {
                temp = i;
            }
        }
        return temp;
    }
}