package prog.lts.exercise.zuulreloaded;

/**
 * An object that runs the game loop. A game can be configured with a scenario and a parser. The
 * game loop grabs the new command from the parser and executes it with respect to the scenario.
 */
public interface Game {
  /**
   * configures the game.
   *
   * @param scenario A scenario with rooms. The scenario may not be null. There must exist
   *                 at minimum one room. For further details @see Scenario
   * @param parser   A parser which makes commands available as soon as they are given by the user
   *                 or a mock component.
   * @param renderer A renderer which transports different kinds of output to the user interface
   * @throws NullPointerException     if either scenario or parser or renderer are a null reference
   * @throws IllegalArgumentException if the scenario has not startingRoom.
   */
  void configureGame(Scenario scenario, Parser parser, Renderer renderer)
          throws IllegalArgumentException;

  /**
   * Starts the game.
   *
   * @throws IllegalStateException if the game is not configured correctly or is already running
   */
  void play() throws IllegalStateException;

  /**
   * Resets the game and sets it into an unconfigured state. If the game is running, it is stopped.
   */
  void reset();

  /**
   * Returns the state the game is in.
   *
   * @return state of the game
   */
  GameState getGameState();
}
