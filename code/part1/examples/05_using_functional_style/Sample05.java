import java.util.*;

public class Sample05 {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Dory", "Gill", "Bruce", "Nemo", "Darla", "Marlin", "Jacques");

    //find if there are names of length 5
    //we are familar with imperative style code to do this.

    //for functional style, look for functions that abstract the details.

    //Put the logic in words or sentences
    //for the given list of names, are there any name that is of length 5

    //we can use filter and that is very true, but we can also look 
    //for functions that are built on top of that abstraction as well

    System.out.println(
      names.stream()
        .anyMatch(name -> name.length() == 5));

    //anyMatch will break out as soon as it finds a match
    //it will not process all the elements if an element satifies the
    //given predicate.
  }
}

