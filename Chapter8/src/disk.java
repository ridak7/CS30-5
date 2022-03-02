
public class disk extends circle
{

	private double thickness;
	
    public disk(double r, double t)
    {
    	super(r);
    	thickness = t;
    }
	
    public void setThickness (double newThickness)
    {
    	thickness = newThickness;
    }
    
    public double getThickness()
    {
    	
    	return(thickness);
    	
    }
    
    public double volume()
    {
    	
    	double v;
    	
    	v = super.area();
    			return(v);
    	
    }
    
    public boolean equals(Object d)
    {
    	
    	disk testObj = (disk)d;
    	
    	if(testObj.getRadius() == super.getRadius() && testObj.getThickness() == thickness)
    		
    	{
    		
    		return(true);
    		
    	}
    	
    	else 
    	{
    	
    		return(false);
    		
    	}
    }
    
    public String toString()
    {
    	
    	String diskString;
    	
    	diskString = "the disk has radius " + super.getRadius() + " and thickness " + thickness + ".";
    	
    	return(diskString);
    	
    }
    
}
