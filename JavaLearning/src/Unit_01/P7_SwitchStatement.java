package Unit_01;

import java.util.Scanner;

/* Problem Statement: P7_SwitchStatements: 
   Create a switch statement [Manual], In Which:
	 a. When you pass 1 your program would print current year
	 b. When you pass 2 your program would print current month
	 c. When you pass 3 your program would print current day
	 d. When you pass 4 your program would print Not applicable 
 * */

public class P7_SwitchStatement {

	public static void main(String[] args) {
		
		SwitchStatements obj = new SwitchStatements();
		obj.switchStatements();

	}

}

class SwitchStatements {
	void switchStatements() {
		
		// Write Logic here!
		int choice;
		System.out.println("Enter the choice : ");
		Scanner s = new Scanner(System.in);   // Create a scanner object
		choice = s.nextInt();
		switch(choice)
		{
		case 1: System.out.println("Current year is 2022:");
		        break;
		case 2: System.out.println("Current month is : 4 April");
		        break;
		case 3: System.out.println("Current day is :Thursday");
		        break;
		default: System.out.println("Not applicable....");
		         break;
		}
		
	}
}