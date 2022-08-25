public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
        System.out.println("Farmer John started out with 3 chickens, ");
       int EggsPerChicken=5;
       int chickens=3;
        int totalEggs = EggsPerChicken * chickens;
        int FinalTotalEggs = totalEggs;

       System.out.println("on Monday the chickens lay a total of "+ totalEggs + " eggs" );

       chickens = chickens + 1;
       totalEggs = EggsPerChicken * chickens;
        FinalTotalEggs = totalEggs + FinalTotalEggs;
        System.out.println("on Tuesday he got a new chicken so the chickens laid a total of "+ totalEggs + " eggs" );
        chickens = chickens / 2;
        totalEggs = EggsPerChicken * chickens;
        FinalTotalEggs = totalEggs + FinalTotalEggs;
        System.out.println("Then, Wednsday half of the chickens were eaten so the chickens laid a total of " + totalEggs + " eggs");
        System.out.println("William got a total of " + FinalTotalEggs + " eggs" +
                "");

        System.out.println("Farmer John started out with 3 chickens, ");
        int WilliamsEggsPerChicken=4;
        int Williamschickens=8;
        int WilliamstotalEggs = WilliamsEggsPerChicken * Williamschickens;
       int WilliamsFinalTotalEggs = WilliamstotalEggs;

        System.out.println("on Monday the chickens lay a total of "+ totalEggs + " eggs" );

        Williamschickens = Williamschickens + 1;
        WilliamstotalEggs = WilliamsEggsPerChicken * Williamschickens;
        WilliamsFinalTotalEggs = WilliamstotalEggs + WilliamsFinalTotalEggs;
        System.out.println("on Tuesday he got a new chicken so the chickens laid a total of "+ WilliamstotalEggs + " eggs" );
        Williamschickens = Williamschickens / 2;
        WilliamstotalEggs = WilliamsEggsPerChicken * Williamschickens;
        WilliamsFinalTotalEggs = WilliamstotalEggs + WilliamsFinalTotalEggs;
        System.out.println("Then, Wednsday half of the chickens were eaten so the chickens laid a total of " + WilliamstotalEggs + " eggs");
        System.out.println("William got a total of " + WilliamsFinalTotalEggs + " eggs");

    }   
}
