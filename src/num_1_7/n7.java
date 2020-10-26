package num_1_7;

import java.util.Scanner;

public class n7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int rez = 0;
        while (a != 0){
            a = a/10;
            rez++;
        }
        System.out.print(rez);
    }
}