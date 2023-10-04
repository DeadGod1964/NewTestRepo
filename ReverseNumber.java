import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.close();

        int rev = 0;

        while(num > 0){
            int rem = num % 10;
            num /= 10;
            rev = rem + (rev * 10);
        }

        System.out.println(rev);
      
    }
}
