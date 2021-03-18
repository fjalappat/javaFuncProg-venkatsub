import java.util.*;
import static java.util.stream.Collectors.*;

public class Sample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3);

    List<Integer> result1 = numbers.stream()
      .map(e -> e * 2)
      .collect(toList());

    System.out.println(result1);

    //Stream<T>.map(f11<T, R>) ===> Stream<R>
    //if you have a one-to-one function
    //map will transform a Stream of values into a stream of values

    //if you have a one-to-many function then what happens if we use map
    List<List<Integer>> result2 = numbers.stream()
      .map(e -> Arrays.asList(e - 1, e + 1))
      .collect(toList());

    System.out.println(result2);

    //Stream<T>.map(f1n<List<R>>) ===> Stream<List<R>>
    //map when used with a one-to-many function will transform a 
    //collection of values to a collection of collection of values

    //for example, do you want an assisant to take a group of people
    //and return
    //1. a collection of emails
    //or
    //2. a collection of collection of emails
    //where each person may have 0, 1, 2, or more emails

    //what if we have one-to-many function, but we want 
    //to go from a collection of values to a collection of values?

    List<Integer> result3 = numbers.stream()
      .flatMap(e -> Arrays.asList(e - 1, e + 1).stream())
      .collect(toList());

    System.out.println(result3);
  }
}

