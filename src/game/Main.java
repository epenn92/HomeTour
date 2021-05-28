package game;
//import java.util.Scanner;
//import fixtures.Room;

public class Main {

	/*
	 * stores main(String[]) method and only class w/ it,
	 * Game-loop goes here displays a prompt, collect input
	 * and parses input
	 * printRoom(Player) method will print a promt to console
	 * for player's current room,
	 * collectInput() method will use Scanner obj to collect
	 * input from user and divide that input into parts(
	 * An action/ Target of Action)
	 * EX: go east -> go, east is target
	 */
	public static RoomManager e = new RoomManager(5, 5);
	public static Player e1 = new Player();
//	public static Room e2 = new Room(null, null, null);
	
	public static boolean isAlive = true;
	
	public static boolean escaped = false;
	
	// main method
	public static void main(String[] args) {
		//makes player?
		e1.createPlayer();
		//create house
		e.house();
		
		while(isAlive) {
		try {
			e.optionsMenu();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of play area try another direction");
		}
		
		if (Player.health < 1) {
			isAlive = false;
		}
		if (escaped) {
			System.out.println("You escaped the nightmare!");
			break;
			}
		if(!isAlive) {
			System.out.println("Game Over...");
			}
	}
//		e1.optionsMenu();
		
		
//		while(isAlive) {
			//Game logic here?
//			System.out.println(e.getRoom());
//			System.out.println("You are currently:" + e.getRoom());
			
//			e1.health--;
//			if (e1.health == 0) isAlive = false;
//		}
		
//		if(!isAlive) {
//			System.out.println("Game Over...");
//		}
//		
//		if(escaped) {
//			System.out.println("You survived the nightmare");
//		}
//		
		
		
	}
	
	
//	private static void roomInfo(Player player) {
//		
//	}
	
//	private static String collectInput() {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Type a direction to move EX: Up,Down,Left,Right");
//		String userInput = scan.nextLine();
//		
//		return userInput;
//	}
//	
//	private static void parseUserInput(String userInput, Player player) {
//		player.getCurrentRoom();
//		System.out.println(manager.getRoom());
//		if(userInput.toLowerCase() == "up") {
//			
//		}
//		
//	}
//	
}
