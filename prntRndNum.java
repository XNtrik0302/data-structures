import java.util.Random;
import java.util.Scanner;

public class prntRndNum {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of random numbers needed:");
        int n = in.nextInt();
        System.out.print("\n{");
        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                System.out.print(rand.nextInt(1000) + ",");
            } else {
                System.out.print(rand.nextInt(1000));
            }
        }
        System.out.print("}");
        System.out.println();
    }
}
