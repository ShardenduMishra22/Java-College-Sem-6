package appB;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.Files.newBufferedReader;
import static java.nio.file.Paths.get;

public class VarLVTI {
  void simpleVar() {
    var name = "A Name";
    var names = new ArrayList<>();
  }

  void varFromMethodCall() {
    var customers = getCustomers();
  }

  void varMustBeDefinedStraightAway() {
    // invalid
//    var name;

    var someValue = 1;

    // invalid
//    someValue = "String";
  }

  void considerVariableNames() throws IOException {
    // descriptive names
    var reader = newBufferedReader(get("/"));

    //unhelpful names
    var stuff = doTheThing();
  }

  void programmingToInterface() {
    // need to declare the interface on the left hand side
    List<String> list1 = new ArrayList<>();

    // list2 is an ArrayList
    var list2 = new ArrayList<String>();
  }

  void doNotUseWithDiamondOperator() {
    // this is an ArrayList of Objects
    var list = new ArrayList<>();
  }

  private List<Customer> getCustomers() {
    return null;
  }

  private class Customer {

  }

  private String doTheThing() {
    return null;
  }
}
