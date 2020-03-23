// HW 5 
// Author Donald Martin

import java.util.*;
import java.util.Scanner;
public class HW5
{
	// Room Descriptions
	static String bedroom1 = "You are in the Master Bedroom, exits are east and south.";
	static String bedroom2 = "You are in the guest bedroom, exits are north and east.";
	static String northHall = "You are in the North Hall, exits are north, east, west, and south.";
	static String southHall = "You are in the South Hall, exits are north, east, and west.";
	static String diningRoom = "You are in the Dining Room, exits are north and west.";
	static String balcony = "You are on the Balcony, exits are south.";
	static String kitchen = "You are in the Kitchen, exits are west and south.";

	static int numberOfRooms = 7;
	static int n = 0;
	static int e = 1;
	static int w = 2;
	static int s = 3;
	
	// Rows represent our rooms and the columns represent our exits.
	static int rooms[][] = { {3, 1, -1, -1}, {4, 2, 0, -1}, {5, -1, -1, 1}, {-1, 4, -1, 0}, {6, 5, 3, 1}, {-1, -1, 4, 2}, {-1, -1, -1, 4} }; 
						       //bedroom2     //southHall	 //diningRoom     //bedroom1     //northHall    //Kitchen        //balcony

	static String descriptions[] = { bedroom2, southHall, diningRoom, bedroom1, northHall, kitchen, balcony };
	public static void userInput()
	{

		int roomNumber;

	}

	public static void movement() 
	{
		int currentRoom = 0;
		boolean run = true;

			System.out.println(descriptions[currentRoom]);
			System.out.println("Where would you like to go?");
			System.out.println("north, east, west, south & quit");
			System.out.println("----------------------------------------------------------------------");
			System.out.println("Type the first letter of the action (ex. n will move you north.)");
			Scanner input = new Scanner(System.in);
			String userInput = input.next();

			while(run) 
			{ 

				System.out.println("north, east, west, south, quit");
				System.out.println(descriptions[currentRoom]);
				userInput = input.next();

				if (userInput.equals("n"))
				{ 	

					if(rooms[currentRoom][n] >= 0) {
					currentRoom = rooms[currentRoom][n];

					}
				}

				else if (userInput.equals("e")) 
				{	
					if(rooms[currentRoom][e] >= 0) {
					currentRoom = rooms[currentRoom][e];
					}
				}
			

				else if (userInput.equals("w"))  
				{	
					if(rooms[currentRoom][w] >= 0) {
					currentRoom = rooms[currentRoom][w];
					}
				}

				else if (userInput.equals("s")) 
				{
					if(rooms[currentRoom][s] >= 0) {
					currentRoom = rooms[currentRoom][s];
					}
				}
			

				else if (userInput.equals("q")) 
				{
					run = false;
					System.out.println("Thank you for playing. See you next time!");
				}

				else {

					System.out.println("Wrong input. Try again.");
				}

			}
			


	}	

	public static void main (String[] args) {
		movement();

	}


}