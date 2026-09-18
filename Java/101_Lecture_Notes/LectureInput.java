import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        double duckTaco = 2.25;
        double duckHorchata = 1.50;
        double duckSalad = 1.00;
        double duckSoup = 1.75;
        double duckBurger = 3.50;
        double duckSalsa = 0.25;
        double duckRanch = 0.15;
        System.out.println("-Duck Butcher-");
        System.out.println(" ");
        System.out.println("Daily Special: " + duckHorchata);
        System.out.println("Apitizers:");
        System.out.println(" ");
        System.out.println("Duck Salad: " + duckSalad);
        System.out.println("Duck Soup: " + duckSoup);
        System.out.println("Duck Salsa: " + duckSalsa);
        System.out.println("Duck Ranch: " + duckRanch);
        System.out.println("Main courses:");
        System.out.println(" ");
        System.out.println("Duck Taco: " + duckTaco);
        System.out.println("Duck Burger: " + duckBurger );

        System.out.println(" ");

        System.out.println("Welcome to Duck Butcher! Who will this order be for?");
        String name = sc.nextLine();
        System.out.println("How much Duck Horchata would you like?");
        int horchata = sc.nextInt();
        System.out.println("How much Duck Salad would you like?"); 
        int salad = sc.nextInt();
        System.out.println("How much Duck Soup would you like?");
        int soup = sc.nextInt();
        System.out.println("How much Duck Salsa would you like?");
        int salsa = sc.nextInt();
        System.out.println("How much Duck Ranch would you like?");
        int ranch = sc.nextInt();
        System.out.println("How much Duck Taco would you like?");
        int taco = sc.nextInt();
        System.out.println("How much Duck Burger would you like?");
        int burger = sc.nextInt();

        double horchataPrice = duckHorchata * horchata;
        double saladPrice = duckSalad * salad;
        double soupPrice = duckSoup * soup;
        double salsaPrice = duckSalsa * salsa;
        double ranchPrice = duckRanch * ranch;
        double tacoPrice = duckTaco * taco;
        double burgerPrice = duckBurger * burger;
        System.out.println("The order for " + name + " is ready! Your total is " + (horchataPrice + saladPrice + soupPrice + salsaPrice + ranchPrice + tacoPrice + burgerPrice));
        double tip = sc.nextDouble();
        tip = tip/100*(horchataPrice + saladPrice + soupPrice + salsaPrice + ranchPrice + tacoPrice + burgerPrice));

    }
}
