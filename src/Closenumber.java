import java.util.Scanner;

/*#Rajashekhar
Take an integer number as an input. Also take a target as an input. Check if number is perfectly divisible by target. If yes return True else return closest perfectly divisible number.

Example 1 :
Number => 42
Target => 5
Output => 40

Example 2 :
Number => 50
Target => 2
Output => True

******************************************/
public class Closenumber {
	static int closestnumber(int n, int m) {

		int q = n / m;
		int n1 = q * m;
		int n2 = (m * n > 0) ? (m * (q + 1)) : (m * (q - 1));
		if (Math.abs(n - n1) < Math.abs(n - n2))
			return n1;
		return n2;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		System.out.println("enter target number");
		int m = sc.nextInt();
		System.out.println(closestnumber(n, m));
		sc.close();
	}

}
