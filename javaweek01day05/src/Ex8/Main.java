package Ex8;

public class Main {
    public static void main(String[] args) {
        MyPoint myPoint = new MyPoint(3,2);
        MyPoint myPoint2 = new MyPoint(4,1);
        MyPoint myPoint3 = new MyPoint(7,2);

        MyTriangle myTriangle = new MyTriangle(myPoint,myPoint2,myPoint3);
        System.out.println("toString(): "+myTriangle);
        System.out.println("getType(): "+myTriangle.getType());
    }
}
