/* Name: Ernesto Garcia
   CIN: 306774005
   Class: CS-2011-5 219

it will print the random dice in two orders
*/
public class FiveDice2{
  public static void main(String[]args){

    //System.out.print("Dice rolled: ");
    int i;
    int a = 1;
    int b = 2;
    for(i=1; i<6; ++i){
      int random = (int)(1 + Math.random()*6);
      String space = " ";
      //int a = 1;
          a +=1;
      if (a<7){
      switch(i){
        case 1: System.out.print("Dice rolled: " + space + random );
        break;
        case 2: System.out.print(space + random);
        break;
        case 3: System.out.print(space + random);
        break;
        case 4: System.out.print(space + random);
        break;
        case 5: System.out.print(space + random);
        break;
        }
        System.out.println(" ");
      }if (b>1){
      switch(i){
        case 1: System.out.print("Generated number: " + space + random );
        break;
        case 2: System.out.print(random);
        break;
        case 3: System.out.print(random);
        break;
        case 4: System.out.print(random);
        break;
        case 5: System.out.print(random);
        break;
       }
     }
    }
     System.out.println(" ");
  }
}
