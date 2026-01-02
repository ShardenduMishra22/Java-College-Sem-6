package ch16;

import java.io.*;
import java.util.List;

public class SaveWithTWR {
  private List<QuizCard> cardList;

  private void saveFile(File file) {
    try (BufferedWriter writer =
           new BufferedWriter(new FileWriter(file));
         BufferedReader reader =
           new BufferedReader(new FileReader(file))) {

      for (QuizCard card : cardList) {
        writer.write(card.getQuestion() + "/");
        writer.write(card.getAnswer() + "\n");
      }
    } catch (IOException e) {
      System.out.println("Couldn't write the cardList out: " + e.getMessage());
    }
  }
}
