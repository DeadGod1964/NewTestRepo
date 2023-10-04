import java.util.Arrays;
import java.util.Scanner;

public class SwapArray {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(arr));
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        in.close();
        swap(arr, num1, num2);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
