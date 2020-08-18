/* Name: Ernesto Garcia
   CIN: 306774005
   Class: CS-2011-5 219

feed the monster a word, lowercase or not and see what it spits out!
you can also input a number/digit
*/

import java.util.Scanner;
public class NibbleMonster{
   public static void main(String[]args){
    Scanner in = new Scanner(System.in);

    System.out.println("FEED ME 10 FINGERED CREATURE! ");
    char nibble = in.next().charAt(0);

    if (Character.isDigit( nibble )){
      System.out.println("nom nom nom");
    }else if ((Character.isUpperCase(nibble)) && (nibble < 'G')){
      System.out.println("YUM!");
    }else if ((Character.isLowerCase(nibble)) && (nibble < 'g')){
      System.out.println("yum!");
    }else {
      System.out.println("why....WHYYYYYY WOULD YOU FEED ME THIS, SIMPLETON");
    }

    in.close();

   }
}
