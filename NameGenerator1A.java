/* Name: Ernesto Garcia
   CIN: 306774005
   Class: CS-2011-5 219

it will print the random name and the amount of letters you tell it to. but with an opinion
*/
import java.util.Scanner;
public class NameGenerator1A{
  public static void main(String[]args){
    Scanner in = new Scanner(System.in);

    System.out.print("Enter the length of the name you want: ");

    int limit = in.nextInt();
    int i;
    int letter = (int)(65 + Math.random() * (90 - 65 + 1));
    int number = (int)(0 + Math.random() * 100);

    if(limit < 1){
      System.out.println("Must be at least one letter and must be a number for the length ");
    }else{
      for (i=1 ; i <= limit; i++){
      int letterOne = (int)(97 + Math.random() * (90 - 65 + 1));

      System.out.print((char)letterOne);
      System.out.println(" ");

   }

   if ((number > 20)){
     // int letterTwo = (int)(97 + Math.random() * (90 - 65 + 1));
     // String word = ("" + (char)letterTwo);

     System.out.println("hmmm " +  word  + " is not my best work ");
    }else{
    */  System.out.println("hmmm " +  word  + " has a nice ring to it ");
    }

   }
      System.out.println(" ");
  }
}
