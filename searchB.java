import java.util.Scanner;

class searchB {
	void binarySearch(int arr[], int lb, int ub, int key) {
		int mid = lb + (ub - lb) / 2;
		while (lb <= ub) {
			if (arr[mid] < key) {
				lb = mid + 1;
			} else if (arr[mid] == key) {
				mid = mid + 1;
				System.out.println("Element is found at position: " + mid);
				break;
			} else {
				ub = mid - 1;
			}
			mid = (lb + ub) / 2;
		}
		if (lb > ub) {
			System.out.println("Element not found! ");
		}
	}

	void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
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

	public static void main(String args[]) {
		searchB sb = new searchB();
		Scanner in = new Scanner(System.in);
		int c, n, key, arr[];
		System.out.print("Enter the number of elements:");
		n = in.nextInt();
		arr = new int[n];
		System.out.println("Enter those " + n + " Elements");
		for (c = 0; c < n; c++) {
			arr[c] = in.nextInt();
		}
		sb.bubbleSort(arr);
		System.out.println("Enter the value to find:");
		key = in.nextInt();
		int ub = arr.length - 1;
		sb.binarySearch(arr, 0, ub, key);
	}
}