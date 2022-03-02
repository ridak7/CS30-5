
public class puck extends circle
{
	
	double AdMax = 5.5;
	double AdMin = 5;
	double YthMax = 4.5;
	double YthMin = 4;
	double weight;
	boolean standard, youth;
	
	public puck(double w)
	{
		
		weight = w;
		
		if(weight >= AdMin && weight <= AdMax);
		{
			standard = true;
			youth = false;
		}
		
		else(weight >= YthMin && weight <= YthMax);
		{
			standard = false;
			youth = true;
		}

	}
	
  public String getDivision()
  {
	  
	  String div;
	  if(standard)
	  {
		  div = "puck is standard";
	  }
	  
	  else
	  {
		  div = "puck is youth";
	  }
		
	  
	  return div;
  }
	
}
