// --== CS400 File Header Information ==--
// Name: Garrison Waugh
// Email: gwaugh@wisc.edu
// Team: CC
// TA: Xi Chen
// Lecturer: Gary Dahl
// Notes to Grader: 

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Stack;

/**
 * BridgeBackend Class
 * 
 * Serves as the backend of the Bridge Storage System. Contains several methods
 * that pass information from the BridgeDataReader and Backend onto the Frontend
 * for various uses.
 * 
 * @author garri
 *
 */
public class BridgeBackend implements BackendInterface {

    RedBlackTree<BridgeInterface> bridges = new RedBlackTree<>();
    BridgeDataReader overview;
    Stack<BridgeInterface> bridgeStack;

    /**
     * BridgeBackend String[] Constructor
     * 
     * Passes the last filepath found to the BridgeBackend(String s) constructor.
     * 
     * @param args the String[] that contains the Filepath
     * @throws FileNotFoundException the specified file is not found
     * @throws IOException           the specified file is not found
     */
    public BridgeBackend(String[] args) throws FileNotFoundException, IOException {
	this(args[args.length - 1]);
    }

    /**
     * BridgeBackend Scanner Constructor
     * 
     * Passes the filepath to the BridgeBackend(String s) constructor.
     * 
     * @param input the Scanner containing the string of the filepath
     * @throws FileNotFoundException the specified file is not found
     * @throws IOException           the specified file is not found
     */
    public BridgeBackend(Scanner input) throws FileNotFoundException, IOException {
	this(input.nextLine());
    }

    /**
     * BridgeBackend String Constructor
     * 
     * Passes the filepath of the bridge database in string format to the
     * BridgeDataReader class.
     * 
     * @param s filepath String
     * @throws FileNotFoundException the specified file is not found
     * @throws IOException           the specified file is not found
     */
    public BridgeBackend(String s) throws FileNotFoundException, IOException {

	ArrayList<Bridge>  bridgeList = null;
	
	try {
	     overview = new BridgeDataReader(s);
	     bridgeList = new ArrayList<Bridge>(overview.getBridges());
	    
	 // Delete when the new BridgeDataReader constructor is made.
	
	} catch (IOException e) {
	    System.err.println("The provided file path does not lead to an existing file.");
	}
	
	
	for (int i = 0; i < bridgeList.size(); i++) {
	    if (!Objects.isNull(bridgeList.get(i).getName())) {
		bridges.insert(bridgeList.get(i));
	    }
	}
    }

    /**
     * getRailroad Method
     * 
     * Returns the name of the current working railroad.
     * 
     * @return the name of the current railroad.
     */
    public String getRailroad() {
	return overview.getRailroad();
    }

    /**
     * getRegion Method
     * 
     * Returns the region of the working railroad.
     * 
     * @return the region of the railroad
     */
    public String getRegion() {
	return overview.getRegion();
    }

    /**
     * getNumBridges Method
     * 
     * Retruns the number of bridges in the current, working bridge database.
     * 
     * @return the number of bridges in this current railroad database
     */
    public int getNumBridges() {
	return bridges.size();
    }

    /**
     * getFormatHelp Method
     * 
     * Returns the String representation containing information about the formatting
     * of this railroad.
     * 
     * @return a String containing information about the formatting for this
     *         railroad
     */
    public String getFormatHelp() {
	return overview.getFormatHelp();
    }

    /**
     * getPrevious Method
     * 
     * Returns the preceeding bridge to the current bridge.
     * 
     * @param current the current bridge.
     * @return the bridge preceeding current if it exists. Null otherwise.
     */
    public BridgeInterface getPrevious(BridgeInterface current) {
	Iterator<BridgeInterface> it = bridges.iterator();
	Stack<BridgeInterface> bStack = new Stack<BridgeInterface>();
	BridgeInterface temp = null;
	
	while (it.hasNext()) {
	    temp = it.next();
	    
	    if (temp.equals(current)) {
		break;
	    }
	    
	    bStack.push(temp);
	}
	
	if (Objects.isNull(temp)) {
	    return null;
	} else if (!temp.equals(current)) {
	    return null;
	}
	
	return bStack.pop();
    }

    /**
     * getNext Method
     * 
     * Returns the succeeding bridge to the current bridge.
     * 
     * @param current the current bridge.
     * @return the bridge succeeding current if it exists. Null otherwise.
     */
    public BridgeInterface getNext(BridgeInterface current) {
	Iterator<BridgeInterface> it = bridges.iterator();
	BridgeInterface temp = null;
	
	while (it.hasNext()) {
	    temp = it.next();
	    
	    if (temp.equals(current)) {
		return it.next();
	    }
	}

	return null;
    }

