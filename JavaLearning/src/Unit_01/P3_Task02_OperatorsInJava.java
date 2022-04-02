package Unit_01;
/* 
Operators :- Operators in java are use to modify or to manipulate value stored in variable. Used to perform operations.
           - Types of operators
             #Unary Operator
             #Arithmetic Operator
             #Shift Operator
             #Relational Operator
             #Bitwise Operator
             #Logical Operator
             #Ternary Operator
             #Assignment Operator
 */

public class P3_Task02_OperatorsInJava {

	public static void main(String[] args) {
		
		// Unary Operator
		int x=10;
		System.out.println(x++); //10 11
		System.out.println(++x); // 12
		System.out.println(x--); // 12 11
		System.out.println(--x); // 10
		
		//Arithmetic Operator
		int a= 22;
		int b= 33;
		System.out.println(a + b); //55
		System.out.println(a - b); //-11
		System.out.println(a * b); //726
		System.out.println(a / b); //0
		System.out.println(a % b); //11
		
		//Shift Operator
		int c=10;
		int d=20;
		System.out.println(c<<d); //100
		System.out.println(c>>d); //0
		System.out.println(c>>>d); //0
		
		//Relational Operator
		int e= 10;
		int f= 20;
		System.out.println(e==f); //false
		System.out.println(e!=f); //true
		System.out.println(e>f); //false
		System.out.println(e<f); //true
		System.out.println(e>=f); //false
		System.out.println(e<=f); //true
		
		//Bitwise Operator
		int g= 10;
		int h= 20;
		System.out.println(g & h); //0
		System.out.println(g | h); //30
		System.out.println(g ^ h); //30
		System.out.println(-g); //-11
		System.out.println(g << 2); //40
		System.out.println(g >> 2); //2
		
		//Logical Operator
		boolean i= true;
		boolean j=false;
		System.out.println(i && j); //false
		System.out.println(i || j); //true
		System.out.println(!i); //false
		
		//Ternary Operator
		int k=10;
		int l=20;
		int m=k > 1 ? k :1;
		System.out.println(m); //20
		
		//Assignment Operator
		int n=10;
		int o=20;
		n+=o;
		System.out.println(n); //30
		n-=o;
		System.out.println (n); //10		 
	}

}
