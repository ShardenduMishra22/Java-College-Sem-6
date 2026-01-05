package ch10;

public class Song {
  String title;

  public Song(String t) {
    title = t;
  }

  public void play() {
    SoundPlayer player = new SoundPlayer();
    player.playSound(title);
  }
}

class SoundPlayer {
  public void playSound(String title) {

  }
}
