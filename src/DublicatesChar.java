import java.util.Scanner;

public class DublicatesChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter");
		String str = sc.next();
		int len = str.length();
		char[] ch = str.toCharArray();
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (ch[i] == ch[j]) {
					System.out.println(ch[j]);

				}
			}
		}
	}

}
