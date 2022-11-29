import java.util.Scanner;

public class VoidReturn {

   public static void main(String args[]){
      int total = addnums();
      System.out.println("your total was: " + total);
   }

   public static int addnums(){
      System.out.println("we are going to add two numbers");
      System.out.println("please enter them below");

      Scanner scan = new Scanner(System.in);
      int num1 = scan.nextInt();
      int num2 = scan.nextInt();

      return (num1 + num2);





   }

}
