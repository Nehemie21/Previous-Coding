// --== CS400 File Header Information ==--
// Name: Stefan Caldararu
// Email: scaldararu@wisc.edu
// Team: CC blue
// Role: Backend Developer
// TA: Xi Chen
// Lecturer: Gary Dahl
// Notes to Grader: The to do statement in the backend constructor is directly before the line where the 
//filepath needs to be changed.

import java.util.List;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.lang.Math;

public class Backend implements BackendInterface{
	//The graph, which stores only the name of the building as the data. It originally stored 
	//building objects, but this was changed when trying to fix a bug (which ended up being unrelated),
	//and ended up staying this way.
	public CS400Graph <String> graph = new CS400Graph <String>();
	public double travelSpeed;
	public double travelConditions;
	//ArrayList of all of the building objects, since the graph only stores their names
	public ArrayList<Building> buildings = new ArrayList<Building>(0);
	//This is the main backend constructor, to be called when actually trying to run the program from
	//the frontend with the correct data file. The filepath at the To Do statement needs to be changed. 
	public Backend() {
		try {
			//TODO: Change the filepath to the correct filepath for the data.
		    MadisonMapperReader mapper = new MadisonMapperReader("C:\\Users\\Nehemie\\eclipse-UWMadison\\CS 400 Project Three\\src\\DataFile.csv");
		    //temporary arraylist of buildings, only stored here until they get insterted into the graph and
		    //buildings list.
			ArrayList<BuildingInterface> build =(ArrayList<BuildingInterface>) mapper.getBuildings();
			//for each of the buildings in build, insert them as a vertex and then...
			for(BuildingInterface b:build) {
				insertVertex(b);
				//... for each of the buildings in the connected nodes for b, if the connected node is 
				//already in the graph insert a vertex in between them.
				for(BuildingInterface a:b.getConnectedNodes()) {
					if(graph.containsVertex(((Building)a).getName())) {
						insertEdge(b, a, getDistance((Building) a, (Building) b));
						insertEdge(a, b, getDistance((Building) a, (Building) b));
					}
				}
			}
			
		}catch (Exception e) {
			System.out.println("error reading data set");
		}
		//Initialize travel speed and travel Conditions: can be changed by user later
		this.travelSpeed = 1.0;
		this.travelConditions = 1.0;
		
		
	}
	//This is the test backend constructor, which takes a list of buildings as input (Allows for the 
	//backend to be tested w/out the frontend.
	public Backend( ArrayList<Building> build) {
		for(BuildingInterface b:build) {
			insertVertex(b);
			for(BuildingInterface a:b.getConnectedNodes()) {
				if(graph.containsVertex(((Building)a).getName())) {
					insertEdge(b, a, getDistance((Building) a, (Building) b));
					insertEdge(a, b, getDistance((Building) a, (Building) b));
				}
			}
		}
		buildings = build;
		travelSpeed = 1.0;
		travelConditions = 1.0;
	}
	//method used in constructor to get the distance between two buildings. Lat and lon coordinates are not 
	//
	public int getDistance(Building a, Building b) {
		
		return (int) Math.round(Math.sqrt((a.getLat()*100000000-b.getLat()*100000000)*(a.getLat()*100000000-b.getLat()*100000000)+(a.getLon()*100000000-b.getLon()*100000000)*(a.getLon()*100000000-b.getLon()*100000000)));
	}
	/**
     * Insert a new vertex into the graph.
     * 
     * @param data the data item stored in the new vertex
     * @return true if the data can be inserted as a new vertex, false if it is already in the graph
     * @throws NullPointerException if data is null
     */
    public boolean insertVertex(BuildingInterface data) throws NullPointerException{
    	if(data==null) {
   		throw new NullPointerException();
    	}
    	buildings.add((Building)data);
    	return graph.insertVertex(((Building)data).getName());
    	
    }
    
    /**
     * Remove a vertex from the graph.
     * Also removes all edges adjacent to the vertex from the graph (all edges that have the vertex as a source or a destination vertex).
     * 
     * @param data the data item stored in the vertex to remove
     * @return true if a vertex with *data* has been removed, false if it was not in the graph
     * @throws NullPointerException if data is null
     */
    public boolean removeVertex(BuildingInterface data) {
    	if(data==null) {
       		throw new NullPointerException();
        	}
    	buildings.remove(buildings.indexOf((Building) data));
    	return graph.removeVertex(((Building)data).getName());
    }
    
    /**
     * Insert a new directed edge with a positive edges weight into the graph.
     * 
     * @param source the data item contained in the source vertex for the edge
     * @param target the data item contained in the target vertex for the edge
     * @param weight the weight for the edge (has to be a positive integer)
     * @return true if the edge could be inserted or its weight updated, false if the edge with the same weight was already in the graph with the graph
     * @throws IllegalArgumentException if either sourceVertex or targetVertex or both are not in the graph, or weight is < 0
     * @throws NullPointerException if either sourceVertex or targetVertex or both are null
     */
    public boolean insertEdge(BuildingInterface source, BuildingInterface target, int weight) {
    	return graph.insertEdge(((Building)source).getName(), ((Building)target).getName(), weight);
    }
    
