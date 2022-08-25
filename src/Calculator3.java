public class Calculator3 {
    public double tax = .05;
    public double tip = .15;
    public  double finalTotal = 0;
    public void findTotal(double price, String name){
        double total = price*(1+tax+tip);

         finalTotal = finalTotal + total;
        System.out.println(name + " owes $" +total);
        System.out.println("so far everyone all together" + " owes $" +finalTotal);

    }
}
