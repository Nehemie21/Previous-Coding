import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.zip.DataFormatException;

public interface MovieInterface extends Comparable<MovieInterface> {
	
	public String getTitle();
	public Integer getYear();
	public List<String> getGenres();
	public String getDirector();
	public String getDescription();
	public Float getAvgVote();
	//public List<MovieInterface> readDataSet(Reader inputFileReader) throws FileNotFoundException, IOException, DataFormatException;

	// from super interface Comparable
	public int compareTo(MovieInterface otherMovie);

}
