package prog.lts.solution.zuulreloaded;

import prog.lts.exercise.zuulreloaded.Command;
import prog.lts.exercise.zuulreloaded.Player;
import prog.lts.exercise.zuulreloaded.ZuulException;

/**
 * the LookCommand triggers the player to list all the player can see.
 */
public class LookCommand extends Command {
  private static final org.slf4j.Logger logger =
          org.slf4j.LoggerFactory.getLogger(LookCommand.class);

  @Override
  public boolean execute(final Player player) throws ZuulException {
    return false;
  }
}
