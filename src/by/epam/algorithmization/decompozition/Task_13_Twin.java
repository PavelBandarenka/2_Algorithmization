package by.epam.algorithmization.decompozition;

import java.util.Arrays;

public class Task_13_Twin {

    /*
     *  Два простых числа называются «близнецами»,
     *  если они отличаются друг от друга на 2 (например, 41 и 43).
     *  Найти и напечатать все пары «близнецов» из отрезка [n,2n],
     *  где n - заданное натуральное число больше 2.
     *  Для решения задачи использовать декомпозицию.
     */

    public static void main(String[] args) {

        int y;
        int z;
        int[] array1;

        y = 14;
        z = 25;

        array1 = createArrayYZ(y, z);
        System.out.println(Arrays.toString(array1));

        printArrayBro(createArrayBro(array1, y, z));

    }

    public static int[] createArrayYZ(int y, int z) {
        int[] array = new int[z - y + 1];
        int count = y;
        for (int i = 0; i < (z - y + 1); i++) {
            if (y <= z) {
                array[i] = count;
                count++;
            }
        }
        return array;
    }

    public static int[] createArrayBro(int[] array, int y, int z) {
        int count = 0;
        int[] array1 = new int[(z - y - 1) * 2];
        for (int i = 0; i < array.length - 2; i++) {
            array1[count] = array[i];
            array1[count + 1] = array[i + 2];
            count = count + 2;
        }
        return array1;
    }

    public static void printArrayBro(int[] array) {
        System.out.println("Pairs of twins between " + array[0] + " and " + array[array.length - 1] + " are: ");
        for (int i = 0; i < array.length - 1; ) {
            System.out.print("[" + array[i] + "," + array[i + 1] + "] ");
            i = i + 2;
        }
    }
}
