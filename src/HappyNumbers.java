/*#Rajashekhar
Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.
condition: check till 10 loops only 

Example 1:
Input: n = 19 => 
Output: true
Explanation:
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1

Example 2:
Input: n = 2
Output: false
1, 7, 10, 13, 19, 23, 28, 31, 32, 44, 49, 68, 70, 79, 82, 
86, 91, 94, 97, 100,  happy numbers all*/




import java.util.Scanner;

public class HappyNumbers {
	// method
	static int happyNumber(int num) {
		int r = 0, sum = 0;
//   r = remainder
		while (num > 0) {
			r = num % 10;
			sum = sum + (r * r);
			num = num / 10;
		}
		return sum;
	}

// main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int result = num;

		while (result !=1 && result != 4) {
			result = happyNumber(result);
		}

		if (result == 1)
			System.out.println(num + " is a happy number");

		else
			System.out.println(num + " is not a happy number");
		sc.close();
	}
}
