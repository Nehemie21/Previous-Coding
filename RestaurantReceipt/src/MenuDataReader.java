import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;

public class MenuDataReader implements MenuDataReaderInterface{

	public static void main(String[] args) throws FileNotFoundException, IOException, DataFormatException {
		
		MenuDataReader test = new MenuDataReader();
		//File fileMovies = new File("C:\\Users\\Nehemie\\Downloads\\movies.csv");
		
		Reader inputFileReader = new StringReader("C:\\Users\\Nehemie\\Downloads\\movies.csv");
		test.readDataSet(inputFileReader);
		

	}
	@Override
	public List<MenuInterface> readDataSet(Reader inputFileReader)
			throws FileNotFoundException, IOException, DataFormatException{
	
		String pathWay = "C:\\Users\\Nehemie\\Downloads\\starbucks.csv";
		
		String sen = "";
	
		ArrayList<Menu> buffData = new ArrayList<Menu>();

		BufferedReader var = new BufferedReader(new FileReader(pathWay));
		String anotherString = "";
		sen.equalsIgnoreCase(anotherString);
		int n = 0;
		
		var.readLine();
		
		while((sen = var.readLine()) != null)
		{
			String[] val = sen.split(",(?=([^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*$)");
			buffData.add(new Menu());
			
			if(!val[0].isEmpty())
			{
				buffData.get(n).setItem(val[0]);

			}
			else
				buffData.get(n).setItem("");

			if(!val[1].isEmpty())
			{
				buffData.get(n).setCalories(Double.parseDouble(val[1]));

			}
			else
				buffData.get(n).setCalories(0);
		
			if(!val[2].isEmpty())
			{
				buffData.get(n).setFat(Double.parseDouble(val[2]));

			}
			else
				buffData.get(n).setFat(0);
			
			if(!val[3].isEmpty())
			{
			
				buffData.get(n).setCarb(Double.parseDouble(val[3]));

			}
			else
				buffData.get(n).setCarb(0);
			
			if(!val[4].isEmpty())
			{
				buffData.get(n).setFiber(Double.parseDouble(val[4]));

			}
			else
				buffData.get(n).setFiber(0);
			
			if(!val[5].isEmpty())
			{
				buffData.get(n).setProtein(Double.parseDouble(val[5]));

			}
			else
				buffData.get(n).setProtein(0);

			if(!val[6].isEmpty())
			{
				buffData.get(n).setType(val[6]);

			}
			else
				buffData.get(n).setType("");
					
			System.out.print(buffData.get(n).getItem());
			System.out.print(" ");

			System.out.print(buffData.get(n).getCalories());
			System.out.print(" ");

			System.out.print(buffData.get(n).getFat());
			System.out.print(" ");

			System.out.print(buffData.get(n).getCarb());
			System.out.print(" ");

			System.out.print(buffData.get(n).getFiber());
			System.out.print(" ");

			System.out.print(buffData.get(n).getProtein());
			System.out.print(" ");

			System.out.print(buffData.get(n).getType());
			System.out.print(" ");
			
			System.out.println();

			n++;
	
		}
		
		var.close();
		
		List<MenuInterface> finalData = new ArrayList<MenuInterface>();
		finalData.addAll(buffData);

		return finalData;
		
	}

	
}
