package prog.lts.exercise.zuulreloaded.cli;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import prog.lts.exercise.zuulreloaded.Command;
import prog.lts.exercise.zuulreloaded.Renderer;
import prog.lts.solution.zuulreloaded.GoCommand;
import prog.lts.solution.zuulreloaded.HelpCommand;
import prog.lts.solution.zuulreloaded.LookCommand;
import prog.lts.solution.zuulreloaded.QuitCommand;


/**
 * This class manages the language-specific text strings to find the appropriate command.
 */
public class CommandWords {
  private static final org.slf4j.Logger logger =
          org.slf4j.LoggerFactory.getLogger(CommandWords.class);
  private Map<String, Command> commands;

  Renderer renderer;

  /**
   * Constructor - initialise the command words.
   */
  public CommandWords(Renderer renderer) {
    this.renderer = renderer;
    commands = new HashMap<>();
    commands.put("go", new GoCommand());
    commands.put("help", new HelpCommand(renderer));
    commands.put("quit", new QuitCommand());
    commands.put("look", new LookCommand());
  }

  /**
   * Given a command word, find and return the matching command object.
   * Return null if there is no command with this name.
   */
  public Command get(String word) {
    return (Command) commands.get(word);
  }

  /**
   * Print all valid commands to System.out.
   */
  public void showAll() {
    for (Iterator i = commands.keySet().iterator(); i.hasNext(); ) {
      System.out.print(i.next() + "  ");
    }
    System.out.println();
  }

  /**
   * Return a string with all commands available.
   *
   * @return string with all commands available
   */
  public String getCommandsAsString() {
    String stringWithCommands = "";
    for (String key : commands.keySet()) {
      stringWithCommands += key + " ";
    }
    stringWithCommands += "\n";
    return stringWithCommands;
  }
}
