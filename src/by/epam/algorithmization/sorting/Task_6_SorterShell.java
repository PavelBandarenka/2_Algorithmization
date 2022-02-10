package by.epam.algorithmization.sorting;

public class Task_6_SorterShell {

    /*
     *  Сортировка Шелла.
     *  Дан массив n действительных чисел.Требуется упорядочить его по возрастанию.
     *  Делается это следующим образом: сравниваются два соседних элемента ai и ai+1.
     *  Если ai<=ai+1, то продвигаются на один элемент вперед. Если ai>=ai+1,
     *  то производится перестановка и сдвигаются на один элемент назад.
     *  Составить алгоритм этой сортировки.
     */

    public static void main(String[] args) {

        int[] array = {9, 8, 5, 6, 4, 7, 1, 2, 3};

        System.out.println("Unsorted Array");

        Print(array);

        Shell(array);

        System.out.println("Sorted Array");

        Print(array);

    }

    public static void Shell(int[] array) {
        for (int i = 0; i < array.length - 1; ) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                if (i != 0) i--;
            } else if (array[i] < array[i + 1]) i++;
        }
    }

    public static void Print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
