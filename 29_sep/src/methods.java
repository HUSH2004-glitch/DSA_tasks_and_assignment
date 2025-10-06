public class methods {
    int[] arr;
    int front;
    int rear;

    methods(int size) {
        this.arr = new int[size];
        front = -1;
        rear = -1;
    }


    //methods
    public void display() {
        if (is_empty()) {
            System.out.println("Queue is empty.");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //enqueue
    public void enqueue(int element) {
        if (is_full()) {
            System.out.println("QUEUE OVERLFOWED");
            return;
        }
        if (is_empty()) {
            front = 0;
        }
        rear++;
        arr[rear] = element;
        System.out.println("Element " + element + " added successfully.");

    }

    public void dequeue() {
        if (is_empty()) {
            System.out.println("Queue underflow");
            return;
        }
        System.out.println("Element " + arr[front] + " removed.");
        front++;

        if (front > rear) { // queue is now empty
            front = -1;
            rear = -1;
        }
    }


    public boolean is_empty() {
        if (front == -1 && rear == -1) {
            return true;
        } else return false;
    }

    public boolean is_full() {
        if (rear >= arr.length - 1) {
            return true;
        } else return false;
    }


    public int front(){
        return arr[front];
    }
}
