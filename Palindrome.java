import java.util.Scanner;

public class Palindrome{

  public static void main(String[]args){
    Scanner in = new Scanner (System.in);

    String s = in.next();
    in.close();

    boolean isPalindrome = true;

    System.out.println(s.length());

    for(int i = 0; i < s.length(); i++){
    System.out.print(" i = " + i + "comparing ");
    System.out.println(s.charAt(i) + " to " + s.charAt(s.length()-1-i));
    System.out.println("indicates compared: " + i + " " + (s.length() - 1 - i));

      if(s.charAt(i) != s.charAt(s.length() - 1 - i))
      {
        isPalindrome = false;
        break;

      }
      }
      System.out.println(s + " is Palindrome: " + isPalindrome);
  }
}
