package prog.lts.exercise.zuulreloaded;

/**
 * This class is an abstract superclass for all command classes in the game.
 * Each user command is implemented by a specific command subclass.
 *
 * <p>Objects of class Command can store an optional argument word (a second
 * word entered on the command line). If the command had only one word,
 * then the second word is null.
 *
 * @author Michael Kolling and David J. Barnes
 * @version 2016.02.29
 */

public abstract class Command {
  private static final org.slf4j.Logger logger =
          org.slf4j.LoggerFactory.getLogger(Command.class);

  protected CommandWord commandWord = CommandWord.UNKNOWN;
  private String secondWord;

  /**
   * Create a command object. First and second word must be supplied, but
   * either one (or both) can be null. The command word should be null to
   * indicate that this was a command that is not recognised by this game.
   */
  public Command() {
    secondWord = null;
  }

  /**
   * Returns the CommandWord representing the command.
   *
   * @return CommandWord representing the command
   */
  public CommandWord getCommandWord() {
    return commandWord;
  }

  /**
   * Return the second word of this command. If no
   * second word was entered, the result is null.
   */
  public String getSecondWord() {
    return secondWord;
  }

  /**
   * Define the second word of this command (the word
   * entered after the command word). Null indicates that
   * there was no second word.
   */
  public void setSecondWord(String secondWord) {
    this.secondWord = secondWord;
  }

  /**
   * Check whether a second word was entered for this
   * command.
   */
  public boolean hasSecondWord() {
    return secondWord != null;
  }

  /**
   * Asserts that the command has a parameter or not. This method can be used in the derived
   * classes to check that the command is valid.
   *
   * @param shouldExist true when a second word should exist, otherwise false
   * @throws InvalidCommandException when a second word is expected but not available or a second
   *                                 word should not appear, but it does
   */
  protected void assertThatSecondWordIsInTheRightMode(boolean shouldExist)
          throws InvalidCommandException {
    if (shouldExist && !hasSecondWord()) {
      throw new InvalidCommandException(commandWord,
              "Command should have a parameter but hasn't.");
    }
    if (!shouldExist && hasSecondWord()) {
      throw new InvalidCommandException(commandWord,
              "Command should have no parameter but has one: " + getSecondWord() + ".");
    }
  }

  /**
   * Execute this command. A flag is returned indicating whether
   * the game is over as a result of this command.
   *
   * @return True, if game should exit; false otherwise.
   * @throws ZuulException if anything goes wrong with the execution where the player has the
   *                       chance to correct it.
   */
  public abstract boolean execute(Player player) throws ZuulException;

}

