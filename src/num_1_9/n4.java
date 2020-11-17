package num_1_9;

import java.util.Scanner;

public class n4 {
    static double chi(double x){
        x = x*2;
        System.out.print((int)x);
        x -= ((int)x);
        return x;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double v=in.nextDouble();
        int n = in.nextInt();
        for(int i = 0; i<n; i++){
            v = chi(v);
        }
    }
}