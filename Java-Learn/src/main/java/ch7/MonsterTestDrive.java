package ch7;

public class MonsterTestDrive {
  public static void main(String[] args) {
    Monster[] monsters = new Monster[3];
    monsters[0] = new Vampire();
    monsters[1] = new Dragon();
    monsters[2] = new Monster();
    for (int i = 0; i < monsters.length; i++) {
      // uncomment to do the exercise
//      monsters[i].frighten(i);
    }
  }
}

class Monster {

}

class Vampire extends Monster {


}

class Dragon extends Monster {
  boolean frighten(int degree) {
    System.out.println("breathe fire");
    return true;
  }
}

//boolean frighten(int d) {
//  System.out.println("arrrgh");
//  return true;
//}
//boolean frighten(int x) {
//  System.out.println("a bite?");
//  return false;
//}
//
//boolean frighten(int x) {
//  System.out.println("arrrgh");
//  return true;
//}
//int frighten(int f) {
//  System.out.println("a bite?");
//  return 1;
//}
//
//boolean frighten(int x) {
//  System.out.println("arrrgh");
//  return false;
//}
//boolean scare(int x) {
//  System.out.println("a bite?");
//  return true;
//}
//
//boolean frighten(int z) {
//  System.out.println("arrrgh");
//  return true;
//}
//boolean frighten(byte b) {
//  System.out.println("a bite?");
//  return true;
//}
