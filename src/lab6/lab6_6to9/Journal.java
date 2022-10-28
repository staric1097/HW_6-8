package lab6.lab6_6to9;

public class Journal implements Printable {
    private String jName;
    private int serialNumber;
    private int yearOfPubl;

    public Journal(String jName, int serialNumber, int yearOfPubl) {
        this.jName = jName;
        this.serialNumber = serialNumber;
        this.yearOfPubl = yearOfPubl;
    }

    @Override
    public void Print() {
        System.out.printf("Название журнала: '%s', год издания:'%d', номер журнала в его серии:'%d'\n",jName, yearOfPubl,serialNumber);
    }

    static void printJournal(Printable[] printable) {
        for (int i = 0; i < printable.length; i++) {
            if (printable[i] instanceof Journal) {
                printable[i].Print();
            }
        }
    }
}
