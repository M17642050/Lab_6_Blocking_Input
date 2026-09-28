import java.util.Scanner;
public class FuelCosts {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        double gallons = 0;
        double milesPG = 0;
        double price = 0;
        boolean loopGallons = true;
        boolean loopMilesPG = true;
        boolean loopPrice = true;
        do {
            System.out.print("What is your fuel tank's maximum capacity in gallons of gas? ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();
                loopGallons = false;
            }
            else {
                String trash1 = in.nextLine();
                System.out.println("Invalid Input. Please enter your fuel tank's maximum capacity in gallons of gas as a number.");
            }
        }
        while (loopGallons);
        do {
            System.out.print("How many miles can a single gallon of gas make your vehicle cover? ");
            if (in.hasNextDouble()) {
                milesPG = in.nextDouble();
                in.nextLine();
                loopMilesPG = false;
            }
            else {
                String trash2 = in.nextLine();
                System.out.println("Invalid Input. Please enter how many miles a single gallon of gas can make you vehicle cover as a number.");
            }
        }
        while (loopMilesPG);
        do {
            System.out.print("What is the price of a single gallon of gas? ");
            if (in.hasNextDouble()) {
                price = in.nextDouble();
                in.nextLine();
                loopPrice = false;
            }
            else {
                String trash3 = in.nextLine();
                System.out.println("Invalid Input. Please enter the price of a single gallon of gas as a number.");
            }
        }
        while (loopPrice);
        double cost100 = price * (100 * (1/milesPG));
        double maxD = gallons * milesPG;
        System.out.println("Based on the values you've provided:\n-It should cost you " + cost100 + "$ to drive 100 miles\n-You should be able to cover a maximum distance of " + maxD + " miles with a full tank of gas.");
    }
}