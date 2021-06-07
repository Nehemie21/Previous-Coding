import java.util.NoSuchElementException;

public interface BackendInterface {
    /**
     * An accessor for the current dataset's railroad name
     * 
     * @return a String representation of the railroad name
     */
    public String getRailroad();

    /**
     * An accessor for the current dataset's region
     * 
     * @return a String representation of the dataset's region
     */
    public String getRegion();

    /**
     * An accessor for the number of bridges in the current database
     * 
     * @return the number of bridges in the database
     */
    public int getNumBridges();

    /**
     * Gives information provided by the data table about bridge naming schemes
     * 
     * @return a String representation of a brief explanation of how bridges are named/numbered for
     *         search purposes
     */
    public String getFormatHelp();

    /**
     * Searches the database for the bridge matching the given input
     * 
     * @param input a String representation of the bridge name
     * @return the corresponding BridgeInterface object if such a bridge exists
     * @throws IllegalArgumentException if the bridge name is not in a valid format
     * @throws NoSuchElementException   if the bridge name was formatted correctly but is not present
     *                                  in the database. The message will contain the name of the
     *                                  bridge closest in number to the searched bridge
     */
    public BridgeInterface getBridge(String input)
	throws IllegalArgumentException, NoSuchElementException;

    /**
     * Searches for the nearest bridge to the input location
     * 
     * @param latitude  a decimal representation of the latitude in degrees
     * @param longitude a decimal representation of the longitude in degrees
     * @return the BridgeInterface object for the nearest bridge
     * @throws IllegalArgumentException if the latitude is outside +/-90 or the longitude is outside
     *                                  +/- 180
     */
    public BridgeInterface getNearestBridge(double latitude, double longitude)
	throws IllegalArgumentException;

    /**
     * Gets the distance between coordinates and a specified bridge, in miles
     * 
     * @param latitude  a decimal representation of the latitude in degrees
     * @param longitude a decimal representation of the longitude in degrees
     * @param bridge    the BridgeInterface object that the distance is being calculated to
     * @return the distance between the bridge and the input position, in miles
     * @throws IllegalArgumentException if the latitude is outside +/-90, if the longitude is outside
     *                                  +/- 180, or if the BridgeInterface is null
     */
    public double getDistance(double latitude, double longitude, BridgeInterface bridge)
	throws IllegalArgumentException;

}
