import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
       int x;
       int y;
       int z;
       Scanner sc = new Scanner (
               System.in
       );
       System.out.println("Enter a number:");
       x = sc.nextInt();
        System.out.println("Enter a 2nd number:");
       y = sc.nextInt();
        System.out.println("Enter a 3rd number:");
       z = sc.nextInt();
        //Find and print the sum of three integers entered by the user
        int sum = x + y + z;
        System.out.println("The sum of the numbers is: "+sum);
        
        //Remember to close the Scanner
        sc.close();
    }
}
