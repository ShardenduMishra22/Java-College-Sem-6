package ch11;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {
  public static void main(String[] args) {

    List<SongV3> songList = MockSongs.getSongsV3();
    songList.sort((song1, song2) -> song1.getTitle().compareTo(song2.getTitle()));
    System.out.println(songList);
    songList.sort((song1, song2) -> song2.getTitle().compareTo(song1.getTitle()));
    System.out.println(songList);
    songList.sort((song1, song2) -> -song1.getTitle().compareTo(song2.getTitle()));
    System.out.println(songList);
    songList.sort((song1, song2) -> song1.getArtist().compareTo(song2.getArtist()));
    System.out.println(songList);
    songList.sort((song1, song2) -> song1.getBpm() - song2.getBpm());
    System.out.println(songList);
  }

  void methodReferences(List<SongV3> songList) {
    Collections.sort(songList, Comparator.comparing(SongV3::getTitle));
    songList.sort((song1, song2) -> song1.getTitle().compareTo(song2.getTitle()));

  }
}
