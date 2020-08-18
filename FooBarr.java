/* Name: Ernesto Garcia
   CIN: 306774005
   Class: CS-2011-5 219

it will print out numbers and a letter after every other certain divisible number
***MY FILE WILL NOT SAVE WITH THE NAME "FOOBAR" SO I MADE IT FOOBARR
*/
public class FooBarr{
  public static void main(String[]args){
    int i ;
    for (i=1; i<=100; i++){
      if((i%3==0) && (i%5==0)){
        System.out.println("FooBar");
      }else if(i % 3 ==0){
        System.out.println("Foo");
      }else if ((i%5==0)){
        System.out.println("Bar");
      }else{
        System.out.println(i);
      }
    }
  }
}
