package appB;

public enum Member {KEVIN, BOB, STUART}

class SomeClass {
  public Member selectedBandMember;

  // later in the code...

  void someMethod() {
    if (selectedBandMember == Member.KEVIN) {
      // do KEVIN-related stuff
    }
  }

  static void doComparisons(Member member) {
    if (member.equals(Member.KEVIN))
      System.out.println("Bellloooo!");
    if (member == Member.BOB)
      System.out.println("Poochy");

    switch (member) {
      case KEVIN: System.out.print("Uh... la cucaracha?");
      case BOB: System.out.println("King Bob");
      case STUART: System.out.print("Banana!");
    }
  }

  public static void main(String[] args) {
    doComparisons(Member.BOB);
  }
}