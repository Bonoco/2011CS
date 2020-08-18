/* Name: Ernesto Garcia
   CIN: 306774005
   Class: CS-2011-5 219

it will print the amount of dice you tell it
*/
import java.util.Scanner;
public class NDice{
  public static void main(String[]args){
    Scanner in = new Scanner(System.in);

    int i;
    int a = 1;
    System.out.print("How many dice would you like to roll? ");
    int number = in.nextInt();

    for(i=1; i <= number; ++i){
      int random = (int)(1 + Math.random()*6);
      String space = " ";
      if(a==1){
        System.out.println("");
        System.out.print("Dice rolled: ");
       a++;
      }
      System.out.print(space + random);


    }
       System.out.println(" ");
  }
}
