package game;

import fixtures.Room;
import java.util.Scanner;

public class Player {

	public static int health;
	public String playerName;
	
	public void createPlayer() {
		
		System.out.println("Creating Player");
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		String playerName = scan.next();
		health = 5;
//		scan.close();
		System.out.println(playerName + " runs from rabid dogs into a mansion...Can you escape the nightmare?");
	}
	
	private Room currentRoom;
	
	public Room getCurrentRoom() {
		return currentRoom;
	}
	
	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}
	
	public static void loseHealth() {
		//events that make you lose hp
		health--;
	}
	
//	public void obtainItem() {
//		
//	}
	
	
	
//	public void takeAction() {
//	}
	
	/*
	 * public Item getCurrentItems() {
	 * return currentItems;
	 * }
	 */
}
