package ch11;

import java.util.*;

public class Jukebox7 {
  public static void main(String[] args) {
    new Jukebox7().go();
  }

  public void go() {
    List<SongV3> songList = MockMoreSongs.getSongsV3();
    System.out.println(songList);

    songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
    System.out.println(songList);

    songList.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
    System.out.println(songList);
  }
}
