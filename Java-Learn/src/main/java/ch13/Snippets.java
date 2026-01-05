package ch13;

public class Snippets {
  private boolean abandonAllHope;
  private Snippets anObject;
  private Laundry laundry;

  void testTryCatch() {
    try {
      Risky x = new Risky();
      Foo f = x.doRiskyThing();
      int b = f.getNum();

    } catch (Exception e) {
      System.out.println("failed");
    }
    System.out.println("We made it!");
  }

  public void takeRisk() throws BadException {
    if (abandonAllHope) {
      throw new BadException();
    }
  }

  public void crossFingers() {
    try {
      anObject.takeRisk();
    } catch (BadException e) {
      System.out.println("Aaargh!");
      e.printStackTrace();
    }
  }

  void catchExceptions() {
//    try {
//      laundry.doLaundry();
//
//    } catch (ShirtException shex) {
//      // recovery code
//    }
  }

}

class Risky {
  public Foo doRiskyThing() {
    return null;
  }
}

class Foo {
  public int getNum() {
    return 0;
  }
}
