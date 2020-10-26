package num_1_7_dop;

import java.util.Scanner;

public class n8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double a;
        double b;
        double v;
        a = in.nextDouble();
        b = in.nextDouble();
        a = Math.abs(a);
        //v = Math.pow(a, b);
        System.out.print(Math.pow(a, b));
    }
}
