import java.util.Random;
import java.util.Scanner;

public class sortMerge {
	public static void divide(int arr[], int lb, int ub) {
		if(lb>=ub){
			return;
		}
		int mid = lb + (ub - lb) / 2;
		divide(arr, lb, mid);
		divide(arr, mid + 1, ub);
		conquer(arr,lb,ub,mid);
	}

	public static void conquer(int arr[], int lb, int ub, int mid) {

		int merged[] = new int[ub - lb + 1];
		int idx1 = lb;
		int idx2 = mid + 1;
		int x = 0;

		while (idx1 <= mid && idx2 <= ub) {
			if (arr[idx1] <= arr[idx2]) {
				merged[x++] = arr[idx1++];
			} else {
				merged[x++] = arr[idx2++];
			}
		}
		while (idx1 <= mid) {
			merged[x++] = arr[idx1++];
		}
		while (idx2 <= ub) {
			merged[x++] = arr[idx2++];
		}
		for (int i = 0, j = lb; i < merged.length; i++, j++) {
			arr[j] = merged[i];
		}

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
		divide(arr, 0, len - 1);
		System.out.println("\narray after sort:");
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}