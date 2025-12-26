import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        //Create a new window
        JFrame frame = new JFrame("My first GUI");
        frame.setSize(300, 150);
        frame.setLayout(null); // absolute positioning

        // text field
        JTextField textField = new JTextField();
        textField.setBounds(20, 20, 150, 25);

        // button
        JButton button = new JButton("Enter");
        button.setBounds(180, 20, 90, 25);

        // label
        JLabel label = new JLabel("What do you want for dinner?");
        label.setBounds(20, 60, 250, 25);

        //Modify label with user input
        button.addActionListener(e -> {
            String name = textField.getText();
            label.setText("Ok, let's go get " + name + "!");
        });

        //Add components to the frame
        frame.add(textField);
        frame.add(button);
        frame.add(label);
        frame.setVisible(true);
    }
}