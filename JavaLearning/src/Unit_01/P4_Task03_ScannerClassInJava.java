package Unit_01;

import java.util.Scanner;

/* When user takes input from the console !
   
   nextLine()     Read user input [ to read string]
   next()         Read next token from the input enetered by the user
   
   nextBoolean()  Reads a boolean value from the user
   nextByte()     Read a byte value from the user
   nextDouble()   Reads a double value from the user
   nextFloat()    Reads a float value from the user
   nextInt()      Reads a int value from the user
   nextLine()     Reads a String value from the user
   nextLong()     Reads a long value from the user
   nextShort()    Reads a short value from the user
   
 */

public class P4_Task03_ScannerClassInJava {

	public static void main(String[] args) {
		 
		Scanner myobj1 = new Scanner(System.in);   // Create a scanner object
		Scanner myobj2 = new Scanner(System.in);
		
		//Read the First-token: (_space bar)
		String firstName = myobj1.next();
		System.out.println("Name is :" + firstName +"\n");
		
		String name = myobj2.nextLine();   //(\n)
		String name2 = myobj2.nextLine();  //(\n)
		
		System.out.println("Name is:" + name + "\n");
		System.out.println("Name is:" + name2 + "\n");	
		
		boolean b = myobj2.nextBoolean();
		System.out.println(b + "\n");
		
		myobj1.close();
		myobj2.close();
	}

}
