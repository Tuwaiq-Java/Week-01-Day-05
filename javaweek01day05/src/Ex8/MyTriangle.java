package Ex8;

public class MyTriangle {
    private MyPoint v1,v2,v3;

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public MyTriangle(int x1,int x2,int x3,int y1,int y2,int y3){
        this.v1 = new MyPoint(x1,y1);
        this.v2 = new MyPoint(x2,y2);
        this.v3 = new MyPoint(x3,y3);
    }

    public double getPerimeter() {
        int a = this.v1.getX() + this.v1.getY();
        int b = this.v2.getX() + this.v2.getY();
        int c = this.v3.getX() + this.v3.getY();
        return a + b + c;
    }

    public String getType() {
        int a = this.v1.distance();
        int b = this.v2.distance();
        int c = this.v3.distance();
        if (a == b && b == c)
            return "Equilateral";
        else if (a == b || b == c || a == c)
            return "Isosceles";
        else
            return "Scalene";
    }

    public String toString() {
        return String.format("MyTriangle[v1=%s,v2=%s,v3=%s]", v1,v2,v3);
    }

}
