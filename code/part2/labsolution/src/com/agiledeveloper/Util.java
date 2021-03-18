package com.agiledeveloper;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

interface Util {
  public static Map<Integer, Set<String>> groupByScores(Map<String, Integer> scores) {
//    Map<Integer, Set<String>> byScores = new HashMap<>();
//    for(String name : scores.keySet()) {
//      int score = scores.get(name);
//
//      Set<String> names = new HashSet<>();
//      if(byScores.containsKey(score))
//        names = byScores.get(score);
//
//      names.add(name);
//      byScores.put(score, names);
//    }
//
//    return byScores;

    return scores.keySet()
      .stream()
      .collect(groupingBy(scores::get, toSet()));
  }
}