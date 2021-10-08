package prog.lts.solution.zuulreloaded;

import prog.lts.exercise.zuulreloaded.InvalidDirectionException;
import prog.lts.exercise.zuulreloaded.Player;
import prog.lts.exercise.zuulreloaded.Room;

/**
 * Implements the Player interface in a simple and straight-forward way.
 */
public class BasicPlayer implements Player {
  private static final org.slf4j.Logger logger =
          org.slf4j.LoggerFactory.getLogger(BasicPlayer.class);

  @Override
  public Room getCurrentRoom() {
    return null;
  }

  @Override
  public void setCurrentRoom(final Room room) {

  }

  @Override
  public void walk(final String direction) throws InvalidDirectionException {

  }

  @Override
  public void look() {

  }
}
