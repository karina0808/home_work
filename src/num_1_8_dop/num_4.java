package num_1_8_dop;

import java.util.Scanner;

public class num_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int res = 1;
        for(int i = 1; i<a+1; i++){
            res *= i;
        }
        System.out.print(res);
    }
}
