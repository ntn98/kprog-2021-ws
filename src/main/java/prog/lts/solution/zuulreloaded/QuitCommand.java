package prog.lts.solution.zuulreloaded;

import prog.lts.exercise.zuulreloaded.Command;
import prog.lts.exercise.zuulreloaded.Player;
import prog.lts.exercise.zuulreloaded.ZuulException;

/**
 * The QuitCommand terminates the game.
 */
public class QuitCommand extends Command {
  private static final org.slf4j.Logger logger =
          org.slf4j.LoggerFactory.getLogger(QuitCommand.class);

  @Override
  public boolean execute(final Player player) throws ZuulException {
    return false;
  }
}
