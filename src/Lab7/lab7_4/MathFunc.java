package Lab7.lab7_4;
import java.lang.Math;
public class MathFunc implements MathCalculable {

    @Override
    public double MyPow(double a ,double b) {
        double result=a;
        if (b>0) {
            for (int i = 0; i < b - 1; i++) {
                result *= a;
            }
        } else {
            for (int i = 0; i < Math.abs(b)+1; i++) {
                result *= 1/a;
            }
        }
        return result;
    }

    @Override
    public double compAbs(Complex c1) {
        return Math.sqrt(Math.pow(c1.getI(),2)+Math.pow(c1.getR(),2));
    }

    @Override
    public double circleL(double r) {
        if (r<=0){
            System.out.printf("err input\t");
            return  1;
        }
        return 2*PI*r;
    }
}
