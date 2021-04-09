import java.util.*;

public class Sample04 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    //find the total of double of even numbers
    //imperative style

    int result = 0;

    for(int e: numbers) {
      if(e % 2 == 0) {
        result += e * 2;
      }
    }

    System.out.println(result);
    //the above code has some fundamental design flaws:
    //it lacks cohesion

    System.out.println(
      numbers.stream()
        .filter(e -> e % 2 == 0)//declarative + higher-order
	.mapToInt(e -> e * 2)//declarative + higher-order
	.sum());//declarative 

   //Functional style: declarative + higher-order functions

   //each line of the above code does only one things : Cohesion, 
   //Single level of abstraction principle

   //The code begins to flow like the problem statement


   //We think about this as a series of transformation or flow of data.

   //Some examples to relate to:
   //Unix: cat myfile.txt | grep "someword" | sed ... | wc -l
   //          source     | filter          | map     | reduce
   //          air        | purifier        | heater  |...
   //          water      | purifier'       | cooler  |...
  }
}
