import java.util.*;
import static java.util.stream.Collectors.*;

public class Sample10 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    List<Integer> doubleOfEven = numbers.stream()
      .filter(e -> e % 2 == 0)
      .map(e -> e * 2) 
      .collect(toList()); //this is also reduce

    System.out.println(doubleOfEven);
  }
}

