package ch11;

import java.util.*;

public class TestGenerics4 {
  public static void main(String[] args) {
    new TestGenerics4().go();
  }

  public void go() {
    List<Dog> dogs = List.of(new Dog(), new Dog());
    List<Dog> vaccinatedDogs = takeAnimals(dogs);
    System.out.println(vaccinatedDogs);

    List<Animal> animals = List.of(new Dog(), new Cat(), new Dog());
    List<Animal> vaccinatedAnimals = takeAnimals(animals);
    System.out.println(vaccinatedAnimals);

    List<? extends Animal> vaccinatedSomethings = takeAnimals2(dogs);
    System.out.println(vaccinatedSomethings);
  }

  public <T extends Animal> List<T> takeAnimals(List<T> animals) {
    return new ArrayList<>(animals);
  }

  public List<? extends Animal> takeAnimals2(List<? extends Animal> animals) {
    return List.of(new Cat());
  }
}



