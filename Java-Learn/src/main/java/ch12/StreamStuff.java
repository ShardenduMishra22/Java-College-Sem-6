package ch12;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamStuff {
  public static void main(String[] args) {
    List<String> coffees = List.of("Cappuccino",
            "Americano", "Espresso", "Cortado", "Mocha",
            "Cappuccino", "Flat White", "Latte");


    Stream<String> stream1 = coffees.stream()
                                    .filter(s -> s.endsWith("o"))
                                    .sorted();

    System.out.println(stream1.distinct()
                              .collect(Collectors.toList()));

    System.out.println(stream1.collect(Collectors.toList()));

    List<Integer> integers = Collections.unmodifiableList(Arrays.asList(1));
  }
}
