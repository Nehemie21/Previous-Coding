import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
//import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.zip.DataFormatException;


public class MovieDataReader implements MovieDataReaderInterface{

    /**
     * Method that readers movie data in CSV format from the Redaer provided. The dummy implementations
     * will always return the same 3 sets of movies.
     */
	
	@Override
	public List<MovieInterface> readDataSet(Reader inputFileReader)
			throws FileNotFoundException, IOException, DataFormatException{
	
		String pathWay = "C:\\Users\\Nehemie\\Downloads\\movies.csv";
		
		String sen = "";
	
		ArrayList<Movie> buffData = new ArrayList<Movie>();

		BufferedReader var = new BufferedReader(new FileReader(pathWay));
		String anotherString = "";
		sen.equalsIgnoreCase(anotherString);
		int n = 0;
		
		var.readLine();
		while((sen = var.readLine()) != null)
		{
			String[] val = sen.split(",(?=([^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*$)");
			buffData.add(new Movie());
			
			
			if(!val[0].isEmpty())
			{
				buffData.get(n).setTitle(val[0]);

			}
			else
				buffData.get(n).setTitle("");

			if(!val[1].isEmpty())
			{
				buffData.get(n).setOriginal_title(val[1]);

			}
			else
				buffData.get(n).setOriginal_title("");
			

			if(!val[2].isEmpty())
			{
				buffData.get(n).setYear(Integer.parseInt(val[2]));

			}
			else
				buffData.get(n).setYear(0);
			
			if(!val[3].isEmpty())
			{
				List<String> list = new ArrayList<String>();
				list.add(val[3]);
				buffData.get(n).setGenre(list);

			}
			else
				buffData.get(n).setGenre(null);
			
			if(!val[4].isEmpty())
			{
				buffData.get(n).setDuration(Integer.parseInt(val[4]));

			}
			else
				buffData.get(n).setDuration(0);
			
			if(!val[5].isEmpty())
			{
				buffData.get(n).setCountry(val[5]);

			}
			else
				buffData.get(n).setCountry("");

			if(!val[6].isEmpty())
			{
				buffData.get(n).setLanguage(val[6]);

			}
			else
				buffData.get(n).setLanguage("");
			
			
			if(!val[7].isEmpty())
			{
				buffData.get(n).setDirector(val[7]);

			}
			else
				buffData.get(n).setDirector("");
			
			
			if(!val[8].isEmpty())
			{
				buffData.get(n).setWriter(val[8]);

			}
			else
				buffData.get(n).setWriter(val[8]);
			
			if(!val[9].isEmpty())
			{
				buffData.get(n).setProduction(val[9]);

			}
			else
				buffData.get(n).setProduction("");
			
			if(!val[10].isEmpty())
			{
				buffData.get(n).setActors(val[10]);

			}
			else
				buffData.get(n).setActors("");
			
			if(!val[11].isEmpty())
			{
				buffData.get(n).setDescription(val[11]);

			}
			else
				buffData.get(n).setDescription("");
			
			if(!val[12].isEmpty())
			{
				buffData.get(n).setAvgVote(Float.parseFloat(val[12]));

			}
			else
				buffData.get(n).setAvgVote(0);
			
			//System.out.println(val[2]);
			
			System.out.print(buffData.get(n).getTitle());
			System.out.print(" ");

			System.out.print(buffData.get(n).getOriginal_title());
			System.out.print(" ");

			System.out.print(buffData.get(n).getYear());
			System.out.print(" ");

			System.out.print(buffData.get(n).getGenres());
			System.out.print(" ");

			System.out.print(buffData.get(n).getDuration());
			System.out.print(" ");

			System.out.print(buffData.get(n).getCountry());
			System.out.print(" ");

			System.out.print(buffData.get(n).getLanguage());
			System.out.print(" ");

			System.out.print(buffData.get(n).getDirector());
			System.out.print(" ");

			System.out.print(buffData.get(n).getWriter());
			System.out.print(" ");

			System.out.print(buffData.get(n).getDescription());
			System.out.print(" ");

			System.out.print(buffData.get(n).getAvgVote());

			System.out.println();
			
			n++;
		
			
		}
		
		//BufferedReader goThru = inputFileReader;
		//data.get(0).readDataSet(inputFileReader);
		
	
		//System.out.println(data.get(data.size() -1).getTitle());
//		
		List<MovieInterface> finalData = new ArrayList<MovieInterface>();
		finalData.addAll(buffData);

		return finalData;
		
	}

//	@Override
//	public List<MovieInterface> readDataSet(Reader inputFileReader)
//			throws FileNotFoundException, IOException, DataFormatException {
//		// TODO Auto-generated method stub
//		return null;
//	}

	
//	public List<MovieInterface> readDataSet(Reader inputFileReader)
//			throws FileNotFoundException, IOException, DataFormatException {
//		// TODO Auto-generated method stub
//		//List<MovieInterface> results = new ArrayList<MovieInterface>();
//		//inputFileReader = (Reader) getSeperated();
//		//results.add(getSeperated());
//		
//		return null;
//	}
//	
	
   }
   


