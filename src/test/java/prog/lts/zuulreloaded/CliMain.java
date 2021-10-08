package prog.lts.zuulreloaded;

import prog.lts.exercise.zuulreloaded.Game;
import prog.lts.exercise.zuulreloaded.Parser;
import prog.lts.exercise.zuulreloaded.Renderer;
import prog.lts.exercise.zuulreloaded.Scenario;
import prog.lts.exercise.zuulreloaded.cli.CliParser;
import prog.lts.exercise.zuulreloaded.cli.CliRenderer;
import prog.lts.solution.zuulreloaded.BasicGame;

/**
 * Creates a scenario, configures the game with a command line interface and starts the game.
 */
public class CliMain {
  private static final org.slf4j.Logger logger =
          org.slf4j.LoggerFactory.getLogger(CliMain.class);

  public static void main(String[] args) {
    Scenario scenario = ScenarioGenerator.generateSimplestScenario();
    Renderer renderer = new CliRenderer();
    Parser parser = new CliParser(renderer);
    Game game = new BasicGame();
    game.configureGame(scenario, parser, renderer);
    game.play();
  }
}
