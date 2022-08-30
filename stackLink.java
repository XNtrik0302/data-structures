import java.util.Scanner;

public class stackLink {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
        }
    }

    public void push(int dt) {
        Node newNode = new Node(dt);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void pop() {
        if (head == null) {
            System.out.println("stack is empty");
            return;
        }
        System.out.println("popped element is" + head.data);
        head = head.next;

    }

    public void peek() {
        if (head == null) {
            System.out.println("stack is empty");
            return;
        }
        System.out.println(head.data);
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        stackLink sl = new stackLink();
        Scanner in = new Scanner(System.in);
        int ch = 0, p = 100;
        while (p > 0) {
            System.out.println("____MENU____\n1.push\n2.pop\n3.peek\n4.display\n5.exit\n______________");
            System.out.print("\nEnter the choice:");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("\nenter data to be pushed into stack:");
                    int d = in.nextInt();
                    sl.push(d);
                    break;
                case 2:
                    sl.pop();
                    break;
                case 3:
                    sl.peek();
                    break;
                case 4:
                    sl.display();
                    break;
                case 5:
                    p = 0;
                    break;
                default:
                    System.out.println("invalid");
            }
        }
    }
}
