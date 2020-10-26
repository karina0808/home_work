package num_1_7;

import java.util.Scanner;

public class n8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b, miin = 10;
        while (a != 0){
            b = a%10;
            if (b % 2 != 0 && b < miin){
                miin = b;
            }
            a = a/10;
        }
        if (miin == 10){
            System.out.println("NO");
        } else {
            System.out.println(miin);
        }
    }
}
