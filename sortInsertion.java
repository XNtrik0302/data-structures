import java.util.Scanner;

public class sortInsertion {
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int j = i - 1;
            while ((j >= 0) && (arr[j] > curr)) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = curr;
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
        System.out.println("Before insertion sort:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        insertionSort(arr);
        System.out.println("After insertion sort");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}