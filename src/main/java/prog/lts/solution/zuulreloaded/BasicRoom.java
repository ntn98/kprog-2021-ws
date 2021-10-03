package prog.lts.solution.zuulreloaded;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import prog.lts.exercise.zuulreloaded.InvalidDirectionException;
import prog.lts.exercise.zuulreloaded.Room;


/**
 * Implementing the Room interface in a simple and straightforward way.
 */
public class BasicRoom implements Room {

  public BasicRoom(String description) {
  }

  @Override
  public Room getExit(final String direction) throws InvalidDirectionException {
    return null;
  }

  @Override
  public Set<String> getExits() {
    return null;
  }

  @Override
  public void setExit(String direction, Room room) {
  }

  @Override
  public String getDescription() {
    return null;
  }

  @Override
  public String getLongDescription() {
    return null;
  }

  @Override
  public String getExitsAsString() {
    return null;
  }
}
