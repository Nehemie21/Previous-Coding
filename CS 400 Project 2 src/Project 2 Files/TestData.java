import java.io.IOException;

public class TestData {

  public static void main(String[] args) {
    try {
      BridgeDataReader test = new BridgeDataReader(null);
      test.getBridges();
    } catch (IOException e) {
      e.printStackTrace();
    }
    

  }

}
