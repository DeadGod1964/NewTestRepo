public class Loop {
    public static void main(String[] args) {
     
      for(int num1=1; num1<=5; num1+=1){
        System.out.println(num1);
      }
      
       int num2 = 1;
       while(num2 <= 5){
        System.out.println(num2);
        num2++;
       }

       int num3 = 1;
       do{
        System.out.println(num3);
        num3++;
       }while(num3 <=5);
    }
} 