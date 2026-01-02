package ch18;

import org.junit.jupiter.api.Test;

class ImmutableDataTest {
  @Test
  void shouldNotBeAbleToChangeTheNotPrivateFields() {
    ImmutableData immutableData = new ImmutableData("theName", 7);
    // does not compile, yay!
//    immutableData.value = 8;
  }
}