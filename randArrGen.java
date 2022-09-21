import java.util.*;

public class randArrGen {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("enter size of array:");
        int c = in.nextInt();
        int arr[] = new int[c];
        int len = arr.length;
        long startTime = System.nanoTime();
        for (int i = 0; i < len; i++) {
            arr[i] = rand.nextInt(1000);
        }
        long endTime = System.nanoTime();
        System.out.println("Took " + (endTime - startTime) + " ns");
        System.out.print("{");
        for (int i = 0; i < len; i++) {
            if (i < len - 1)
                System.out.print(arr[i] + ",");
            else
                System.out.print(arr[i] + "}");
        }
    }
}