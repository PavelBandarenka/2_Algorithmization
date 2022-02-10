package by.epam.algorithmization.sorting;

public class Task_4_ExchangeSorter {

    /*
     *  Сортировка обменами.
     *  Дана последовательность чисел а1<=a2<=...<=an.Требуется переставить числа в
     *  порядке возрастания. Для этого сравниваются два соседних числа ai и ai+1.
     *  Если ai>ai+1, то делается перестановка. Так продолжается до тех пор,
     *  пока все элементы не станут расположены в порядке возрастания.
     *  Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
     */

    public static void main(String[] args) {

        int[] array = {9, 7, 7, 5, 4, 1};

        System.out.println("Unsorted Array");
        for (int elements : array) {
            System.out.print(elements + " ");
        }
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println("Sorted Array");
        for (int elements : array) {
            System.out.print(elements + " ");
        }
        System.out.println();
        System.out.print("shifts counter = " + count);
    }
}
