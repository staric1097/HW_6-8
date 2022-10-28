package lab6.lab6_6to9;

public class Main {
    public static void main(String[] args) {
        Printable shop=new Shop("Cheap stuffs");
        Printable [] arr=new Printable[4];
        arr[0]=new Book("the hound of the baskervilles", 1901);
        arr[2]=new Book("The Man Who Was Thursday", 1908);
        arr[1]=new Journal("Car and Driver", 12, 2016);
        arr[3]=new Journal("National Review", 121, 2019);
        shop.Print();
        for (int i=0; i< arr.length; i++){
            arr[i].Print();
        }
        System.out.println("//////////////////////////////////");
        Book.printBooks(arr);
        System.out.println("//////////////////////////////////");
        Journal.printJournal(arr);
    }
}
