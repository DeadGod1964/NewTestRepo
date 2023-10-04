import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        in.close();
        // if(num1>num2){
        //     if(num1>num3){
        //         System.out.println(num1 + " is the Largest number");
        //     }
        // }
        // if(num2>num1){
        //     if(num2>num3){
        //         System.out.println(num2 + " is the Largest number");
        //     }
        // }
        // if(num3>num1){
        //     if(num3>num2){
        //     System.out.println(num3 + " is the Largest number");
        //     }
        // }    

        // int max = num1;
        // if(num2>max){
        //     max = num2;
        // }
        // if(num3>max){
        //     max = num3;
        // }
        // System.out.println(max + " is the Largest number");

        System.out.println(Math.max(num3, (Math.max(num1, num2))) + " is the Largest number");
       
    }
}
