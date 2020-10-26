package num_1_7_dop;

import java.util.Scanner;

public class n5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int summ = 0;
        int c;

        while (a != 0){
            c = a % 10;
            summ += c;
            a = a / 10;
        }
        System.out.print(summ);
    }
}
