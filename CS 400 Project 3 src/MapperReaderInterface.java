import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.zip.DataFormatException;

public interface MapperReaderInterface {
    /**
     * Generates a list of BuildingInterface's from the dataset that is passed in
     * 
     * @param filePath the filePath to the dataset
     * @return a list of all of the BuildingInterface Objects in this dataset.
     * @throws DataFormatException if the dataset is improperly formatted or contains no building data
     * @throws FileNotFoundException if the file is not found
     * @throws IOException if there is an I/O exception
     */
    public void readDataSet(String filePath) throws DataFormatException, FileNotFoundException, IOException;

    /**
     * Returns a list of all of the BuildingInterfaces found in this dataset.
     * 
     * @return a list of all of the BuildingInterface Objects in this dataset.
     */
    public ArrayList<BuildingInterface> getBuildings();

    /**
     * Returns the different specifiers that can be used for each building in this
     * dataset. One "column" contains the full specifier text, while the other
     * contains the "char" that represents this full text specifier.
     * 
     * @return a 2D Array of strings with one column containing the single char
     *         representing the specifier, and the other column containing the
     *         full-length specifier.
     */
    public String[][] getBuildingSpecifiers();
}