
public class circle 
{

	    private static double PI = 3.14;
	    private double radius;
	    
	    public circle()
	    {

	        radius = 1;//radius equals 1
	        
	    }

	    public circle( double r)
	    {

	        radius = r;// radius equals r
	        
	    }
	    
	    public void setRadius(double newRadius)
	    {
	        radius = newRadius;// get new radius
	    }
	    
	    public double area()
	    {
	        double circleArea;
	        
	        circleArea = PI * radius * radius;// PI times radius times radius
	        return(circleArea);
	    }
	    
	    public double getRadius()
	    {
	        return(radius);
	    }
	    
	    public double circumference()
	    {
	        double circleCircumference;
	        
	        circleCircumference = 2 * PI * radius;// two times PI times radius
	        return(circleCircumference);
	    }
	    
	    public static void displayAreaFormula()
	    {
	        System.out.println("The formula for the area of a circle is a=Pi*r*r");
	    }
	    
	    public boolean equals(Object c)
	    {
	        circle testObj = (circle)c;
	        
	          if (testObj.getRadius() == radius)
	          {
	              return(true);
	          }
	          else
	          {
	              return (false);
	          }
	          
	    }
	    
	    public String toString()
	    {
	        String circleString;
	        
	        circleString = "Circle has radius " + radius;
	        return(circleString);
	    }
	    

	    
	   
	
}
