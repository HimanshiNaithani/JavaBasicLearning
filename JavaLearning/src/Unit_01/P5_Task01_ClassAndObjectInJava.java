package Unit_01;

public class P5_Task01_ClassAndObjectInJava {

	public static void main(String[] args) {
		 
		ABC3 obj = new ABC3();
		obj.display2();
	
		ABC3.display();

	}

}
class ABC3 {
	
	int a = 20;
	static int b = 10;
	
	static void display() 
	{
		int b = 10;
		b++;   
		
		//System.out.println(a);
		System.out.println(b);
	}
	 
	void display2() {
		
		System.out.println(a);
		//As a was a local variable so we cannot access it outside the method
		//System.out.println(b);
	}
	
}
