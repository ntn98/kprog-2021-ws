package prog.lts.zuulreloaded;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import prog.lts.exercise.zuulreloaded.InvalidDirectionException;
import prog.lts.exercise.zuulreloaded.Room;
import prog.lts.solution.zuulreloaded.BasicRoom;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class TestBasicRoom {

	private static final String NORTH = "north";
	private static final String EAST = "east";
	private static final String SOUTH = "south";
	private static final String WEST = "west";

	private final Room kitchen = new BasicRoom("Kitchen");
	private final Room hallway = new BasicRoom("Hallway");
	private final Room livingRoom = new BasicRoom("Living room");
	private final Room bedRoom = new BasicRoom("Bedroom");

	@Before
	public void setup() {
		hallway.setExit(SOUTH, livingRoom);
		hallway.setExit(WEST, kitchen);
		hallway.setExit(EAST, bedRoom);

		livingRoom.setExit(NORTH, hallway);
		livingRoom.setExit(EAST, bedRoom);
	}

	@Test @Ignore
	public void testGetDescription() {
		String message = "getDescription() did not return the description that was set in the constructor.";
		assertEquals(message, "Kitchen", kitchen.getDescription());
		assertEquals(message, "Bedroom", bedRoom.getDescription());
	}

	@Test @Ignore
	public void testGetExit() {
		kitchen.setExit(NORTH, hallway);
		try {
			Room exit = kitchen.getExit(NORTH);
			assertNotNull("null was returned instead of a room.", exit);
			assertEquals("The wrong room was returned.", hallway, exit);
		} catch (InvalidDirectionException e) {
			fail("InvalidDirectionException was thrown, despite the direction was valid.");
		}
	}

	@Test @Ignore
	public void testGetExitInvalid() {
		try {
			kitchen.getExit(NORTH);
			fail("InvalidDirectionException was not thrown, despite the direction was invalid.");
		} catch (InvalidDirectionException e) {
			System.out.println("Detected invalid direction successfully.");
			assertEquals("The InvalidDirectionException did not has the right room attached.", kitchen, e.getRoom());
			assertEquals("The InvalidDirectionException did not has the right direction attached.", NORTH, e.getDirection());
		}

		try {
			kitchen.getExit(null);
			fail("Exception was not thrown, despite the direction was null.");
		} catch (IllegalArgumentException | InvalidDirectionException | NullPointerException e) {
			assertTrue("Argument was null. Therefore a IllegalArgumentException should be thrown, as described in the Javadoc.",
					e instanceof IllegalArgumentException);
			System.out.println("Detected null direction successfully.");
		}
	}

	@Test @Ignore
	public void testGetExits() {
		String message = "The exits did not mach the exits that were added via setExits() before.";

		Set<String> expectedExitsHallway = new HashSet<>();
		expectedExitsHallway.add(EAST);
		expectedExitsHallway.add(SOUTH);
		expectedExitsHallway.add(WEST);
		assertEquals(message, expectedExitsHallway, hallway.getExits());

		Set<String> expectedExitsLivingRoom = new HashSet<>();
		expectedExitsLivingRoom.add(NORTH);
		expectedExitsLivingRoom.add(EAST);
		assertEquals(message, expectedExitsLivingRoom, livingRoom.getExits());
	}

	@Test @Ignore
	public void testGetExitsAsString() {
		String message = "The return value should contain every exit.";

		String livingRoomExits = livingRoom.getExitsAsString();

		assertTrue(message, livingRoomExits.contains(NORTH));
		assertTrue(message, livingRoomExits.contains(EAST));
	}

	@Test @Ignore
	public void testGetLongDescription() {
		String message = "The return value should contain ";

		String livingRoomLongDescription = livingRoom.getLongDescription();

		assertTrue(message + "the description.",
				livingRoomLongDescription.contains(livingRoom.getDescription()));
		assertTrue(message + "every exit. (use the getExitsAsString() method)",
				livingRoomLongDescription.contains(livingRoom.getExitsAsString()));
	}

	@Test @Ignore
	public void testSetExitNull() {
		try {
			kitchen.setExit(NORTH, null);
			fail("If null is passed as an argument for room, an IllegalArgumentException should be thrown.");
		} catch (IllegalArgumentException e) {
			System.out.println("Detected null room successfully as illegal argument.");
		}

	}

	@Test @Ignore
	public void testSetExitEmptyDirection() {
		try {
			kitchen.setExit(null, hallway);
			fail("If null is passed as an argument for direction, an IllegalArgumentException should be thrown.");
		} catch (IllegalArgumentException e) {
			System.out.println("Detected null successfully as illegal argument.");
		}

		try {
			kitchen.setExit("", hallway);
			fail("If an empty String is passed as an argument for direction, an IllegalArgumentException should be thrown.");
		} catch (IllegalArgumentException e) {
			System.out.println("Detected empty String successfully as illegal argument.");
		}

		try {
			kitchen.setExit(" ", hallway);
			fail("If one space is passed as an argument for direction, an IllegalArgumentException should be thrown.");
		} catch (IllegalArgumentException e) {
			System.out.println("Detected one space successfully as illegal argument.");
		}

		try {
			kitchen.setExit(" \n\t ", hallway);
			fail("If whitespace is passed as an argument for direction, an IllegalArgumentException should be thrown.");
		} catch (IllegalArgumentException e) {
			System.out.println("Detected whitespace successfully as illegal argument.");
		}
	}

}
