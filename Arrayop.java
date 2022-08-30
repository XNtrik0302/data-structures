import java.util.*;

class Arrayop {
	public static void main(String args[]) {
		int ar[] = new int[80], i, n, ch, p = 32;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		n = sc.nextInt();
		System.out.println("Enter the elements: ");
		for (i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		while (p > 0) {
			System.out.println("1.Insert last");
			System.out.println("2.Insert position");
			System.out.println("3.Deletion");
			System.out.println("4.Deletion at position");
			System.out.println("5.Merge");
			System.out.println("6.Display");
			System.out.println("7.Exit");
			System.out.println("Enter your choice 1-7");
			ch = sc.nextInt();
			switch (ch) {
				case 1:
					int a;
					System.out.println("Enter the value you want to insert at last");
					a = sc.nextInt();
					ar[n] = a;
					n++;
					break;
				case 2:
					System.out.println("Enter the value you want to insert");
					a = sc.nextInt();
					System.out.println("Enter position");
					int pos1 = sc.nextInt();
					for (i = n; i >= (pos1 - 1); i--) {
						ar[i + 1] = ar[i];
					}
					ar[pos1 - 1] = a;
					n++;
					break;
				case 3:
					ar[n - 1] = 0;
					System.out.println("Deleted");
					n--;
					break;
				case 4:
					System.out.println("Enter position to delete");
					int pos2 = sc.nextInt(); {
					ar[i] = ar[i + 1];
				}
					n--;
					break;
				case 5:
					int k = 0;
					int arr1[] = new int[30];
					int arr2[] = new int[30];
					int m[] = new int[60];
					System.out.println("Enter array1 length");
					int len1 = sc.nextInt();
					System.out.println("Enter array2 length");
					int len2 = sc.nextInt();
					System.out.println("Enter the elements of array 1:");
					for (i = 0; i < len1; i++) {
						arr1[i] = sc.nextInt();
					}
					System.out.println("Enter the elements of array 2:");
					for (i = 0; i < len2; i++) {
						arr2[i] = sc.nextInt();
					}
					for (i = 0; i < len1; i++, k++) {
						m[k] = arr1[i];
					}
					for (i = 0; i <= (len1 + len2); i++, k++) {
						m[k] = arr2[i];
					}
					System.out.println("Merged array");
					for (i = 0; i <= (len1 + len2); i++) {
						System.out.println(+m[i]);
					}
					break;
				case 6:
					System.out.println("Display");
					for (i = 0; i < n; i++) {
						System.out.println(+ar[i]);
					}
					break;
				case 7:
					p = 0;
					break;
				default:
					System.out.println("Invalid");
			}
		}
	}
}