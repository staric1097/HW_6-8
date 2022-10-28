package lab6.lab6_11;

public class Fahrenheit implements Convertable {
    private double degreesF;

    @Override
    public void convert() {
        double degreesK, degreesC;
        degreesK=(degreesF+459.67)/1.8;
        degreesC=(degreesF-32)/1.8;
        System.out.printf("%s радусов по Фаренгейту равняются: %s градусам по Цельсию и %s по Кельвину\n",degreesF, degreesC, degreesK);
    }

    public Fahrenheit(double degreesF) {
        this.degreesF = degreesF;
    }
}
