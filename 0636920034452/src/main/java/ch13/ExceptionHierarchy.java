package ch13;

public class ExceptionHierarchy {
  private Laundry laundry;

  void catchMultipleExceptions() {
    try {
      laundry.doLaundry();

    } catch (TeeShirtException tex) {
      // recovery from TeeShirtException

    } catch (LingerieException lex) {
      // recovery from LingerieException

    } catch (ClothingException cex) {
      // recovery from all others
    }
  }
}
