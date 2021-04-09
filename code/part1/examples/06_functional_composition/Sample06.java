import java.util.*;
import java.util.function.*;

public class Sample06 {
  public static void printInfo(int number, String msg,
    Function<Integer, Integer> func) {

    System.out.println(number + " " + msg + ": " + func.apply(number));
  }
  
  public static void main(String[] args) {
    Function<Integer, Integer> inc = e -> e + 1;
    printInfo(5, "incremented", inc);
    printInfo(6, "incremented", inc);

    Function<Integer, Integer> doubleIt = e -> e * 2;
    printInfo(5, "doubled", doubleIt);
    printInfo(6, "doubled", doubleIt);

    //what if I want to increment and double?
    //printInfo(5, "incremented and doubled", e -> (e + 1) * 2);

    printInfo(5, "doubled", inc.andThen(doubleIt));
    printInfo(6, "doubled", inc.andThen(doubleIt));

    /*
      Function
      func1.andThen(func2);

      result1 = func1.apply(data);
      return func2.apply(result1);

      return func2.apply(func1.apply(data));

      Predicate (or function to combine predicate)
        return predicate1.test(data) || predicate2.test(data);

      Predicate (and function to combine predicate)
        return predicate1.test(data) && predicate2.test(data);


     Predicate is a special form of Function
      Function<Input, Output>

      Predicate<Input> ==== Function<Input, Boolean>


      BiFunction<Input1, Input2, Output>

        biFunction.apply(data1, data2);
    */
  }
}
