import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Stack;
import javax.swing.border.Border;

public class graphics extends JFrame implements ActionListener {
    JTextField input;
    JButton add, remove;
    JTextArea textArea;
    Stack<String> stack;

    graphics() {
        stack = new Stack<>();

        setLayout(null);
        JLabel welcome = new JLabel();
        welcome.setText("THE STACK !");
        welcome.setBounds(100, 10, 100, 30);
        welcome.setFont(new Font("algerian", Font.BOLD, 14));
        add(welcome);


        textArea = new JTextArea();
        textArea.setBounds(100, 100, 200, 150);
        textArea.setFont(new Font("Courier New", Font.PLAIN, 14));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        Border line_border = BorderFactory.createLineBorder(Color.BLACK, 4);
        textArea.setBorder(line_border);
        textArea.setEditable(false);
        add(textArea);

        input = new JTextField();
        input.setBounds(100, 270, 200, 30);
        add(input);

        //JButton
        add = new JButton("ADD");
        add.setBackground(Color.darkGray);
        add.setBounds(100, 320, 80, 25);
        add.addActionListener(this);
        add(add);

        remove = new JButton("Remove");
        remove.setBackground(Color.darkGray);
        remove.setBounds(200, 320, 80, 25);
        remove.addActionListener(this);
        add(remove);


        setSize(400, 400);
        setLocation(30, 30);
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == add) {
                String element = input.getText().trim();
                if (!element.isEmpty()) {
                    stack.push(element);
                    textArea.setText("");
                    for (String s : stack) {
                        textArea.append(" |" + s);
                    }
                }
            }
            if (e.getSource() == remove) {
                if (!stack.isEmpty()) {
                   stack.pop();
                    textArea.setText("");
                    for (String s : stack) {
                        textArea.append(" |" + s);
                    }
                }
            }
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }

    public static void main(String[] args) {

        new graphics();
    }
}
