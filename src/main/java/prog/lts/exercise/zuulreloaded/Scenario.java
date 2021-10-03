package prog.lts.exercise.zuulreloaded;

import java.util.List;

/**
 * A scenario contains a set of rooms for the zuul game. There must be at minimum one room in the
 * scenario. Also the startRoom must be set to be a valid scenario.
 */
public interface Scenario {

  /**
   * returns the list of rooms of the scenario.
   *
   * @return list of rooms
   */
  public List<Room> getRooms();

  /**
   * Sets the list of rooms.
   *
   * @param rooms list of rooms
   * @throws IllegalArgumentException if the list is empty or a null reference
   */
  public void setRooms(List<Room> rooms) throws IllegalArgumentException;

  /**
   * Returns the room the game is starting of.
   *
   * @return the starting room
   */
  public Room getStartRoom();

  /**
   * Sets the room the game is starting of. This room must be in the list of rooms.
   *
   * @param startRoom room to start from
   * @throws IllegalArgumentException if the startRoom is either null or not in the list of rooms.
   */
  public void setStartRoom(Room startRoom);

  /**
   * selects randomly one of the rooms of the list of rooms.
   *
   * @return randomly selected room
   */
  public Room getRandomRoom();

  /**
   * Returns the name of the scenario.
   *
   * @return name of the scenario
   */
  public String getScenarioName();
}
