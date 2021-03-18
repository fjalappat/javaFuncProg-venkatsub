import java.util.*;

public class Sample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Dory", "Gill", "Bruce", "Nemo", "Darla", "Marlin", "Jacques");

    //is Nemo there?

    //imperative style of programming: 
    //we tell what to do and also how to do it.
    //boolean found = false; //garbage variable

    //for(int i = 0; i < names.... //familiar and very complex
    //we often confuse the word familiar with the word simple
    
    //for(String name: names) {
      //if(name == "Nemo") //oh no, don't do than - the focus on how
    //  if(name.equals("Nemo")) {
    //    found = true;
    //	break; // again how comes back to haunt us
    //}
    //}

    //if(found) {
    //  System.out.println("Nemo found");
    //} else {
    //  System.out.println("Nemo not found");
    //}

    //Declarative style: we tell what to do and *not* how to do it
    if(names.contains("Nemo")) {
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

//declarative style:
//we focus on the essence and leave the lower level details to other function
//no garbage variable
//no explicit mutation - the code is very humane
//easier to understand, fewer errors, easier to parallelize as well
//Unlike the imperative style where the details are on your face all
//the time, in the declarative style the details are one click away
//Are we not pushing the stuff one layer below. Yes we are, but
//if we do those details, then debugging, concurrency, error prooffing
//and more are our problem. If we push to a lower level, then those
//issues are the problem of those writing that lower level code.
