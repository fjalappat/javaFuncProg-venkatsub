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
    //functional style languages provide functional composition

    //functional composition is necessary but not sufficient

    //If I say a language is objected-oriented, what feature
    //do you expect?
    //Polymorphism

    //Polymorphism is to object-oriented programming as
    //lazy evaluation is to functional programming

    //Functional programming == functional composition + lazy evaluation

    //A number of languages today given functional composition, but 
    //not all of them give lazy evaluation

    //Lazy evaluation is critical for performance.

    List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9, 10);

    //find the double of the first number > 3 and even

    //Imperative style
    Integer result = null; //what a smell

    for(int e: numbers) {
      if(isGT(e) && isEven(e)) {
        result = doubleIt(e);
	break;
      }
    }
    //the above will perform, for the given numbers, only 8 units of work

    System.out.println(result);
    System.out.println("----------");
    //Functional style
    System.out.println(
      numbers.stream()
        .filter(Sample::isGT)  //1, 2, 3, 5, 4
	.filter(Sample::isEven) //5, 4
	.map(Sample::doubleIt) //4
	.findFirst() //got it, now we can go home with result for 4
	.orElse(0));
  //to the human eyes this looks like 21 computations, oh my

  //Thankfull that is not true.
  //a number of the methods of Stream are lazy
  //They do not do the work until a terminal function is called

  //filter, map, etc. do what is called function fusing.
  
  //Stream does not process each element in a collection through a function
  //instead it creates a functional composition of the functions given
  //and then runs that combined function, but only as necessary.
  }
}
