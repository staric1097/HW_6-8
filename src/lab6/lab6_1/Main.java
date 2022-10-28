package lab6.lab6_1;

public class Main {
    public static void main(String[] args) {
        MovablePoint p1=new MovablePoint();
        p1.moveUp();
        p1.moveLeft();
        //p1.moveDown();
        //p1.moveRight();
        MovableCircle c1=new MovableCircle(5, p1);
        c1.moveDown();
        /*MovableCircle c2=new MovableCircle(0,0,5);
        c2.moveRight();
        MovablePoint c3=new MovableCircle(4,10,10);
        c3.moveLeft();*/
    }
}
