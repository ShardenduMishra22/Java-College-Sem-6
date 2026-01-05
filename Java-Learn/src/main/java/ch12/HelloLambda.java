package ch12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HelloLambda {
  public static void main(String[] args) {
    longPipeline();
  }

  static void helloLambda() {
    List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");

    List<String> result = strings.stream()
                                 .sorted((s1, s2) -> {
                                   return s1.compareToIgnoreCase(s2);
                                 })
                                 .limit(4)
                                 .collect(Collectors.toList());
    System.out.println("result = " + result);
  }

  static void sortingNaturalOrder() {
    List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");

    List<String> result = strings.stream()
                                 .sorted(Comparator.naturalOrder())
                                 .collect(Collectors.toList());
    System.out.println("result = " + result);
  }

  static void lambdaAsBehaviour() {
    List<String> strings = new ArrayList<>(List.of("I", "am", "a", "list", "of", "Strings"));
    String str = strings.get(2);
    strings.add("new String");
    strings.forEach(s -> System.out.println(s));

    List<String> result = strings.stream()
                                 .sorted((s1, s2) -> s1.compareToIgnoreCase(s2))
                                 .limit(4)
                                 .collect(Collectors.toList());
  }

  static void longPipeline() {
    List<String> strings = new ArrayList<>(List.of("I", "am", "a", "list", "of", "Strings"));

    List<String> result = strings.stream()
                                 .sorted((s1, s2) -> s1.compareToIgnoreCase(s2))
                                 .skip(2)
                                 .limit(4)
                                 .collect(Collectors.toList());
    System.out.println("result = " + result);
  }

  static void longLambda() {
    List<String> strings = new ArrayList<>(List.of("I", "am", "a", "list", "of", "Strings"));

    List<String> result = strings.stream()
                                 .sorted(
                                         (String s1, String s2) -> {
                                           return s1.compareToIgnoreCase(s2);
                                         })
                                 .collect(Collectors.toList());
    System.out.println("result = " + result);
  }

  static void multilineLambda() {
    List<String> strings = new ArrayList<>(List.of("I", "am", "a", "list", "of", "Strings"));
    Stream<String> sorted = strings.stream().sorted(
            (str1, str2) -> {
              int l1 = str1.length();
              int l2 = str2.length();
              return l2 - l1;
            });

    List<String> result = sorted.collect(Collectors.toList());
    System.out.println("result = " + result);
  }

  static void compare() {
    List<String> strings = new ArrayList<>(List.of("I", "am", "a", "list", "of", "Strings"));
    Stream<String> sorted = strings.stream().sorted(
            (str1, str2) -> str1.compareToIgnoreCase(str2));
  }

  static void noReturn() {
    List<String> strings = new ArrayList<>(List.of("I", "am", "a", "list", "of", "Strings"));
    strings.forEach(
            (String str) -> {
              String output = "str = " + str;
              System.out.println(output);
            }
    );
  }

  static void noArgs() {
    ExecutorService executorService = Executors.newFixedThreadPool(1);
    executorService.submit(() -> System.out.println("Hello!"));
  }

  static void mandatoryTypes() {
    // if you remove String from the param here, the compiler doesn't know which method you want
    overloadedMethod((String str) -> System.out.println(str));
  }

  private static void overloadedMethod(Consumer<String> consumer) {
    consumer.accept("Something");
  }

  private static void overloadedMethod(Function<Integer, Integer> function) {
    function.apply(1);
  }


}