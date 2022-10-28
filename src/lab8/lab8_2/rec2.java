package lab8.lab8_2;

public class rec2 {
    public static String recursion(int n) {
        if (n==1) {
            return "1";
        }
        return recursion(n-1)+n;
    }
}
