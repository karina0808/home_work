package num_1_9;

import java.util.Scanner;

public class n3 {
    static int SUMM(int a){
        int s = 0;
        s = a%10 + a/100 + a/10%10;
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ch = 0;
        int a = in.nextInt();
        for(int i = 100; i<a; i++){
            if(SUMM(i)%13 == 0){
                ch++;
            }
        }
        System.out.print(ch);
    }
}