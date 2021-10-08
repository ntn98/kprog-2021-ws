package prog.lts.exercise.zuulreloaded.cli;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import prog.lts.exercise.zuulreloaded.Command;
import prog.lts.exercise.zuulreloaded.Parser;
import prog.lts.exercise.zuulreloaded.Renderer;


/**
 * Parser to control the game using the command line interface.
 */
public class CliParser implements Parser {
  private static final org.slf4j.Logger logger =
          org.slf4j.LoggerFactory.getLogger(CliParser.class);

  private CommandWords commandWords;
  private Renderer renderer;

  public CliParser(Renderer renderer) {
    this.renderer = renderer;
    commandWords = new CommandWords(renderer);
  }

  @Override
  public Command getCommand() {
    String inputLine = "";   // will hold the full input line
    String word1;
    String word2;

    System.out.print("> ");     // print prompt

    BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));
    try {
      inputLine = reader.readLine();
    } catch (java.io.IOException exc) {
      System.out.println("There was an error during reading: " + exc.getMessage());
    }

    StringTokenizer tokenizer = new StringTokenizer(inputLine);

    if (tokenizer.hasMoreTokens()) {
      word1 = tokenizer.nextToken();      // get first word
    } else {
      word1 = null;
    }
    if (tokenizer.hasMoreTokens()) {
      word2 = tokenizer.nextToken();      // get second word
    } else {
      word2 = null;
    }

    // note: we just ignore the rest of the input line.

    Command command = commandWords.get(word1);
    if (command != null) {
      command.setSecondWord(word2);
    }
    return command;
  }

  @Override
  public String getCommandsAsString() {
    return commandWords.getCommandsAsString();
  }
}
