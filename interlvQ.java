import java.util.*;

public class interlvQ {
    static int qsize;
    static node front, rear, head;

    interlvQ() {
        front = rear = null;
        head = null;
        qsize = 0;
    }

    static class node {
        int data;
        node next;

        node(int d) {
            this.data = d;
        }
    }

    static node enqueue(int d) {
        node newNode = new node(d);
        if (front == null) {
            rear = newNode;
            front = rear;
            qsize++;
            return front;
        }
        rear.next = newNode;
        rear = newNode;
        qsize++;
        return front;
    }

    static int dequeue() {
        int x = front.data;
        front = front.next;
        return x;
    }

    static void push(int d) {
        node newnode = new node(d);
        newnode.next = head;
        head = newnode;
    }

    static int pop() {
        int x = head.data;
        head = head.next;
        return x;
    }

    static void display() {
        if (front == null) {
            System.out.println("queue empty!!");
            return;
        }
        node temp = front;
        while (temp != null) {
            System.out.print(temp.data + "<--");
            temp = temp.next;
        }
    }

    static void interleave() {
        if (qsize % 2 != 0) {
            System.out.println("only even queue can be interleaved!!");
            return;
        }
        int mid = qsize / 2;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < mid; j++) {
                if (front != null || head != null) {
                    push(dequeue());
                }
            }
            if (i < 3) {
                for (int k = 0; k < mid; k++) {
                    if (front != null || head != null) {
                        enqueue(pop());
                    }
                }
            }
        }
        for (int i = 0; i < mid; i++) {
            enqueue(dequeue());
            enqueue(pop());
        }

    }

    public static void main(String args[]) {

        int opt, val;
        Scanner inp = new Scanner(System.in);
        do {
            System.out.print("\n\n1.enqueue\n2.interleave\n3.Display\n4.Exit");
            System.out.print("\nenter option: ");
            opt = inp.nextInt();
            switch (opt) {
                case 1:
                    System.out.print("Enter node value: ");
                    val = inp.nextInt();
                    enqueue(val);
                    break;
                case 2:
                    interleave();
                    break;
                case 3:
                    display();
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
