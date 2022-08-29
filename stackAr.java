import java.util.*;

class stackAr {
    public static void main(String args[]) {
        int ar[] = new int[80], i, n, ch, p = 32;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        n = sc.nextInt();
        System.out.println("enter the elements");
        for (i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        while (p > 0) {
            System.out.println("1.push");

            System.out.println("2.pop");

            System.out.println("3.display");

            System.out.println("\nEnter your choice 1-3");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    if (n == 80) {
                        System.out.println("stack overflow");
                    } else {
                        int a;
                        System.out.println("enter the value you want to push");
                        a = sc.nextInt();
                        ar[n] = a;
                        n++;
                        break;
                    }
                case 2:
                    if (n == 1) {
                        System.out.println("stack underflow");
                    } else {
                        ar[n - 1] = 0;
                        System.out.println("item to be popped");
                        n--;
                    }
                    break;
                case 3:
                    System.out.println("Stack:\n");
                    for (i = 0; i < n; i++) {
                        if (i != n - 1) {
                            System.out.println("["+ar[i]+"]");
                            System.out.println(" |\n V");
                        } else {
                            System.out.println("["+ar[i]+"]\n");
                        }
                    }
                    break;
                default:
                    System.out.println("invalid!!");
            }
        }

    }
}