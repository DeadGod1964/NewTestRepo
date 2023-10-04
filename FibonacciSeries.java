import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        int i = 0;

        System.out.print(n1 + " " + n2);

        for(i = 2; i < n; ++i){
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
