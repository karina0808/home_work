package num_1_8;

import java.util.Scanner;

public class num_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num = 0, max = 0, numMax = 0;
        int a[] = new int [n];

        for(int i=0;i<n;i++) {
            a[i]=s.nextInt();
        }
        for(int i = 0; i<n - 1; i++){
            for(int j = i+1; j<n; j++) {
                if (a[i] == a[j]) {
                    num++;
                }
                if (max<num){
                    max =num;
                    numMax =i;
                }
            }
        }
        System.out.println(numMax);
    }
}