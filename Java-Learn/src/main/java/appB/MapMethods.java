package appB;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {
  void addOrGetCustomer(String usr) {
    Map<String, Actions> custActs = new HashMap<>();
    Actions actions = custActs.computeIfAbsent(usr, name -> new Actions(name));
    // do something with activity
  }

  void addOrGetCustomerOld(String usr) {
    Map<String, Actions> custActs = new HashMap<>();
    // probably other stuff happens here...
    Actions actions = custActs.get(usr);
    if (actions == null) {
      actions = new Actions(usr);
      custActs.put(usr, actions);
    }
    // do something with actions
  }

  void incrementMetricWeCareAbout(String metric) {
    Map<String, Integer> metrics = new HashMap<>();
    // probably other stuff happens here...

    if (metrics.containsKey(metric)) {
      Integer integer = metrics.get(metric);
      metrics.put(metric, ++integer);
    }
  }

  private class Actions {
    private String username;

    public Actions(String username) {
      this.username = username;
    }
  }
}
