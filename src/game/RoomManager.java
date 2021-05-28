package game;

import java.util.Scanner;
import java.util.ArrayList;
import fixtures.Room;
//import game.Player;

public class RoomManager {

	private Room currentRoom;
	
	private Room[][] room;

	private Room exitRoom;
	
	private int roomX;
	
	private int roomY;
	
//	private String item;
	
	
//	private Player currentRoom;
	
	public RoomManager(int roomX, int roomY) {
		super();
		room = new Room[roomX][roomY];
	}
	
	public void house() {
//		System.out.println("creating Rooms");
		
		Room greenhouse = new Room(
				"Greenhouse",
				"Lots of plants around with reports scattered around",
				"The notes show they were testing a virus on plants that enhances them...What happened here",
				"Green Herb"
				);
		this.room[0][3] = greenhouse;
		
		Room fountainArea = new Room(
				"Fountain",
				"Quite a beautiful area, lots of statues",
				"Quite a serene area but I can't help but feel as if something is watching me",
				"Trap"
				);
		this.room[0][2] = fountainArea;
		
		Room outsideShed = new Room(
				"Shed",
				"This shed seems to lead outside the mansion",
				"Plenty of tools laying around might be something useful"
				);
		this.room[0][1] = outsideShed;
		
		Room livingQuarters = new Room(
				"Living Quarters",
				"Lots of dead bodies, looks like they've been eaten partially...",
				"Not much light and smells awful, I should not be here with all the corpses around",
				"Trap"
				);
		this.room[0][0] = livingQuarters;

		Room diningHall = new Room(
				"Dining Hall",
				"There's a large table with unfinished food",
				"The food is molding and smells putrid, who leaves a room in this condition?"
				);
		this.room[1][0] = diningHall;
		
		Room kitchen = new Room(
				"Kitchen",
				"Doesn't looks like anyone has cleaned for a while",
				"Disgusting area, lots of dead bodies around... I shouldn't linger long",
				"Trap"
				);
		this.room[1][1] = kitchen;
		
		Room mainQuarters = new Room(
				"Main Quarters",
				"Main Quarters large mansion area with plenty of doors",
				"Is no one home? Very ominous... where should I start looking first"
				);
		this.room[1][2] = mainQuarters;
		
		Room start = new Room(
				"Mansion Entrance",
				"Enormous room with plenty of doors",
				"Where is everyone? It's strangely silent. I can't go back through the entrance its way too dangerous"
				);
		this.room[2][0] = start;
		this.currentRoom = start;
		roomX = 2;
		roomY = 0;
		
		Room mainHall = new Room(
				"Main Hall",
				"Main Hallway I can see multiple exits around me",
				"Is no one home? Very ominous... where should I start looking first"
				);
		this.room[2][1] = mainHall;
	
		Room paintingRoom = new Room(
				"Dining Hall",
				"There's a large table with unfinished food",
				"The food is molding and smells putrid, who leaves a room in this condition?"
				);
		this.room[2][2] = paintingRoom;
		
		Room courtyard = new Room(
				"Courtyard",
				"Courtyard descption",
				"Courtyard longdes"
				);
		this.room[2][3] = courtyard;
		
		Room library = new Room(
				"Library",
				"Lots of old books, is that a key on the table over there",
				"I feel like something is watching me from above, I should be cautious here",
				"Gate Key"
				);
		this.room[1][3] = library;
		
		Room poolArea = new Room(
				"Pool Area",
				"Its so dark I can barely see into the water",
				"A strange calm fills the room, can't see much but I feel relaxed"
				);
		this.room[3][2] = poolArea;
		
		Room mainHall3 = new Room(
				"Art Room",
				"Art Room description",
				"Art Room longdes",
				"Green Herb"
				);
		this.room[3][0] = mainHall3;
		
		Room quietHallway = new Room(
				"Quiet Hallway",
				"Quiet Hallway des",
				"Long Des"
				);
		this.room[3][1] = quietHallway;
		
		Room exit = new Room(
				"Outside Gate",
				"If only I could get past this gate I could leave this nightmare",
				"Large mountains encompass the view offering a sense of peace/escape"
				);
		this.room[3][3] = exit;
		this.exitRoom = exit;
//		if (currentRoom == exitRoom) 
		
		
//		System.out.println("Rooms created solution room: " + exit.getName());
		System.out.println("You are currently in: " + currentRoom.getName());
	}
	
