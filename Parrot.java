import java.util.Scanner;
public class Parrot{
  public static void main(String[]args){
    Scanner in = new Scanner (System.in);
    System.out.print("Please type something in: ");
    String stuff = in.nextLine();
    System.out.println(stuff + "!");
    in.close();
  }

}
