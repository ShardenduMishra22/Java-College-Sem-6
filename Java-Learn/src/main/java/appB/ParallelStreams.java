package appB;


import ch12.JukeboxData;
import ch12.Song;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStreams {
  void startAParallelStream() {
    List<Song> songs = new JukeboxData.Songs().getSongs();

    Stream<Song> songStream = songs.parallelStream();
  }

  void addAParallelOperationStream() {
    List<Song> songs = new JukeboxData.Songs().getSongs();

    Stream<Song> songStream = songs.stream()
                                   .parallel();
  }
}
