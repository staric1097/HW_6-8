package lab6.lab6_6to9;

public class Shop implements Printable{
    private String shName;

    public Shop(String shName) {
        this.shName = shName;
    }

    @Override
    public void Print() {
        System.out.printf("Название магазин: '%s'\n", shName);
    }
}
