package num_1_7_dop;

import java.util.Scanner;

public class n1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = 437;
        boolean isok = true;
        int k = 1;
        int N = in.nextInt();
        int b = 0;
        while (k <= N){
            b = in.nextInt();
            if(b<h){
                isok = false;
                System.out.print("Crash"+ " " + k);
                break;
            }
            k++;
        }
        if(isok){
            System.out.println("No crash");
        }
    }
}