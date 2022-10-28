package lab8.lab8_17;

import java.util.Arrays;
import java.util.Scanner;

public class Rec17 {
    public static int returnCorrectInput(){
        Scanner sc=new Scanner(System.in);
        Mark1:
        while (true){
            if (sc.hasNextInt()){
                int s=sc.nextInt();
                if (s<0){
                    System.out.println("input err");
                    continue Mark1;
                }
                if (s==0){break;}
                return s;
            } else{
                System.out.println("input err");
                sc.next();
            }
        }
        return 0;
    }
    public static int recursion(){
        int s=returnCorrectInput();
        if (s==0){
            return 0;
        }
        return Math.max(s, recursion());
    }
}
