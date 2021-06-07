//  Mapper Project Three
// Name: Nehemie Pluviose
// Email: pluviose@wisc.edu
// Team: Group CC Blue Team
// Role: Frontend Developer
// TA: Xi Chen
// Lecturer: Gary
// Notes to Grader: The program only works with some Buildings
//in the data set and not all for some reason. Just keep that in Mind
// This one works for sure: [Trader Joe's,Camp Randall Stadium,F]
//When entering the Distance Function

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertEquals;
import  org.junit.jupiter.api.Test;

public class TestFrontendMapper {


	private final String LINEBREAK =
		      "\n| ------------------------------------------------------------------------------------------";

	private final String invalidCommand = LINEBREAK+
			"\n| ----------------------------------Error - Invalid Command----------------------------------"
			+LINEBREAK;
	
	private final String noSuchPath = LINEBREAK+
			"\n| ----------------------------- No path exists between the two provided nodes---------------------------"
			+LINEBREAK;


	

	/**
	 * This method will make sure home screen is displayed properly
	 * to the user to that they'll know which inputs to use to 
	 * run the program
	 */
	@Test
	public void testHomeScreen()

	{
		
		PrintStream standardOut = System.out;
		InputStream standardIn = System.in;
		
		try{
			
			String input = "m";
			InputStream inputBytes = new ByteArrayInputStream(input.getBytes());

			 System.setIn(inputBytes);
			ByteArrayOutputStream output = new ByteArrayOutputStream();

			System.setOut(new PrintStream(output));

			
			FrontendMapper f = new FrontendMapper();
			f.oversee("m");			
			
			System.setOut(standardOut);
			System.setIn(standardIn);

			String appOutput = output.toString();

		
			assertEquals(appOutput.contains(
						
								 "HOME: "
								+"\n| Your current starting place: N/a"
								+"\n| Your current destination:    N/a"
								+"\n| Press 'h' to the help screen on other modes"
								+"\n| Press 'm' to go to the home screen at any time"
								+"\n| from other modes"
								+"\n| Press 'd' to go to distance"
								+"\n| Press 'x' to exit program"
						
					),true);
			

			
		}catch(Exception e) {
			System.out.println("Home screen Exception thrown");
			System.setOut(standardOut);
			System.setIn(standardIn);
			e.printStackTrace();
			assertEquals(true, false);
		}
		
	}
	
	/**
	 * The walking function cannot be done until the Distance function is done
	 * so this method will ensure that the hierarchy of input order is maintained
	 */
	@Test
	public void testWalkingFunction() {
		
	
		PrintStream standardOut = System.out;
		InputStream standardIn = System.in;
		
		try{
			
			String input = "w";
			InputStream inputBytes = new ByteArrayInputStream(input.getBytes());

			 System.setIn(inputBytes);
			ByteArrayOutputStream output = new ByteArrayOutputStream();

			System.setOut(new PrintStream(output));

			FrontendMapper f = new FrontendMapper();
			f.oversee("w");			
			
			System.setOut(standardOut);
			System.setIn(standardIn);

			String appOutput = output.toString();

		
			
		

		assertEquals(appOutput.contains(
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
						+ "Your Response : "),true);
		
		
		}catch(Exception e) {
			System.setOut(System.out);
			System.setIn(System.in);
			assertEquals(true, false);
		}
		
		
	}
	
	/**
	 * This method will ensure that the Distance function 
	 * will work properly and that it displays the right message
	 * to the user to start the distance function
	 */
	@Test
	public void testDistanceFunction(){
		
		
		PrintStream standardOut = System.out;
		InputStream standardIn = System.in;
		
		try{
			
			String input = "d";
			InputStream inputBytes = new ByteArrayInputStream(input.getBytes());

			 System.setIn(inputBytes);
			ByteArrayOutputStream output = new ByteArrayOutputStream();

			System.setOut(new PrintStream(output));

			
			FrontendMapper f = new FrontendMapper();
			f.oversee("d");			
			
			System.setOut(standardOut);
			System.setIn(standardIn);

			String appOutput = output.toString();

		

		assertEquals(appOutput.contains(
				"\n| Enter your Start Place and Building in this format:"
						+"\n| [Start,End,Category] "
						+ "\n| Example [Trader Joe's,Camp Randall Stadium,F] F = Fitness "
						+ "\n| Your response : "),true);
		
		
		}catch(Exception e) {
			System.setOut(System.out);
			System.setIn(System.in);
			assertEquals(true, false);
		}
			
}
	/**
	 * Because the program cannot run until the Distance and Walk functions are completed
	 * this method will ensure that the hierarchy of input order is maintained
	 */
	@Test
	public void testDisplaySettings()
	{
		

		PrintStream standardOut = System.out;
		InputStream standardIn = System.in;
		
		try{
			
			String input = "p";
			InputStream inputBytes = new ByteArrayInputStream(input.getBytes());

			 System.setIn(inputBytes);
			ByteArrayOutputStream output = new ByteArrayOutputStream();

			System.setOut(new PrintStream(output));

			FrontendMapper f = new FrontendMapper();
			f.oversee("p");			
			
			System.setOut(standardOut);
			System.setIn(standardIn);

			String appOutput = output.toString();

		

		assertEquals(appOutput.contains(
				"\n| Enter"
						+ "\n| Press 'l': Lists Of Buildings Function - List the buildings that would be passed on the way to the destination"
						+"\n| Press 'w': Walking Function - Estimate walking time between these locations\"\r\n" 
						+"\n| Press 'c': Category Function - Displays buildings, Walking time, and diatance in relation to a category\r\n" 
						+"\n| Press 'b': Building Function - Displays distance to a builing " 
						+"\n| Press 'a': To list all of the above")
				,true);
		
		
		}catch(Exception e) {
			System.setOut(System.out);
			System.setIn(System.in);
			assertEquals(true, false);
		}
			
			
	}
	
	/**
	 * This method will ensure the help menu is being properly displayed.
	 */
	@Test
	public void testHelpScreen()
	{
		
		PrintStream standardOut = System.out;
		InputStream standardIn = System.in;
		
		try{
			
			String input = "h";
			InputStream inputBytes = new ByteArrayInputStream(input.getBytes());

			 System.setIn(inputBytes);
			ByteArrayOutputStream output = new ByteArrayOutputStream();

			System.setOut(new PrintStream(output));

			FrontendMapper f = new FrontendMapper();
			f.oversee("h");		
			System.setOut(standardOut);
			System.setIn(standardIn);

			String appOutput = output.toString();

		

		assertEquals(appOutput.contains("\n| ------------------------------------------------------------------------------------------"
					+ "\n| <<USER ENTER FUNCTION COMMANDS + HOME SCREEN>>:"
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
					+"\n| x: Type x from any mode terminate program"),true);
		
		
		}catch(Exception e) {
			System.setOut(System.out);
			System.setIn(System.in);
			assertEquals(true, false);
		}
		
	}	
}


