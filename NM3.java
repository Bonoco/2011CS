import java.util.Scanner;
public class NM3{
   public static void main(String[]args){
    Scanner in = new Scanner(System.in);

    // int nibble;
    // int food = 0;
    //
    // nibble = num ;
int num ;
int sum = 0;
int num1 = (int)(1 + Math.random() * 12);
do {
  System.out.println("feed me sum food will ya??...");
  num = in.next().charAt(0);
  sum += num;

}while (num != num1);
System.out.println("thanks!" + sum);

  // num = in.nextInt();
  // if(num.length() >= 32){
  //   num += in.nextInt();
  //   System.out.println("munch");
  // }else {
  //   num -= in.nextInt();
  //   System.out.println("um..");
  // }
  //   }
  }
}
