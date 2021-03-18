import java.util.*;

public class Sample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Dory", "Gill", "Bruce", "Nemo", "Darla", "Marlin", "Jacques");

    //is Nemo there?

    //imperative style of programming: 
    //we tell what to do and also how to do it.
    boolean found = false; //garbage variable

    //for(int i = 0; i < names.... //familiar and very complex
    //we often confuse the word familiar with the word simple
    
    for(String name: names) {
      //if(name == "Nemo") //oh no, don't do than - the focus on how
      if(name.equals("Nemo")) {
        found = true;
	break; // again how comes back to haunt us
      }
    }

    if(found) {
      System.out.println("Nemo found");
    } else {
      System.out.println("Nemo not found");
    }
  }
}

//Smells of imperative code:
//verbose and tiring over time
//easier to write because we are familiar, but harder to read because
//of the verbosity and the how details that are everywhere.
//often has mutability - code is hard to maintain, error prone, hard to
//parallelize
