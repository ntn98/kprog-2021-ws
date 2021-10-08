package prog.lts.exercise.zuulreloaded.cli;

import prog.lts.exercise.zuulreloaded.Renderer;

/**
 * Renderer to render the output to System.out.
 */
public class CliRenderer implements Renderer {
  private static final org.slf4j.Logger logger =
          org.slf4j.LoggerFactory.getLogger(CliRenderer.class);

  private CommandWords commandWords;

  public CliRenderer() {
    commandWords = new CommandWords(this);
  }

  @Override
  public void renderInfoForPlayer(final String text) {
    System.out.println(text);
  }

  @Override
  public void renderException(final Exception e) {
    System.out.println("----- A Problem occured --------");
    System.out.println(e.getMessage());
    System.out.println("--------------------------------");

  }

  @Override
  public void renderHelp() {
    System.out.println(commandWords.getCommandsAsString());

  }
}
