import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {

		int i = 0;
		int binary[] = new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		sc.close();
		while (number != 0) {
			binary[i] = number % 2;
			number = number / 2;
			i++;
		}
		System.out.print("Binary value is :");
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(" " + binary[j]);

		}

	}

}
