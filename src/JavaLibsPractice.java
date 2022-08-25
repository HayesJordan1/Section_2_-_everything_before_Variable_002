import javax.swing.JOptionPane;

public class JavaLibsPractice {

    public static void main(String[] args) {
        // TODO code application logic here
        String name = JOptionPane.showInputDialog("Enter your name");
        int num1 =  Integer.parseInt(JOptionPane.showInputDialog("Enter your favorite Whole Number"));
        int num2 =  Integer.parseInt(JOptionPane.showInputDialog("Enter your second favorite Whole Number"));
        int sum = (num1 + num2);

        JOptionPane.showMessageDialog(null, "The sum of these numbers is " + sum, "Sum", 1);
        double double1 =  Double.parseDouble(JOptionPane.showInputDialog("Enter your favorite Decimal Number"));
        double double2 =  Double.parseDouble(JOptionPane.showInputDialog("Enter your second favorite Decimal Number"));
        double doubleSum = (double1 + double2);
        JOptionPane.showMessageDialog(null, "The sum of these numbers is " + doubleSum, "Sum", 1);
         String friendName = JOptionPane.showInputDialog("What is your friend's name");
         String commonInterest = JOptionPane.showInputDialog("Do you and " + friendName + " both like anything");
        JOptionPane.showMessageDialog(null, "Ok so, your name is " + name +" and your friends name is " + friendName + " and you both like " + commonInterest + "?" , "Sum", 1);
        JOptionPane.showMessageDialog(null, "That is awesome!" , "Sum", 1);
        JOptionPane.showMessageDialog(null, "Let's play a game" , "Sum", 1);
        String noun  =  JOptionPane.showInputDialog("Enter a Noun");
        String adjective  =  JOptionPane.showInputDialog("Enter an Adjective");
        String adjective2  =  JOptionPane.showInputDialog("Enter another Adjective");
        String food  =  JOptionPane.showInputDialog("Enter a cool food");
        String whacky_name  =  JOptionPane.showInputDialog("Enter a whacky name");
        String action  =  JOptionPane.showInputDialog("Enter an action");
        String Setting  =  JOptionPane.showInputDialog("Enter a setting");
        String noun2  =  JOptionPane.showInputDialog("Enter another noun");
        String Superhero  =  JOptionPane.showInputDialog("Enter a superhero");
        String myth  =  JOptionPane.showInputDialog("Enter a mythological creature");
        JOptionPane.showMessageDialog(null, "There once was a  " + adjective + " "+ myth + " from the magical \n " + Setting +
                " she always wanted to be like her favorite superhero, " + Superhero
                + ". Then one day,\n she got the chance. a " + adjective2 + " villain named \n" + whacky_name  + " had started " + action + " all over the city! " +
                " she knew that " + Superhero + " would save her " + " but then she looked \ncloser and realized the villain had her! " +
                " she knew what had to be done. she flew up to the\n villain and threw a " + noun + " at\n her it was so powerful she was flung all the way to " + Setting + ". " + Superhero + " thanked her and gave her a giant " + food + " and a new " + noun2 + ". she had become a hero"
                , "Sum", 1);



    }
}