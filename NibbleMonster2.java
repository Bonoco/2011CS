/* Name: Ernesto Garcia
   CIN: 306774005
   Class: CS-2011-5 219

loop will keep asking for nibbles and will stop for anything else inputed but it will print before the while
*/
import java.util.Scanner;
public class NibbleMonster2{
   public static void main(String[]args){
    Scanner in = new Scanner(System.in);

     char nibble = 0;//the zero will not be allowed to run on the while loop

     do{
       System.out.println("FEED ME 10 FINGERED CREATURE! ");

       nibble = in.next().charAt(0);
       //it will read the input but will change before the while and will still be executed at least once
       if (Character.isLetter(nibble)){
       System.out.println("more please");
       }
       else {
         System.out.println("thanks i'm full.....bye");
       }
     }while((65<= nibble && nibble <= 90) || (97<= nibble && nibble <=122));

     in.close();

    }
 }
