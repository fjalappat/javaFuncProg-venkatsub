import java.util.*;

public class Sample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    int result = numbers.stream()
      .filter(e -> e % 2 == 0) //2, 4, 6, 8, 10
      .map(e -> e * 2) //4, 8, 12, 16, 20
      .reduce(0, (total, e)  -> total + e);
       // 0 + 4 = 4
       // 4 + 8 = 12
       // 12 + 12 = 24
       // 24 + 16 = 40
       // 40 + 20 = 60

    System.out.println(result);
  }
}

/*
Reduce on one hand transforms a collection of data into a single data
but it is more than that.

Reduce transforms a collection of data into, possibly, another collection
of data. Thus, collect in Java is also a reduce operation.


            filter              map              reduce
                                 op                 opr
x1             |                                initial
-------------------------------------------------------\----------
x2 ------------------------->    op    --------------> opr
---------------------------------------------------------\--------
x3             |                                          \
-----------------------------------------------------------\------
x4 ------------------------->    op    ----------------->  opr
-------------------------------------------------------------\----
x5             |                                              \
---------------------------------------------------------------\--
x6 ------------------------->    op    ----------------------> opr
                                                                \
								 \result


                       ei
		        |
		        |
	initial ---->  opr  ----------->
                  ^            |
		  |            |
		  --------------
*/
