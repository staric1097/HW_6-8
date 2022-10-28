package lab6.lab6_6to9;

public class Book implements Printable{
    private String name;
    private int publYear;

    public Book(String name, int publYear) {
        this.name = name;
        this.publYear = publYear;
    }

    @Override
    public void Print() {
        System.out.printf("Название книги '%s', год публикации '%d'\n", name, publYear);
    }

    static void printBooks(Printable[] printable){
        for (int i=0; i<printable.length; i++){
            if (printable[i] instanceof Book) {
                printable[i].Print();
            }
        }
    }
}
