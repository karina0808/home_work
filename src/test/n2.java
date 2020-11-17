package test;

import java.util.Scanner;

public class n2 {
    static int yy(int ch){
        int c = 0, s = 0;
        for (int i = 100; i < ch; i++) {
            if((i%10 + i/10 +i/10%10)%13==0){
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int e = yy(v);
        System.out.print(e);
    }
}
