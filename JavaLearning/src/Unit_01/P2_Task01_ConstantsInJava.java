package Unit_01;
/*
    CONSTANTS :- Piece of data /code that would never change.
               - Constants never change once a value is assigned .
               - constants and goto are 2 keywords  which are not supposed to use at present . They are there to be used in future.
               *-note used  (constant*,goto*) 
               **-1.2V      (strictfp**)
               ***-1.4V     (assert***)
               ****-5.0V    (enum****)
 */

public class P2_Task01_ConstantsInJava {

		 static final double pi = 3.14; // GLOBAL CONSTANT  

		 public static void main(String[] args) {
				
				final int r = 10;
				double area = pi*r*r;
				
				 System.out.println(area);
				 System.out.println(r);
				  
				 System.out.println(pi);

			}

}


	


