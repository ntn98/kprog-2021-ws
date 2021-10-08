package prog.lts.solution.zuulreloaded;

import prog.lts.exercise.zuulreloaded.Game;
import prog.lts.exercise.zuulreloaded.GameState;
import prog.lts.exercise.zuulreloaded.Parser;
import prog.lts.exercise.zuulreloaded.Player;
import prog.lts.exercise.zuulreloaded.Renderer;
import prog.lts.exercise.zuulreloaded.Scenario;

/**
 * Implements the Game interface in a simple and straight-forward way.
 */
public class BasicGame implements Game {
  private static final org.slf4j.Logger logger =
          org.slf4j.LoggerFactory.getLogger(BasicGame.class);

  @Override
  public void configureGame(final Scenario scenario, final Parser parser, final Renderer renderer)
          throws IllegalArgumentException {

  }

  @Override
  public void play() throws IllegalStateException {

  }

  @Override
  public void reset() {

  }

  @Override
  public GameState getGameState() {
    return null;
  }

  @Override
  public Player getPlayer() {
    return null;
  }
}
