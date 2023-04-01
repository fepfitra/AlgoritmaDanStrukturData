import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    new preProcessor()
      .readFile("Berita1.txt")
      // .readConsole(System.in)
      .filter("[^A-Za-z ]")
      .toLowercase()
      .removeStopWords("stopwords_id.txt")
      .removeDuplicates()
      .getContent()
      .forEach(item -> {
        System.out.println(item);
      });

    // for (String word : words) {
    //   System.out.println(word);
    // }
  }
}
