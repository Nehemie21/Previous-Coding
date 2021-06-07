// --== CS400 File Header Information ==--
// Name: Stefan Caldararu
// Email: scaldararu@wisc.edu
// Team: CC
// Role: Frontend developer
// TA: Xi Chen
// Lecturer: Gary Dahl
// Notes to Grader: To run this with the dummy backend, Uncomment the lines directly above the to do 
//statement, and comment the 4 lines directly below the to do statement.

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Frontend {
	
	
	//The different modes are represented by integers.
	//mode 0 - Home Screen
	//mode 1 - Location Entry Screen
	//mode 2 - Name Search Screen
	//mode 3 - Help Screen
	//mode 4 - Viewer Screen
	private int mode = 0;
	//Whether or not the program should continue scanning
	private boolean run = true;
	//latitude and longitude values entered
	private double lat;
	private double lon;
	//The selected bridge
	private BridgeInterface bridge;
	//The bridge selected by location
	private BridgeInterface bridgeFromLocation;
	//backend object
	private BridgeBackend backend;
	//whether the viewer mode was selected via location or name search
	private boolean wasNameSearched = true;
	//clears the screen
	private final String CLEAR = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
	//Linebreak
	private final String LINEBREAK =
		      "\n| ------------------------------------------------------------------------------------------";
	//Exit message
	private final String END = LINEBREAK +
			"\n| Thanks for using this Bridge RBTree Program!"
			+ "\n| This program was made possible by Team CC Blue:"
		      + "\n|"
		      + "\n| Tyler Krill      - Data Wrangler" 
		      + "\n| Garrison Waugh   - Backend Developer"
		      + "\n| Stefan Caldararu - Frontend Developer" 
		      + "\n| Nehemie Pluviose - Integration Manager"
		      + "\n|" 
	+LINEBREAK;
	//Home screen message
	private String HOMESCREENMESSAGE = LINEBREAK + "\n| HOME: "
	+"\n| currently selected location: N/a"
			+"\n| please enter one of the following commands to enter a mode: s, l, ls, ?, v"
	+"\n| type \"help\" or \"?\" to view the help screen"
			+"\n| enter the following command to exit: x"
			+LINEBREAK;
	//Name search screen message
	private final String NAMESEARCHMESSAGE = LINEBREAK+ 
			"\n| Please enter a bridge name according to the following specifications:"
	+"\n| [BRIDGE NAME]"+LINEBREAK;
	//Location entry screen message
	private final String LOCATIONENTRYMESSAGE = LINEBREAK 
			+"\n| Please enter a location according to the following specifications: "
			+"\n| [latitude,longitude]"
			+LINEBREAK;
	//Index out of bounds message for location mode
	private final String indexOutOfBoundsMessage = LINEBREAK+
			"\n| --------------------------------Error - Index Out of Bounds--------------------------------"
			+LINEBREAK;
	//Help screen message
	private final String HELPMESSAGE = LINEBREAK+
			 "\n| This program has 5 modes:"
			+"\n| Home: type x from any other mode to enter home mode"
			+"\n| Location Entry: type l from Home mode to enter Location Entry. Allows user to enter a location to search for bridges"
			+"\n| Name Search: type s from Home mode to enter Name Search. Allows user to search for bridges by name"
			+"\n| Viewer: type v from Home mode to enter Viewer. Displays information about the currently selected bridge"
			+"\n| Help: type help or ? to view this help mode"
			+"\n| \n| OTHER COMMANDS:"
			+"\n| ls: displays the bridge closest to the entered location"
			+"\n| x: Type x from Home mode to exit this program, or from any other mode to enter Home mode"
			+"\n| a/d: In view mode, use a to go to the previous bridge and d to go to the next bridge"
			//TODO: if needed add q/e commands
			+LINEBREAK;
	//View screen message
	private String VIEWMESSAGE = LINEBREAK
			+"\n| NO BRIDGE CURRENTLY SELECTED"
			+LINEBREAK;
	//No such bridge found message
	private final String noSuchBridgeMessage = LINEBREAK+
			"\n| -----------------------------Error - No bridge matches this name---------------------------"
			+LINEBREAK;
	//Generic Invalid command message
	private final String invalidCommand =LINEBREAK+
			"\n| ----------------------------------Error - Invalid Command----------------------------------"
			+LINEBREAK;

	//The main method, what to run.
	public static void main (String[]args) throws FileNotFoundException, IOException{
		//This is the dummy implementation
		/**
		BackendInterface back = new backendDummy();
		Frontend f = new Frontend();
		f.run(back);
		**/
		 //TODO: fix this so the filepath is correct
		String filePath = "./CNWBridges.csv";
		BackendInterface back = new BridgeBackend(filePath);
		Frontend f = new Frontend();
		f.run(back);
		
		
	}
	//The start of the program, what the main method will run
	public void run(BackendInterface b) {
		Scanner s = new Scanner (System.in);
		backend = (BridgeBackend) b;
		System.out.println(HOMESCREENMESSAGE);
		while(run) {
			oversee(s.next());
		}
		System.out.println(CLEAR);
		System.out.println(END);
		s.close();
	}
	//Method that prints the correct message when called
	public void printMessage() {
		if(mode==0) {
			System.out.println(CLEAR);
			System.out.println(HOMESCREENMESSAGE);
		}
		else if (mode == 1) {
			System.out.println(CLEAR);
			System.out.println(LOCATIONENTRYMESSAGE);
		}
		else if (mode == 2) {
			System.out.println(CLEAR);
			System.out.println(NAMESEARCHMESSAGE);
		}
		else if(mode == 3) {
			System.out.println(CLEAR);
			System.out.println(HELPMESSAGE);
		}
		else if (mode == 4) {
			System.out.println(CLEAR);
			System.out.println(VIEWMESSAGE);
		}
	}
	//Updates the view message to show the correct message, with the bridge
	public void updateViewMessage() {
		if(bridge != null && wasNameSearched) {
			VIEWMESSAGE = LINEBREAK
					+"\n| Bridge name: " +bridge.getName()
					+"\n| Bridge location: ["+bridge.getLat()+","+bridge.getLon()+"]"
					+"\n| Number of versions: "+bridge.getNumVersions()
					+LINEBREAK;
		}
		else if(bridgeFromLocation !=null && !wasNameSearched) {
			VIEWMESSAGE = LINEBREAK
					+"\n| Bridge name: " +bridgeFromLocation.getName()
					+"\n| Bridge location: ["+bridgeFromLocation.getLat()+","+bridgeFromLocation.getLon()+"]"
					+"\n| Number of versions: "+bridgeFromLocation.getNumVersions()
					+LINEBREAK;
		}
		else {
			VIEWMESSAGE = LINEBREAK
					+"\n| NO BRIDGE CURRENTLY SELECTED"
					+LINEBREAK;
		}
		//TODO: might need to fix this (Think its fine, idk what to fix)
	}
	//updates the Home message to show correct location
	public void updateHomeMessage() {
		if(Double.isNaN(lat)||Double.isNaN(lon)) {
			HOMESCREENMESSAGE = LINEBREAK + "\n| HOME: "
					+"\n| currently selected location: N/a"
							+"\n| please enter one of the following commands to enter a mode: s, l, ls, ?, v"
					+"\n| type \"help\" or \"?\" to view the help screen"
							+"\n| enter the following command to exit: x"
							+LINEBREAK;
		}
		else {
			HOMESCREENMESSAGE = LINEBREAK + "\n| HOME: "
					+"\n| currently selected location: ["+lat+","+lon+"]"
							+"\n| please enter one of the following commands to enter a mode: s, l, ls, ?, v"
					+"\n| type \"help\" or \"?\" to view the help screen"
							+"\n| enter the following command to exit: x"
							+LINEBREAK;
		}
	}
	//oversees the user commands
	public void oversee(String input) {
		//mode 0 - Home Screen
		if(mode == 0) {
			//exit program
			if(input.equals("x")) {
				run = false;
			}
			//enter name search mode
			else if (input.equals("s")) {
				mode = 2;
				printMessage();
			}
			//enter location search mode
			else if (input.equals("l")) {
				mode = 1;
				printMessage();
			}
			//Takes user to viewer screen of nearest bridge
			else if (input.equals("ls")) {
				//first update the selected bridge to the nearest location
				bridgeFromLocation = backend.getNearestBridge(lat, lon);
				wasNameSearched = false;
				mode = 4;
				updateViewMessage();
				printMessage();
			}
			//Enter help mode
			else if (input.equals("?") || input.equals("help")) {
				mode = 3;
				printMessage();
			}
			//enter viewer mode
			else if (input.equals("v")) {
				//First try and print name searched bridge
				if(bridge !=null) {
					wasNameSearched = true;
					
				}
				//then try and print location searched bridge
				else if(bridgeFromLocation !=null) {
					wasNameSearched = false;
					//update nearest bridge
					bridgeFromLocation = backend.getNearestBridge(lat, lon);
				}
				mode = 4;
				updateViewMessage();
				printMessage();
			}
			else {
				System.out.println(invalidCommand);
			}
		}
		//mode 1 - Location Entry Screen
		else if (mode == 1) {
			//return to Home mode
			if(input.equals("x")) {
				mode = 0;
				printMessage();
			}
			//clear the current location
			else if(input.equals("r")) {
				lat = Double.NaN;
				lon = Double.NaN;
				bridgeFromLocation = null;
				updateHomeMessage();
				printMessage();
			}
			//Check if a location was entered correctly

			else if(input.charAt(0)=='['&&input.charAt(input.length()-1)==']') {
				String lattitude = input.substring(1,input.indexOf(','));
				String longitude  = input.substring(input.indexOf(',')+1,input.length()-1);
				//try and parse what's in the brackets, and then enter Home mode 
				try {
					lat = Double.parseDouble(lattitude);
					lon = Double.parseDouble(longitude);
					if(Math.abs(lat)<=90 || Math.abs(lon)<=180) {
						bridgeFromLocation = backend.getNearestBridge(lat, lon);
						mode = 0;
						updateHomeMessage();
						printMessage();
					}
					else {
						lat = Double.NaN;
						lon = Double.NaN;
						printMessage();
						System.out.println(indexOutOfBoundsMessage);
					}
				}catch (Exception e) {
					System.out.println(invalidCommand);
					System.out.println(e);
				}
			}
			else {
				System.out.println(invalidCommand);
			}
		}
		//mode 2 - Name Search Screen
		else if (mode == 2) {
			//return to Home mode
			if(input.equals("x")) {
				mode = 0;
				printMessage();
			}
			//Check if name is formatted correctly
			else if(input.charAt(0)=='['&&input.charAt(input.length()-1)==']') {
				String name = input.substring(1,input.length()-1);
				//try and get the bridge object from the backend, catching the exception thrown if 
				//the name was invalid
				try {
					bridge = backend.getBridge(name);
					System.out.println("HERE   "+bridge.getName());
					wasNameSearched = true;
					mode = 4;
					updateViewMessage();
					printMessage();
					
				}catch(Exception e) {
					System.out.println(noSuchBridgeMessage);
				}
				
			}
			else {
				System.out.println(invalidCommand);
			}
		}
		//mode 3 - Help Screen
		else if (mode == 3) {
			//exit to home screen
			if(input.equals("x")) {
				mode = 0;
				printMessage();
			}
			else {
				System.out.println(invalidCommand);
			}
		}
		//mode 4 - Viewer Screen
		else if (mode == 4) {
			//exit to home screen
			if(input.equals("x")) {
				mode = 0;
				printMessage();
			}
			//view the previous bridge
			else if(input.equals("a")) {
				//No bridge currently available to view, do nothing
				if(bridge == null && bridgeFromLocation == null) {
					
				}
				//go to the previous bridge
				else if(wasNameSearched) {
					bridge = backend.getPrevious(bridge);
				}
				else {
					bridgeFromLocation = backend.getPrevious(bridgeFromLocation);
					updateHomeMessage();
				}
				updateViewMessage();
				printMessage();
			}
			else if(input.equals("d")) {
				if(bridge == null && bridgeFromLocation == null) {
					
				}
				else if(wasNameSearched) {
					bridge = backend.getNext(bridge);
				}
				else {
					bridgeFromLocation = backend.getNext(bridgeFromLocation);
					updateHomeMessage();
				}
				updateViewMessage();
				printMessage();
			}
			//TODO: make sure this can happen
			/**
			else if(input.equals("q")) {
				
			}
			else if(input.equals("e")) {
				
			}**/
			else {
				System.out.println(invalidCommand);
			}
			
		}
	}
	
}
