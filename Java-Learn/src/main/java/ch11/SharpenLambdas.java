package ch11;

import java.util.List;

public class SharpenLambdas {
  public static void main(String[] args) {
    new SharpenLambdas().go();
  }

  public void go() {
    List<SongV3> songList = MockSongs.getSongsV3();
    System.out.println(songList);

    songList.sort((one, two) -> one.getBpm() - two.getBpm());
    System.out.println(songList);

    songList.sort((one, two) -> two.getTitle().compareTo(one.getTitle()));
    System.out.println(songList);
  }
}
