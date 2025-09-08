// about to work on the array and making some methods.
//adding at the end of the array
//sorting in ascending order
// adding the element at random index

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        methods obj = new methods();


        int array[] = new int[10];
        System.out.println("<============================================>");
        System.out.println("WORKING ON ARRAY");
        System.out.println("<============================================>");
        System.out.println("The array will be filled with the multiples of 10");
//        System.out.println("Enter your limit :");
//        int limit_array = sc.nextInt();

        //loop for adding and printing the array elements

        int size = 0;
        for (int i = 0; i < 5; i++) {
            array[i] = (i +1)* 10;
            size++;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println("\n");
        //MENU
        while (true) {
            System.out.println("<====================================>");
            System.out.println("1.Insert.");
            System.out.println("2.Remove.");
            System.out.println("3.Search.");
            System.out.println("4.Exit.");
            System.out.println(array.length);

            System.out.println("Enter your choice :");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("1.Add at first.");
                System.out.println("2.Add at given index.");
                System.out.println("3.Add at last.");

                int choice_insert = sc.nextInt();

                switch (choice_insert) {
                    case 1:
                        System.out.print("Enter the element :");
                        int input_add_element_1= sc.nextInt();

                        obj.add_first(array,size,input_add_element_1);
                        System.out.println("ADDED!");
                        size++;
                        obj.display(array);
                        break;

                    case 2:
                        System.out.println("Enter the index:");
                        int input_add_index= sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter the number You want to add");
                        int input_add_element_2 = sc.nextInt();
                        sc.nextLine();
                        obj.add_at_index(array,size,input_add_index,input_add_element_2);
                        size ++;
                        obj.display(array);

                        break;
                    case 3:
                        System.out.println("Enter the number :");
                        int user_input_1 = sc.nextInt();
                        obj.add_at_last(array, size, user_input_1);
                        size ++;
                        obj.display(array);

                        break;

                    default:
                        System.out.println("invalid Input");
                        break;
                }
            }
            if (choice == 2) {

                System.out.println("1.Remove the last.");
                System.out.println("2.Remove the first.");
                System.out.println("3.Remove the Given Index");


                System.out.println("Enter your choice");
                int choice_remove = sc.nextInt();

                switch (choice_remove) {
                    case 1:
                        obj.remove_last(array, size);
                        obj.display(array);
                        size--;
                        break;

                    case 2:
                        obj.remove_first(array,size);
                        System.out.println("removed !");
                        obj.display(array);
                        size--;
                        break;

                    case 3:
                        System.out.println("Enter the Index:");
                        int input_index_remove =  sc.nextInt();
                        obj.remove_element(array,input_index_remove,size);
                        obj.display(array);
                        size--;
                        break;

                    default:
                        System.out.println("invalid Input");
                        break;
                }
            }
            if (choice == 3) {
                System.out.println("1.Search by index.");
                System.out.println("2.search by element.");
                System.out.println("Enter your choice:");
                int choice_search = sc.nextInt();

                switch (choice_search) {
                    case 1:
                        System.out.println("Enter the index");
                        int input_search_index = sc.nextInt();
                        System.out.println(obj.search_by_index(array, size, input_search_index));
                        break;
                    case 2:
                        System.out.println("Enter the element");
                        int input_search_element = sc.nextInt();
                        System.out.println(obj.search_by_element(array, size, input_search_element));
                        break;
                    default:
                        System.out.println("invalid Input");
                        break;
                }
            }
        }
    }
}
