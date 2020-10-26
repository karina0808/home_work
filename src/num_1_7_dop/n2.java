package num_1_7_dop;

import java.util.Scanner;

public class n2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int rez = 0, i = 0;
        if (a<0){
            a = (a) - (a) - (a);
            while(i < a){
                rez -= b;
                i++;
            }
            System.out.println(rez);
        } else if(b<0){
            b = (b) - (b) - (b);
            while(i < a){
                rez -= b;
                i++;
            }
            System.out.println(rez);
        } else{
            while(i < a){
                rez += b;
                i++;
            }
            System.out.println(rez);
        }
    }
}
