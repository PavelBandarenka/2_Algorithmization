package by.epam.algorithmization.sorting;

public class Task_3_SelectionSorter {

    /*
     *  Сортировка выбором.
     *  Дана последовательность чисел a1<=a2<=...<=an.
     *  Требуется переставить элементы так, чтобы они были расположены по убыванию.
     *  Для этого в массиве, начиная с первого, выбирается наибольший элемент
     *  и ставится на первое место, а первый - на место наибольшего.
     *  Затем, начиная со второго, эта процедура повторяется.
     *  Написать алгоритм сортировки выбором.
     */

    public static void main(String[] args) {

        int[] array = {2, 4, 5, 5, 7, 9};

        for (int elements : array) {
            System.out.print(elements + " ");
        }

        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int maxIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    maxIndex = j;
                }
            }
            if (i != maxIndex) {
                int temp = array[i];
                array[i] = array[maxIndex];
                array[maxIndex] = temp;
            }
        }
        System.out.println();
        for (int elements : array)
            System.out.print(elements + " ");
    }
}
