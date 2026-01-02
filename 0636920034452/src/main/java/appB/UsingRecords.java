package appB;

public class UsingRecords {
  public static void main(String[] args) {
    usingARecordLooksJustLikeANormalClass();
  }

  static void usingARecordLooksJustLikeANormalClass() {
    Customer customer = new Customer(7, "Trisha");
    System.out.println(customer);
    System.out.println(customer.name());

    System.out.println("customer = " + customer);
    System.out.println("customer.name() = " + customer.name());
  }
}
