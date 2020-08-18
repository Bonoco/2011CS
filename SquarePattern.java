/* Name: Ernesto Garcia
   CIN: 306774005
   Class: CS-2011-5 219
it will print out the a (number X number) based on your number input.
*/
import java.util.Scanner;
public class SquarePattern{


  public static void main(String[]args){
    Scanner in = new Scanner(System.in);

    System.out.print("Enter a integer and a character: ");
    int num = in.nextInt();
    char word = in.next().charAt(0);
    System.out.println("");
    displayPattern(num, word);
  }
  public static void displayPattern(int n, char c){
    for(int i=0; i<n; i++){
      for(int m=0; m<n; m++){
        System.out.print(c + " ");
      }
    System.out.println();
   }
 }
}
