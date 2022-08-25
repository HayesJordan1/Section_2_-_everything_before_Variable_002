package Chickens02;

public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here
         double DAILYAVERAGE = (100 + 121 + 117 ) / 3.0;
         double monthlyAverage = DAILYAVERAGE * 30.0;

        double monthlyProfit = monthlyAverage * .18;

        System.out.println("Daily Average:   " +DAILYAVERAGE);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);


    }
    
}
