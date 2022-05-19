package Ex8;

public class MyPoint {

    private int x,y;


    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int distance() {
        return getY() + getX();
    }

    public String toString() {
        return String.format("(%d,%d)", x,y);
    }
}
