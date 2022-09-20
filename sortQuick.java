import java.util.*;

public class sortQuick {
	public static void qsort(int[] A, int lb, int ub) {
		if (lb >= ub) {
			return;
		}
		int pivot = A[ub];
		int i = lb, j = ub;
		while (i <= j) {
			while (A[i] < pivot) {
				i++;
			}
			while (A[j] > pivot) {
				j--;
			}
			if (i <= j) {
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
				i++;
				j--;
			}
		}
		qsort(A, lb, j);
		qsort(A, i, ub);
	}

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner in = new Scanner(System.in);
		System.out.print("enter size of array:");
		int c = in.nextInt();
		int arr[] = new int[c];
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			arr[i] = rand.nextInt(100);
		}
		System.out.println("arary before sort:");
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}
		qsort(arr, 0, arr.length - 1);
		System.out.println("\narary after sort:");
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}