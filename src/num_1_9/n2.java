package num_1_9;

public class n2 {
    static int SUMM(int a){
        int s = a/10 + a%10;
        return s;
    }

    public static void main(String[] args) {
        int ch = 0;
        for(int i = 14; i<100; i+=7){
            ch += SUMM(i);
        }
        System.out.print(ch);
    }
}