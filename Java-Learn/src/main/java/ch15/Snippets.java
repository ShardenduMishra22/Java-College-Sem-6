package ch15;

import javax.swing.*;

public class Snippets {
  void panelsDemo() {
    JPanel panelA = new JPanel();
    JPanel panelB = new JPanel();
    panelB.add(new JButton("button 1"));
    panelB.add(new JButton("button 2"));
    panelB.add(new JButton("button 3"));
    panelA.add(panelB);

  }
}
