package ch12;

import java.util.List;

public class Ch10c {
  void forExample() {
    List<String> allColors = List.of("Red", "Blue", "Yellow");
    for (String color : allColors) {

      System.out.println(color);
    }
  }

  static void forEachExample() {
    List<String> allColors = List.of("Red", "Blue", "Yellow");
    allColors.forEach(color -> System.out.println(color));
  }

  public static void main(String[] args) {
    forEachExample();
  }

  // 2, 3, 4, 5
  static void badFor1() {
    List<Integer> nums = List.of(1, 2, 3, 4, 5);
    for (int i = 1; i < nums.size(); i++) {
      System.out.println(nums.get(i));
    }
  }

  //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
  static void badFor2() {
    List<Integer> nums = List.of(1, 2, 3, 4, 5);
    for (int i = 0; i <= nums.size(); i++) {
      System.out.println(nums.get(i));
    }
  }

  // Doesn't compile
  static void badFor3() {
//        List<Integer> nums = List.of(1, 2, 3, 4, 5);
//        for (int i = 0; i <= nums.length; i++) {
//            System.out.println(nums.get(i));
//        }
  }

  // [1, 2, 3, 4, 5]
  //[1, 2, 3, 4, 5]
  //[1, 2, 3, 4, 5]
  //[1, 2, 3, 4, 5]
  //[1, 2, 3, 4, 5]
  static void badFor4() {
    List<Integer> nums = List.of(1, 2, 3, 4, 5);
    for (Integer num : nums) {
      System.out.println(nums);
    }
  }

  // doesn't compile
  static void badFor5() {
//        List<Integer> nums = List.of(1, 2, 3, 4, 5);
//        for (Integer int : nums) {
//            System.out.println(nums);
//        }
  }

  static void forEach() {
    List<Integer> nums = List.of(1, 2, 3, 4, 5);
    nums.forEach(num -> System.out.println(num));
  }


}
