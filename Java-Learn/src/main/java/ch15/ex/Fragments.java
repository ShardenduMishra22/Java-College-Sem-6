package ch15.ex;

import javax.swing.*;
import java.awt.*;

public class Fragments {
  static JFrame fragmentD() {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    panel.setBackground(Color.darkGray);
    JButton button = new JButton("tesuji");
    JButton buttonTwo = new JButton("watari");
    frame.getContentPane().add(BorderLayout.NORTH, panel);
    panel.add(buttonTwo);
    frame.getContentPane().add(BorderLayout.CENTER, button);
    return frame;
  }

  static JFrame fragmentB() {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    panel.setBackground(Color.darkGray);
    JButton button = new JButton("tesuji");
    JButton buttonTwo = new JButton("watari");
    panel.add(buttonTwo);
    frame.getContentPane().add(BorderLayout.CENTER, button);
    frame.getContentPane().add(BorderLayout.EAST, panel);
    return frame;
  }

  static JFrame fragmentC() {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    panel.setBackground(Color.darkGray);
    JButton button = new JButton("tesuji");
    JButton buttonTwo = new JButton("watari");
    panel.add(buttonTwo);
    frame.getContentPane().add(BorderLayout.CENTER, button);
    return frame;
  }

  static JFrame fragmentA() {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    panel.setBackground(Color.darkGray);
    JButton button = new JButton("tesuji");
    JButton buttonTwo = new JButton("watari");
    panel.add(button);
    frame.getContentPane().add(BorderLayout.NORTH, buttonTwo);
    frame.getContentPane().add(BorderLayout.EAST, panel);
    return frame;
  }

  static JFrame fragmentE() {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    panel.setBackground(Color.darkGray);
    JButton button = new JButton("tesuji");
    JButton buttonTwo = new JButton("watari");
    frame.getContentPane().add(BorderLayout.SOUTH, panel);
    panel.add(buttonTwo);
    frame.getContentPane().add(BorderLayout.NORTH, button);
    return frame;
  }

  static JFrame missing() {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    panel.setBackground(Color.darkGray);
    JButton button = new JButton("tesuji");
    JButton buttonTwo = new JButton("watari");
    frame.getContentPane().add(BorderLayout.SOUTH, button);
    panel.add(buttonTwo);
    frame.getContentPane().add(BorderLayout.CENTER, panel);
    return frame;
  }

}
