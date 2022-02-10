package by.epam.algorithmization.decompozition;

public class Task_9_Quadliteral {

    /*
     *  Даны числа X, Y, Z, Т — длины сторон четырехугольника.
     *  Написать метод(методы) вычисления его площади,
     *  если угол между сторонами длиной X и Y— прямой.
     */

    public static void main(String[] args) {

        int x;
        int y;
        int z;
        int t;

        x = 26;
        y = 30;
        z = 90;
        t = 96;

        checkQuadrilateralExistence(x, y, z, t);

        System.out.printf("%.2f", quadrilateralArea(x, y, z, t));
    }

    public static double quadrilateralArea(double x, double y, double z, double t) {
        double firstTriangleArea = x * y / 2;
        double firstTriangleHypotenuse = Math.sqrt(x * x + y * y);
        double p = (z + t + firstTriangleHypotenuse) / 2;
        double secondTriangleArea = Math.sqrt(p * (p - z) * (p - t) * (p - firstTriangleHypotenuse));
        return firstTriangleArea + secondTriangleArea;
    }

    public static void checkQuadrilateralExistence(double x, double y, double z, double t) {
        double h = Math.sqrt(x * x + y * y);
        if (x > 0 && y > 0 && z > 0 && t > 0) {
            if ((z < h + t) && (h < z + t) && (t < z + h)) {
                System.out.println("Quadrilateral area is : ");
            } else {
                System.out.println("Quadrilateral does not exist ");
            }
        } else {
            System.out.println("Quadrilateral does not exist ");
        }
    }
}
