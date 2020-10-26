package num_1_7;

import java.util.Scanner;

public class n1 {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int summ = 0;
        int a = 1;
        while (a>=0) {
            a = in.nextInt();
            summ += 1;
        }
        System.out.print(summ);
    }
}



