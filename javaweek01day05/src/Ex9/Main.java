package Ex9;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4.3);
        System.out.println("circle.toString(): "+ circle);
        System.out.println("circle.getArea()(): "+circle.getArea());
        System.out.println("circle.getPerimeter()(): "+circle.getPerimeter());
        ResizeableCircle resizeableCircle = new ResizeableCircle(3.2);
        System.out.println();
        System.out.println("resizeableCircle.toString(): "+ resizeableCircle);
        System.out.println("resizeableCircle.getArea(): "+ resizeableCircle.getArea());
        System.out.println("resizeableCircle.getPerimeter(): "+ resizeableCircle.getPerimeter());
    }
}
