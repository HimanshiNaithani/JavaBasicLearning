package Unit_01;
/*
 VARIABLES :- Variables in java is a data container that saves the data value during java program execution.
            - There are 3 types of variables in java
                #Local Variable - It is declared inside the body of a method.
                #Instance variable - They are defined without static keyword.
                                      - They are defined outside the method declaration.
                                      - They are object specific that's why known as instance variable.
                #Static Variable - Static variable defines with a static keyword.
                                 - These variables initialized only once, at the start of the program execution.
                                 - These static variables should be initialized first, just before the initialization of any
                                   instance variable.
                                    
 DATA TYPES :- Data type in java are defined as specifiers that allocate different size and type of values that can be stored in the 
               variable or identifiers.
             - Data types in java can be divided into 2 :-
               #Primitive - Are like integers;characters;boolean and float.
               #Non Primitive -Are like strings;arrays;class and interface.
 */
class Instance
{
	int c=12;      // Instance variable

}

public class P3_Task01_VariablesAndDataTypesInJava {
	   
	 static int a= 10;  // Static variable
	 int c=13;          //  Global variable
	     
	 public static void main(String[] args) {
		 
		 int b=11; // Local variable
		 Instance obj=new Instance();   //
		 
		 System.out.println("a=" +a);
		 System.out.println("b=" +b);
		 System.out.println("c=" +obj.c);
		 
 
// Type conversion
	double f;     //8bytes=64 slots/bits
	int i= 20;    //4bytes=32 slots/bits
	f=i;          //Type Conversion
	System.out.println("Value after type conversion : "+ f);
	
	// Type casting
	
	double g= 10.45;
	int h;
/*	h=g;   //type mismatch: cannot convert from double to int*/
	h=(int)g;      // Type casting  
	System.out.println("Value after type casting : "+ h);
 }
}
	

