package prog.lts.solution.zuulreloaded;

import prog.lts.exercise.zuulreloaded.Command;
import prog.lts.exercise.zuulreloaded.Player;
import prog.lts.exercise.zuulreloaded.ZuulException;

/**
 * The goCommand realizes the movement of a player. It should contain a second parameter, the
 * direction in which the movement should take place.
 */
public class GoCommand extends Command {
  private static final org.slf4j.Logger logger =
          org.slf4j.LoggerFactory.getLogger(GoCommand.class);

  @Override
  public boolean execute(final Player player) throws ZuulException {
    return false;
  }
}
