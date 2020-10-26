package num_1_7_dop;

import java.util.Scanner;

public class n7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        if((a !=2 && a != 3 && a != 5 && a!= 7) && (a % 2 == 0 || a%3 ==0 || a%5==0 || a%7 ==0)){
            System.out.print("composite");
        } else{
            System.out.print("prime");
        }
    }
}
