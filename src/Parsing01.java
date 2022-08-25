public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        
        String gibberish = "p'oadnrfoqeio[3;r3'gq3rmor3vo[3wnovnr3vnr3ogreonernvnovaw'on;or";
        String taxRate = ".09";
        String shirtPrice = "2";
        //Parse shirtPrice and taxRate, and print the total tax
        double taxRateNumber = Double.parseDouble(taxRate);
        int shirtPriceNumber = Integer.parseInt(shirtPrice);
        double totalTax = shirtPriceNumber * taxRateNumber + shirtPriceNumber;
        //Try to parse taxRate as an int
        int taxRateIntNumber = Integer.parseInt(taxRate);
        //Try to parse gibberish as an int
        int gibberishNumber = Integer.parseInt(gibberish);

    }
    
}
