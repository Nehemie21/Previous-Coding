// Stefan Caldararu
// Nehemie Pluviose
// Garrison Waugh
// Tyler Krill

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import java.util.List;

public class FrontendMapper  {

	
	
		
		
	
	/**
	 * Three main screens, each with different functions within them.
	 *  Home screen will provide the options to navigate between screens 
	 *  as well as a help menu if needed. 
	 *  
	 *  The Distance screen will contain the 
	 *  functions for determining walk time between locations, 
	 *  
	 *  the buildings that would be passed when traveling between locations, 
	 *  
	 *  and another feature where a category of locations(b-cycle) can be entered, 
	 *  
	 *  and the walking time to each of the locations of this category would
	 *  be displayed.
	 */
	
	//mode 0 - Home Screen
	//mode 1 - Distance Screen
	//mode 2 - Walk Settings
	//mode 3 - Display Functions
	private int mode = 0;
	
	//Whether or not the program should continue scanning
	private boolean run = true;
	
	//The start of the path
	private Building start;
	private Building end;

	//The speed at which the person is traveling
	private double travelSpeed = 1;
	
	//Travel conditions which may impact paths
	private double travelConditions = 1;
	
	//The time it takes to go along that path
	private double pathWalkingTime = 1;
	private double pathWalkingTimeGeneral = 1;

	
	//The cost of the path without any conditions
	private double pathCost = 1;
	private double pathCostGeneral =1;

	
	//Backend object
	private Backend backend;
	
	

	//List the shortest path of buildings
	private ArrayList<Building> buildingsGeneral;
	private ArrayList<Building> buildings;
	
	DecimalFormat df = new DecimalFormat("#,###,##0.00");
	
	//distance between two places 
	private double distance = 1.0000000;
	
	

	//To see if user entered a Type
	private boolean containsType = false;

	//To see if route is found
	private boolean routeIsFound = false;
	
	//To see if wakl settings finished
	private boolean walkSettingsFinished = false;

	//Clears the old screen
	private final String CLEAR = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
	
	//Linebreak
	private final String LINEBREAK =
		      "\n| ------------------------------------------------------------------------------------------";
	
	//Exit message
	private final String END = LINEBREAK +
			"\n| Thanks for using this UW Madison Mapper Program!"
			+ "\n| This program was made possible by Team CC Blue:"
		      + "\n|"
		      + "\n| Garrison Waugh - Data Wrangler" 
		      + "\n| Stefan Caldararu - Backend Developer"
		      + "\n| Nehemie Pluviose- Frontend Developer" 
		      + "\n| Tyler Krill - Integration Manager"
		      + "\n|" 
	+LINEBREAK;
	
	//Home screen message
	private String HOMESCREENMESSAGE = LINEBREAK + "\n| "
			+ "HOME: "
			+"\n| Your current starting place: N/a"
			+"\n| Your current destination:    N/a"
			+"\n| Press 'h' to the help screen on other modes"
			+"\n| Press 'm' to go to the home screen at any time"
			+"\n| from other modes"
			+"\n| Press 'd' to go to distance"
			+"\n| Press 'x' to exit program";
	
	//Help screen message
	private final String HELPMESSAGE = LINEBREAK+
			 "\n| <<USER ENTER FUNCTION COMMANDS + HOME SCREEN>>:"
			+"\n| m: Home Screen - Displays the options for different functionalities"
			+"\n| d: Distance Screen - Enter two locations on campus"
			+"\n| s: Walk Settings - Enter the user walking speed of current path conditions"
			+"\n| \n| <<DISPLAY COMMANDS>>:"
			+"\n| h: Help Function - Provides Instructions"
			+"\n| >>Display Functions can only be accessed after finshing"
			+"\n| Distance Screen and Walk Settings<<"
			+"\n| l: Lists Of Buildings Function - Displays list of the buildings that would be passed on the way to the destination"
			+"\n| w: Walking Function - Displays estimate walking time between these locations"
			+"\n|  Category Function - Displays buildings, Walking time, and diatance in relation to a category"
			+"\n| b: Building Function - Displays distance to a builing "
			+"\n| a: To list all of the display functions"
			+"\n| x: Type x from any mode terminate program";

