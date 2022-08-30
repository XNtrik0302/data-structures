import java.util.Random;
import java.util.Scanner;

public class quickSort {

    public static void qsort(int arr[], int lb, int ub) {
        if (lb < ub) {
            int pidx = partition(arr, lb, ub);
            qsort(arr, lb, pidx - 1);
            qsort(arr, pidx + 1, ub);
        }

    }

    public static int partition(int arr[], int lb, int ub) {
        int pivot = arr[ub];
        int i = lb - 1;
        for (int j = lb; j < ub; j++) {
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[ub]=temp;
        return i;
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