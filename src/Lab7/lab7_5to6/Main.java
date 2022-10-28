package Lab7.lab7_5to6;

public class Main {
    public static void main(String[] args) {
        StrOp s1=new ProcessStrings("hello world");
        StrOp s2=new ProcessStrings("123456789");
        System.out.println(s1.chPerSt());
        System.out.println(s1.invert());
        System.out.println(s1.oddStr());
        System.out.println(s2.chPerSt());
        System.out.println(s2.invert());
        System.out.println(s2.oddStr());
    }
}