    /**
     * Remove an edge from the graph.
     * 
     * @param source the data item contained in the source vertex for the edge
     * @param target the data item contained in the target vertex for the edge
     * @return true if the edge could be removed, false if it was not in the graph
     * @throws IllegalArgumentException if either sourceVertex or targetVertex or both are not in the graph
     * @throws NullPointerException if either sourceVertex or targetVertex or both are null
     */
    public boolean removeEdge(BuildingInterface source, BuildingInterface target) {
    	return graph.removeEdge(((Building)source).getName(), ((Building) target).getName());
    }
    
    /**
     * Check if the graph contains a vertex with data item *data*.
     * 
     * @param v the data item to check check for
     * @return true if data item is stored in a vertex of the graph, false otherwise
     * @throws NullPointerException if *data* is null
     */
    public boolean containsVertex(BuildingInterface data) {
    	return graph.containsVertex(((Building)data).getName());
    }
    
    /**
     * Check if edge is in the graph.
     * 
     * @param source the data item contained in the source vertex for the edge
     * @param target the data item contained in the target vertex for the edge
     * @return true if the edge is in the graph, false if it is not in the graph
     * @throws NullPointerException if either sourceVertex or targetVertex or both are null
     */
    public boolean containsEdge(BuildingInterface source, BuildingInterface target) {
    	return graph.containsEdge(((Building) source).getName(), ((Building) target).getName());
    }
    
    /**
     * Return the weight of an edge.
     * 
     * @param source the data item contained in the source vertex for the edge
     * @param target the data item contained in the target vertex for the edge
     * @return the weight of the edge (0 or positive integer)
     * @throws IllegalArgumentException if either sourceVertex or targetVertex or both are not in the graph
     * @throws NullPointerException if either sourceVertex or targetVertex or both are null
     * @throws NoSuchElementException if edge is not in the graph
     */
    public int getWeight(BuildingInterface source, BuildingInterface target) {
    	return graph.getWeight(((Building) source).getName(), ((Building) target).getName());
    }
    
    /**
     * Returns the shortest path between startingVertex and destinationVertex.
     * Uses Dijkstra's shortest path algorithm to find the shortest path.
     * 
     * @param start the data item in the starting vertex for the path
     * @param end the data item in the destination vertex for the path
     * @return list of data item in vertices in order on the shortest path between vertex with data item startingVertex and vertex with data item destinationVertex, including both startingVertex and destinationVertex
     */
    public List<Building> shortestPath(BuildingInterface start, BuildingInterface end){
    	//generates a list of building names in the shortest path
    	List<String> a = graph.shortestPath(((Building) start).getName(), ((Building) end).getName());
    	//List to return
    	List <Building> b = new ArrayList<Building>();
    	//populates the list to return with the appropriate buildings.
    	for(String name:a) {
    		for(int i=0;i<buildings.size();i++) {
    			if(name==buildings.get(i).getName()) {
    				b.add(buildings.get(i));
    			}
    		}
    	}
    	return b;
    }
    
    /**
     * Returns the cost of the path (sum over edge weights) between startingVertex and destinationVertex.
     * Uses Dijkstra's shortest path algorithm to find the shortest path.
     * 
     * @param start the data item in the starting vertex for the path
     * @param end the data item in the destination vertex for the path
     * @return the cost of the shortest path between vertex with data item startingVertex and vertex with data item destinationVertex, including both startingVertex and destinationVertex
     */
    public int getPathCost(BuildingInterface start, BuildingInterface end) {
    	return graph.getPathCost(((Building) start).getName(), ((Building) end).getName());
    }
    
    /**
     * Check if the graph is empty (does not contain any vertices or edges).
     * 
     * @return true if the graph does not contain any vertices or edges, false otherwise
     */
    public boolean isEmpty() {
    	return graph.isEmpty();
    }
    
    /**
     * Return the number of edges in the graph.
     * 
     * @return the number of edges in the graph
     */
    public int getEdgeCount() {
    	return graph.getEdgeCount();
    }
    
