package prog.lts.exercise.zuulreloaded;

/**
 * Thrown to indicate that the room has no exit in the given direction.
 */
public class InvalidDirectionException extends ZuulException {
  private static final org.slf4j.Logger logger =
          org.slf4j.LoggerFactory.getLogger(InvalidDirectionException.class);

  private Room room;
  private String direction;

  /**
   * Constructor of the exception.
   *
   * @param room room in which the player tried to go into the given direction
   * @param direction direction the player requested to go in the given room
   */
  public InvalidDirectionException(final Room room, final String direction) {
    this.room = room;
    this.direction = direction;
  }

  @Override
  public String getMessage() {
    return "You are in room " + room + ". You cannot go in direction " + direction;
  }

  public Room getRoom() {
    return room;
  }

  public String getDirection() {
    return direction;
  }
}
