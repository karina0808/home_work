package num_1_8_dop;

import java.util.Scanner;

public class num_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = a * (a+1)/2; //сумма от 1 до а
        int v[] = new int[a];
        int sum = 0;
        for (int i = 0; i<a - 1; i++){
            v[i] = in.nextInt();
        }
        for(int i = 0; i<a; i++){
            sum += v[i]; // сумма введенных элементов
        }
        System.out.println(b - sum);
        // 1 2 3 4 5 6
    }
}
