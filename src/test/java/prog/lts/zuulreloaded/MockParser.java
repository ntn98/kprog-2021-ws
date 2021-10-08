package prog.lts.zuulreloaded;

import prog.lts.exercise.zuulreloaded.Command;
import prog.lts.exercise.zuulreloaded.Parser;
import prog.lts.solution.zuulreloaded.QuitCommand;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Parser which simulates a user interaction. The MockParser has a command queue which can be
 * filled by a test program. Between two calls of getCommand a minimal delay can be configured.
 *
 */
public class MockParser implements Parser {
  private static final org.slf4j.Logger logger =
          org.slf4j.LoggerFactory.getLogger(MockParser.class);

  private Queue<Command> commandQueue;
  private int delayInMilliSecs;

  /**
   *
   * @param delayInMilliSecs minimal delay between two simulated interactions
   */
  public MockParser(final int delayInMilliSecs) {
    this.delayInMilliSecs = delayInMilliSecs;
    commandQueue = new LinkedList<>();
  }

  @Override
  public Command getCommand() {
    try {
      Thread.sleep(delayInMilliSecs);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    if (commandQueue.isEmpty()) {
      return new QuitCommand();
    }
    return commandQueue.poll();
  }

  @Override
  public String getCommandsAsString() {
    return null;
  }

  /**
   * Adds a command to the command queue.
   *
   * @param command command to be added
   */
  public void addCommand(final Command command) {
    commandQueue.add(command);
  }
}
