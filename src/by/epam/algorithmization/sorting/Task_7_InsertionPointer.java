package by.epam.algorithmization.sorting;

public class Task_7_InsertionPointer {

    /*
     *  Пусть даны две неубывающие последовательности действительных чисел a1<=a2<=...an и b1<=b2<=...bm.
     *  Требуется указать те места, на которые нужно вставлять элементы последовательности b1<=b2<=...bm
     *  в первую последовательность так, чтобы новая последовательность оставалась возрастающей.
     */

    public static void main(String[] args) {

        double[] array1 = {3.2, 7.4, 11.4};
        double[] array2 = {4.9, 5.8, 12.4};

        Print(array1, "array1 :");
        Print(array2, "array2 :");

        elementsPositionIndicator(array1, array2);
    }

    private static void elementsPositionIndicator(double[] array1, double[] array2) {
        for (int i = 0; i < array2.length; i++) {
            boolean lastElementInArrayFlag = true;
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] < array1[j]) {
                    System.out.printf("%d элемент array2 вставим после %d элемента array1 \n", i, j);
                    lastElementInArrayFlag = false;
                    break;
                }
            }
            if (lastElementInArrayFlag)
                System.out.printf("%d элемент array2. вставим после последенго элем. array1\n", i);
        }
    }

    public static void Print(double[] array, String name) {
        System.out.print(name);
        for (double i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
