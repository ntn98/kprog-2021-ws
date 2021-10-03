package prog.lts.solution.zuulreloaded;

import java.util.List;
import prog.lts.exercise.zuulreloaded.Room;
import prog.lts.exercise.zuulreloaded.Scenario;

/**
 * Realizes a simple implementation of the Scenario interface.
 */
public class BasicScenario implements Scenario {

  public BasicScenario(String name) {
  }

  @Override
  public List<Room> getRooms() {
    return null;
  }

  @Override
  public void setRooms(final List<Room> rooms) throws IllegalArgumentException {
  }

  @Override
  public Room getStartRoom() {
    return null;
  }

  @Override
  public void setStartRoom(final Room startRoom) throws IllegalArgumentException {
  }

  @Override
  public Room getRandomRoom() {
    return null;
  }

  @Override
  public String getScenarioName() {
    return null;
  }
}
