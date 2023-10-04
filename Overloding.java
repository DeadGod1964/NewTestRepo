public class Overloding {
    public static void main(String[] args) {
        
        fun(19);
        fun("Sanidhya");
    }


    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}
