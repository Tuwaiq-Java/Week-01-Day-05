package Ex4Part1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Point2D point2D = new Point2D(4.0f,3.4f);
        System.out.println("toString(): " + point2D.toString());

        Point3D point3D = new Point3D(3.1f, 6.3f, 8.3f);
        System.out.println("toString(): " + point3D.toString());

        System.out.println("\n getXY: " + Arrays.toString(point2D.getXY()));
    }
}