	//USER ENTER FUNCTIONS
	//Distance screen message
	private final String DISTANCESCREENMESSAGE = LINEBREAK+ 
			"\n| Enter your Start Place and Building in this format:"
	+"\n| [Start,End,Category] "
	+ "\n| Example [Trader Joe's,Camp Randall Stadium,F] F = Fitness "
	+ "\n| Your response : ";
	
	//Walk settings message
	private final String WALKINGSETTINGSMESSAGE = LINEBREAK+ 
			"\n| You will enter your walking speed multiplier first"
			+ "\n| Then you will enter your walking conditions multipler"
			+ "\n| Walking conditions are from 1 to 5"
			+ "\n| 1 meaning it's all clear skies and no weather or human conditions "
			+ "\n| that makes it harder to get to yur destination "
			+ "\n| 5 meaning it is nearly difficult to get to your destination"
			+ "\n| because of weather and human conditions"
			+ "\n| Enter them  in this format"
			+"\n| Format [WakingSpeed,WalkingConditions] "
			+ "\n| Number Format [0.00,0.00] "
			+ "Your Response : ";
	
	//Display function
	private final String DISPLAYFUNCTION = LINEBREAK+ 
			"\n| Enter"
			+ "\n| Press 'l': Lists Of Buildings Function - List the buildings that would be passed on the way to the destination"
			+"\n| Press 'w': Walking Function - Estimate walking time between these locations\"\r\n" 
			+"\n| Press 'c': Category Function - Displays buildings, Walking time, and diatance in relation to a category\r\n" 
			+"\n| Press 'b': Building Function - Displays distance to a builing " 
			+"\n| Press 'a': To list all of the above";
;
	
	//DISPLAY FUNCTIONS]
//Walking time message
	private String walkingTimeMessage = LINEBREAK+ 
			"\n| Here is your estimated walking time: ";
	//Category message
	private String categoryWalkingTimeMessage = LINEBREAK+ 
			"\n| Here is your estimated walking time in relation to your Category: ";
	//List buildings message
	private String listBuildingsMessage = LINEBREAK+ 
			"\n| Here are a list of buildings passed along the way:\n";
	//list cetegory buildings message
	private String categoryListBuildingsMessage = LINEBREAK+ 
			"\n| Here are a list of buildings passed along the way in relation to your Category: ";
	
	//Distance message
	private String distanceMessage = LINEBREAK+ 
			"\n| Distance From Start Place To Building: ";
	//Category Distance Message
	private String categoryDistanceMessage = LINEBREAK+ 
			"\n| Distance From Start Place To Category: ";
	
	
	//Generic Invalid command message
	private final String invalidCommand = LINEBREAK+
				"\n| ----------------------------------Error - Invalid Command----------------------------------"
				+LINEBREAK;
	//No node of that type exists
	private final String noSuchNode = LINEBREAK+
				"\n| -----------------------------Error - No node of that entry exist---------------------------"
				+LINEBREAK;
	//No path exists between two selected nodes
	private final String noSuchPath = LINEBREAK+
			"\n| ----------------------------- No path exists between the two provided nodes---------------------------"
			+LINEBREAK;

	private final String ALMOSTFINISHED = "\n\nYour done with the program!"
			+ "\n| Press x to exit"
			+ "\n  Press m to go to the home screen"
			+ "\n| or continue to press the other Display Functions!"
			+ "\n\n"
			+"\n| Enter"
			+"\n| Press 'l': Lists Of Buildings Function - List the buildings that would be passed on the way to the destination"
			+"\n| Press 'w': Walking Function - Estimate walking time between these locations\"\r\n" 
			+"\n| Press 'c': Category Function - Displays buildings, Walking time, and diatance in relation to a category\r\n" 
			+"\n| Press 'b': Building Function - Displays distance to a builing " 
			+"\n| Press 'a': To list all of the above";
			
	
	
