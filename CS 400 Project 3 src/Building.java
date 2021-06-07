import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Building implements BuildingInterface {
    protected String name;
    protected String type;
    protected double latitude;
    protected double longitude;
    protected List<String> tempList;
    protected ArrayList<BuildingInterface> connectedNodes = new ArrayList<>();

    /**
     * Constructs a new BuildingNode Object.
     * 
     * @param name the name of this building
     * @param type the type of this building
     * @param latitude the latitude of this building
     * @param longitude the longitude of this building
     * @param nodeNames the unseparated names of the connected nodes
     * @throws IllegalargumentException if name or type is null, or if latitude is < -90 or > 90, or if longitude is < -180 or > 180.
     */
    public Building (String name, String type, double latitude, double longitude, String nodeNames) {
	this.name = name;
	this.type = type;
	this.latitude = latitude;
	this.longitude = longitude;
	tempList = Arrays.asList(nodeNames.split("\\s\\+\\s"));
    }
    
    /**
     * Adds the given BuildingInterface Object to the connected nodes ArrayList.
     * 
     * @throws NullPointerException if b is null
     * @return true if b does not exist in connectedNodes and b is added, false otherwise
     */
    public boolean addConnectedNode(BuildingInterface b) {
	if (b == null)
	    throw new NullPointerException ("b cannot be null.");
	if (connectedNodes.contains(b))
	    return false;
	connectedNodes.add(b);
	return true;
    }
    
    /**
     * Returns the name of the building
     * 
     * @return the name of the BuildingInterface Object
     */
    public String getName() {
	return this.name;
    }

    /**
     * Returns the multiple specifier codes of the building
     * 
     * @returns the specifier types that apply to this specific BuildingInterface
     *          Object
     */
    public String getTypes() {
	return this.type;
    }

    /**
     * Returns the latitude of the building or path
     * 
     * @return the latitude of this BuildingInterface Object
     */
    public double getLat() {
	return this.latitude;
    }

    /**
     * Returns the longitude of the building or path
     * 
     * @return the longitude of this BuildingInterface Object
     */
    public double getLon() {
	return this.longitude;
    }

    /**
     * Returns a list of BuildingInterface's that are connected to this node
     * 
     * @return a List of BuildingInterfaces that are connected to this
     *         BuildingInterface
     */
    public ArrayList<BuildingInterface> getConnectedNodes() {
	return this.connectedNodes;
    }

    /**
     * Checks whether two BuildingInterface Objects represent the same building
     * 
     * @param o the BuildingInterface to check
     * @return true if the name, latitude, and longitude of the nodes are equal;
     *         false otherwise
     */
    @Override
    public boolean equals(Object o) {
	if (o instanceof BuildingInterface) {
	    BuildingInterface comp = (BuildingInterface) o;
	    if (comp.getName().equalsIgnoreCase(this.name) && comp.getLat() == this.latitude && comp.getLat() == this.longitude) {
		return true;
	    }
	}
	return false;
    }

    /**
     * Compares two BuildingNode Objects based on their name.
     * 
     * @param b the BuildingNode Object being compared to
     * @return If this BuildingNode comes before b alphabetically, return -1. If they
     *         have the same name, return 0, if b comes before this, return 1.
     */
    public int compareTo(Building b) {
	int compare = this.name.compareToIgnoreCase(b.getName());
	if (compare < 0)
	    return -1;
	if (compare > 0)
	    return 1;
	return 0;
    }
    
    public String toString()
    {
    	
    	
    	
    	return this.name;
    	
    }
}