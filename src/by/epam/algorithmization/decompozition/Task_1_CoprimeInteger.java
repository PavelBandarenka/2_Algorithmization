package by.epam.algorithmization.decompozition;

public class Task_1_CoprimeInteger {

    /*
     *  Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
     *  натуральных чисел:                   A*B
     *                       ( НОК(А,В)=  --------- )
     *                                     НОД(A,B)
     */

    public static void main(String[] args) {

        int a;
        int b;
        int greatestCommonDivisor;
        int leastCommonMultiple;

        a = 8;
        b = 12;
        greatestCommonDivisor = findGreatestCommonDivisor(a, b);
        leastCommonMultiple = findLeastCommonMultiple(a, b, greatestCommonDivisor);

        System.out.println("Greatest Common Divisor: " + greatestCommonDivisor);
        System.out.println("Least Common Multiple: " + leastCommonMultiple);

    }

    public static int findGreatestCommonDivisor(int a, int b) {
        int greatestCommonDivisor = 0;
        int maxElement = Math.max(a, b);
        for (int i = maxElement; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                greatestCommonDivisor = i;
                break;
            }
        }
        return greatestCommonDivisor;
    }

    public static int findLeastCommonMultiple(int a, int b, int greatestCommonDivisor) {
        return (a * b) / greatestCommonDivisor;
    }
}

