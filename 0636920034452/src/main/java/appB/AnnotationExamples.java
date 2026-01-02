package appB;

import org.jetbrains.annotations.NotNull;

public class AnnotationExamples {
  private @NotNull String cannotBeNull = "some value";

  void cannotTakeNullParameter(@NotNull String str) {
    @NotNull String val;
    System.out.println(str.length());
  }

  @NotNull
  String cannotReturnNullValue() {
    return null;
  }

  // if you use @Override on a method that is not from Object, this will give a compiler error
  @Override
  public String toString() {
    return "AnnotationExamples{" +
           "cannotBeNull='" + cannotBeNull + '\'' +
           '}';
  }
}

@FunctionalInterface
interface IntToString {
  String convert(int value);
  // uncomment this to see a compiler error
//  void anotherAbstractMethod();
}
