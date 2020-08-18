import java.util.Scanner;
public class NibbleMonster1{
   public static void main(String[]args){
    Scanner in = new Scanner(System.in);

    System.out.println("FEED ME 10 FINGERED CREATURE! ");

    char nibble = 0;

    int num = (int) (Math.random()*11);
    int num1 = (int) (32 + Math.random()*15);


    while (nibble <= 'z'){

    System.out.println("Insert my food please: ");
      nibble = in.next().charAt(0);

    }if (Character.isLowerCase( nibble )){
      System.out.println("nom nom nom");
  }else {
      System.out.println("thanks");
    }



    in.close();

   }
}
