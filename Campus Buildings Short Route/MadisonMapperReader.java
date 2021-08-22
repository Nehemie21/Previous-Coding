import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;

public class MadisonMapperReader implements MapperReaderInterface {

    protected ArrayList<BuildingInterface> vertices;
    protected String[][] buildingSpecifiers;

    /**
     * Generates a list of BuildingInterface's from the dataset that is passed in
     * 
     * @param filePath the filePath to the dataset
     * @return a list of all of the BuildingInterface Objects in this dataset.
     * @throws DataFormatException if the dataset is improperly formatted or contains no building data
     * @throws IOException if there is an I/O exception
     */
    public void readDataSet(String filePath) throws DataFormatException, IOException {
	this.vertices = new ArrayList<BuildingInterface>();
	BufferedReader reader = null;
	String[] basicData = null;
	
	try { // tries to open the file at the passed in filePath
	    reader = new BufferedReader(new FileReader(filePath));
	} catch (FileNotFoundException e) {
	    System.err.println("The given file could not be found.");
	}
	
	try { // tries to split the first line of the file so we can access the specifier keys
	    basicData = reader.readLine().split(",");
	} catch (IOException e) {
	    System.err.println("An error was caught while splitting the dataset data.");
	}
	
	String specifiers = basicData[1]; // accesses the cell containing the building specifier keys
	Pattern p = Pattern.compile("(.)[-](\\w+((\\s\\w+)?)+)");
	Matcher m = p.matcher(specifiers);
	
	ArrayList<MatchResult> mr = new ArrayList<>();
	m.results().forEach(match -> mr.add(match));
	
	if (mr.size() <= 0) {
	    throw new DataFormatException("The given file is incorrectly formatted.");
	}
	
	buildingSpecifiers = new String[mr.size()][2]; // initializing the 2D array containing building specifier pairs
	
	for (int i = 0; i < mr.size(); i++) {
	    buildingSpecifiers[i][0] = mr.get(i).group(1);
	    buildingSpecifiers[i][1] = mr.get(i).group(2);
	}

	ArrayList<String> readData = new ArrayList<>();
	String building = "";
	while ((building = reader.readLine()) != null) { // reads the remainder of the csv file
	    readData.add(building);
	}
	
	for(String s : readData) {
	    String[] buildingData = s.split(",");
	    Building b = new Building(buildingData[0], buildingData[1], Double.parseDouble(buildingData[2]), Double.parseDouble(buildingData[3]), buildingData[4]);
	    vertices.add(b);
	}
	
	/**
	 * This code snippet comes after creating all of the nodes so I can properly add the BuildingInterface nodes
	 * to the connectedNodes ArrayList as opposed to just the names of the buildings.
	 */
	for (BuildingInterface b : vertices) {
	    Building bn = (Building) b;
	    for (BuildingInterface c : vertices) {
		Building cn = (Building) c;
		if (bn.tempList.contains(cn.getName())) {
		    bn.addConnectedNode(cn);
		}
	    }
	}	
}

    /**
     * Returns a list of all of the BuildingInterfaces found in this dataset.
     * 
     * @return a list of all of the BuildingInterface Objects in this dataset.
     */
    public ArrayList<BuildingInterface> getBuildings() {
	return vertices;
    }

    /**
     * Returns the different specifiers that can be used for each building in this
     * dataset. One "column" contains the full specifier text, while the other
     * contains the "char" that represents this full text specifier.
     * 
     * @return a 2D Array of strings with one column containing the single char
     *         representing the specifier, and the other column containing the
     *         full-length specifier.
     */
    public String[][] getBuildingSpecifiers() {
	return buildingSpecifiers;
    }

    /**
     * MadisonMapperReader constructor
     * 
     * @param filePath the filePath to the specified csv file
     * @throws IOException if an exception is thrown while splitting the csv file data
     * @throws DataFormatException if the data is formatted incorrectly
     */
    public MadisonMapperReader(String filePath) throws DataFormatException, IOException {
	this.readDataSet(filePath);
    }
    
    /**
     * MadisonMapperReader constructor
     * 
     * @param filePath the filePath to the specified csv file
     * @throws IOException if an exception is thrown while splitting the csv file data
     * @throws DataFormatException if the data is formatted incorrectly
     */
    public MadisonMapperReader(String[] filePath) throws DataFormatException, IOException {
	this.readDataSet(filePath[filePath.length-1]);
    }
}