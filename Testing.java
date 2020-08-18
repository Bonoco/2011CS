import java.util.Scanner;
public class Testing{
  public static void main(String[]args){
    Scanner in = new Scanner(System.in);

    System.out.print("How many graded items?: ");
    int gradedItems = in.nextInt();
    double []scores = new double[gradedItems];
    double []weight = new double[gradedItems];

    System.out.println("For each item enter a grade followed by the weight: ");
    for(int i = 0; i < gradedItems; i++){
      System.out.print("Graded Items" + (i+1)+ ": ");
      scores[i] = in.nextDouble();
      weight[i] = in.nextDouble();
    }
    System.out.print("Drop your lowest mark? [Y/N]: " );
    char choice = in.next().charAt(0);
    if(choice == 'Y' || choice == 'y'){
      System.out.println("Too late");
    }
    System.out.println("Your weighted average is: "  );



  }
  public static void dropLowest(double[]scores, double[]weights){
    int index = 0;
    double minRatio = scores[0]/weights[0];
    for(int i = 1; i<scores.length; i++){
      if(scores[i]/weights[i]<minRatio){
        minRatio = scores[i]/weights[i];
        index = i;
      }
    }
    scores[index] = 0;
    weights[index] = 0;

  }
  public static double weightedAvg(double[]scores, double[]weight, int items){
    double = 0;
    double = 0;
    double = 0;

    for(int i =0; i < items; i++){
      if(scores[i] === 0 && weights[i]==0){
      }
      else{
        total = scores[i]/weights[i];
        store += total;
        times = i;
        }
      }
      int percent = (int)((store/times)*1000.0);
      double accuratePercentage = ((double) percentage)/10.0;
      if (accuratePercentage > 100){
        accuratePercentage = 100.0;
      }
      return(Math.ceil(accuratePercentage));
      }

    }
