import java.util.*;

public class Sample {
  public static boolean isGT(int number) {
    System.out.println("isGT called for " + number);
    return number > 3;
  }

  public static boolean isEven(int number) {
    System.out.println("isEven called for " + number);
    return number % 2 == 0;
  }

  public static int doubleIt(int number) {
    System.out.println("doubleIt called for " + number);
    return number * 2;
  }

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9, 10);
      numbers.stream()
        .filter(Sample::isGT)  
	.filter(Sample::isEven) 
	.map(Sample::doubleIt) 
	//.findFirst()  //try uncommenting this line
	;

      System.out.println("DONE");

      //functions like filter and map are called intermediate functions
      //functions like reduce, collect, findFirst are called terminal
      //functions. The intermediate functions do not run until a 
      //terminal function is executed.

      //intermediate functions in Java return Stream, while terminal
      //functions don't.

      //The functional style code does not do any extra work than
      //the imperative style code. They both have the same
      //computational complexity.

      //But, the functional style code is easier to parallelize than
      //imperative style because of lack of shared mutable state.
  }
}
