public class CalculatorTest3 {
    public static void main(String[] args) {
        
       Calculator3 calc = new Calculator3();
        calc.findTotal(10, "person1");
        calc.findTotal(12, "person2");
        calc.findTotal(9, "person3");
        calc.findTotal(8, "person4");
        calc.findTotal(7, "person5");
        calc.findTotal(15, "Alex");
        calc.findTotal(11, "person7");
        calc.findTotal(30, "person8");
       //Use the Calculator object and arguments supplied to findTotal()
       //to print the total for each person
       /*This is what everyone owes before tax and tip:
       Person 1: $10
       Person 2: $12
       Person 3: $9
       Person 4: $8
       Person 5: $7
       Person 6: $15 (Alex)
       Person 7: $11
       Person 8: $30
       */
    }    
}
