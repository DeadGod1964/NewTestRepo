import java.util.Scanner;

public class SwitchFruits {
    public static void main(String[] args) {
     
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        in.close();

        switch(fruit){
            case "Mango":
                System.out.println("King of Fruits");
                break;
            case "Apple":
                System.out.println("A sweent red fruit");
                break;
            case "Orange":
                System.out.println("Round fruit");
                break;
            case "Grapes":
                System.out.println("A small fruit");
                break;
            
            default:
                System.out.println("Please enter a valid fruit!");
        }

        // int day = in.nextInt();
        // in.close();

        // switch(day){
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("Wednesday");
        //     case 4 -> System.out.println("Thursday");
        //     case 5 -> System.out.println("Friday");
        //     case 6 -> System.out.println("Saturday");
        //     case 7 -> System.out.println("Sunday");
        // }
    }
}
