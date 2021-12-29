/*
 * #Pooja
Given a string s and an integer k, reverse the first k characters for first k characters counting from the start of the string.
If there are fewer than k characters left, reverse all of them. 

Example 1:
Input: s = "abcdefg", k = 2
Output: "bacdefg"

Example 2:
Input: s = "abcd", k = 2
Output: "bacd"*/


import java.util.Scanner;

public class PoojaDrive {
	

	// Function to return the string after
	// reversing the alternate k characters
	//method
	static String reverseCharacterNearK(String s, int k, int len) {
		for (int i = 0; i < s.length();) {

			// If there are less than k characters
			// starting from the current position
			if (i + k > len)
				break;

			// Reverse first k characters
			s = s.substring(0, i) + new String(new StringBuilder(s.substring(i, i + k)).reverse()) + s.substring(i + k);

			// Skip the k characters
			i += 2 * k;
		}
		return s;
		
	}

	//mainMethod . program starts from here!
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//scanner class
		System.out.println("Enter String to reverse characters");
		String s = sc.next();
		int len = s.length();
		System.out.println("enter the K value");
		int k = sc.nextInt();
		System.out.println(reverseCharacterNearK(s, k, len));
		sc.close();
	}
}



