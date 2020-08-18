/* Name: Ernesto Garcia
   CIN: 306774005
   Class: CS-2011-5 219

it will print the random name and the amount of letters you tell it to.
*/
import java.util.Scanner;
public class NameGenerator1{
  public static void main(String[]args){
    Scanner in = new Scanner(System.in);

    System.out.print("Enter the length of the name you want: ");
    int limit = in.nextInt();
    int i;
    int letter = (int)(65 + Math.random() * (90 - 65 + 1));

    if(limit < 1 ){
      System.out.println("Must be at least one letter and must be a number for the length ");
    }else{
        System.out.print((char)letter);

    for (i=1 ; i < limit; ++i){
      int letterTwo = (int)(97 + Math.random() * (90 - 65 + 1));

      System.out.print((char)letterTwo);


     }
    }
System.out.println(" ");
  }
}
