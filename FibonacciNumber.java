import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        int a = 0;
        int b = 1;
        int count = 2;

        while(count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }

        System.out.println(b);

        
    }
}
