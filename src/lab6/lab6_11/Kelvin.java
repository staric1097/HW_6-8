package lab6.lab6_11;

public class Kelvin implements Convertable{
    private double degreesK;

    @Override
    public void convert() {
        double degreesF, degreesC;
        degreesF=degreesK*1.8-459.67;
        degreesC=degreesK-273.15;
        System.out.printf("%s радусов по Кельвину равняются: %s градусам по Цельсию и %s по Фаренгейту\n",degreesK, degreesC, degreesF);
    }

    public Kelvin(double degreesK) {
        this.degreesK = degreesK;
    }
}
