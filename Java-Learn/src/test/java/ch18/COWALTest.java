package ch18;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWALTest {
  @Test
  void doIGetTheSameIterator() {
    CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
    list.add("Hi");
    list.add("There");
    list.add("Everyone");

    // use the debugger to inspect these objects
    // the iterators are different instances (of course, because they will track different iterations of the data)
    // but the snapshot of the list that they iterate over are the same array
    System.out.println(list.iterator());
    System.out.println(list.iterator());
  }

  @Test
  void showMeTheNewArrayAfterWriting() {
    CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
    list.add("Hi");
    list.add("There");
    list.add("Everyone");

    // breakpoint here
    // initial iterator/backing array
    System.out.println(list.iterator());
    Iterator<String> iterator = list.iterator();
    System.out.println(iterator);

    // write to the list
    list.add("Hey I'm new here");

    // breakpoint here. Take a look at the backing array on a new iterator
    System.out.println(list.iterator());
  }
}
