package lab6.lab6_11;

public class Main {
    public static void main(String[] args) {
        Convertable c1=new Celsius(100);
        Convertable f1=new Fahrenheit(-15);
        Convertable k1=new Kelvin(310);
        /*c1.convert();
        f1.convert();
        k1.convert();*/
        Convertable c2=new Celsius(5);
        c1.convert();
    }
}
