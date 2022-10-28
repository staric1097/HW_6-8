package lab6.lab6_11;

public class Celsius implements Convertable{
    private double degreesC;
    @Override
    public void convert() {
        double degreesK, degreesF;
        degreesK=degreesC+273.15;
        degreesF=degreesC*1.8+32;
        System.out.printf("%s радусов по Цельсию равняются: %s градусам по Фаренгейту и %s по Кельвину\n",degreesC, degreesF, degreesK);
    }

    public Celsius(double degreesC) {
        this.degreesC = degreesC;
    }
}
