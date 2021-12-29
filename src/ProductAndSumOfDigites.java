/*#Rajashekhar
Given an integer number n, return the difference between the product of its digits and the sum of its digits.
Example 1:
Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15
_____________________________________________________________
Example 2:
Input: n = 4421
Output: 21
Explanation: 
Product of digits = 4 * 4 * 2 * 1 = 32 
Sum of digits = 4 + 4 + 2 + 1 = 11 
Result = 32 - 11 = 21
____________________________________________________________________________*/



import java.util.Scanner;

public class ProductAndSumOfDigites {

	static int productAndSum(int n) {
		int mult = 1;
		int add = 0;
		while (n > 0) {
			mult = mult * (n % 10);
			add = add + (n % 10);
			n = n / 10;
		}
		return (mult - add);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number =");
		int n = sc.nextInt();
		System.out.println(productAndSum(n));
		sc.close();

	}

}