	public static void main (String[]args) throws FileNotFoundException, IOException{
		
		Backend back = new Backend();
		FrontendMapper f = new FrontendMapper();
		f.run(back);

		
		
	}
	
	/**
	 * This is the method that'll be used to run the program
	 * @param b This is a BackendInterface object
	 *That will be used to throughout the program to access 
	 *the data
	 */
	public void run(BackendInterface b)
	{
		Scanner scan = new Scanner (System.in);

		backend =  (Backend) b;
		System.out.println(HOMESCREENMESSAGE);
		
		while(run) {
			oversee(scan.nextLine());
		}
		System.out.println(CLEAR);
		System.out.println(END);
		scan.close();

	}
	/**
	 * This messages Print the current mode of the program to 
	 * the user so that they can run through the program
	 * with the correct directions
	 */
	public void printMessage()
	{
				//Mode 0 - Home Screen
				//Mode 1 - Distance Screen
				//Mode 2 - Walk Settings
				//Mode 3 - Display Functions
				//Mode 4 - Help Screen
		if(mode==0) {
			System.out.println(CLEAR);
			System.out.println(HOMESCREENMESSAGE);
		}
		else if (mode == 1) {
			System.out.println(CLEAR);
			System.out.println(DISTANCESCREENMESSAGE);
		}
		else if (mode == 2) {
			System.out.println(CLEAR);
			System.out.println(WALKINGSETTINGSMESSAGE);
		}
		else if(mode == 3) {
			System.out.println(CLEAR);
			System.out.println(DISPLAYFUNCTION);
		}
		else if (mode == 4) {
			
			System.out.println(CLEAR);
			System.out.println(HELPMESSAGE);
		}
	
	}
	
