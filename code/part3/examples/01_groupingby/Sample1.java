import java.util.*;
import static java.util.stream.Collectors.*;

class Person1 {
  private final String name;
  private final int age;

  public Person1(String theName, int theAge) {
    name = theName;
    age = theAge;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String toString() {
    return String.format("%s -- %d", name, age);
  }
}

public class Sample1 {
  public static List<Person1> createPeople() {
    return List.of(
	    new Person1("Sara", 20),
	    new Person1("Sara", 22),
	    new Person1("Bob", 20),
	    new Person1("Paula", 32),
	    new Person1("Paul", 32),
	    new Person1("Jack", 3),
	    new Person1("Jack", 72),
	    new Person1("Jill", 11));
  }

  public static void main(String[] args) {
    //map of names and age but only those who are older than 30

    System.out.println(createPeople()
      .stream()
      .filter(person -> person.getAge() > 30)
      .collect(groupingBy(Person1::getName)));
  }
}

