package ch13.sharpen;

public class Sharpen {
  private Risky x = new Risky();

  void catchExceptions() {
    try {
      x.doRisky();
    } catch(AlphaEx a) {
      // recovery from AlphaEx
    } catch(BetaEx b) {
      // recovery from BetaEx
    } catch(GammaEx c) {
      // recovery from GammaEx
    } catch(DeltaEx d) {
      // recovery from DeltaEx
    }
  }

  public static void main(String[] args) {
    new Sharpen().catchExceptions();
  }
}
