import java.util.Scanner;

public class MaxValueArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        System.out.println(max(arr));
    }

    static int max(int[] arr){
        int maxvalue = arr[0];
        for(int i = 1; i< arr.length; i++){
            if(arr[i] > maxvalue){
                maxvalue = arr[i];
            }
        }
        return maxvalue;
    }
}
