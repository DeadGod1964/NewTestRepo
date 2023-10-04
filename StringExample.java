import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = in.next();
        in.close();
        String name2 = myGreet(name);
        System.out.println(name2);
    }

    static String myGreet(String name){
        String message = "Hello " + name;
        return message;
    }
}