	public void optionsMenu() {
		System.out.println("1): Go up " + "\n2): go down " + "\n3): go right "
				+ "\n4): go left" + "\n5): check around" + "\n6): Search around" + "\n7): View Inventory");
		Scanner scan = new Scanner(System.in);
		int action = scan.nextInt();
		userAction(action);
//		scan.close();
//		optionsMenu();
	
	}
	
	public void userAction(int action) {
		switch(action) {
			case 1:
//				System.out.println(roomX + " " + (roomY - 1));
				changeRoom(roomX, ++roomY);
//				getCurrentRoom();
				setCurrentRoom(currentRoom);
//				System.out.println(currentRoom);
				System.out.println(currentRoom.getName() + "\n" + currentRoom.getShortDescription());;
				break;
			case 2:
				changeRoom(roomX, --roomY);
				setCurrentRoom(currentRoom);
				System.out.println(currentRoom.getName() + "\n" + currentRoom.getShortDescription());;
				break;
			case 3:
				changeRoom(++roomX, roomY);
				setCurrentRoom(currentRoom);
				System.out.println(currentRoom.getName() + "\n" + currentRoom.getShortDescription());;
				break;
			case 4:
				changeRoom(--roomX, roomY);
				setCurrentRoom(currentRoom);
				System.out.println(currentRoom.getName() + "\n" + currentRoom.getShortDescription());;
				break;
			case 5:
				System.out.println(currentRoom.getLongDescription());
				break;
			case 6:
				String item = currentRoom.getItem();
				if(item == "Trap") {
					Player.loseHealth();
					System.out.println("You took damage becareful searching dangerous rooms!");
					break;
				}
				if(item != null) {
					System.out.println("You search around and find: " + currentRoom.getItem());
					ArrayList<String> myInventory = Inventory.items;		
					myInventory.add(item);
					currentRoom.removeItem();
					}
				else {
					System.out.println("You found nothing");
					}
				break;
			case 7:
				if(Player.health > 3) {
					System.out.println("Fine condition");
				} else if (Player.health > 1 && Player.health <= 3) {
					System.out.println("Caution condition");
				} else System.out.println("Danger condition");
				ArrayList<String> myInventory = Inventory.items;	
				if(myInventory.size() == 0) { 
					System.out.println("You have no items");
				}
				for ( int i = 0; i < myInventory.size(); i++) {
					System.out.println(myInventory.get(i));
				}
				break;
			default:
				System.out.println("Please pick an option.");
		}
		
	}
	
	
	
//	public Room getCurrentRoom() {
//		return this.currentRoom;
//	}
	public Room changeRoom(int roomX, int roomY) {
//		System.out.println(this.currentRoom);
//		System.out.println(room);
		currentRoom = room[roomX][roomY];
//		System.out.println(this.currentRoom);
		System.out.println(roomX + " " + roomY);
		return currentRoom;
	}
	
	public void setCurrentRoom(Room currentRoom) {
		currentRoom = this.currentRoom;
		if(this.currentRoom == exitRoom) {
			ArrayList<String> myInventory = Inventory.items;
			if(myInventory.contains("Gate Key")) {
				Main.escaped = true;
			}
			else { 
				System.out.println("Looks like I need a key to escape...could it be back in the mansion?");
			}
		}
	}
	
	public Room[][] getRoom() {
		System.out.println(this.room);
		return this.room;
	}
	
	public Room getExitRoom() {
		return this.exitRoom;
	}
	
	public void setRooms(Room[][] rooms) {
		this.room = rooms;
	}
	
//	public String toString() {
//	
//	}
//	
//	public void checkCurrentRoom(Player currentRoom) {
//		
//	}
	
	
}
