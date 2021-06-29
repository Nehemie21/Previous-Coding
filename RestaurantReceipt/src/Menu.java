
public class Menu implements MenuInterface {

	public String item;
	public double calories;
	public double fat;
	public double carb;
	public double fiber;
	public double protein;
	public String type;
	
	public void setItem(String s)
	{
		item = s;
	}
	
	public void setCalories(double s)
	{
		calories = s;
	}
	
	public void setFat(double s)
	{
		fat = s;
	}
	
	public void setCarb(double s)
	{
		carb = s;
	}
	
	public void setFiber(double s)
	{
		fiber = s;
	}
	
	public void setProtein(double s)
	{
		protein = s;
	}
	
	public void setType(String s)
	{
		type = s;
	}
	
	@Override
	public String getItem() {
		// TODO Auto-generated method stub
		return item;
	}

	@Override
	public double getCalories() {
		// TODO Auto-generated method stub
		return calories;
	}

	@Override
	public double getFat() {
		// TODO Auto-generated method stub
		return fat;
	}

	@Override
	public double getCarb() {
		// TODO Auto-generated method stub
		return carb;
	}

	@Override
	public double getFiber() {
		// TODO Auto-generated method stub
		return fiber;
	}

	@Override
	public double getProtein() {
		// TODO Auto-generated method stub
		return protein;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}

}
