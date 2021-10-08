package prog.lts.exercise.zuulreloaded;

/**
 * Enum for all different commands to identify the command.
 *
 * <p>The commandKey will help to find multilingual expressions for the enums.
 */
public enum CommandWord {
  GO("cmd.go"),
  HELP("cmd.help"),
  LOOK("cmd.look"),
  QUIT("cmd.quit"),
  UNKNOWN("cmd.unknown");

  private String commandKey;

  CommandWord(final String commandKey) {
    this.commandKey = commandKey;
  }

  public String getCommandKey() {
    return commandKey;
  }
}
