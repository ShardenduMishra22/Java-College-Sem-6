package appB;

public class StringImmutability {
  public static void main(String[] args) {
    stringMethodsCreateNewObjects();
  }

  static void stringMethodsCreateNewObjects() {
    String string = "the text";
    String upperStr = string.toUpperCase();

    System.out.println(string);
    System.out.println(upperStr);
    System.out.println(string.equals(upperStr));
  }

  static void stringsOfTheSameValueAreTheSameObject() {
    String str1 = "customer";
    String str2 = "customer";
    System.out.println(str1 == str2);
  }
  String stringConcatenation() {
    String s = "0";
    for (int i = 1; i < 10; i++) {
      s = s + i;
    }
    return s;
  }

  String stringBuilder() {
    StringBuilder s = new StringBuilder("0");
    for (int i = 1; i < 10; i++) {
      s.append(i);
    }
    return s.toString();
  }
}
