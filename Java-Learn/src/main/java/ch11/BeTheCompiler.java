package ch11;

import java.util.ArrayList;
import java.util.List;

public class BeTheCompiler {
  public static void main(String[] args) {
    takeAnimals(new ArrayList<Animal>());

//    takeDogs(new ArrayList<Animal>());
//
//    takeAnimals(new ArrayList<Dog>());

    takeDogs(new ArrayList<>());

    List<Dog> dogs = new ArrayList<>();
    takeDogs(dogs);

    takeSomeAnimals(new ArrayList<Dog>());

    takeSomeAnimals(new ArrayList<>());

    takeSomeAnimals(new ArrayList<Animal>());

    List<Animal> animals = new ArrayList<>();
    takeSomeAnimals(animals);

    List<Object> objects = new ArrayList<>();
//    takeObjects(objects);
//
//    takeObjects(new ArrayList<Dog>());

    takeObjects(new ArrayList<Object>());
  }

  private static void takeDogs(List<Dog> dogs) {
    // do something
  }
  private static void takeAnimals(List<Animal> animals) {
    // do something
  }
  private static void takeSomeAnimals(List<? extends Animal> animals) {
    // do something
  }
  private static void takeObjects(ArrayList<Object> objects) {
    // do something
  }
}
