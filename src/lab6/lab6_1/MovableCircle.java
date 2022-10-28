package lab6.lab6_1;

public class  MovableCircle extends MovablePoint{

    private int radius;
    private MovablePoint centre;

    public MovableCircle(int x, int y, int radius) {
        this.radius = radius;
        this.centre =new MovablePoint(x,y);
    }

    public MovableCircle(int radius, MovablePoint centre) {
        this.radius = radius;
        this.centre = centre;
    }

    @Override
    public void moveUp() {
        this.centre.moveUp();
    }

    @Override
    public void moveDown() {
        this.centre.moveDown();
    }

    @Override
    public void moveLeft() {
        this.centre.moveLeft();
    }

    @Override
    public void moveRight() {
        this.centre.moveRight();
    }
}
