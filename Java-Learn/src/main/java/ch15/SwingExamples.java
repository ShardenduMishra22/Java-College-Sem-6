package ch15;

import javax.swing.*;
import java.awt.*;

public class SwingExamples {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    JButton button = new JButton("click me");

    JCheckBox checkBox = new JCheckBox("choose me");
    JMenuBar menuBar = new JMenuBar();
    menuBar.add(new JMenu("File"));
    menuBar.add(new JMenu("Panic"));
    menuBar.add(new JMenu("Deviate"));
    frame.add(BorderLayout.NORTH, menuBar);

    Box textBox = new Box(BoxLayout.X_AXIS);
    textBox.add(button);
    textBox.add(checkBox);
    frame.getContentPane().add(BorderLayout.CENTER, textBox);

    frame.setSize(300, 300);
    frame.setVisible(true);
  }
}
