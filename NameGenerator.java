/* Ernesto Garcia
   306774005
   2011-6 219
  This program will print out 4 random letters and a name */
import java.util.Random;
public class NameGenerator{
 public static void main (String[]args){
   Random random = new Random();

   //int letterOne = (int)(9 + Math.random() * (17 - 9 + 1));
   int letterOne = (int)(65 + Math.random() * (90 - 65 + 1));
   int letterTwo = (int)(97 + Math.random() * (90 - 65 + 1));
   int letterThree = (int)(97 + Math.random() * (90 - 65 + 1));
   int letterFour = (int)(97 + Math.random() * (90 - 65 + 1));

   System.out.print((char)letterOne);
   System.out.print((char)letterTwo);
   System.out.print((char)letterThree);
   System.out.println((char)letterFour);



 }
}
