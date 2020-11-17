package test;

import java.util.Scanner;

public class а {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int max = 0;
        int f=0;

        int n = in.nextInt();
        int ar[] = new int[n];

        for(int i = 0; i<n; i++){
            ar[i] = in.nextInt();
        }

        for(int i = 0; i<n; i++){
            if(ar[i] > max){
                max = ar[i];
            }
        }
        for(int i = 0; i<n; i++){
            if(ar[i] == max){
               f++;
            }
        }
        System.out.print(max +" " +f);
    }
}
