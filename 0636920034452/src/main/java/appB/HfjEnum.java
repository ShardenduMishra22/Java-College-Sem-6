package appB;

public class HfjEnum {
  enum BandMember {
    KEVIN("lead guitar") {
      public String sings() {
        return "plaintively";
      }
    },
    BOB("rhythm guitar") {
      public String sings() {
        return "hoarsely";
      }
    },
    STUART("bass");

    private final String instrument;

    BandMember(String instrument) {
      this.instrument = instrument;
    }

    public String getInstrument() {
      return this.instrument;
    }

    public String sings() {
      return "occasionally";
    }
  }

  public static void main(String[] args) {
    for (BandMember bandMember : BandMember.values()) {
      System.out.print(bandMember);
      System.out.print(", instrument: " + bandMember.getInstrument());
      System.out.println(", sings: " + bandMember.sings());
    }
  }
}