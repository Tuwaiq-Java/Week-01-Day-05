package Ex4Part2;

public class Main {

    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(4,2,6,4);
        System.out.println("toString(): "+movablePoint);
        movablePoint.moveUp();
        System.out.println("After moveUp(): "+movablePoint);

        MovableCircle movableCircle = new MovableCircle(4, movablePoint);
        System.out.println("toString(): "+movableCircle);
        movableCircle.moveUp();
        System.out.println("After moveUp(): "+movableCircle);

    }
}
