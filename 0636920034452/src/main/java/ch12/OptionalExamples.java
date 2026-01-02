package ch12;

import java.util.Optional;

public class OptionalExamples {
  public static void main(String[] args) {
    Optional<IceCream> optional = getIceCream("Strawberry");
    IceCream ice = optional.get();

    if (optional.isPresent()) {
      ice.eat();
    } else {
      System.out.println("No ice cream for you!");
    }

  }

  private static Optional<IceCream> getIceCream(String strawberry) {
    return Optional.ofNullable(null);
  }

  private static class IceCream {
    void eat() {

    }
  }
}
