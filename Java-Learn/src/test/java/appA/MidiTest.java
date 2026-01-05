package appA;

import org.junit.jupiter.api.Test;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

import static org.junit.jupiter.api.Assertions.*;

class MidiTest {

  @Test
  void testInstruments() throws MidiUnavailableException {
    Synthesizer synthesizer = MidiSystem.getSynthesizer();
    synthesizer.open();
    Instrument[] orchestra = synthesizer.getAvailableInstruments();
    for (Instrument instrument : orchestra) {
      System.out.println(instrument);
    }

  }

}