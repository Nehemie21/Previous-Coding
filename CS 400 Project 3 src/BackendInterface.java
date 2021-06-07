import java.util.NoSuchElementException;
import java.util.List;
import java.util.ArrayList;
public interface BackendInterface {
	// Gets travel time between two vertex in minutes based on internal speed and condition parameters, throwing a NoSuchElementException if one or both vertices are invalid in some way
	public double getPathTime(BuildingInterface currentVertex, BuildingInterface destinationVertex) throws NoSuchElementException;
	// Same core functionality as GraphADT’s shortestPath() function, but returning a list of vertices for the shortest path to a destination of the specified type.  Throws a NoSuchElementException if currentVertex is invalid in some way or no vertices match the destination type.
	public ArrayList<Building> shortestGeneralPath(BuildingInterface currentNode, char destinationType) throws NoSuchElementException;

	// Same core functionality as GraphADT’s getPathCost() function, but returning the cost of the shortest path to a destination of the specified type.  Throws a NoSuchElementException if currentVertex is invalid in some way or no vertices match the destination type.
	public int getGeneralPathCost(BuildingInterface currentVertex, char destinationType) throws NoSuchElementException;

	// Same core functionality as getPathTime(), but returning the travel time along the shortest path to a destination of the specified type in minutes.  Throws a NoSuchElementException if currentVertex is invalid in some way or no vertices match the destination type.
	public double getGeneralPathTime(BuildingInterface currentVertex, char destinationType) throws NoSuchElementException;

	// Sets the travel speed for travel time calculations, with speed provided in feet/second.  Throws an IllegalArgumentException if speed is <= 0.0.
	public void setTravelSpeed(double speed) throws IllegalArgumentException;

	// Gets the current travel speed, in feet/second.
	public double getTravelSpeed();

	// Sets a multiplier for travel times related to the current travel conditions on campus, with the default being 1.0.  Throws an IllegalArgumentException if conditionMultiplier is <= 0.0.
	public void setTravelConditions(double conditionMultiplier) throws IllegalArgumentException;

	// Gets the current travel condition multiplier.
	public double getTravelConditions();

	// Gets a list of all building vertices in the dataset, returning an empty list in the case of a graph without buildings.
	public ArrayList<Building> getBuildings();

}
