package appB;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class MapMethodsTest {

  @Test
  void shouldOnlyAddMetricsThatWeCareAbout() {
    Map<String, Integer> metrics = new HashMap<>();
    metrics.put("metric 1", 0);
    metrics.put("metric 2", 0);
    metrics.put("metric 3", 0);

    Integer newValue = metrics.computeIfPresent("metric 1", (key, value) -> ++value);
    System.out.println("metrics = " + metrics);
    Assertions.assertEquals(1, metrics.get("metric 1"));
    Assertions.assertEquals(1, newValue);

    metrics.computeIfPresent("metric 4", (s, integer) -> ++integer);
    System.out.println("metrics = " + metrics);
    Assertions.assertFalse(metrics.containsKey("metric 4"));
  }

  @Test
  void shouldOnlyAddMetricsThatWeCareAboutOld() {
    Map<String, Integer> metrics = new HashMap<>();
    metrics.put("metric 1", 0);
    metrics.put("metric 2", 0);
    metrics.put("metric 3", 0);

    String key = "metric 1";
    if (metrics.containsKey(key)) {
      Integer value = metrics.get(key);
      metrics.put(key, ++value);
    }
    System.out.println("metrics = " + metrics);
    Assertions.assertEquals(1, metrics.get("metric 1"));
  }

  @Test
  void shouldSeeWhatReplaceAllLooksLike() {
    Map<String, Integer> metrics = new HashMap<>();
    metrics.put("metric 1", 0);
    metrics.put("metric 2", 0);
    metrics.put("metric 3", 0);

    metrics.replaceAll((key, value) -> ++value);
    Assertions.assertEquals(1, metrics.get("metric 1"));
    Assertions.assertEquals(1, metrics.get("metric 2"));
    Assertions.assertEquals(1, metrics.get("metric 3"));
  }

  @Test
  void shouldSeeWhatForEachLooksLike() {
    Map<String, Integer> metrics = new HashMap<>();
    metrics.put("metric 1", 0);
    metrics.put("metric 2", 0);
    metrics.put("metric 3", 0);

    metrics.forEach((key, value) -> {
      System.out.println("key = " + key);
      System.out.println("value = " + value);
    });
  }
}