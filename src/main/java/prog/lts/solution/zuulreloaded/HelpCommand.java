package prog.lts.solution.zuulreloaded;

import prog.lts.exercise.zuulreloaded.Command;
import prog.lts.exercise.zuulreloaded.Player;
import prog.lts.exercise.zuulreloaded.Renderer;
import prog.lts.exercise.zuulreloaded.ZuulException;

/**
 * The HelpCommand lists all possible commands.
 */
public class HelpCommand extends Command {
  private static final org.slf4j.Logger logger =
          org.slf4j.LoggerFactory.getLogger(HelpCommand.class);

  public HelpCommand(Renderer renderer) {
  }

  @Override
  public boolean execute(final Player player) throws ZuulException {
    return false;
  }
}
