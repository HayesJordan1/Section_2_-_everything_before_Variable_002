
public class ShoppingCart01 {
    public static void main(String[] args) {
        // Declare and initialize String variables.  Do not initialize message yet.
        String custName = "David Jones";
        String custItem = "Pizza(s)";
        double itemPrice = 12.00;
        double salesTax = .089;
        int qauntity = 5;
        double totalPrice = itemPrice * qauntity * salesTax + itemPrice * qauntity;
        String message;
        int spcidx = custName.indexOf(" ");
        System.out.println(spcidx);
        String FirstName = custName.substring( 0, spcidx);




        
        
        // Assign the message variable 
        message= FirstName + " wants " + qauntity + " " + custItem + "\n It will cost: " + totalPrice + " plus tax";
        
        // Print and run the code
        System.out.println(message);
    }
}
