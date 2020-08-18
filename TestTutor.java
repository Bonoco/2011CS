/*
Ernesto Garcia
306774005
2011-6 219
checks to see if it matches strings and values */
import java.util.Scanner;
import java.util.Random;
public class TestTutor{
 public static void main (String[]args){
   Scanner in = new Scanner(System.in);
   Random random = new Random();

   System.out.println("Type in the following: ");
   int letterOne = (int)(65 + Math.random() * (26));
   int letterTwo = (int)(97 + Math.random() * (26));
   int letterThree = (int)(97 + Math.random() * (26));
   int letterFour = (int)(97 + Math.random() * (26));

   String word = ("" + (char)letterOne + "" + (char)letterTwo + "" + (char)letterThree + "" + (char)letterFour);

   System.out.println(word);
   String input = in.nextLine();


   if (input.equals(word)){
     System.out.println("You got it!");
   }else if(input.equalsIgnoreCase(word)){
     System.out.println("Almost right, but mind the case next time.");
   }else{
     System.out.println("Wrong.");
   }



  }
}
