import java.text.NumberFormat;

public class hockey 
{

		
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		puck pA = new puck(5.5);
		puck yt = new puck(4.5);
		
		//standard puck
		System.out.println(pA.getWeight());
		System.out.println(pA.getDivision());
		System.out.println(pA.getRadius());
		
		//youth puck
		System.out.println(yt.getWeight());
		System.out.println(yt.getDivision());
		System.out.println(yt.getRadius());
		
		
		String action;
		int w;
		double wArg;
		
	}
	
}
