package by.epam.algorithmization.decompozition;

public class Task_3_GeometricFigures {

    /*
     *  Вычислить площадь правильного шестиугольника со стороной а,
     *  используя метод вычисления площади треугольника.
     */

    public static void main(String[] args) {

        double a;
        double areaOfTriangle;
        double areaOfHexagon;

        a = 4;
        areaOfTriangle = calculateAreaOfTriangle(a);
        areaOfHexagon = calculateAreaOfHexagon(areaOfTriangle);

        System.out.printf("Площадь треугольника: " + "%.2f \n", areaOfTriangle);
        System.out.printf("Площадь шестиугольника: " + "%.2f", areaOfHexagon);

    }

    public static double calculateAreaOfTriangle(double triangleSide) {
        return triangleSide * triangleSide * Math.sqrt(3) / 4;
    }

    public static double calculateAreaOfHexagon(double areaOfTriangle) {
        return 6 * areaOfTriangle;
    }
}
