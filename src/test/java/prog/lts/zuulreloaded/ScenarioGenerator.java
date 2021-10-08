package prog.lts.zuulreloaded;

import prog.lts.exercise.zuulreloaded.Room;
import prog.lts.exercise.zuulreloaded.Scenario;
import prog.lts.solution.zuulreloaded.BasicRoom;
import prog.lts.solution.zuulreloaded.BasicScenario;

import java.util.ArrayList;
import java.util.List;

/**
 * Generates multiple scenarios. OK. Not now. Now we have only one scenario.
 */
public class ScenarioGenerator {
  private static final org.slf4j.Logger logger =
          org.slf4j.LoggerFactory.getLogger(ScenarioGenerator.class);
  public static Scenario generateSimplestScenario() {
    Scenario scenario = new BasicScenario("SimplestScenario");
    Room outside = new BasicRoom("in front of the entrance.");
    Room oneRoomApartment = new BasicRoom("in the Apartment.");
    outside.setExit("north", oneRoomApartment);
    oneRoomApartment.setExit("south", outside);
    List<Room> roomList = new ArrayList<>();
    roomList.add(outside);
    roomList.add(oneRoomApartment);
    scenario.setRooms(roomList);
    scenario.setStartRoom(outside);

    return scenario;
  }
}
