package ch13;

import javax.sound.midi.*;

public class PlayingMusic {
  public void play() {
    try {
      Sequencer sequencer = MidiSystem.getSequencer();
      System.out.println("Successfully got a sequencer");

    } catch(MidiUnavailableException e) {
      System.out.println("Bummer");
    }
  }
}
