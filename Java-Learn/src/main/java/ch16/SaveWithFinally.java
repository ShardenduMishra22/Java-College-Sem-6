package ch16;

import java.io.*;
import java.util.List;

public class SaveWithFinally {
  private List<QuizCard> cardList;

  private void saveFile(File file) {
    BufferedWriter writer = null;
    try {
      writer = new BufferedWriter(new FileWriter(file));

      for (QuizCard card : cardList) {
        writer.write(card.getQuestion() + "/");
        writer.write(card.getAnswer() + "\n");
      }

    } catch (IOException e) {
      System.out.println("Couldn't write the cardList out: " + e.getMessage());
    } finally {
      try {
        writer.close();
      } catch (Exception e) {
        System.out.println("Couldn't close writer: " + e.getMessage());
      }
    }
  }
}
