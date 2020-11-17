package test;

import java.util.Scanner;

public class n1 {
    static void me(double[] a, char del){
        for(int i = 0; i<a.length; i++){
            a[i] = Math.random()*10;
            if(i==0){
                System.out.print(a[i]); }
            System.out.print(del + " " +a[i]);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] e = new double[10];
        me(e, ',');
    }
}
