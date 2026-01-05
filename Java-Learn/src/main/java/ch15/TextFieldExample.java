package ch15;

import javax.swing.*;
import java.awt.*;

public class TextFieldExample {

  public static void main(String[] args) {
    TextFieldExample gui = new TextFieldExample();
    gui.go();
  }

  public void go() {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();

    JTextField textField = new JTextField(20);
    JLabel label = new JLabel("Dog's first name:");
    panel.add(label);
    panel.add(textField);

    frame.getContentPane().add(BorderLayout.NORTH, panel);
    frame.setSize(400,200);
    frame.setVisible(true);
  }

}
   