    /**
     * Return the number of vertices in the graph
     * 
     * @return the number of vertices in the graph
     */
    public int getVertexCount() {
    	return graph.getVertexCount();
    }
    //Returns the time it takes to travel a path (incorporates travelConditions and travelSpeed).
    public double getPathTime( BuildingInterface currentVertex, BuildingInterface destinationVertex) throws NoSuchElementException{
    	if(graph.containsVertex( ((Building) currentVertex).getName()) && graph.containsVertex( ((Building) destinationVertex).getName())) {
    		return getPathCost(currentVertex, destinationVertex)*travelConditions/travelSpeed;
    	}
    	else {
    		throw new NoSuchElementException();
    	}
    }
    //This class needed to be made so that the shortest general path method can be written in here instead 
    //of in the CS400Graph class. It is based off of the Path class in the CS400Graph class.
    class Path implements Comparable{
    	Building start;
    	ArrayList<Building> path;
    	Building end;
    	int cost;
    	public Path(Building s) {
    		start = s;
    		end = s;
    		path = new ArrayList<Building>();
    		cost = 0;
    	}
    	public Path(Path p, Building e, int c) {
    		this.start = p.start;
    		this.path = p.path;
    		this.path.add(e);
    		end = e;
    		cost = cost+c;
    	}
    	public int compareTo(Object b) {
    		return 0;
    	}
    }
	// Same core functionality as GraphADT’s shortestPath() function, but returning a list of vertices for the shortest path to a destination of the specified type.  Throws a NoSuchElementException if currentVertex is invalid in some way or no vertices match the destination type.
	public ArrayList<Building> shortestGeneralPath( BuildingInterface currentNode, char destinationType) throws NoSuchElementException{
		if(!graph.vertices.containsKey(currentNode.getName())) {
    		throw new NoSuchElementException();
    	}
    	//first creates a hashtable of the visited verticies
    	ArrayList<Building> visitedVerticies = new ArrayList<>();
    	//creates a priority queue to store paths
    	PriorityQueue <Path> queue= new PriorityQueue<>();
    	//the current path we are using
    	Path path;
    	//initialization
    	queue.add(new Path((Building)currentNode));
    	//runs while there are still paths to explore in the queue
    	while(!queue.isEmpty()) {
    		//gets next path to explore
    		path = queue.poll();
    		
    		//checks if this vertex has already been explored. If so, skips it (shortest path already
    		//found).
    		if(!visitedVerticies.contains(path.end)) {
    			visitedVerticies.add(path.end);
    			//checks if this is the correct end for the path we are searching for, and that it isn't a 
    			//path of 0 to the start node.
    			String endTypes = path.end.getTypes();
    			if(endTypes.indexOf(destinationType)!=-1&& path.end!=path.start) {
    				return path.path;
    			}
    			//updates the queue if not
    			else {
    				for(BuildingInterface b: path.end.getConnectedNodes()) {
    					queue.add(new Path(path, (Building) b, getPathCost(path.end,b)));
    				}
    			}
    		}
    	}
    	throw new NoSuchElementException();
	}

	// Same core functionality as GraphADT’s getPathCost() function, but returning the cost of the shortest path to a destination of the specified type.  Throws a NoSuchElementException if currentVertex is invalid in some way or no vertices match the destination type.
	public int getGeneralPathCost( BuildingInterface currentVertex, char destinationType) throws NoSuchElementException{
		if(!graph.vertices.containsKey(currentVertex.getName())) {
    		throw new NoSuchElementException();
    	}
    	//first creates a hashtable of the visited verticies
    	ArrayList<Building> visitedVerticies = new ArrayList<>();
    	//creates a priority queue to store paths
    	PriorityQueue <Path> queue= new PriorityQueue<>();
    	//the current path we are using
    	Path path;
    	//initialization
    	queue.add(new Path((Building)currentVertex));
    	//runs while there are still paths to explore in the queue
    	while(!queue.isEmpty()) {
    		//gets next path to explore
    		path = queue.poll();
    		
    		//checks if this vertex has already been explored. If so, skips it (shortest path already
    		//found).
    		if(!visitedVerticies.contains(path.end)) {
    			visitedVerticies.add(path.end);
    			//checks if this is the correct end for the path we are searching for, and that it isn't a 
    			//path of 0 to the start node.
    			String endTypes = path.end.getTypes();
    			if(endTypes.indexOf(destinationType)!=-1 &&path.start!=path.end) {
    				return path.cost;
    			}
    			//updates the queue if not
    			else {
    				for(BuildingInterface b: path.end.getConnectedNodes()) {
    					queue.add(new Path(path, (Building) b, getPathCost(path.end,b)));
    				}
    			}
    		}
    	}
    	throw new NoSuchElementException();
	}

	// Same core functionality as getPathTime(), but returning the travel time along the shortest path to a destination of the specified type in minutes.  Throws a NoSuchElementException if currentVertex is invalid in some way or no vertices match the destination type.
	public double getGeneralPathTime( BuildingInterface currentVertex, char destinationType) throws NoSuchElementException{
		return getGeneralPathCost(currentVertex, destinationType)*travelConditions/travelSpeed;
	}

	// Sets the travel speed for travel time calculations, with speed provided in feet/second.  Throws an IllegalArgumentException if speed is <= 0.0.
	public void setTravelSpeed(double speed) throws IllegalArgumentException{
		travelSpeed = speed;
	}

	// Gets the current travel speed, in feet/second.
	public double getTravelSpeed() {
		return travelSpeed;
	}

	// Sets a multiplier for travel times related to the current travel conditions on campus, with the default being 1.0.  Throws an IllegalArgumentException if conditionMultiplier is <= 0.0.
	public void setTravelConditions(double conditionMultiplier) throws IllegalArgumentException{
		if(conditionMultiplier<=0) {
			throw new IllegalArgumentException();
		}
		else {
			travelConditions = conditionMultiplier;
		}
	}

	// Gets the current travel condition multiplier.
	public double getTravelConditions() {
		return travelConditions;
	}

	// Gets a list of all building vertices in the dataset, returning an empty list in the case of a graph without buildings.
	public ArrayList<Building> getBuildings(){
		
		return buildings;
	}
	
}
