package Uemployee;

public class Staff extends Uemployee
{

	private String title;
	
	public Staff(String fn, String ln, double sal, String jobTitle)
	{
		
		super(fn, ln, sal);
		title = jobTitle;
		
	}
	
	public String getTitle()
	{
		return title;
	}
	
}
