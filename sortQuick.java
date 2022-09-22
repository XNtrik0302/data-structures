import java.util.*;

public class sortQuick {
	public static void qsort(int A[], int lb, int ub) {
        if (lb < ub) {
            int key = A[lb];
            int i = lb, j = ub + 1;
            while (i < j) {
                i++;
                j--;
                while (A[i] < key) {
                    i++;
                }
                while (A[j] > key) {
                    j--;
                }
                if (i < j) {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
            int temp = A[lb];
            A[lb] = A[j];
            A[j] = temp;
            qsort(A, lb, j - 1);
            qsort(A, j + 1, ub);
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
		qsort(arr, 0, len - 1);
		System.out.println("\narary after sort:");
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}