    /**
     * Searches the database for the bridge matching the given input
     * 
     * @param input a String representation of the bridge name
     * @return the corresponding BridgeInterface object if such a bridge exists
     * @throws IllegalArgumentException if the bridge name is not in a valid format
     * @throws NoSuchElementException   if the bridge name was formatted correctly
     *                                  but is not present in the database. The
     *                                  message will contain the name of the bridge
     *                                  closest in number to the searched bridge
     */
    public BridgeInterface getBridge(String input) throws IllegalArgumentException, NoSuchElementException {
	String prefix = overview.getBridgePrefix();

	for (int i = 0; i < prefix.length(); i++) {
	    if (input.charAt(i) != prefix.charAt(i)) {
		throw new IllegalArgumentException("The bridge name is in and invalid format. Must start with the prefix: " + prefix);
	    }
	}

	Bridge b = new Bridge();
	b.setName(input);
	if (bridges.contains(b)) {

	    Iterator<BridgeInterface> it = bridges.iterator();
	    while (it.hasNext()) {
		Bridge toReturn = (Bridge) it.next();
		if (toReturn.equals(b)) {
		    return toReturn;
		}
	    }
	} else {
	    throw new NoSuchElementException("The input bridge name does not exist in this database.");
	}
	return null;
    }

    /**
     * Searches for the nearest bridge to the input location
     * 
     * @param latitude  a decimal representation of the latitude in degrees
     * @param longitude a decimal representation of the longitude in degrees
     * @return the BridgeInterface object for the nearest bridge
     * @throws IllegalArgumentException if the latitude is outside +/-90 or the
     *                                  longitude is outside +/- 180
     */
    public BridgeInterface getNearestBridge(double latitude, double longitude) throws IllegalArgumentException {

	if (latitude > 90 || latitude < -90) {
	    throw new IllegalArgumentException("Value for latitude is out of bounds [-90, 90].");
	}
	if (longitude > 180 || latitude < -180) {
	    throw new IllegalArgumentException("Value for latitude is out of bounds [-180, 180].");
	}

	Iterator<BridgeInterface> it = bridges.iterator();
	BridgeInterface temp;
	BridgeInterface toReturn = it.next();
	double toReturnDist = getDistance(latitude, longitude, toReturn);

	while (it.hasNext()) {
	    temp = it.next();

	    if (getDistance(latitude, longitude, temp) > toReturnDist) {
		toReturn = temp;
		toReturnDist = getDistance(latitude, longitude, toReturn);
	    }
	}

	return toReturn;
    }

    /**
     * Gets the distance between coordinates and a specified bridge, in miles.
     * 
     * Based on the code for the Haversine Formula by GeeksForGeeks at:
     * https://www.geeksforgeeks.org/haversine-formula-to-find-distance-between-two-points-on-a-sphere/
     * 
     * @param latitude  a decimal representation of the latitude in degrees
     * @param longitude a decimal representation of the longitude in degrees
     * @param bridge    the BridgeInterface object that the distance is being
     *                  calculated to
     * @return the distance between the bridge and the input position, in miles
     * @throws IllegalArgumentException if the latitude is outside +/-90, if the
     *                                  longitude is outside +/- 180, or if the
     *                                  BridgeInterface is null
     */
    public double getDistance(double latitude, double longitude, BridgeInterface bridge) throws IllegalArgumentException {

	if (latitude > 90 || latitude < -90) {
	    throw new IllegalArgumentException("Value for latitude is out of bounds [-90, 90].");
	}
	if (longitude > 180 || latitude < -180) {
	    throw new IllegalArgumentException("Value for latitude is out of bounds [-180, 180].");
	}

	double lat1 = latitude;
	double lat2 = bridge.getLat();
	double lon1 = longitude;
	double lon2 = bridge.getLon();
	double latitudes = Math.toRadians(lat2 - lat1);
	double longitudes = Math.toRadians(lon2 - lon1);

	lat1 = Math.toRadians(lat1);
	lat2 = Math.toRadians(lat2);

	double a = (Math.pow(Math.sin(latitudes / 2), 2) + Math.pow(Math.sin(longitudes / 2), 2)) * Math.cos(lat1) * Math.cos(lat2);

	double c = 2 * Math.asin(Math.sqrt(a));
	return 3958.1 * c;
    }

    public Bridge getRoot() {
	if (!Objects.isNull(bridges.root.data))
	    return (Bridge) bridges.root.data;
	return null;
    }
}
