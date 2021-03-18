package com.agiledeveloper;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.IntStream;

interface Util {
  public static boolean isPrime(int number) {
//    boolean divisible = false;
//    for(int i = 2; i < number; i++) {
//      if(number % i == 0) {
//        divisible = true;
//        break;
//      }
//    }
//
//    return number > 1 && !divisible;

    //imperative style code is often verbose and has more accidental complexity
    //functional style code is declarative, concise, avoid garbage variables,
    //and has less accidental complexity.

    //we are more familiar with imperative and less familiar with functional
    //imperative may be easier to write because of that familiarity
    //functional style is much easier to read and maintain - code reads like
    //the problem statement.

    return number > 1 && IntStream.range(2, number)
      .noneMatch(i -> number % i == 0);
  }

  public static long countWordsInFile(String filePath, String searchWord) throws IOException {
//    long count = 0;
//    BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
//
//    String line = null;
//
//    while ((line = bufferedReader.readLine()) != null) {
//      if (line.contains(searchWord))
//        count++;
//    }
//
//    return count;

    return Files.lines(Paths.get(filePath))
      .filter(line -> line.contains(searchWord))
      .count();
  }
}