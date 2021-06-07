import java.util.List;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public interface BridgeDataReaderInterface {
  /**
   * Generates a list of BridgeInterfaces from the input dataset
   * 
   * @param inputScanner a Scanner object containing the dataset
   * @return a list of BridgeInterfaces containing all of the information from the dataset
   * @throws DataFormatException if the data set is incorrectly formatted or contains no bridges
   */
  public List<BridgeInterface> readDataSet(Scanner inputScanner) throws DataFormatException;

  /**
   * An accessor for the dataset's railroad
   * 
   * @return a String representation of the name of the railroad
   */
  public String getRailroad();

  /**
   * An accessor for the dataset's region
   * 
   * @return a String representation of the region of the dataset
   */
  public String getRegion();

  /**
   * Gives the standardized bridge number prefix for the current dataset
   * 
   * @return a String representation of the dataset's bridge prefix
   */
  public String getBridgePrefix();

  /**
   * Gives information provided by the data table about bridge naming schemes
   * 
   * @return a String representation of a brief explanation of how bridges are named/numbered for
   *         search purposes
   */
  public String getFormatHelp();
}
