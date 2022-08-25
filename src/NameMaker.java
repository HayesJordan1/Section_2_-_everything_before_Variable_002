import java.util.Scanner;

public class NameMaker {
    
    public static void main(String args[])
    {
        String FirstName;
        String MiddleName;
        String LastName;
        String FullName;
        Scanner sc = new Scanner(        System.in);
        System.out.println("What is your First name:");
        FirstName = sc.next();

        System.out.println("What is your Middle name:");
        MiddleName = sc.next();

        System.out.println("What is your Last name:");
        LastName = sc.next();

        FullName = "your name is " + FirstName + " " + MiddleName + " " + LastName;
        System.out.println(FullName);



    }
    
}
