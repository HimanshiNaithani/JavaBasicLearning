package Unit_01;
/*
 -It is called when an instance of the class is created
 -At the time of calling the constructor , memory for the object is allocated in the memory
 -It is a special type of method which is used to initialize the object
 -Every time an object is created using the new() keyword,at least one constructor is called 
 -Two types of Constructors in Java
  #Parameterized Constructor
  #Default Constructor
 */

public class P5_Task03_ConstructorsInJava {

	public static void main(String[] args) {
		
		ABC5 obj = new ABC5();
		ABC5 obj1 = new ABC5(1);
		
		System.out.println(obj.a);
		System.out.println(obj1.a);
	}

}
class ABC5 {
	
	int a;
	
	/*  className(Constructor Parameters) {
	    All the class and Instance variables can be initialized here!
	  }
	 */
	ABC5() {
		a = 30;
	}
	ABC5(int a) {
		this.a = a;
	}
	
	void display() {
		
		int b = 15;
     	System.out.println(a);
     	System.out.println(b);
		
	}
	int display2() {
		
		System.out.println(a);
		//As a was a local variable so we can not access it outside the method
		
		return a;
		//System.out.println(b);

	}
	
}
