/* Name: Ernesto Garcia
   CIN: 306774005
   Class: CS-2011-5 219

loop will keep asking for nibbles and will stop for anything else inputed
*/
import java.util.Scanner;
public class NibbleMonster1{
   public static void main(String[]args){
    Scanner in = new Scanner(System.in);

     System.out.println("FEED ME 10 FINGERED CREATURE! ");
     char nibble = 90;

     while ((65<= nibble && nibble <= 90) || (97<= nibble && nibble <=122)){
     nibble = in.next().charAt(0);

     if (Character.isLetter(nibble)){
       System.out.println("more please!");
     }else {
       System.out.println("thanks i'm full.....bye");
      }

     }

     in.close();

   }
}
