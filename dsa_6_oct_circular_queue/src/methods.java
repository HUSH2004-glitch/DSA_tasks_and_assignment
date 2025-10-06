public class methods {
    int[] arr;
    int front, rear;

    methods(int size) {
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    public void enqueue(int element) {
        if (is_full()) {
            System.out.println("Queue Overflow!");
            return;
        }

        if (front == -1) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % arr.length;
        }

        arr[rear] = element;
        System.out.println("Element " + element + " added successfully.");
    }

    public void dequeue() {
        if (is_empty()) {
            System.out.println("Queue Underflow!");
            return;
        }

        int temp = arr[front];
        arr[front] = 0;

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % arr.length;
        }

        System.out.println("Element " + temp + " removed successfully.");
    }

    public void display() {
        if (is_empty()) {
            System.out.println("Queue is empty.");
            return;
        }

        int i = front;
        System.out.print("Queue: ");
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear) break;
            i = (i + 1) % arr.length;
        }
        System.out.println();
    }

    public boolean is_empty() {
        return front == -1;
    }

    public boolean is_full() {
        return (rear + 1) % arr.length == front;
    }
}
