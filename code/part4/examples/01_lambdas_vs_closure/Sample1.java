import java.util.*;

public class Sample1 {
  public static void main(String[] args) {
    //Functions
    //1. name
    //2. return type
    //3. parameters list
    //4. body

    //In functional programming we use anonymous functions, called as
    //lambda expressions:
    //1. parameters list
    //2. body

    //return type is inferred and they have no name

    //lamda expression are stateless. They take an input (possibly)
    //and work with the expression, using constants internally,
    //and finally may return a result.

    //lamdas being stateless are pure functions. They should not
    //have any side-effects.

    List<Integer> numbers = Arrays.asList(1, 2, 3);

    numbers.stream()
      .map(e -> e * 2) //this is a lambda expression
      .forEach(System.out::println);

    //takes e as a parameter, uses 2 which is a constant, returns result

    int factor = 2;
    
    numbers.stream()
      .map(e -> e * factor)  //** closure
      .forEach(System.out::println);

    //** this lambda has a e which is a parameter, but factor
    //is not part of the lambda. The compiler has to look for factor.
    //It will look for it in the definings scope of the lambda.
    //Thus, the compiler will close over the defining scope to
    //bind the factor. Since it closes over, such lamda are called
    //as close-over, or, say it many times really fast, it sounds like
    //closure. That is why they are called closures.

    //closures are lambdas that carry (an immutable) state
  }
}

