/* Name: Ernesto Garcia
   CIN: 306774005
   Class: CS-2011-5 219
It will print out a range with PerfectSquares from the input
*/
import java.util.Scanner;
public class PerfectSquares{
 public static void main(String[]args){
   Scanner in = new Scanner(System.in);

   System.out.print("Enter a range: ");
   int start = in.nextInt();
   int end = in.nextInt();
   printSquaresInRange(start, end);

   if(start>end){//checks to see if range will work
     System.out.println("Invalid range");
   }
   System.out.println(" ");

 }
 public static void isPerfectSquare(int n){
   int numSquared = (int) Math.sqrt(n);
    if (numSquared*numSquared==n){
      System.out.print(n + " ");
    }

 }//creates the range that was inputted
 public static void printSquaresInRange(int begin, int end){
   for ( int i=begin; i<=end; i++){
     // for (int m=1; m*m<=1; m++){
     // }
     isPerfectSquare(i);
   }

 }
}
