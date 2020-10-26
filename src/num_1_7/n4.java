package num_1_7;
import java.util.Scanner;

public class n4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = 0;
        int e;
        while (a >= b){
            a = a - b;
            c+=1;
        }
        System.out.print(c + " " + a);
    }
}
