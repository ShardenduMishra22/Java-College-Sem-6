package ch9;

public class StackRef {
  public void foof() {
    barf();
  }

  public void barf() {
    Duck d = new Duck(24);
  }
}