/* Name: Ernesto Garcia
   CIN: 306774005
   Class: CS-2011-5 219

it will print the possible number from the virtual graphic die
IT LOOKS FUNNY I KNOW BUT I FIXED AN ERROR LAST MINUTE AND IT OBLITERATED EVERYTHING. FORGIVE
MY SINFUL CODE STYLE
*/
public class FiveDice1{
  public static void main(String[]args){
    String six =  "+-------+\n"
                + "| *   * |\n"
                + "| *   * |\n"
                + "| *   * |\n"
                + "+-------+\n";
String five = "+-------+\n"
            + "| *   * |\n"
            + "|   *   |\n"
            + "| *   * |\n"
            + "+-------+\n";
            String four = "+-------+\n"
                        + "| *   * |\n"
                        + "|       |\n"
                        + "| *   * |\n"
                        + "+-------+\n";
                        String three= "+-------+\n"
                                    + "| *     |\n"
                                    + "|   *   |\n"
                                    + "|      *|\n"
                                    + "+-------+\n";
                                    String two =  "+-------+\n"
                                                + "|   *   |\n"
                                                + "|       |\n"
                                                + "|   *   |\n"
                                                + "+-------+\n";
                                                String one =  "+-------+\n"
                                                            + "|       |\n"
                                                            + "|   *   |\n"
                                                            + "|       |\n"
                                                            + "+-------+\n";

                                                                int i;
                                                                  for (i = 1; i<6;++i){
                                                                int number = (int) (1 + Math.random() * 6);
                                                             switch (number){
                                                          case 1: System.out.println(five);
                                                    break;
                                               case 2: System.out.println(four);
                                         break;
                                    case 3: System.out.println(three);
                              break;
                         case 4: System.out.println(two);
                   break;
              case 5: System.out.println(one);
        break;
  case 6: System.out.println(six);
break;
default: System.out.println("Try again");
break;
   }
  }
 }
}
