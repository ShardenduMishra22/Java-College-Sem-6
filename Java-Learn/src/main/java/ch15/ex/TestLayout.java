package ch15.ex;

import javax.swing.*;

public class TestLayout {
  public static void main(String[] args) {
    new TestLayout().go();
  }

  public void go() {
    JFrame frame = Fragments.missing();

    frame.setSize(300,300);
    frame.setVisible(true);
  }
}
