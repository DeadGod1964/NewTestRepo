import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int employID = in.nextInt();
        java.lang.String department = in.next();
        in.close();

        switch(employID){
            case 1:
                System.out.println("Sanidhya Singh Gaur");
                break;
            case 2:
                System.out.println("Tanmay Mishra");
                break;
            case 3:
                System.out.println("Shashank Krishu");
                switch(department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No Department Entered!");
                }
                break;
            default:
                System.out.println("Enter Correct EmployID!");
        }
    }
}
