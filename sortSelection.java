import java.util.Scanner;

class sortSelection {
	static void sort(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int c, n, arr[];
		System.out.print("Enter array size:");
		n = in.nextInt();
		arr = new int[n];

		System.out.println("Enter those " + n + " elements");
		for (c = 0; c < n; c++)
			arr[c] = in.nextInt();

		System.out.println("Array before sort:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		sort(arr);
		System.out.println("\nSorted array:");
		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}