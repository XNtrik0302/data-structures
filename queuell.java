import java.util.Scanner;

public class queuell {
    class Node {
        int data;
        Node next;

        Node(int dt) {
            this.data = dt;
        }
    }

    Node front;
    Node rear;

    queuell() {
        front = rear = null;
    }

    void enqueue(int d) {
        Node newNode = new Node(d);
        if (front == null) {
            rear = newNode;
            front = rear;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    void dequeue() {
        if (front == null) {
            System.out.println("queue empty!!");
            return;
        }
        front = front.next;
    }

    void display() {
        if (front == null) {
            System.out.println("queue empty!!");
            return;
        }
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + "<--");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        queuell lst = new queuell();
        Scanner in = new Scanner(System.in);
        int ch, p = 100;
        while (p > 0) {
            System.out.println("\n1.Enqueue\n2.Dequeue\n3.Display\n4.Exit");
            System.out.print("Enter your choice: ");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("\nEnter the data to be added:");
                    int d = in.nextInt();
                    lst.enqueue(d);
                    break;
                case 2:
                    lst.dequeue();
                    break;
                case 3:
                    lst.display();
                    break;
                case 4:
                    p = 0;
                    break;
                default:
                    System.out.println("invalid");
            }
        }
    }
}
