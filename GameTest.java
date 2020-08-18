/* Name: Ernesto Garcia
   CIN: 306774005
   Class: CS-2011-5 219

It will unravel the fortune of your exam score in the future (mark II unfinished)
It will only display the percentage
*/
import java.util.Scanner;
public class GameTest{
  public static void main(String[]args){
    Scanner in = new Scanner(System.in);

    if(args.length > 0){
      System.out.println("You will simply enter a heart crushing thought such as exams and see what your fortune is."
      + "\n Also you will enter if you would want a final or a midterm and this will tell your fortune. See your percentage"
      + "\n and see what prize will come along with it");
    }
    else {
    //Scanner in = new Scanner(System.in);


    int chance = 0;
    String titleDesign =   "+-----------------------------+\n"
                         + "|          CSULA'S            |\n"
                         + "|      FORTUNE SERVICE        |\n"
                         + "|                             |\n"
                         + "|copyright 2019 Ernesto Garcia|\n"
                         + "+-----------------------------+\n";

    System.out.println(titleDesign);
    System.out.println("Yes we get it, you're a college student. Wouldn't you like\n"
                      +"to know your own fortune for midterms or finals? \n");
    System.out.println("LET US BEGIN.....WOULD YOU LIKE TO CONTINUE? [Y/N]");
    char decision = in.next().charAt(0);

    if ('Y' == decision || decision == 'y'){
      System.out.println("Just what I expected from you.");
      System.out.println();
      System.out.print("Choose your destiny at your own discretion...");
      System.out.println();

          System.out.println("Await fate or play with. This is a trial for you to determine what you will get on your next exam"
          + "\nand perhaps and award with it\n");
          System.out.println("");
          String word = in.nextLine();
            int b = 1;
            int a = 1;
            int random = (int)(1 + Math.random()*100);
            if(a==1){
              System.out.println("");
              System.out.print("Exam Grade: ");
              a++;
            }
            System.out.println(random + "%....  oh my");

            if(b==1){
            int number = (int) ( Math.random() * 4);
            switch (number){
              case 0: System.out.println("your award....  extra credit!");
              break;
              case 1: System.out.println("your award....  an eraser...");
              break;
              case 2: System.out.println("your award....  some glasses to pay better attention to improve!");
              break;
              case 3: System.out.println("your award....  A pencil!");
              break;
              case 4: System.out.println("your award....  An extra sheet of paper");
              break;
              default: System.out.println("your award.... A backpack!");
              break;
            }
            b++;
          }
    }
    else if (('N'== decision || decision == 'n')){
       System.out.println("...loser");
     }else if ((65<= decision && decision <= 90) || (97<= decision && decision <=122)){
       System.out.println("I sAiD pIcK \"Y\" oR \"N\" but ok, it looks like you do not want to play");
     }
  }
  }
 }
