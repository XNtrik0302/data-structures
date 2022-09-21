import java.util.*;

public class sortHeap {
    public static void Hsort(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && arr[l] > arr[largest])
            largest = l;
        if (r < n && arr[r] > arr[largest])
            largest = r;
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
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
        Hsort(arr);
        System.out.println("\narary after sort:");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}