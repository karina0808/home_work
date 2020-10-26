package num_1_7_dop;

import java.util.Scanner;

public class n3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int ch = 0;
        int i =0;
        while(i < N){
            ch += 2;
            System.out.print(ch + " ");
            i++;
        }
    }
}