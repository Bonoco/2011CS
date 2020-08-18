/* Name: Ernesto Garcia
   CIN: 306774005
   Class: CS-2011-5 219

A game will challenge you with dice. A gambling game designed to destroy student's lives
*/
import java.util.Scanner;
public class GameOfChance{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);

        int round;
        int computer = 0;
        int player = 0;
        int compNum;
        int playerNum = 0;

        System.out.println("");
        System.out.println("Hello You! Let's see which one of us"
            +"\nthe gods of pseudorandomness favor...");                  //layout and body of the game
        System.out.println("");
        System.out.println("Press 'Enter' whenever you are"
            +"\nready to roll the virtual die.");
        System.out.println("");
        System.out.print("                     S C O R E          \n"
                        +"                      me : you          \n");
        System.out.print("                       " + computer + " : " + player);
        System.out.println("");
        String enter = input.nextLine();

        for(round = 1; round <= 3; round++){//controls the amount of rounds
          compNum = (int)(1 + Math.random() *(6));
          playerNum = (int)(1 + Math.random() *(6));
          System.out.println("-------------------------------------------------");
          System.out.println("                      Round " + round);
          System.out.println("I rolled: " + compNum);
          System.out.print("Your turn: ");
          enter = input.nextLine();
          System.out.println(playerNum);

          if (compNum > playerNum){
            System.out.println("yay the points are all mine! :O");
            computer = playerNum + compNum + computer;
          }
          else if(playerNum > compNum){
            System.out.println("");
            System.out.println("this time the points are all yours >:|");
            player = compNum + playerNum + player;
          }
          else if(playerNum == compNum){
            System.out.println("");
            System.out.println("nooo! you made us both lose 10 points");
            computer = -10;
            player = -10;
          }

          if (computer < 0 || player < 0){
            System.out.println("");
            System.out.println("Game over: one of us is in the red!");
            System.out.println("-------------------------------------------------");
            System.out.println("");
            System.out.print("                F I N A L  S C O R E          \n"
                            +"                      me : you          \n");
            System.out.println("                     " + computer + " : " + player);
            System.out.println("");
            System.out.println("I still refuse to accept you as my equal.");
            break;
          }
          if ((round >= 3) && (computer % 5 == 0))

          System.out.println("");
          System.out.print("                     S C O R E          \n"
                          +"                      me : you          \n");
          System.out.println("                       " + computer + " : " + player);
          System.out.println("");

    }
  }
}
