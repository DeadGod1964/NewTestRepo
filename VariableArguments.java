import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {
        fun(2, 3, 4, 5, 6, 7, 8, 9);
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
