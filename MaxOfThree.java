import java.util.Scanner;
 public class MaxOfThree{
   public static void main(String[]args){
     Scanner in = new Scanner(System.in);

     System.out.println("input three numbers: ");
     int num1 = in.nextInt();
     int num2 = in.nextInt();
     int num3 = in.nextInt();

     if((num1 >= num2) && (num1 >= num3)){
       System.out.println("max is: " + num1 );
      }else if(num2 >= num3){
       System.out.println("max is: " + num2 );
        }else{
          System.out.println("max is: " + num3);
          }

   }

 }
