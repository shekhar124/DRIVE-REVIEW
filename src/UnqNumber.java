
public class UnqNumber {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 4, 5, 5, 6, 6, 7, 7, 10, 14 };
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {

				if (arr[j] == arr[i])
					count++;
			}
			if (count == 1) {
				System.out.println(arr[i]);
			}

		}

	}

}
