import java.util.*;

public class Sample {
  public static void main(String[] args) {
  /*
  Functions:
  we can pass objects to functions
  we can create objects in functions
  we can return objects from functions

  Higher-order Functions:
  we can pass functions to functions
  we can create functions in functions
  we can return functions from functions

  In addition to doing object decomposition we can also do functional
  decomposition.


  functions are objects?
  functions as data
  */

    //Thread th = new Thread(new Runnable() {
    //  public void run() {
    //    System.out.println("You called...");
    //  }
    //});
    //the above code represent an old idiology of Java that everything
    //is object (when in reality it is not).

    //remove the ceremony or the noise and focus on the essence

    Thread th = new Thread(() -> System.out.println("You called..."));
    //we are passing a function (instead of an object) to the constructor
    //Thread constructor is now a higher-order function.
    
    th.start();
    System.out.println("In the main thread");
   
  }
}
