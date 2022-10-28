package lab8.lab8_1;

public class rec1 {
    public static String recursion(int n){
        int chAm=0, temp=0;
        if (n==1) {
            System.out.print("1");
        }else{
            for (int i=0; chAm<n; i++){
                temp=i;
                chAm+=i;
            }
            System.out.print(recursion(n-1)+ temp);
        }
        return "";
    }
}
