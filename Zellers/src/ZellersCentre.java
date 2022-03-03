import java.text.NumberFormat;
import java.util.Scanner;

public class ZellersCentre 
{


	
	public static void payEmployee(employee emp, double payArg)
	{
	   NumberFormat money = NumberFormat.getCurrencyInstance();
	   double pay;
	   
	   System.out.println(emp);
	   pay = emp.pay(payArg);
	   
	   System.out.println(money.format(pay));
	   
	}
	
	public static void main(String[] args) 
	{
	    Manager emp1 = new Manager("Steve", "Jobs", 69000);
		Associate emp2 = new Associate("Bill", "Gates", 14.20);
		
		Scanner input = new Scanner(System.in);
		
		String action;
		int empNum;
		double payArg;
		
		employee emp = emp1;
		
		do 
		{
		 System.out.println("\n employee \\ Pay \\ Quit");
		 System.out.println("Enter choice: ");
		 action = input.next();
		 
		 if(!action.equalsIgnoreCase("Q"))
		 {
			 System.out.println("Enter employee number(1, or 2): ");
			 empNum = input.nextInt();
			 
			 switch(empNum)
			 {
			 case 1: emp = emp1; break;
			 case 2: emp = emp2; break;
			 }
			 
			 if(action.equalsIgnoreCase("e")) 
			 {
			    System.out.println(emp);
		     } 
			 else if(!action.equalsIgnoreCase("P"))
			 {
				 System.out.println("Enter the hours for Accosiate OR pay period for Manager");
				 payArg = input.nextDouble();
				 
				 payEmployee(emp, payArg);
			 }
		 
		 }
		
	    }while(!action.equalsIgnoreCase("Q"));
	}
  }
