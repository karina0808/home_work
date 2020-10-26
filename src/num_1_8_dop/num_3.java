package num_1_8_dop;

import java.util.Scanner;

public class num_3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int chh = in.nextInt();
        int st = 1, st2 = 1;
        int a[][] = new int[chh][chh];
        int b[][] = new int[chh][chh];

        for(int i = 0; i<chh; i++){
            for(int j = 0; j<chh; j++){
                a[i][j] = st;
                st +=1;
            }
        }
        for(int i = 0; i<chh; i++){
            for(int j = 0; j<chh; j++){
                b[j][i] = st2;
                st2 +=1;
            }
        }
        for (int n=0; n<chh; n++){
            if (a[n][n] == b[n][n]){
                System.out.print(a[n][n] + " ");
            }
        }
    }
}
