import java.util.Scanner;
public class CountOccurences{
  public static void main(String[]args){
    System.out.print("Enter integers 1 to 100: ");

    Scanner in = new Scanner(System.in);
    int num;
    int[] numOccurences = new int[101];

    do {
        num = in.nextInt();
        numOccurences[num]++;
    }while(num != 0);
    printOccurenceInfo(numOccurences);

  }

  public static void printOccurenceInfo(int[]occurences){
    for(int i = 1; i<=100;i++){
      if(occurences[i] != 0){
        String msg = i + " occurs ";
        msg += (occurences[i]==1)? " 1 time ": occurences[i] + " times. ";
        System.out.println(msg);
      }
    }

  }

}
