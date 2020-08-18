/* Name: Ernesto Garcia
   CIN: 306774005
   Class: CS-2011-5 219

feed the program until it gets full....
(must be nice to eat whenever )-: )
*/
import java.util.Scanner;
public class NibbleMonster3{
   public static void main(String[]args){
     Scanner in = new Scanner(System.in);
     System.out.println("feed me until i'm full please!");

     char num = in.next().charAt(0);

     int plate = (int)(1 + Math.random() * 12);
     int bowl = (int)(1 + Math.random() * 3);

 while (plate >= 0){

 if((65<= num && num <= 90) || (97<= num && num <=122)) {
 plate = plate - 1;
 System.out.println("More!");
 num = in.next().charAt(0);

 }else if ((32<= num && num <= 64) || (91 <= num && num <= 96) || (123<= num && num <=127)){
   plate = plate + bowl;
   System.out.println("oh...cut back on that please");
   num = in.next().charAt(0);

 }

   }
    System.out.println("[bburp]...thanks");
   }
 }
