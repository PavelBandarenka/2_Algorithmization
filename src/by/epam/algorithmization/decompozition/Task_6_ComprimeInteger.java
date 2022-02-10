package by.epam.algorithmization.decompozition;

public class Task_6_ComprimeInteger {

    /*
     *  Написать метод(методы), проверяющий,
     *  являются ли данные три числа взаимно простыми.
     */

    public static void main(String[] args) {

        int a;
        int b;
        int j;

        a = 12;
        b = 4;
        j = 1;

        System.out.println("Numbers: " + a + ", " + b + ", " + j);
        System.out.println(findGreatestCommonDivisor(a, b, j));

    }

    public static String findGreatestCommonDivisor(int a, int b, int j) {
        int[] array = {a, b, j};
        String printSolution = "are not relatively prime numbers";
        boolean relativelyPrimeNumbers = false;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (relativelyPrimeNumbers) {
                printSolution = "are relatively prime numbers";
                break;
            }
            i = count;
            if (count == array.length - 1) {
                break;
            }

            for (int z = Math.max(array[i], array[i + 1]); z > 0; z--) {
                if (array[i] % z == 0 && array[i + 1] % z == 0) {
                    if (z != 1) {
                        count++;
                        break;
                    } else {
                        relativelyPrimeNumbers = true;
                    }
                }
            }
        }
        return printSolution;
    }
}