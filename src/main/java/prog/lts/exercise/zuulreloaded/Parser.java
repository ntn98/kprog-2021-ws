package prog.lts.exercise.zuulreloaded;

/**
 * Parser receiving commands from the user in any kind and delivers command objects to the game
 * loop.
 */
public interface Parser {
  /**
   * returns the next command as soon as the user transmits it to the parser. This method can block
   * the control flow.
   *
   * @return command of the user
   */
  Command getCommand();

  /**
   * Returns a string listing all valid commands in alphabetical order.
   *
   * @return string containing all valid commands in alphabetical order
   */
  String getCommandsAsString();
}
