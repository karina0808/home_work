package num_1_7_dop;

import java.util.Scanner;

public class n6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a;
        int k = 1;
        int n = 0, i = 0;
        a = in.nextInt();
        a = Math.abs(a);
        while (a / k > 0) {
            k *= 10;
            n++;
        }
        int v[] = new int[n];
        while (a != 0) {
            v[i] = a % 10;
            a = a/ 10;
            i++;
        }
        k = 0;
        for (int l = 1; l < n; l++) {
            if (v[l]== v[l-1]) {
                k++;
            }
        }
        if(k==0){
            System.out.print("NO");
        } else{
            System.out.print("YES");
        }
    }
}

