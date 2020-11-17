package num_1_9;

import java.util.Scanner;

public class N5 {
    static void SUMM(int[] ar){
        double c = 0;
        double ch = 0;
        double one = -1.00;
        for(int i = 0; i<ar.length; i++){
            if (1000 <= ar[i] && ar[i] <= 9999) {
                c += ar[i];
                ch++;
            }
        }
        double otvet = c / ch;
        if(ch>0){
            System.out.printf("%.2f", otvet);
        } else if(ch == 0){
            System.out.printf("%.2f", one);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int v[] = new int[n];
         for(int i = 0; i<n; i++){
             v[i] = in.nextInt();
         }
         SUMM(v);
    }
}
