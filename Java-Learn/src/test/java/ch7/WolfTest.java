package ch7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class WolfTest {

  @Test
  void createWolf() {
    Wolf w = new Wolf();
    w.makeNoise();
    w.roam();
    w.eat();
    w.sleep();

    assertNotNull(w);
  }
}