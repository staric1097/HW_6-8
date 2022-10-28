package lab6.lab6_4;

public class Main {
    public static void main(String[] args) {
        Priceable comp1=new Computer(74999);
        Priceable car1=new Car(2498000);
        Car car2=new Car(869900);
        System.out.println(comp1.getPrice());
        System.out.println(car1.getPrice());
        System.out.println(car2.getPrice());
    }
}
