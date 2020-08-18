import java.util.Scanner;
public class DegreesToRadians{
  public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    System.out.print("Degrees: ");
    double degrees = in.nextDouble();
    double radians = degrees*Math.PI/180;
    System.out.println("Radians: " + radians);
    in.close();
  }

}
