/*
Ernesto Garcia
306774005
2011-6 219
checks and validates your phone number and its format */
import java.util.Scanner;
public class PhoneValidator{
  public static void main(String[]args){
    Scanner in = new Scanner(System.in);

    System.out.println("Enter phone number as (###) ###-#### : ");
    String phone = in.nextLine();

    if (phone.length() == 14
    && (phone.charAt(0) == 40) //for character "40" it puts '('
    && Character.isDigit(phone.charAt(1))
    && Character.isDigit(phone.charAt(2))
    && Character.isDigit(phone.charAt(3))
    && (phone.charAt(4)== 41) //for character "41" it puts ')'
    && (phone.charAt(5)== 32)// "32" is ' '
    && Character.isDigit(phone.charAt(6))
    && Character.isDigit(phone.charAt(7))
    && Character.isDigit(phone.charAt(8))
    && (phone.charAt(9)== 45)//for character "45" it puts '-'
    && Character.isDigit(phone.charAt(10))
    && Character.isDigit(phone.charAt(11))
    && Character.isDigit(phone.charAt(12))
    && Character.isDigit(phone.charAt(13))){

      System.out.println("thank you!");

    }else{
      System.out.println("ERROR: wrong phone number format");
     }
    in.close();

  }
}
