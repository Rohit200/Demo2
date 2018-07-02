package Bridgelabz2;
import Bridgelabz.Project.*;
public class VendingMachine 
{
public static void main(String[] args)
{
		System.out.println("Enter the Amount ");
		int Tamt=Utility.input();
		
		System.out.println("Change for your Amount\t\t\tRs"+Tamt+" is:");
		System.out.println("--------------------------------------------------");
	    Utility.vendingMachine(Tamt);
		
		
		System.out.println("--------------------------------------------------");
		System.out.println("Total notes:"+Utility.totalNotes+"\t\t\t  Amount="+Tamt);
		System.out.println("--------------------------------------------------");
		
	}
}

	

