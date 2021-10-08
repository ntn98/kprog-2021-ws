package prog.lts.exercise.zuulreloaded;

/**
 * The player is embedded in the scenario. He is always in a certain room of the scenario.
 */
public interface Player {

  /**
   * Returns the current room the player is in.
   *
   * @return current room where the player is in
   */
  Room getCurrentRoom();

  /**
   * Set the current room, the player is in.
   *
   * @param room current room, the player is in
   */
  void setCurrentRoom(Room room);

  /**
   * Tries to move the player in the given direction.
   *
   * @param direction direction the player shall walk
   */
  void walk(String direction) throws InvalidDirectionException;

  /**
   * Allows the player to check the current room.
   */
  void look();
}
