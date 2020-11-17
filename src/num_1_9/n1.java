package num_1_9;

import java.util.Scanner;

public class n1 {
    static int SUMM(int a){
        int su = 0;
        while(a!=0){
            su += a%10;
            a/=10;
        }
        return su;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ch = in.nextInt();
        System.out.print(SUMM(ch));
    }
}
