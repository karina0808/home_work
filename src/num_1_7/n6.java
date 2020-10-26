package num_1_7;
import java.util.Scanner;

public class n6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int i = 25, summ = 0;
        while (i < a){
            if (i % 2 == 0){
                summ += i;
            }
            i++;
        }
        System.out.print(summ);
    }
}