	/**
	 * This is the method where we overlook the user's input
	 * and use it to change field and backend values and
	 * displays it to the user to interact
	 * @param enter string value that user enters to interact with program
	 */
	public void oversee(String enter)
	{
		//Mode 0 - Home Screen
		//Mode 1 - Distance Screen
		//Mode 2 - Walk Settings
		//Mode 3 - Display Functions
		//Mode 4 - Help Screen

		//Mode 0 - Home Screen
		if(mode == 0)
		{
			walkSettingsFinished = false;
			this.routeIsFound = false;
			this.containsType = false;
			//exit program
			if(enter.equals("x"))
			{
				run = false;
			}
			//help screen
			else if(enter.equals("h"))
			{
				mode = 4;
				printMessage();
			}
			//home screen
			else if(enter.equals("m"))
			{
				mode = 0;
				printMessage();
			}
			//distance function
			else if(enter.equals("d"))
			{
				mode = 1;
				printMessage();
			}
			//walking function for TestFrontend.java purposes
			else if(enter.equals("w"))
			{
				mode = 2;
				printMessage();
				
			}
			//Display function for TestFrontend.java purposes
			else if(enter.equals("p"))
			{
				mode = 3;
				printMessage();
				
			}
			else {
				System.out.println("Your input didn't match the Home Screen Commands\n"
						+ invalidCommand);
			}
			
		}
		//Mode 1 - Distance Screen
		else if(mode == 1)
		{
		
			//exit program
			if(enter.equals("x"))
			{
				run = false;
			}
			//Help screen
			else if(enter.equals("h"))
			{
				mode = 4;
				printMessage();
				
			}
			//Home screen
			else if(enter.equals("m"))
			{
				mode = 0;
				printMessage();
			}
			//See if in correct format
			else if(enter.charAt(0)=='['&&enter.charAt(enter.length()-1)==']')
			{

				
				
				try
				{
					//[Trader Joe's,Camp Randall Stadium,F]
					//[Witte Residence Hall,Memorial Union Terrace,L]
					String[] arr = enter.split(",");
				    String begin = arr[0];
					begin = begin.substring(1);
	
					String last = arr[1];
					String type = arr[2].substring(0, 1);
					

					for(int i = 0; i < backend.getBuildings().size(); i++)
					{
						if(backend.getBuildings().get(i).name.equalsIgnoreCase(begin))
						{
							
							
							start = backend.getBuildings().get(i);

						}
						else if (backend.getBuildings().get(i).name.equalsIgnoreCase(last))
						{
							end = backend.getBuildings().get(i);
						}
						
					}
					
					if(start != null && end != null )
					{
						
						if(end.getTypes() != null && end.getTypes().contains(type))
						{
							
							this.buildingsGeneral = backend.shortestGeneralPath(start, type.charAt(0));
							
							

							this.pathWalkingTimeGeneral = backend.getGeneralPathTime(start, type.charAt(0));
							
							this.pathWalkingTimeGeneral /= 10;
							this.pathCostGeneral = backend.getGeneralPathCost(start, type.charAt(0));
							
							this.pathCostGeneral /= 10000;
							this.containsType = true;
							
						}
						
						this.distance =  backend.getDistance(start, end);
						
						this.distance /= 1000000;
						this.buildings =  (ArrayList<Building>) backend.shortestPath(start, end);
						
						this.pathCost = backend.getPathCost(start, end);
					
						this.pathCost /= 10000;
						this.pathWalkingTime = backend.getPathTime(start, end);
						
						this.pathWalkingTime /= 10;
						this.routeIsFound = true;
						mode = 2;
						System.out.println("\nYour distance response has been recorded\n");
						printMessage();
					}
			

				}
				catch(Exception e)
				{
					e.printStackTrace();
					System.out.println();
					System.out.println("Something went wrong: \n"
							+ "Either: \n Potential Error 1: "
							+ noSuchNode + "\n Potential Error 2: Incorrect format\n" + this.invalidCommand);
					
					mode = 1;
					printMessage();
				}
				
			}
			else {
				System.out.println(invalidCommand);

			}
		}
		//Mode 2 - Walk Settings
		else if(mode == 2)
		{
			//exit program
			if(enter.equals("x"))
			{
				run = false;
			}
			else if(enter.equals("h"))
			{
				mode = 4;
				printMessage();
				
			}
			else if(enter.equals("m"))
			{
				mode = 0;
				printMessage();
			}
			else if(!this.routeIsFound)
			{
				System.out.println("Either  you did not finish the distance function: "
						+ "\n Or  there is no such path"  + this.noSuchPath);
				mode = 0;
				printMessage();
			}
			//Check if walking input is formatted correctly
			else if(enter.charAt(0)=='['&&enter.charAt(enter.length()-1)==']'
					&& enter.contains(","))
			{
				//[Trader Joe's,Camp Randall Stadium,F]

			
				try {
					
					String[] arr = enter.split(",");
					String walkingSpeed = arr[0];
					walkingSpeed = walkingSpeed.substring(1, walkingSpeed.length());
					
					String walkingConditions = arr[1];
					
					walkingConditions = walkingConditions.substring(0, walkingConditions.length() - 1);
					
					double ws = Double.parseDouble(walkingSpeed);
				
					double wc = Double.parseDouble(walkingConditions);
					this.travelSpeed *= ws;
					this.travelConditions *= wc;
					
					if(this.travelSpeed == 0 || this.travelConditions == 0)
					{
						mode = 2;
						System.out.println("Input of zero not allowed " + this.invalidCommand);

						printMessage();
					}
					else {
						
						backend.setTravelSpeed(this.travelSpeed);
						backend.setTravelConditions(this.travelConditions);
					
							this.pathWalkingTime = (this.pathWalkingTime / this.travelSpeed) 
									* this.travelConditions;
							
							this.pathWalkingTime /= 10000;


							if(this.containsType)
							{			
								

								this.pathWalkingTimeGeneral = (this.pathWalkingTimeGeneral / this.travelSpeed) 
									* this.travelConditions;
							
								this.pathWalkingTimeGeneral /= 10000;
							}
		
						mode = 3;
						System.out.println("\nYour walk settings response has been recorded\n");
						this.walkSettingsFinished = true;
						printMessage();
					}
				}
				catch(Exception e)
				{
					System.out.println(invalidCommand);

				}
			}
			else {
				System.out.println("Mode 2 " +invalidCommand);
			}
			
		}
		//Display function
		else if (mode == 3)
		{
			//exit program
			if(enter.equals("x"))
			{
				run = false;
			}
			//Help menu
			else if(enter.equals("h"))
			{
				mode = 4;
				printMessage();
				
			}
			//Home Screen
			else if(enter.equals("m"))
			{
				mode = 0;
				printMessage();
			}
			//Walk settings not finished
			else if(!this.walkSettingsFinished)
			{
				System.out.println(invalidCommand 
						+ "\nWalk Setting have not been completed."
						+ "\nRestart from the Distance Screen to complete program");
				mode = 1;
				printMessage();
			}
			//List of buildings
			else if(enter.equals("l"))
			{
				System.out.println(this.listBuildingsMessage + " \n" + this.buildings.toString());

				System.out.println(this.ALMOSTFINISHED);
				//[Trader Joe's,Camp Randall Stadium,F]
				
			}
			//Walk time
			else if(enter.equals("w"))
			{
				System.out.println(this.walkingTimeMessage + " \n"
			+ (int) this.pathWalkingTime + " Minutes");
				
				System.out.println(this.ALMOSTFINISHED);

				
					
			}
			//List of category
			else if(enter.equals("c"))
			{
				if(this.containsType)
				{
					System.out.println(this.categoryListBuildingsMessage + " \n" + this.buildingsGeneral.toString());
					System.out.println(this.categoryWalkingTimeMessage + " \n" 
							+ (int) this.pathWalkingTimeGeneral + " Minutes");
					System.out.println(this.categoryDistanceMessage + df.format(this.distance) + " Miles");
					System.out.println("This is the path cost in relation to a category: " + (int) this.pathCostGeneral);


				}
				else {
					System.out.println("Your input had no category so no category data is displayed");
				}
				
				System.out.println(this.ALMOSTFINISHED);

			}
			//Distance to building
			else if(enter.equals("b"))
			{
				System.out.println(this.distanceMessage + df.format(this.distance) + " Miles");
				System.out.println("This is the path cost: " + (int) this.pathCost);
				System.out.println(this.ALMOSTFINISHED);

			}
			//Prints all of them at once
			else if(enter.equals("a"))
			{
				
				System.out.println(this.listBuildingsMessage + " \n" + this.buildings.toString().toString());
				
				if(this.containsType)
					System.out.println(this.categoryListBuildingsMessage + " \n" + this.buildingsGeneral);
				
				System.out.println(this.walkingTimeMessage + " \n"
						+ (int) this.pathWalkingTime + " Minutes");

				if(this.containsType)
					System.out.println(this.categoryWalkingTimeMessage + " \n" 
							+ (int) this.pathWalkingTimeGeneral + " Minutes");
				
				
				System.out.println(this.distanceMessage + df.format(this.distance) + " Miles");

				
				
				if(this.containsType)
					System.out.println(this.categoryDistanceMessage + df.format(this.distance) + " Miles");

				System.out.println(LINEBREAK+ 
						"\n| This is the path cost: " + (int) this.pathCost);

				System.out.println(LINEBREAK+ 
						"\n| This is the path cost in relation to a category: " + (int) this.pathCostGeneral);
				System.out.println(this.ALMOSTFINISHED);

			}
			else
			{
				System.out.println("Mode 3 " +invalidCommand);
			}
			
		}
		//Mode 4 - Help Screen
		else if(mode == 4)
		{
		
			//exit program
			if(enter.equals("x"))
			{
				run = false;
			}
			//Help screen
			else if(enter.equals("h"))
			{
				mode = 4;
				printMessage();
				
			}
			//Home screen
			else if(enter.equals("m"))
			{
				mode = 0;
				printMessage();
			}
			//distance function
			else if(enter.equals("d"))
			{
				mode = 1;
				printMessage();
			}
			else
			{
				System.out.println("Mode 4 " + invalidCommand);
			}
		}
		else
		{
			System.out.println(invalidCommand);
		}
	}
}
