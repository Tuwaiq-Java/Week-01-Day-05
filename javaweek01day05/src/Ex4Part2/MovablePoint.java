package Ex4Part2;

public class MovablePoint implements Movable{
    int x,y,xSpeed,ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        this.x += this.x * xSpeed;
    }

    @Override
    public void moveDown() {
        this.x -= this.x * xSpeed;
    }

    @Override
    public void moveLeft() {
        this.y -= this.y * ySpeed;
    }

    @Override
    public void moveRight() {
        this.y += this.y * ySpeed;
    }

    @Override
    public String toString() {

        String str = String.format("(%d,%d), speed=(%d,%d)", x,y,xSpeed,ySpeed);
        return str;
    }
}
