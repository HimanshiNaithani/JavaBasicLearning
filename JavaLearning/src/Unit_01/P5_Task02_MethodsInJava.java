package Unit_01;

public class P5_Task02_MethodsInJava {

	public static void main(String[] args) {
		 ABC4 obj = new ABC4();
		 
		 //Calling display method definition
		 obj.display();
		 System.out.println(obj.a);

	}

}
class ABC4 {
	
	static int a = 10;
	
	/* Actual method definiton
	 DataType methodName(DataType2 p1, DataType2 p2)
	 {
	   methodBody;
	   
	   return value; //oif requierd  
	  }
	 */
	static void display()
	{
		int b = 10;
		int a = 20;
		System.out.println(b);
		System.out.println(a);
		
	}
	int display2() {
		
		System.out.println(a);
		//As a was a local variable so we can not access it outside the method
		
		return a;
		//System.out.println(b);
	}
}
