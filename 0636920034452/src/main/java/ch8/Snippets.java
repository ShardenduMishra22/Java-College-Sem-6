package ch8;

import ch7.Dog;

public class Snippets {
  public void go() {
    Dog aDog = new Dog();
    Object sameDog = getObject(aDog);
  }

  public Object getObject(Object o) {
    return o;
  }
}

class BadDog {
  public void go() {
    Dog aDog = new Dog();
    // doesn't compile
//    Dog sameDog = getObject(aDog);
  }

  public Object getObject(Object o) {
    return o;
  }
}