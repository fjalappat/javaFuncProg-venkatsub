import java.util.*;

public class Sample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    numbers.stream()
      .map(e -> e * 2.0)
      .forEach(e -> System.out.println(e));
  }
}

//map takes a Function as argument
//it transforms the input collection to the output collection

// Given x1, x2, x3,... and a function f(x) it produces
//       y1, y2, y3,... where yi = f(xi)

//# of elements in the output == # of elements in the input

//The type of the output may be different from the type of the input

//Stream<T.map(Function<T, R>) ===> Stream<R>


