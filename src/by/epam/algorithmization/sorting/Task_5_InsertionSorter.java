package by.epam.algorithmization.sorting;

public class Task_5_InsertionSorter {

    /*
     *  Сортировка вставками.
     *  Дана последовательность чисел a1,a2,...an.
     *  Требуется переставить числа в порядке возрастания.
     *  Делается это следующим образом. Пусть a1,a2,...ai - упорядоченная последовательность,
     *  т.е. a1<=a2<=...<=an. Берется следующее число ai+1 и вставляется в последовательность так,
     *  чтобы новая последовательность была тоже возрастающей. Процесс производится до тех пор,
     *  пока все элементы от i+1 до n не будут перебраны. Примечание.
     *  Место помещения очередного элемента в отсортированную часть производить с помощью двоичного поиска.
     *  Двоичный поиск оформить в виде отдельной функции.
     */

    public static void main(String[] args) {

        int[] array = new int[]{9, 7, 7, 5, 4, 1};

        System.out.println("Unsorted Array");

        for (int elements : array) {
            System.out.print(elements + " ");
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                int unsortedElement = array[i];
                int j = i - 1;
                int start = 0;
                int end = i - 1;
                end = getAnIntBinary(array, unsortedElement, start, end);
                for (; j >= end + 1; j--) {
                    array[j + 1] = array[j];
                }
                array[end + 1] = unsortedElement;
            }

        }
        System.out.println();
        System.out.println("Sorted Array");
        for (int elements : array) {
            System.out.print(elements + " ");
        }

    }

    private static int getAnIntBinary(int[] array, int unsortedElement, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (unsortedElement < array[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
