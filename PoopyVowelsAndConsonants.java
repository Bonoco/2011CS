/* Name: Ernesto Garcia
   CIN: 306774005
   Class: CS-2011-5 219
breaks down strings into vowels and VowelsAndConsonants
*/
public class PoopyVowelsAndConsonants{
  public static void main(String[]args){
    System.out.print("Testing with string: ");
    String s1 = "hawaii";
    printVowels(s1);
    isVowel(s1);
    System.out.println(getNumVowels(s1));
    System.out.println(vowels(s));
  }





  //displays all the consonants in s in the order and case in which they appear
  public static void printVowels(String s){
    //String vs = getVowels(s);
    System.out.println("Vowels: " + getVowels(s));
  }





  //returns the number of vowels in s.
  public static int getNumVowels(String s){
    return getVowels(s).length();






  }
  public static String getVowels(String s){
    String vowels = "";
    for (int i=0; i < s.length() ;i++){
        char c = s.charAt(i);
        if(isVowel(c)){
          vowels += c;
        }
     }
     return vowels;





  }
  public static int getNumConsonants(String s){
   return getConsonants(s).length();



  }
  public static void printConsonants(String s){
    System.out.println("Consonants: " + getConsonants(s));





  }
  public static String getConsonants(String s){
    String consonants = "";
    for (int i=0; i < s.length() ;i++){
        char c = s.charAt(i);
        if(isVowels(c)==false){
          consonants += c;
        }
      }
        return consonants;




  }
  public static boolean isVowel(char c){
    if (c == 'a'|| c=='e'|| c=='i'||c=='o'||c=='u'||c=='y'
      ||c == 'A'|| c=='E'|| c=='I'||c=='O'||c=='U'||c=='Y'){
      return true;
    }else
      return  false;
    }
}
