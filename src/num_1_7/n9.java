package num_1_7;

import java.util.Scanner;

public class n9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b, miin = 10;
        while (a != 0){
            b = a%10;
            if (b != 0 && b < miin){
                miin = b;
            }
            a = a/10;
        }
        System.out.println(miin);
    }
}