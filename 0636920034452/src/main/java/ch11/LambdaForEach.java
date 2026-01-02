package ch11;

import java.util.Collections;
import java.util.List;

public class LambdaForEach {

  public static void main(String[] args) {
    new LambdaForEach().go();
  }

  public void go() {
    List<SongV3> mySongs = MockSongs.getSongsV3();

    mySongs.forEach(mySong -> System.out.println(mySong));


    System.out.println(mySongs);
    Collections.sort(mySongs);
    System.out.println(mySongs);
  }
}