package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b, su = 0;

        for(int i = 0; i<a; i++){
            b = in.nextInt();
            if(b!=0){
                System.out.print(b + " ");
            } else{
                su++;
            }
        }
        for(int i = 0; i<su; i++){
            System.out.print(0 + " ");
        }
    }
}