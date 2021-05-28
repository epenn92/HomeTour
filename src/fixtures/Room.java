package fixtures;

public class Room extends Fixture {

	/*
	 * represents a room in the house, extends Fixture and 
	 * inherits descriptive properties, has exits prop
	 * Make sure constructor accepts name,shortDescr,longDescrip
	 * Getters can be good for exits/particular exits given a 
	 * direction
	 */
	
	// 4 possible exits for now? ++x, --x, ++y, --y
	private Room[][] exits = new Room[1][1];
//	private String name;
//	private String shortDescription;
//	private String longDescription;
	
	public Room(String name, String shortDescription, String longDescription, String item) {
		super(name, shortDescription, longDescription, item);
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		this.item = item;
//		this.exits = new Room[][];
	}
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}
	
	public Room[][] getExits() {
		return this.exits;
	}
	
//	public Room getExit(String direction) {
//		int index = 0;
//		direction = direction.toUpperCase();
////		switch()
//	}
	public String getName() {
		return this.name;
	}
//	
	public String getShortDescription() {
		return this.shortDescription;
	}
	
	public String getLongDescription() {
		return this.longDescription;
	}
	
	public String getItem() {
		return this.item;
	}
	
	public void removeItem() {
		this.item = null;
	}
	
	public void setExits(Room[][] exits) {
		this.exits = exits;
	}
	
	
}
