package appB;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestMeTest {
  @Test
  void shouldReturnAMessage() {
    // given
    String expectedMessage = "The message";

    // when
    TestMe testMe = new TestMe(expectedMessage);

    // then
    Assertions.assertEquals(expectedMessage, testMe.getMessage());
  }

  @Test
  @Disabled("This test isn't finished")
  void thisTestIsForIgnoring() {
    Assertions.fail("Fails on purpose");
  }

}