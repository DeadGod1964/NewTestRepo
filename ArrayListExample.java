import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // list.add(6);
        // list.add(7);
        // list.add(8);
        // list.add(9);
        // list.add(10);
        // list.add(11);

        for(int i = 0; i < 5; i++){
            list.add(in.nextInt());
        }
        in.close();

        for(int i = 0; i < 5; i++){
            System.out.println(list.get(i));
        }

        System.out.println(list);
    }
}
