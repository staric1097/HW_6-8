package lab6.lab6_1;

public class MovablePoint implements Movable {
    private int x,y, xSpeed, ySpeed;

    public MovablePoint() {
        this.x = 0;
        this.y = 0;
        this.xSpeed = 0;
        this.ySpeed = 0;
    }

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
        this.xSpeed = 0;
        this.ySpeed = 0;
    }

    @Override
    public void moveUp() {
        int tempY=this.y;
        this.showCurrentPos();
        while ((Math.abs(this.y-tempY))<10) {
            this.y++;
            this.ySpeed=10;
            this.showCurrentPos();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.ySpeed=0;
        this.showCurrentPos();
    }

    @Override
    public void moveDown() {
        int tempY=this.y;
        this.showCurrentPos();
        while ((Math.abs(this.y-tempY))<10) {
            this.y--;
            this.ySpeed=10;
            this.showCurrentPos();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.ySpeed=0;
        this.showCurrentPos();
    }

    @Override
    public void moveLeft() {
        int tempY=this.x;
        this.showCurrentPos();
        while ((Math.abs(this.x-tempY))<10) {
            this.x--;
            this.xSpeed=10;
            this.showCurrentPos();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.xSpeed=0;
        this.showCurrentPos();
    }

    @Override
    public void moveRight() {
        int tempY=this.x;
        this.showCurrentPos();
        while ((Math.abs(this.x-tempY))<10) {
            this.x++;
            this.xSpeed=10;
            this.showCurrentPos();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.xSpeed=0;
        this.showCurrentPos();
    }

    public void showCurrentPos(){
        System.out.printf("current coordinates of the object: (%d;%d)  current speed %d,%d ( abstract distance values per second)\n", x,y, xSpeed, ySpeed);
    }
}
