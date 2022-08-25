public class Calculator2 {
    public double tax = .05;
    public double tip = .15;  //Change tax and tip if you prefer different values
    public double originalPrice = 0;
    
    public void findTotal(int x, int y){
        //Calculate an individual's total after tax and tip
        double Total = tax*originalPrice+tip*originalPrice+originalPrice;
        //Print this value
        System.out.println(x + y);
    }
}
