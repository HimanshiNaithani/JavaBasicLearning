package Unit_01;

/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */

public class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s1);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s) {
		// Write Logic Here!
		
		int n = s.length();
		String news = "";
		for (int i = n - 1; i >= 0; i--) {
			news = news + s.charAt(i);
		}
		if (s.equals(news)) {
			System.out.println("string is palindrome");
		}

	}

	

	void reverseOfAString(String s) {
		// Write Logic Here!
		
		int n = s.length();
		String newstr = "";
		for (int i = n - 1; i >= 0; i--) {
			newstr = newstr + s.charAt(i);

		}
		System.out.println(newstr);


	}
	
	void stringEqualOrNot(String s1,String s2) {
		// Write Logic Here!
		
		if (s1.length() == s2.length())

		{
			int c = 0;
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) == s2.charAt(i))
					c++;
			}
			if (c != (s1.length() ))
				System.out.println("not equal");
			else
				System.out.println("equal");
		} else
			System.out.println("not equal");

		
	}
}