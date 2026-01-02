package ch9;

public class SuperclassConstructors {
public abstract class Animal {
  private String name;

  public String getName() {
    return name;
  }

  public Animal(String theName) {
    name = theName;
  }
}

public class Hippo extends Animal {
  public Hippo(String name) {
    super(name);
  }
}


  public static void main(String[] args) {
//    Hippo h = new Hippo("Buffy");
//    System.out.println(h.getName());
  }
}
