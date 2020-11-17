package test;

import java.util.Scanner;

public class snake {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();//4
        int m = in.nextInt();//5
        int k = 0;
        int[][] mat = new int[n][m];

        for(int i = 0; i<n; i++){
            if(i%2==0){
                for(int j = 0; j<m; j++){
                    mat[i][j] =k;
                    k++;
                }
            } else{
                for(int j= m-1; j>=0; j--){
                    mat[i][j] = k;
                    k++;
                }
            }
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
