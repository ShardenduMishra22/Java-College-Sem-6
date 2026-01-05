package ch12;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class BeTheCompiler {
  public static void main(String[] args) {
    Runnable runnable = () -> System.out.println("Hi!");
    Consumer<String> consumer = s -> System.out.println(s);
//    Supplier<String> supplier3 = () -> System.out.println("Some string");
//    Consumer<String> consumer2 = (s1, s2) -> System.out.println(s1 + s2);
//    Runnable runnable2 = (String str) -> System.out.println(str);
    Function<String, Integer> function = s -> s.length();
    Supplier<String> supplier = () -> "Some string";
//    Consumer<String> consumer3 = s -> "String" + s;
//    Function<String, Integer> function3 = (Integer i) -> "i = " + i;
//    Supplier<String> supplier2 = s -> "Some string: " + s;
//    Function<String, Integer> function2 = () -> System.out.println("Some string");
  }

  void book() {
//    ❑Runnable r = () -> System.out.println("Hi!");
//❑Consumer<String> c = s -> System.out.println(s);
//❑Supplier<String> s = () -> System.out.println("Some string");
//❑Consumer<String> c = (s1, s2) -> System.out.println(s1 + s2);
//❑Runnable r = (String str) -> System.out.println(str);
//❑Function<String, Integer> f = s -> s.length();
//❑Supplier<String> s = () -> "Some string";
//❑Consumer<String> c = s -> "String" + s;
//❑Function<String, Integer> f = (int i) -> "i = " + i;
//❑Supplier<String> s = s -> "Some string: " + s;
//❑Function<String, Integer> f = () -> System.out.println("Some string");
  }

  void assignToVariable() {
    Comparator<String> comparator = (s1, s2) -> s1.compareToIgnoreCase(s2);
    Runnable runnable = () -> System.out.println("Hello!");
    Consumer<String> consumer = str -> System.out.println(str);
    Supplier<String> supplier = () -> "Returned from a lambda";
  }
}
