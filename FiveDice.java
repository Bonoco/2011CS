/* Name: Ernesto Garcia
   CIN: 306774005
   Class: CS-2011-5 219

it will print the possible number from the virtual dice.
*/
public class FiveDice{
  public static void main(String[]args){

      int i;
      for (i = 1; i<6; ++i){
        int number = (int) (1 + Math.random() * 6);

        switch (i){
          case 1: System.out.println("First die is " + number);
          break;
          case 2: System.out.println("Second die is " + number);
          break;
          case 3: System.out.println("Third die is " + number);
          break;
          case 4: System.out.println("Fourth die is " + number);
          break;
          case 5: System.out.println("Fifth die is " + number);
          break;
          default: System.out.println("Try again");
          break;

      }
    }
  }
}
