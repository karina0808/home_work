package num_1_8_dop;

import java.util.Scanner;

public class num_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a, i = 0, k = 0;
        a = in.nextInt();
        int[] b = new int[1000];
        int buf = a;
        while (a > 1) {
            b[i] = a % 2;
            i++;
            a /= 2;
        }
        for (int j = 0; j < i; j++) {
            System.out.print(b[j]);
        }
        System.out.print(a % 2 == 0 ? 0 : 1);
    }
}


