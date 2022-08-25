import javax.swing.*;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
        String input = JOptionPane.showInputDialog("Type Something:");
        //Parse the input as an int.
        int inputNumber = Integer.parseInt(input);
        //Print its value +1
        inputNumber = inputNumber + 1;
        System.out.println(inputNumber);
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.
        int d = Integer.parseInt(JOptionPane.showInputDialog("Type Something:")) + 1;
        
    }
}
