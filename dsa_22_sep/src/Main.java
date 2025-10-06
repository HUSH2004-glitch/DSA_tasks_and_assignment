import java.util.*;

// infix_to_postfix
public class Main {
    public static void main(String[] args) {
        System.out.println("HI!");;
        int choice;
        do {
            System.out.print("Enter the infix expression :");
            //taking input
            Scanner sc = new Scanner(System.in);
            String infix = sc.next();
            System.out.println("\n");
            System.out.println("<--------------------------->");
            System.out.println("Your String :" + infix);
            System.out.println("<--------------------------->");

            Stack<String> val = new Stack<>();
            Stack<Character> op = new Stack<>();
            for (int i = 0; i < infix.length(); i++) {
                char ch = infix.charAt(i);
                if (Character.isDigit(ch)) {
                    String num_string = "" + ch;
                    val.push(num_string);
                } else if (ch == '(') {
                    op.push(ch);
                } else if (ch == ')') {
                    while (!op.isEmpty() && op.peek() != '(') {
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String temp = v1 + v2 + o;
                        val.push(temp);
                    }
                    if (!op.isEmpty()) op.pop();
                }

                else{
                    while (!op.isEmpty() && op.peek() != '(' &&
                            (((ch == '+' || ch == '-') && (op.peek() == '+' || op.peek() == '-' || op.peek() == '*' || op.peek() == '/')) ||
                                    ((ch == '*' || ch == '/') && (op.peek() == '*' || op.peek() == '/')))) {

                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String temp = v1 + v2 + o;
                        val.push(temp);
                    }
                    op.push(ch);

                }
            }
            while(!op.isEmpty())

            {
                String v2 = val.pop();
                String v1 = val.pop();
                char o = op.pop();
                String temp = v1 + v2 + o;
                val.push(temp);
            }

            String postfix = val.pop();
            System.out.println(postfix);
            System.out.println("<+=========================+>");
            System.out.println("0. to continue");
            System.out.println("Type any key to exit.");
             choice = sc.nextInt();
            System.out.println("<+=========================+>");
        }while(choice==0);


        System.out.println("<-------------------------------->");
        System.out.println("HusH");
}
}
