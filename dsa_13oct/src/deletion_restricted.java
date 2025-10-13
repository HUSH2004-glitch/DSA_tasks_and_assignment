public class deletion_restricted {
    int[] arr;
    int front = -1;
    int rear = -1;

    deletion_restricted(int size) {

        arr = new int[size];
    }


    //yahan se
    public void insertFront(int val) {
        if (front == 0) {
            System.out.println("Cannot insert at front");
            return;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
            arr[front] = val;
        } else {
            arr[--front] = val;
        }
    }

    public void insertRear(int val) {
        if (rear == 4) {
            System.out.println("Queue is Full");
            return;
        }
        if (front == -1)
            front = 0;
        arr[++rear] = val;
    }

    public void delete() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Deleted: " + arr[front]);
        front++;
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
