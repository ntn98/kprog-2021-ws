package prog.lts.exercise.zuulreloaded;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Gets thrown when a command is not in proper shape.
 */
public class InvalidCommandException extends ZuulException {
  private static final Logger logger =
          LoggerFactory.getLogger(InvalidCommandException.class);

  CommandWord commandWord;

  /**
   * Constructor to allow the transport of the command word.
   *
   * @param commandWord CommandWord belonging to this command
   * @param message additional message explaining the reason
   */
  public InvalidCommandException(CommandWord commandWord, final String message) {
    super(message);
    this.commandWord = commandWord;
  }

  @Override
  public String getMessage() {
    return "Command " + commandWord + ":" + super.getMessage();
  }

  @Override
  public String getLocalizedMessage() {
    return "Command " + commandWord + ":" + super.getLocalizedMessage();
  }
}
