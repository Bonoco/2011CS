public class lilLoop{
 public static void main(String[]args){
   for (int i = 1; i <= 9; ++i)
     System.out.print("\t" + i);
  System.out.println();

  for (int i = 1; i <80; ++i)
     System.out.print("-");
  System.out.println();

  for (int i = 1; i <=9; ++i)
  {
    System.out.print(i + "|");
    for (int j=1; j <=9; ++j)
        System.out.print("\t" + i *j);
   System.out.println();

   }
 }
}
