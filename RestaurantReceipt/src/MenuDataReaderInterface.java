import java.util.List;
import java.util.zip.DataFormatException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;

public interface MenuDataReaderInterface {

	
	public List<MenuInterface> readDataSet(Reader inputFileReader)
			throws FileNotFoundException, IOException, DataFormatException;

}
