package by.epam.algorithmization.decompozition;

public class Task_4_PlaneDivider {

    /*
     *  На плоскости заданы своими координатами n точек.
     *  Написать метод(методы), определяющие, между какими
     *  из пар точек самое большое расстояние.
     *  Указание. Координаты точек занести в массив.
     */

    public static void main(String[] args) {

        int[][] array = {{0, 0},
                         {3, 4},
                         {2, 22},
                         {1, 0},
                         {2, 6}};

        int[] theLongestSegmentCoordinates;

        theLongestSegmentCoordinates = findSegmentsCoordinates(array);

        System.out.println("theLongestSegmentCoordinates are:\n" + "A" + "(" + theLongestSegmentCoordinates[0] + ";"
                           + theLongestSegmentCoordinates[1] + ") " +
                           " B" + "(" + theLongestSegmentCoordinates[2] + ";"
                           + theLongestSegmentCoordinates[3] + ") ");

    }

    public static int[] findSegmentsCoordinates(int[][] array) {
        int pointCoordinateX1 = 0;
        int pointCoordinateY1 = 0;
        int pointCoordinateX2 = 0;
        int pointCoordinateY2 = 0;
        int segmentCoordinateX;
        int segmentCoordinateY;
        double segmentMaxLength = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {

                segmentCoordinateX = Math.abs(array[i][0] - array[j][0]); // x1 - x2
                segmentCoordinateY = Math.abs(array[i][1] - array[j][1]); // y1 - y2
                double segmentLength = Math.sqrt(segmentCoordinateX * segmentCoordinateX
                                                 + segmentCoordinateY * segmentCoordinateY);

                if (segmentLength > segmentMaxLength) {
                    segmentMaxLength = segmentLength;
                    pointCoordinateX1 = array[i][0];
                    pointCoordinateY1 = array[i][1];
                    pointCoordinateX2 = array[j][0];
                    pointCoordinateY2 = array[j][1];
                }
            }
        }
        return new int[]{pointCoordinateX1, pointCoordinateY1, pointCoordinateX2, pointCoordinateY2};

    }
}