import java.util.Scanner;

public class sortBubble {
	static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (n - i - 1); j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int c, n, arr[];
		System.out.println("Enter the number of elements:");
		n = in.nextInt();
		arr = new int[n];
		System.out.println("Enter those " + n + " elements:");
		for (c = 0; c < n; c++) {
			arr[c] = in.nextInt();
		}
		System.out.println("Array before bubble sort:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		bubbleSort(arr); 
		System.out.println("Array after bubble sort:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}