package prog.lts.zuulreloaded;

import prog.lts.exercise.zuulreloaded.Game;
import prog.lts.exercise.zuulreloaded.Renderer;
import prog.lts.exercise.zuulreloaded.Scenario;
import prog.lts.exercise.zuulreloaded.cli.CliRenderer;
import prog.lts.solution.zuulreloaded.BasicGame;
import prog.lts.solution.zuulreloaded.GoCommand;
import prog.lts.solution.zuulreloaded.HelpCommand;

public class RunSimpleScenario {
  private static final org.slf4j.Logger logger =
          org.slf4j.LoggerFactory.getLogger(RunSimpleScenario.class);

  public static void main(String[] args) {
    Game game = new BasicGame();
    Scenario scenario = ScenarioGenerator.generateSimplestScenario();
    MockParser parser = new MockParser(1000);
    Renderer renderer = new CliRenderer();
    HelpCommand helpCommand = new HelpCommand(renderer);
    parser.addCommand(helpCommand);
    GoCommand goCommand1 = new GoCommand();
    goCommand1.setSecondWord("north");
    parser.addCommand(goCommand1);
    GoCommand goCommand2 = new GoCommand();
    goCommand2.setSecondWord("south");
    parser.addCommand(goCommand2);
    game.configureGame(scenario, parser, renderer);
    game.play();
  }
}
