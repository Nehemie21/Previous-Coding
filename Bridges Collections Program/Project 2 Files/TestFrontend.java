//--== CS400 File Header Information ==--
// Name: Stefan Caldararu
// Email: scaldararu@wisc.edu
// Team: CC
// Role: Frontend developer
// TA: Xi Chen
// Lecturer: Gary Dahl
// Notes to Grader: These tests are currently written in such a way that they will run with the backend
//dummy class written by Stefan (myself). To change this, uncomment the /** and **/ around the to do
//statement and the following lines, and change the filepath. Some of thes tests are only implemented 
//using the dummy backend (because I didn't recieve access to a working backend, or a dummy backend from
//the backend developer, I needed to write my own). 

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import  org.junit.jupiter.api.Test;

public class TestFrontend {
	//This test will instantiate a backend object in the test environment (meaning using the string 
	//constructor, not the scanner one), and will immediately enter help mode. It will then ensure
	//that each of the possible commands is displayed correctly. 
	@Test
	public void HelpScreenTest() {
		try{
			String input = "?";
			InputStream inputBytes = new ByteArrayInputStream(input.getBytes());
			System.setIn(inputBytes);
			ByteArrayOutputStream output = new ByteArrayOutputStream();
			System.setOut(new PrintStream(output));
			/**
			//TODO: Change the filepath here
			String filePath = "";
			BackendInterface back = new BridgeBackend(filePath);
			Frontend frontend = new Frontend();
			frontend.run(back);
			**/
			BackendInterface back = new BackendDummy();
			Frontend frontend = new Frontend();
			frontend.run(back);
			
			System.setOut(System.out);
			System.setIn(System.in);
			String helpMessage = "";
			String appOutput = output.toString();
			if(frontend == null) {
				assertEquals(true,false);
			}
			else {
				assertEquals(appOutput.contains("\n| ------------------------------------------------------------------------------------------"
						+ "\n| This program has 5 modes:"
						+"\n| Home: type x from any other mode to enter home mode"
						+"\n| Location Entry: type l from Home mode to enter Location Entry. Allows user to enter a location to search for bridges"
						+"\n| Name Search: type s from Home mode to enter Name Search. Allows user to search for bridges by name"
						+"\n| Viewer: type v from Home mode to enter Viewer. Displays information about the currently selected bridge"
						+"\n| Help: type help or ? to view this help mode"
						+"\n| \n| OTHER COMMANDS:"
						+"\n| ls: displays the bridge closest to the entered location"
						+"\n| x: Type x from Home mode to exit this program, or from any other mode to enter Home mode"
						+"\n| a/d: In view mode, use a to go to the previous bridge and d to go to the next bridge"+
						"\n| ------------------------------------------------------------------------------------------"),true);
			}
		}catch(Exception e) {
			System.setOut(System.out);
			System.setIn(System.in);
			assertEquals(true, false);
		}
	}
	//This test will test the location entry. It will instantiate a backend object in the test 
	//environment, and will immediately enter location entry mode. It will then enter a location, 
	//and then exit to the home screen. The home screen will have a section to display what
	//location is currently selected (if any), and this test will make sure that that is displayed 
	//correctly.
	@Test
	public void locationTest() {
		try {
			String input = "l" + System.lineSeparator() + "[42.0,-57.3]";
			InputStream inputBytes = new ByteArrayInputStream(input.getBytes());
			System.setIn(inputBytes);
			ByteArrayOutputStream output = new ByteArrayOutputStream();
			System.setOut(new PrintStream(output));
			/**
			//TODO: Change the filepath
			String filePath = "";
			BackendInterface back = new BridgeBackend(filePath);
			Frontend frontend = new Frontend();
			frontend.run(back);
			**/
			BackendInterface back = new BackendDummy();
			Frontend frontend = new Frontend();
			frontend.run(back);
			
			System.setOut(System.out);
			System.setIn(System.in);
			String appOutput = output.toString();
			if(frontend == null) {
				assertEquals(true,false);
			}
			else {
				assertEquals(appOutput.contains("42.0")&&appOutput.contains("-57.3"),true);
			}
		}catch(Exception e) {
			System.setOut(System.out);
			System.setIn(System.in);
			assertEquals(true, false);
		}
	}
	//This test will test the viewer screen. It will instantiate a backend object in the test 
	//view screen by immediately entering the view mode, and checking to see that the correct 
	//"no bridge found" message is shown.
	@Test
	public void viewerScreenFormatTest() {
		try{
			String input = "v";
			InputStream inputBytes = new ByteArrayInputStream(input.getBytes());
			System.setIn(inputBytes);
			ByteArrayOutputStream output = new ByteArrayOutputStream();
			System.setOut(new PrintStream(output));
			/**
			//TODO: Change the filepath
			String filePath = "";
			BackendInterface back = new BridgeBackend(filePath);
			Frontend frontend = new Frontend();
			frontend.run(back);
			**/
			BackendInterface back = new BackendDummy();
			Frontend frontend = new Frontend();
			frontend.run(back);
			
			System.setOut(System.out);
			System.setIn(System.in);
			String appOutput = output.toString();
			if(frontend == null) {
				assertEquals(true,false);
			}
			else {
				
				assertEquals(appOutput.contains("\\n| NO BRIDGE CURRENTLY SELECTED"),true);
			}
		}catch(Exception e) {
			System.setOut(System.out);
			System.setIn(System.in);
			assertEquals(true, false);
		}
	}
	//This test will test the name search feature. It will instantiate a backend object in the 
	//test environment with only one bridge, and will immediately enter name search mode. It 
	//will then search for a bridge in the dummy backend class (written by Stefan), 
	//and test if the bridge name is displayed in the following 
	//display.
	@Test
	public void nameSearchTest() {
		try{
			String bridgeName = "bridge1";
			String input = "s"+System.lineSeparator()+bridgeName+System.lineSeparator();
			InputStream inputBytes = new ByteArrayInputStream(input.getBytes());
			System.setIn(inputBytes);
			ByteArrayOutputStream output = new ByteArrayOutputStream();
			System.setOut(new PrintStream(output));
		       
			
			BackendInterface back = new BackendDummy();
			Frontend frontend = new Frontend();
			frontend.run(back);
			
			System.setOut(System.out);
			System.setIn(System.in);
			String appOutput = output.toString();
			if(frontend == null) {
				assertEquals(true,false);
			}
			else {
				assertEquals(appOutput.contains(bridgeName),true);
			}
		}catch(Exception e) {
			System.setOut(System.out);
			System.setIn(System.in);
			assertEquals(true, false);
		}
	}
	//This test will instantiate a backend object in the test environment, then enter location 
	//entry mode, and enter a location. It will then return to location entry mode, and reset the
	//location. It will then ensure that the location that was entered is no longer displayed on
	//the screen.
	@Test
	public void locationResetTest() {
		try{
			String input = "l" + System.lineSeparator() + "[42.0,-50.3]"+System.lineSeparator()
			+"l"+System.lineSeparator()+"r"+System.lineSeparator()+"x";
			InputStream inputBytes = new ByteArrayInputStream(input.getBytes());
			System.setIn(inputBytes);
			ByteArrayOutputStream output = new ByteArrayOutputStream();
			System.setOut(new PrintStream(output));
			
			/**
			//TODO: Change the filepath
			String filePath = "";
			BackendInterface back = new BridgeBackend(filePath);
			Frontend frontend = new Frontend();
			frontend.run(back);
			**/
			BackendInterface back = new BackendDummy();
			Frontend frontend = new Frontend();
			frontend.run(back);
			
			System.setOut(System.out);
			System.setIn(System.in);
			String appOutput = output.toString();
			if(frontend == null) {
				assertEquals(true,false);
			}
			else {
				assertEquals(appOutput.contains("42.0")||appOutput.contains("-50.3"),false);
			}
		}catch(Exception e) {
			System.setOut(System.out);
			System.setIn(System.in);
			assertEquals( true, false);
		}
	}
	
}
