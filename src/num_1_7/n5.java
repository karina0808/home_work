package num_1_7;
import java.util.Scanner;

public class n5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int c = 0;
        while (a != 0){
            a = a/2;
            c++;
        }
        System.out.print(c);
    }
}
