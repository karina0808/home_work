package test;

import java.util.Scanner;

public class n4 {
    static void writeArray(int[] arr){
        Scanner in = new Scanner(System.in);
        for(int i = 0; i <= arr.length; i++){
            arr[i] = in.nextInt();
            System.out.print("Значение массива: " + arr[i]);
        }
    }

    public static void main(String[] args) {
        int a[] = new int[4];
        writeArray(a);
    }
}