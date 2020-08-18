/* Ernesto Garcia
   306774005
   2011-6 219
  This program takes your input/points and tells you */

import java.util.Scanner;
public class RotatePoint1{
  public static void main(String[]args){
    Scanner in = new Scanner(System.in);

    System.out.print("Enter x- and y- coordinates: ");
    double xCord = in.nextDouble();
    double yCord = in.nextDouble();

    System.out.print("Enter angle of rotation in degrees: ");
    double angle = in.nextDouble();
           angle = Math.toRadians(angle);


    System.out.println("Enter \'+' or \'-' for clockwise rotation: ");
    char direction = in.next().charAt(0);


    double xClockWise = ((xCord)*Math.cos(angle) - (yCord)*Math.sin(angle));
    double yClockWise = ((xCord)*Math.sin(angle) + (yCord)*Math.cos(angle));

    double xCounterClockWise = (((xCord)*Math.cos(angle*(-1))) - ((yCord)*Math.sin(angle*(-1))));
    double yCounterClockWise = (((xCord)*Math.sin(angle*(-1))) + ((yCord)*Math.cos(angle*(-1))));

    if (direction == '-'){
      System.out.print("Here are your new x,y coordinates: ");
      System.out.print("(" + (Math.rint(xCounterClockWise*100)/100) + ",");
      System.out.println(" " + (Math.rint(yCounterClockWise*100)/100) + ")");

    }else if(direction == '+'){
      System.out.print("Here are your new x,y coordinates: ");
      System.out.print("(" + (Math.rint (xClockWise *100)/100) + ",");
      System.out.println(" " + (Math.rint (yClockWise *100)/100) + ")");
    }else{
      System.out.println("Invalid input: " + direction);
    }

    in.close();





  }
}
