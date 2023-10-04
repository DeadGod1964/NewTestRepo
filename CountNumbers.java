import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        long num = in.nextInt();
        long num2 = in.nextInt();
        in.close();

        int count = 0;
        
        while(num > 0){
            Long rem = num % 10;
            if(rem == num2){
                count++;
            } 
            num = num / 10;
        }
        System.out.println(count);
    }
}
