/*
  Byron Garibay
  CIN: 307047993
  CS2011-5 S19

  Counts from 1 to 100 and every time a number can be divided by 3 without leaving any remainder, it prints Foo.
  The same happens when its 5 instead of 3 but it prints Bar. If it can be divided by both without leaving any
  remainder, it prints FooBar.
*/
public class FooBar{
    public static void main(String args[]){

        int count;
        for(count = 1; count<=100; count++){
            if( (count % 5 == 0) &&  (count % 3 == 0)){
              System.out.println("FooBar");
            }
            else if( (count % 3 == 0) ){
              System.out.println("Foo");
            }
            else if( (count % 5 == 0) ){
              System.out.println("Bar");
            }
            else{
              System.out.println(count);
            }
        }
    }
}
