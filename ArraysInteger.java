import java.util.Scanner;

public class ArraysInteger {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        arr[0] = 00;
        arr[1] = 11;
        arr[2] = 22;
        arr[3] = 33;
        arr[4] = 44;
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        in.close();

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }

        for(int num : arr){
            System.out.println(num + " ");
        }
    }
}
