package prog.lts.zuulreloaded;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import prog.lts.exercise.zuulreloaded.Room;
import prog.lts.solution.zuulreloaded.BasicRoom;
import prog.lts.solution.zuulreloaded.BasicScenario;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;


public class TestBasicScenario {

    public static final String SCENARIO_NAME = "Scenario One";
    public static List<Room> rooms;
    private BasicScenario basicScenario;
    private Room startRoom;
    private Room secondRoom;
    private Room secondStartRoom;

    @Before
    public void setup() {
        rooms = new ArrayList<>();
        basicScenario = new BasicScenario(SCENARIO_NAME);
        startRoom = new BasicRoom("start");
        secondRoom = new BasicRoom("second");
        secondStartRoom = new BasicRoom("start2");
        rooms.add(startRoom);
        rooms.add(secondRoom);
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test @Ignore
    public void testScenarioName() {
        String actual = basicScenario.getScenarioName();
        assertEquals("Name of the scenario should be  " + SCENARIO_NAME + ", but it is " + actual + ".", SCENARIO_NAME, actual);
    }

    @Test @Ignore
    public void testRoomListEmpty(){
        expectedException.expect(IllegalArgumentException.class);
        basicScenario.setRooms(new ArrayList<>());
    }

    @Test @Ignore
    public void testRoomListNull(){
        expectedException.expect(IllegalArgumentException.class);
        basicScenario.setRooms(null);
    }

    @Test @Ignore
    public void testRoomList(){
        assertNull("The list should be null by default", basicScenario.getRooms());

        basicScenario.setRooms(rooms);

        List<Room> actual = basicScenario.getRooms();
        assertEquals("The returned list from the get-method does not match the list set by the setter-method.", rooms, actual);
    }

    @Test @Ignore
    public void testRandomRoom(){
        basicScenario.setRooms(rooms);
        assertTrue("The rooms-list does not contain the returned room.", basicScenario.getRooms().contains(basicScenario.getRandomRoom()));
    }

    @Test @Ignore
    public void testStartRoomNull(){
        expectedException.expect(IllegalArgumentException.class);
        basicScenario.setStartRoom(null);
    }

    @Test @Ignore
    public void testStartRoomUnknown(){
       expectedException.expect(IllegalArgumentException.class);
       basicScenario.setRooms(rooms);
       basicScenario.setStartRoom(secondStartRoom);
    }

    @Test @Ignore
    public void testStartRoom() {
        assertNull("The starting room should be null by default.", basicScenario.getStartRoom());
        basicScenario.setRooms(rooms);
        basicScenario.setStartRoom(startRoom);
        Room actual = basicScenario.getStartRoom();
        assertEquals("The room returned by the get-method does not match the room previously set.", startRoom, actual);
    }
}
