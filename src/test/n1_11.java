package test;

import java.util.Scanner;

public class n1_11 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int g[][] = new int[a][b];

        for(int i = 0; i<a; i++){
            for(int f = 0; f<b; f++){
                g[i][f] = in.nextInt();
            }
        }

        for(int i = 0; i<b; i++){
            for(int f = 0; f<a; f++){
                System.out.print(g[i][f]);
            }
            System.out.println();
        }
    }
}
