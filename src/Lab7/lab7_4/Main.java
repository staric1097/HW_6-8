package Lab7.lab7_4;

public class Main {
    public static void main(String[] args) {
        MathCalculable empt=new MathFunc();
        Complex c1=new Complex(-5.8, 8.3);
        System.out.println(empt.compAbs(c1));
        System.out.println(empt.MyPow(-2,-5));
        System.out.println(empt.circleL(5.3));
    }
}
