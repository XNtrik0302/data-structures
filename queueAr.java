import java.util.*;

class Queue {
    int front, rear, capacity;
    int queue[];

    Queue(int c) {
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];
    }

    void enqueue(int data) {

        if (capacity == rear) {
            System.out.print("\nQueue is full\n");
            return;
        } else {
            queue[rear] = data;
            rear++;
        }
        return;
    }

    void dequeue() {
        if (front == rear) {
            System.out.print("\nQueue is empty\n");
            return;
        } else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
            rear--;
        }
        return;
    }

    void display() {
        int i;
        if (front == rear) {
            System.out.print("\nQueue is Empty\n");
            return;
        }
        for (i = front; i < rear; i++) {
            System.out.print(queue[i] + "  <-- ");
        }
        return;
    }
}

public class queueAr {
    public static void main(String[] args) {
        int p = 50;
        System.out.println("enter queue size:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Queue q = new Queue(n);
        while (p > 0) {
            System.out.println("\nSelect option\n1.Enqueue\n2.Dequeue\n3.Display\n4.Exit");
            int ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("enter element to be inserted:");
                    int d = in.nextInt();
                    q.enqueue(d);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    p = 0;
                    break;
                default:
                    System.out.println("invalid option!!!!");
            }
        }
    }
}