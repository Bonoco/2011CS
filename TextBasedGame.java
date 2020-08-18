/*

-this game would be able to roll the dice and see if your number is just as much, less, or more.
-If your dice is more, you won, if it's less. You lost.
...or gamble if the middle number of the dice matches your number.
*/
import java.util.Scanner;
public class TextBasedGame{
  public static void main(String[]args){
    if(args.length >= 0){
      System.out.println("You will simply enter a heart crushing thought such as exams and see what your fortune is.");
    }
    Scanner in = new Scanner(System.in);


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


      while (chance == 0){
        if ('Y'== decision || decision == 'y'){

          System.out.print("Enter \"final\" or \"midterm\": ");
          String choice = in.nextLine();

          if (choice.length() == 5
          && Character.isLetter(choice.charAt(0))
          && Character.isLetter(choice.charAt(1))
          && Character.isLetter(choice.charAt(2))
          && Character.isLetter(choice.charAt(3))
          && Character.isLetter(choice.charAt(4))){

     {
    if(choice.equals("final")){

      int number = (int) (1 + Math.random() * 4);
      switch (number){
        case 0: System.out.println("You'll be alright, man");
        break;
        case 1: System.out.println("It's in the bag, chief");
        break;
        case 2: System.out.println("See....I dont know how to say this...GoOd lUcK");
        break;
        case 3: System.out.println("Just try again G");
        break;
        case 4: System.out.println("Close...DON'T GIVE UP");
        break;
        default: System.out.println("You had a good run");
        break;

      }

    }

  //}
  else if(choice.length() == 8
            && Character.isLetter(choice.charAt(0))
            && Character.isLetter(choice.charAt(1))
            && Character.isLetter(choice.charAt(2))
            && Character.isLetter(choice.charAt(3))
            && Character.isLetter(choice.charAt(4))
            && Character.isLetter(choice.charAt(5))
            && Character.isLetter(choice.charAt(6))
            && Character.isLetter(choice.charAt(7))){



              if(choice.equals("final")){
                int number = (int) (1 + Math.random() * 4);
                switch (number){
                  case 0: System.out.println("You'll be alright, man");
                  break;
                  case 1: System.out.println("It's in the bag, chief");
                  break;
                  case 2: System.out.println("See....I dont know how to say this...GoOd lUcK");
                  break;
                  case 3: System.out.println("Just try again G");
                  break;
                  case 4: System.out.println("Close...DON'T GIVE UP");
                  break;
                  default: System.out.println("You had a good run");
                  break;
                }
              }


          }
        }
        else{
          System.out.println("ERROR: invalid input");
        }
          chance++;
          System.out.println();
      }
    else if (('N'== decision || decision == 'n')){
       System.out.println("...loser");
     }else if ((65<= decision && decision <= 90) || (97<= decision && decision <=122)){
       System.out.println("I sAiD pIcK \"Y\" oR \"N\" but ok, it looks like you do not want to play");
     }
   }
  }
 }
}
