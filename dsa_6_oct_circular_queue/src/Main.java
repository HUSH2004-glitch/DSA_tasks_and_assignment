import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        methods object = new methods(10);
        Scanner sc = new Scanner(System.in);
        System.out.println("WORKING ON THE DOUBLE ENDED QUEUE");

        while (true) {
            try {
                System.out.println("\n1.Enqueue");
                System.out.println("2.Dequeue");
                System.out.println("3.Display");
                System.out.println("4.Status");
                System.out.println("0.Exit");
                System.out.print("Enter your choice: ");

                int choice = sc.nextInt();

                if (choice == 0) {
                    System.out.println("Exiting...");
                    return;
                }

                switch (choice) {
                    case 1:
                        System.out.print("Enter the element: ");
                        int element = sc.nextInt();
                        object.enqueue(element);
                        break;
                    case 2:
                        object.dequeue();
                        break;
                    case 3:
                        object.display();
                        break;
                    case 4:
                        if (object.is_empty()) {
                            System.out.println("Queue is empty.");
                        } else if (object.is_full()) {
                            System.out.println("Queue is full.");
                        } else {
                            System.out.println("Queue has space left.");
                        }
                        break;
                    default:
                        System.out.println("Invalid input!");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
                sc.nextLine();
            }
        }
    }
}
