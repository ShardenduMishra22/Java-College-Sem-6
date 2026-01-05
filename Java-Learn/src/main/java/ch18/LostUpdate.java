package ch18;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class LostUpdate {
  public static void main(String[] args) throws InterruptedException {
    ExecutorService pool = Executors.newFixedThreadPool(30);
    AtomicBalance balance = new AtomicBalance();
    for (int i = 0; i < 1000; i++) {
      pool.execute(() -> balance.increment());
    }
    pool.shutdown();
    // make sure the pool has finished running all the updates before printing the output
    if (pool.awaitTermination(1, TimeUnit.MINUTES)) {
      System.out.println("balance = " + balance.balance);
    }
  }
}

class Balance {
  int balance = 0;

  // add synchronized here to see it work properly
  public void increment() {
    balance++;
  }
}

class AtomicBalance {
  AtomicInteger balance = new AtomicInteger(0);

  public void increment() {
    balance.incrementAndGet();
  }
}

