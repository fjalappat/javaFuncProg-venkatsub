import java.util.*;
import static java.util.stream.Collectors.*;

class Person {
  private final String name;
  private final int age;

  public Person(String theName, int theAge) {
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

public class Sample {
  public static List<Person> createPeople() {
    return List.of(
	    new Person("Sara", 20),
	    new Person("Sara", 22),
	    new Person("Bob", 20),
	    new Person("Paula", 32),
	    new Person("Paul", 32),
	    new Person("Jack", 3),
	    new Person("Jack", 72),
	    new Person("Jill", 11));
  }

  public static void main(String[] args) {
    //map of names and age but only those who are older than 30

    System.out.println(createPeople()
      .stream()
      //.filter(person -> person.getAge() > 30)
      //.collect(groupingBy(Person::getName)));
      .collect(groupingBy(Person::getName,
        mapping(Person::getAge, toList()))));
  }
}

