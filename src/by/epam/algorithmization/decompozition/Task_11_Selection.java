package by.epam.algorithmization.decompozition;

public class Task_11_Selection {

    /*
     *  Написать метод(методы), определяющий,
     *  в каком из данных двух чисел больше цифр.
     */

    public static void main(String[] args) {

        int a;
        int b;

        a = -556;
        b = 66;

        calculateTheBiggestNumber(a, b);
    }

    public static void calculateTheBiggestNumber(int a, int b) {
        int tempA = a;
        int tempB = b;
        int count = 0;
        if (a < 0) {
            a *= -1;
        }
        if (b < 0) {
            a *= -1;
        }

        for (; a > 0; a /= 10) {
            count++;
        }

        for (; b > 0; b /= 10) {
            count--;
        }
        if (count > 0) {
            System.out.println("There are more numbers in a = " + tempA + " > than in b = " + tempB);
        } else {
            System.out.println("There are more numbers in b = " + tempB + " > than in a = " + tempA);
        }
    }
}