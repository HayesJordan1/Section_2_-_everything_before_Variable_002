
import java.util.Scanner;


public class ComputeBMI {

    public static void main(String[] args) {

        double Weight;
        double Height;
        Scanner SC = new Scanner(
                System.in
        );
        System.out.println("What is your Height? (Inches)");
        Height = Math.pow(SC.nextInt(), 2);
        System.out.println("What is your Weight? (Pounds)");
        Weight = SC.nextInt();
        double BMI = Math.round(Weight / Height * 703);
        System.out.println("Your BMI IS" + BMI);
        if( BMI < 18.5 ){
            System.out.println("This means you are underweight");
        } else if (BMI < 24.9) {
            System.out.println("This means you are a healthy weight!");  
        } else if (BMI < 29.9) {
            System.out.println("This means you are a over weight");

        }
        else {
            System.out.println("This means you are a obese");
        }
    }
}
