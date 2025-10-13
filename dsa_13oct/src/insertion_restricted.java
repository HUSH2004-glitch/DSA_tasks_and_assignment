public class insertion_restricted {
    int[] arr;
    int front = -1;
    int rear = -1;

    insertion_restricted(int size) {
        arr = new int[size];
    }

    // methods
    public void insert(int val) {
        if (rear == 4) {
            System.out.println("Queue is Full");
            return;
        }
        if (front == -1)
            front = 0;
        arr[++rear] = val;
    }

    public void deleteFront() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Deleted: " + arr[front]);
        front++;
    }

    public void deleteRear() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Deleted: " + arr[rear]);
        rear--;
        if (rear < front) {
            front = -1;
            rear = -1;
        }
    }

    public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
