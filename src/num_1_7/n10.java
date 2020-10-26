package num_1_7;

import java.util.Scanner;

public class n10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = 0;
        if (n == 999){
            n = 1008;
        }
        while(k != 1){
            n++;
            if ((n%2!=0)&&(n%3!=0)&&(n%5!=0)&&(n%7!=0)){
                k = 1;
            }
        }
        System.out.println(n);
    }
}
