package num_1_9;

import java.util.Scanner;

public class n6 {
    static void f(int[] ar){
        int min = 1000;
        int f=0;
        for(int i = 0; i<ar.length; i++){
            if(ar[i] < min){
                min = ar[i];
            }
        }//нашли минимальное

        for(int i = 0; i<ar.length; i++){
            if(ar[i] == min){
                f++;
            }
        }// узнали сколько повторений минимальных есть

        int g[] = new int[ar.length-f];//массив длинной
        //входящего массива, не считая повторение
        for(int i = 0; i<ar.length; i++){
            if(ar[i] != min){
                g[i]= ar[i];
            }
        }
        System.out.print(min+" ");
        for(int i = 0; i<g.length; i++){
            System.out.print(g[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int v[] = new int[n];
        for(int i = 0; i<n; i++){
            v[i] = in.nextInt();
        }
        f(v);
    }
}
