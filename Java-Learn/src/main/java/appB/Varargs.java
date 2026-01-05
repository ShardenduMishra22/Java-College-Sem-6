package appB;

public class Varargs {
  void formatExample(String name, int number) {
    String msgName = String.format("Message for %s", name);
    String msgNumberName = String.format("%d, messages for %s", number, name);
  }

  void printAllObjects(Object... elements) {
    for (Object element : elements) {
      System.out.println(element);
    }
  }

  <E> void printAllElements(E... elements) {
    for (E element : elements) {
      System.out.println(element);
    }
  }
}
