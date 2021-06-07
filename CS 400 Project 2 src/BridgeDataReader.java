import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.Scanner;

public class BridgeDataReader implements BridgeDataReaderInterface {

  public List<Bridge> bridgeList;
  public String railroad;
  public String region;
  public String prefix;
  public String formatHelp;
    public String path;
    
  public BridgeDataReader(String x) throws FileNotFoundException, IOException {
    
    this.bridgeList = new ArrayList<Bridge>();
    path = x;
    
    BufferedReader rdr = new BufferedReader(new FileReader(path));
    rdr.readLine();
    String data = rdr.readLine();
    String[] elements = data.split(",");
    this.railroad = elements[0];
    this.region = elements[1];
    this.prefix = elements[2];
    this.formatHelp = elements[4];
    rdr.close();
    
    
  }
  
  /*
   * "C:" + File.separator + "Users" + File.separator
    + "Nehemie" + File.separator 
    + "eclipse-UWMadison" + File.separator + "CS 400 Project 2" 
    + "src" + File.separator + "CNWBridges.csv";
   */
  //C:\Users\Nehemie\eclipse-UWMadison\CS 400 Project 2\src
  public List<Bridge> getBridges() throws FileNotFoundException, IOException {
      String path = "C:\\Users\\Nehemie\\eclipse-UWMadison\\CS 400 Project 2\\src\\CNWBridges.csv";
      
    ArrayList<String> readData = new ArrayList<String>();
    BufferedReader rdr = new BufferedReader(new FileReader(path));
    rdr.readLine();rdr.readLine();rdr.readLine();
    System.out.println(rdr.readLine());
    String bridge = "";
    while ((bridge = rdr.readLine()) != null) {
       readData.add(bridge);
       System.out.println(bridge);
    }
    
    for (int i = 0; i < readData.size(); ++i) {
      Bridge NB = new Bridge();
      BufferedReader reader = new BufferedReader(new StringReader(readData.get(i)));
      String data = reader.readLine();
      String[] elements = data.split(",");
      NB.setName(elements[0]);
      NB.setLat(elements[1]);
      NB.setLon(elements[2]);
      if ((NB.setVersion(elements[19]) != null)) {
        bridgeList.add(NB.setVersion(elements[19]));
      }
      NB.setNumVersions(elements[19]);//calls the same, 1 or 0 new versions
      NB.setSpecificType(elements[4]);
      NB.setLength(elements[5]);
      NB.setHeight(elements[6]);
      NB.setStartDate(elements[18]);
      NB.setEndDate(elements[20]);
      NB.setFate(elements[19]);
      NB.setSpans(elements[8]);
      NB.setLAType(elements[10]);
      NB.setLASpans(elements[13]);
      NB.setLALength(elements[11]);
      NB.setLAHeight(elements[12]);
      NB.setHAType(elements[14]);
      NB.setHASpans(elements[17]);
      NB.setHAHeight(elements[16]);
      NB.setHALength(elements[15]);
      if (elements[9].toCharArray().length != 0) {
         NB.setApproach(elements[9].toCharArray()[0]);
      }
      else {
        NB.setApproach(null);
      }
      if (elements[3].toCharArray().length != 0) {
        NB.setType(elements[3].toCharArray()[0]);
     }
     else {
       NB.setType(null);
     }
      bridgeList.add(NB);
    }
    rdr.close();
    return bridgeList;
  }

  @Override
  public String getRailroad() {
    return railroad;
  }

  @Override
  public String getRegion() {
    return region;
  }

  @Override
  public String getBridgePrefix() {
    return prefix;
  }

  @Override
  public String getFormatHelp() {
    return formatHelp;
  }
    public List<BridgeInterface> readDataSet(Scanner inputScanner) throws DataFormatException{


	return null;
    }
}
