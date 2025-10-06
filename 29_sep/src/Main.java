import com.sun.security.jgss.GSSUtil;

import java.util.*;

// array implementation of queue
//4 methods
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // initilization
        methods queue = new methods(10);
        while (true) {
            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.display Queue");
            System.out.println("4.Get the front");
            System.out.println("5.Exit");


            int choice = sc.nextInt();


            //switch cases
            switch (choice) {
                case 1:
                    System.out.print("Enter the element: ");
                    int element = sc.nextInt();
                    queue.enqueue(element);
                    System.out.println("<----------------------------------->");
                    break;
                case 2:
                    queue.dequeue();
                    System.out.println("<----------------------------------->");
                    break;

                case 3:
                    System.out.println("<----------------------------------->");
                    queue.display();
                    System.out.println("<----------------------------------->");
                    break;
                case 4:
                    System.out.println("The first element of the queue :" + queue.front());
                default:
                    break;

            }
        }
    }
}