
//Find out if there are any occurrences of the word "Beautiful" in a sentence:

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionApp 
{
      public static void main(String[] args) 
  {
    Pattern pattern = Pattern.compile("Beautiful", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("The world is Beautiful in so many ways.Let us cherish every beautiful moment we have.");
    boolean matchFound = matcher.find();
    if(matchFound) {
      System.out.println("Match found");
    } 
else 
{
      System.out.println("Match not found");
    }
  }
}
// Outputs Match found
    

