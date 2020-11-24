package num_2_1_2;

import java.util.Scanner;

public class n2_1_2 {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toOctalString(a));
        System.out.println(Integer.toHexString(a));
        if (a>=-128 && a<=127){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }//SHort
        if (a>0 && a<=255){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }//BYte
    }
}

