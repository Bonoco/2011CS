
/* Name: Ernesto Garcia
   CIN: 306774005
   Class: CS-2011-5 219

This code will print out a simple sentence of minimum 3 words
*/
public class SimpleSentence{
   public static String getSimpleSentence(String[]subjects, String[]verbs, String[]adjectives){

     int subjectIndex = (int) (0 + Math.random() * 10);
     int verbIndex = (int) (0 + Math.random() * 5);
     int adjectiveIndex = (int)(0 + Math.random() * 15);


     String sentence = ( subjects[subjectIndex] + " " + verbs[verbIndex]+ " " + adjectives[adjectiveIndex]);
     return sentence;
  }
  public static void main(String[]args){
    String[]subject = {"Area", "Books", "Business", "Case", "Children", "Company", "Country", "Day", "Fact", "Puzzle"};
    String[]verb = {"generate","grow", "gold", "cannot", "insist"};
    String[]adjective = {"bulky.", "bumpy.", "buoyant.", "burdensome.", "burly.", "bustling.", "busy.", "buttery.", "buzzing.", "magnificent.", "muscular.", "plain.", "plump.", "quaint.","scruffy."};
    System.out.println(getSimpleSentence(subject, verb, adjective));
    //getSimpleSentence(subject, verb, adjective);
  }
}
