package Algorithm;

import java.util.Scanner;

public class Midterm {

    static final int MAX = 10;

    static int[] queue = new int[MAX];
    static int front = 0;
    static int rear = -1;

    static int[] stack = new int[MAX];
    static int top = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ᡕᠵデᡁ᠊╾━ STACK DEMO ᡕᠵデᡁ᠊╾━");
        push(10);
        push(20);
        push(30);
        showStack();

        int popped = pop();
        System.out.println("Pooped item: " + popped);
        showStack();

        int topItem = peek();
        System.out.println("Top item: " + topItem);
        showStack();

        System.out.println("\nᡕᠵデᡁ᠊╾━ QUEUE DEMO ᡕᠵデᡁ᠊╾━");
        enqueue(1);
        enqueue(2);
        enqueue(3);
        showQueue();

        int removed = dequeue();
        System.out.println("Dequeued item: " + removed);
        showQueue();

        enqueue(4);
        enqueue(5);
        showQueue();

        System.out.println("\nSection: DIT 2-6");
        System.out.println("Programmer's Name: Toledo Ivan P.");

        sc.close();
    }


    static void push(int item) {
        if (top == MAX - 1) {
            System.out.println("Stack overflow (cannot push " + item + ")");
        } else {
            top = top + 1;
            stack[top] = item;
            System.out.println("Push: " + item);
        }
    }



    static void showStack() {
        System.out.print("Stack (bottom -> top): ");
        if (top == -1) {
            System.out.println("Empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    static int pop() {
        if (top == -1) {
            System.out.println("Stack underflow (cannot pop)");
            return -1;
        } else {
            int item = stack[top];
            top = top - 1;
            return item;
        }
    }


    static int peek() {
        if (top == -1) {
            System.out.println("Stack is empty (no top element)");
            return -1;
        } else {
            return stack[top];
        }
    }

    static void enqueue(int item) {
        if (rear == MAX - 1) {
            System.out.println("Queue overflow (cannot enqueue " + item + ")");
        } else {
            rear = rear + 1;
            queue[rear] = item;
            System.out.println("Enqueue: " + item);
        }
    }

    static int dequeue() {
        if (front > rear) {
            System.out.println("Queue underflow (cannot dequeue)");
            return -1;
        } else {
            int item = queue[front];
            front = front + 1;
            return item;
        }
    }

    static void showQueue() {
        System.out.print("Queue (Front --> Rear): ");
        if (front > rear) {
            System.out.println("Empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}
