package prog.lts.exercise.zuulreloaded;

import java.util.Set;

/**
 * A room may have none or more exits.
 */
public interface Room {

  /**
   * returns the next room in the given direction.
   *
   * @param direction direction where the room should be located
   * @return Room which is located in this direction
   * @throws InvalidDirectionException if the direction is a readable string, but not a direction
   *                                   where an exit is configured
   * @throws IllegalArgumentException  if the direction is a null reference
   */
  Room getExit(String direction) throws InvalidDirectionException, IllegalArgumentException;

  /**
   * Returns a set with directions where exits lie.
   *
   * @return set of directions
   */
  Set<String> getExits();

  /**
   * Sets the exit in a given direction.
   *
   * @param direction direction where the given room is located
   * @param room      room located in the given direction
   * @throws IllegalArgumentException when either parameter is a null reference or the direction
   *                                  is a non-readable string (empty string or only whitespace)
   */
  void setExit(String direction, Room room) throws IllegalArgumentException;

  /**
   * Returns a description of the room.
   *
   * @return description of the room
   */
  String getDescription();

  /**
   * Returns a complete description of the room.
   *
   * @return complete description of the room
   */
  String getLongDescription();

  /**
   * Returns a list of directions of the exits as a string. There is no order specified.
   *
   * @return list of directions where the exits are located.
   */
  String getExitsAsString();
}
