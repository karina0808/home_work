package num_1_7;

import java.util.Scanner;
public class n2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int summ = 0;
        int a = 1;
        while(a % 5 != 0){
            a = in.nextInt();
            if (a > 10){
                summ += a;
            }
        }
        System.out.print(summ);
    }
}
