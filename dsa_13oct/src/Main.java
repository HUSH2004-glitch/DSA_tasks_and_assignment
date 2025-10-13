import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice_1, choice_2;
        int size = 10;
        insertion_restricted ins_obj = new insertion_restricted(size);
        deletion_restricted del_obj = new deletion_restricted(size);

        while (true) {
            System.out.println("1. For Insertion Restricted Queue");
            System.out.println("2. For Deletion Restricted Queue");
            System.out.println("3. Exit");
            System.out.println("<--------------------------------------------->");
            choice_1 = sc.nextInt();

            if (choice_1 == 1) {
                System.out.println("INSERTION RESTRICTED QUEUE:");
                while (true) {
                    System.out.println("1. Insert (from one end only)");
                    System.out.println("2. Delete from Front");
                    System.out.println("3. Delete from Rear");
                    System.out.println("4. Display Queue");
                    System.out.println("5. Back to Main Menu");
                    choice_2 = sc.nextInt();

                    switch (choice_2) {
                        case 1:
                            System.out.print("Enter element to insert: ");
                            int val1 = sc.nextInt();
                            ins_obj.insert(val1);
                            break;
                        case 2:
                            ins_obj.deleteFront();
                            break;
                        case 3:
                            ins_obj.deleteRear();
                            break;
                        case 4:
                            ins_obj.display();
                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("Invalid input!");
                    }

                    if (choice_2 == 5)
                        break;
                }
            }

            else if (choice_1 == 2) {
                System.out.println("DELETION RESTRICTED QUEUE:");
                while (true) {
                    System.out.println("1. Insert from Front");
                    System.out.println("2. Insert from Rear");
                    System.out.println("3. Delete (only one end allowed)");
                    System.out.println("4. Display Queue");
                    System.out.println("5. Back to Main Menu");
                    choice_2 = sc.nextInt();

                    switch (choice_2) {
                        case 1:
                            System.out.print("Enter element to insert from front: ");
                            int val2 = sc.nextInt();
                            del_obj.insertFront(val2);
                            break;
                        case 2:
                            System.out.print("Enter element to insert from rear: ");
                            int val3 = sc.nextInt();
                            del_obj.insertRear(val3);
                            break;
                        case 3:
                            del_obj.delete();
                            break;
                        case 4:
                            del_obj.display();
                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("Invalid input!");
                    }

                    if (choice_2 == 5)
                        break;
                }
            }

            else if (choice_1 == 3) {
                System.out.println("Exiting Program...");
                break;
            }

            else {
                System.out.println("Invalid input!");
            }
        }
    }
}
