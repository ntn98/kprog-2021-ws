package prog.lts.exercise.zuulreloaded;

/**
 * The Renderer offers methods to pass information to the user interface. Each user interface
 * (textual interface, graphical interface, audio interface, ...) will have its own renderer.
 */
public interface Renderer {

  /**
   * Renders some information directed to the player.
   *
   * @param text Text to be rendered
   */
  public void renderInfoForPlayer(String text);

  /**
   * Renders an exception.
   *
   * @param e Exception to be rendered
   */
  public void renderException(Exception e);

  /**
   * Renders the ui specific help.
   */
  public void renderHelp();
}
