import java.util.*;

public class sortMergell {
    static class node {
        int data;
        node next;

        node() {
        }

        node(int key) {
            this.data = key;
            next = null;
        }
    }

    static node divide(node head) {
        if (head.next == null)
            return head;
        node mid = getmid(head);
        node h2 = mid.next;
        mid.next = null;
        node newh1 = divide(head);
        node newh2 = divide(h2);
        node finalhead = conquer(newh1, newh2);
        return finalhead;
    }

    static node conquer(node h1, node h2) {
        node merged = new node();
        node temp = merged;
        while (h1 != null && h2 != null) {
            if (h1.data < h2.data) {
                temp.next = h1;
                h1 = h1.next;
            } else {
                temp.next = h2;
                h2 = h2.next;
            }
            temp = temp.next;
        }
        while (h1 != null) {
            temp.next = h1;
            h1 = h1.next;
            temp = temp.next;
        }
        while (h2 != null) {
            temp.next = h2;
            h2 = h2.next;
            temp = temp.next;
        }
        return merged.next;
    }

    static node getmid(node head) {
        node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static void display(node head) {
        if (head == null) {
            System.out.print("__Empty list__");
            return;
        }
        node ptr = head;
        System.out.print("List data: ");
        while (ptr != null) {
            if (ptr.next != null)
                System.out.print(ptr.data + "->");
            else
                System.out.print(ptr.data);
            ptr = ptr.next;
        }
    }

    static node insert(int d, node head) {
        node newnode = new node(d);
        newnode.next = head;
        head = newnode;
        return head;
    }

    public static void main(String args[]) {
        int opt, val;
        node head = null;
        Scanner inp = new Scanner(System.in);
        do {
            System.out.print("\n\n1.Insert at Beginning\n2.sort\n3.Display\n4.Exit");
            System.out.print("\nenter option: ");
            opt = inp.nextInt();
            switch (opt) {
                case 1:
                    System.out.print("Enter node value: ");
                    val = inp.nextInt();
                    head = insert(val, head);
                    break;
                case 2:
                    head = divide(head);
                    System.out.println("sorted");
                    break;
                case 3:
                    display(head);
                    break;
                case 4:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("invalid option!!!!");
            }
        } while (opt != 4);
    }
}